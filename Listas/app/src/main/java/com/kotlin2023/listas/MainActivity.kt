package com.kotlin2023.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.kotlin2023.listas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listNum = ArrayList<Int>()

        listNum.add(1)
        listNum.add(10)
        listNum.add(5)
        listNum.add(4)
        listNum.add(8)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listNum)

        binding.listViewItens.adapter = adapter

        binding.listViewItens.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "Clicando em ${listNum.get(position)}", Toast.LENGTH_SHORT).show()
        }
    }
}