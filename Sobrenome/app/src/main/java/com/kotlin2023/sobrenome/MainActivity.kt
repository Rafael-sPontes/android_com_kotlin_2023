package com.kotlin2023.sobrenome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

            if (nome.isEmpty() || sobrenome.isEmpty()) {
                binding.txtResult.text = "Nome Inválido!"
                Toast.makeText(applicationContext, "Nome Inválido!", Toast.LENGTH_SHORT).show()
            } else {
                binding.txtResult.text = "Olá, $nome $sobrenome"
                Toast.makeText(applicationContext, "Olá, $nome $sobrenome", Toast.LENGTH_LONG).show()
            }
        }
    }
}