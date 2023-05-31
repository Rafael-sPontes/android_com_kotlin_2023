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

        val listUtil = ArrayList<Utilizador>()

        listUtil.add(Utilizador("user", "pass"))
        listUtil.add(Utilizador("admin", "pwd123"))
        listUtil.add(Utilizador("aaaa", "bbbb"))

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listUtil)

        binding.listViewUsername.adapter = adapter

        binding.listViewUsername.setOnItemClickListener { _, _, position, _ ->
            binding.editUser.setText(listUtil.get(position).username)
            binding.editPass.setText(listUtil.get(position).password)
        }
    }
}