package com.kotlin2023.listviewobj2

import android.icu.text.UnicodeSetSpanner
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.kotlin2023.listviewobj2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*val listUser = ArrayList<Users>()
        listUser.add(Users("rafael", "night"))
        listUser.add(Users("lorrane", "nenha"))
        listUser.add(Users("elessandra", "getcha"))
        listUser.add(Users("sidnei", "elessar"))*/

        binding.btnInserir.setOnClickListener {}

        binding.btnEditar.setOnClickListener {}

        binding.btnEliminar.setOnClickListener {}
    }
}