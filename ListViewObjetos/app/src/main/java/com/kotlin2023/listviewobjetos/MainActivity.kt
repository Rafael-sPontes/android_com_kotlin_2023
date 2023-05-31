package com.kotlin2023.listviewobjetos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.kotlin2023.listviewobjetos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var pos = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listUtil = ArrayList<Utilizador>()

        listUtil.add(Utilizador("user", "pass"))
        listUtil.add(Utilizador("admin", "pwd123"))
        listUtil.add(Utilizador("aaaa", "bbbb"))

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listUtil)

        binding.listViewUsername.adapter = adapter

        binding.listViewUsername.setOnItemClickListener { _, _, position, _ ->
            binding.editUser.setText(listUtil.get(position).username)
            binding.editPass.setText(listUtil.get(position).password)
            pos = position
        }

        binding.btnInserir.setOnClickListener {
            val username = binding.editUser.text.toString().trim()
            val password = binding.editPass.text.toString().trim()

            if (!username.isEmpty() && !password.isEmpty()) {
                listUtil.add(Utilizador(username, password))
                adapter.notifyDataSetChanged()
                Toast.makeText(applicationContext, "Usuário Cadastrado!", Toast.LENGTH_SHORT).show()
                binding.editUser.setText("")
                binding.editPass.setText("")
                pos = -1
            } else {
                Toast.makeText(applicationContext, "user/pass Inválido!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnEditar.setOnClickListener {
            if (pos >= 0) {
                val username = binding.editUser.text.toString().trim()
                val password = binding.editPass.text.toString().trim()

                if (!username.isEmpty() && !password.isEmpty()) {
                    listUtil.get(pos).username = binding.editUser.text.toString().trim()
                    listUtil.get(pos).password = binding.editPass.text.toString().trim()

                    adapter.notifyDataSetChanged()
                    binding.editUser.setText("")
                    binding.editPass.setText("")
                    pos = -1
                } else {
                    Toast.makeText(applicationContext, "Selecione um Usuário!", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.btnEliminar.setOnClickListener {
            if (pos >= 0) {
                listUtil.removeAt(pos)
                adapter.notifyDataSetChanged()
                Toast.makeText(applicationContext, "Cadastro Excluído!", Toast.LENGTH_SHORT).show()
                binding.editUser.setText("")
                binding.editPass.setText("")
                pos = -1
            } else {
                Toast.makeText(applicationContext, "Selecione um Usuário!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnLimpar.setOnClickListener {
            listUtil.clear()
            adapter.notifyDataSetChanged()
            binding.editUser.setText("")
            binding.editPass.setText("")
            pos = -1
        }
    }
}