package com.kotlin2023.primeiraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.primeiraapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMostrar.setOnClickListener {
            val nome = binding.editNome.text.toString()
            binding.txtResult.text = "Olá, $nome!"
        }
    }
}