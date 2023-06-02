package com.kotlin2023.listviewobj3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.kotlin2023.listviewobj3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var pos = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listUsers = ArrayList<Users>()
        listUsers.add(Users("rafael", "night"))
        listUsers.add(Users("lorrane", "nenha"))
        listUsers.add(Users("elessandra", "getcha"))
        listUsers.add(Users("sidnei", "elessar"))

        val listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listUsers)
        binding.listViewItens.adapter = listAdapter

        binding.listViewItens.setOnItemClickListener { _, _, position, _ ->
            binding.editUser.setText(listUsers.get(position).username)
            binding.editPass.setText(listUsers.get(position).password)
            pos = position
        }

        binding.btnInserir.setOnClickListener {
            val username = binding.editUser.text.toString().trim()
            val password = binding.editPass.text.toString().trim()
            if (!username.isEmpty() && !password.isEmpty()) {
                listUsers.add(Users(username, password))
                listAdapter.notifyDataSetChanged()
                binding.editUser.setText("")
                binding.editPass.setText("")
                pos = -1
                Toast.makeText(applicationContext, "Usuário Cadastrado!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Preencha os Campos!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnEditar.setOnClickListener {
            if (pos >= 0) {
                val username = binding.editUser.text.toString().trim()
                val password = binding.editPass.text.toString().trim()
                if (!username.isEmpty() && !password.isEmpty()) {
                    listUsers.get(pos).username = binding.editUser.text.toString().trim()
                    listUsers.get(pos).password = binding.editPass.text.toString().trim()
                    listAdapter.notifyDataSetChanged()
                    binding.editUser.setText("")
                    binding.editPass.setText("")
                    pos = -1
                    Toast.makeText(applicationContext, "Cadastro Atualizado!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "Preencha os Campos!", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast. makeText(applicationContext, "Selecione um Usuário!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnEliminar.setOnClickListener {
            if (pos >= 0) {
                listUsers.removeAt(pos)
                listAdapter.notifyDataSetChanged()
                binding.editUser.setText("")
                binding.editPass.setText("")
                pos = -1
                Toast.makeText(applicationContext, "Cadastro Excluido!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Selecione um Usuário!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}