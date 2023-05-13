package com.kotlin2023.primeiraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.primeiraapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMostrar.setOnClickListener {
            if (!binding.editNome.text.toString().isEmpty()) {
                val nome = binding.editNome.text.toString().trim()
                binding.txtResult.text = "Olá, $nome!"
                Toast.makeText(applicationContext, "Olá, $nome!", Toast.LENGTH_LONG).show()
            } else {
                binding.txtResult.text = "Nome Inválido!"
                Toast.makeText(applicationContext, "Nome Inválido!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}