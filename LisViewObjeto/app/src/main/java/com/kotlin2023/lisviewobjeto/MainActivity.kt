package com.kotlin2023.lisviewobjeto

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.kotlin2023.lisviewobjeto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaUtil = ArrayList<Utilizador>()
        listaUtil.add(Utilizador("user", "userone"))
        listaUtil.add(Utilizador("admin", "admintwo"))
        listaUtil.add(Utilizador("subadm", "subadmthree"))

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaUtil)
        binding.listviewUtil.adapter = adapter

        binding.listviewUtil.setOnItemClickListener { parent, view, position, id ->
            binding.editUsername.setText(listaUtil.get(position).username)
            binding.editPassword.setText(listaUtil.get(position).username)
        }
    }
}