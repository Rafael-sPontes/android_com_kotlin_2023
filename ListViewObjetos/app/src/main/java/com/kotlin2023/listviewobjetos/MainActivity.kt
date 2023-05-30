package com.kotlin2023.listviewobjetos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.kotlin2023.listviewobjetos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaUtil = ArrayList<Utilizador>()

        listaUtil.add(Utilizador("user", "pass"))
        listaUtil.add(Utilizador("admin", "pwd123"))
        listaUtil.add(Utilizador("aaa", "bbb"))

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaUtil)
        binding.listViewUtil.adapter = adapter

        binding.listViewUtil.setOnItemClickListener { _, _, position, _ ->
            binding.editUsername.setText(listaUtil.get(position).username)
            binding.editPassword.setText(listaUtil.get(position).password)
        }
    }
}