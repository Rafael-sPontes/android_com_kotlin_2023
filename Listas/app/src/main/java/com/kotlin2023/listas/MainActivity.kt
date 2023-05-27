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

        val listaNum = ArrayList<Int>()

        listaNum.add(1)
        listaNum.add(10)
        listaNum.add(5)
        listaNum.add(4)
        listaNum.add(8)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaNum)
        binding.listviewItens.adapter = adapter

        binding.listviewItens.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicado em ${listaNum.get(position)}", Toast.LENGTH_SHORT).show()
        }


        /*val listaNum = ArrayList<Int>()

        listaNum.add(1)
        listaNum.add(10)
        listaNum.add(5)
        listaNum.add(4)
        listaNum.add(8)

        //listaNum [1, 10, 5, 4, 8]

        //Primeiro número
        val primeiro = listaNum.get(0)
        //1

        //Remover item por índice
        listaNum.removeAt(0)
        //listaNum [10, 5, 4, 8]

        //Remover número
        listaNum.remove(5)
        //listaNum [10, 4, 8]

        //Tamanho da lista
        val tamanho = listaNum.size
        //3

        //Limpar lista
        listaNum.clear()
        //listaNum []*/
    }
}