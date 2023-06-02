package com.kotlin2023.listviewobj2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.kotlin2023.listviewobj2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var pos = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listUser = ArrayList<Users>()

        listUser.add(Users("rafael", "night"))
        listUser.add(Users("lorrane", "nenha"))
        listUser.add(Users("elessandra", "getcha"))
        listUser.add(Users("sidnei", "elessar"))

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listUser)
        binding.listViewUsers.adapter = adapter

        binding.listViewUsers.setOnItemClickListener { _, _, position, _ ->
            val username = listUser.get(position).username
            val password = listUser.get(position).password
            binding.editUsername.setText(username)
            binding.editPassword.setText(password)
            pos = position
        }

        binding.btnInserir.setOnClickListener {
            val username = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()
            if (!username.isEmpty() && !password.isEmpty()) {
                listUser.add(Users(username, password))
                adapter.notifyDataSetChanged()
                pos = -1
                Toast.makeText(applicationContext, "Usuário Cadastrado!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Preencha os Campos!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnEditar.setOnClickListener {
            if (pos >= 0) {
                val username = binding.editUsername.text.toString().trim()
                val password = binding.editPassword.text.toString().trim()
                if (!username.isEmpty() && !password.isEmpty()) {
                    listUser.get(pos).username = binding.editUsername.text.toString().trim()
                    listUser.get(pos).password = binding.editPassword.text.toString().trim()
                    adapter.notifyDataSetChanged()
                    binding.editUsername.setText("")
                    binding.editPassword.setText("")
                    pos = -1
                    Toast.makeText(applicationContext, "Usuário Atualizado!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "Preencha os Campos!", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(applicationContext, "Selecione um Usuário!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnEliminar.setOnClickListener {
            if (pos >= 0) {
                listUser.removeAt(pos)
                adapter.notifyDataSetChanged()
                pos = -1
                Toast.makeText(applicationContext, "Usuário Removido!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Selecione um Usuário!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}