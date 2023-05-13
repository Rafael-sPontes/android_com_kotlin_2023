package com.kotlin2023.sobrenome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.sobrenome.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOla.setOnClickListener {
            val nome = binding.editNome.text.toString().trim()
            val sobrenome = binding.editSobrenome.text.toString().trim()

            if (binding.editNome.text.isEmpty() || binding.editSobrenome.text.isEmpty()) {
                binding.txtResult.text = "Nome Inválido!"
            } else {
                binding.txtResult.text = "Olá, $nome $sobrenome"
            }
        }
    }
}