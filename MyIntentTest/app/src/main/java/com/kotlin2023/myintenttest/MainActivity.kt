package com.kotlin2023.myintenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.myintenttest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edit_nome = binding.editNome.text.toString()
        val edit_sobrenome = binding.editSobrenome.text.toString()

        binding.btnContNome.setOnClickListener {
            val i = Intent(this, DataNascimentoActivity::class.java)
            i.putExtra("edit_nome", edit_nome)
            i.putExtra("edit_sobrenome", edit_sobrenome)
            startActivity(i)
        }
    }
}