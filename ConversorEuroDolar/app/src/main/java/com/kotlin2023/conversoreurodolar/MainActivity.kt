package com.kotlin2023.conversoreurodolar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.conversoreurodolar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConvert.setOnClickListener {
            if (!binding.editEuro.text.toString().isEmpty()) {
                val euro = binding.editEuro.text.toString().toDouble()
                val dolar = String.format("%.2f", euro * 0.8)

                binding.txtDolar.text = "$$dolar"
            } else {
                binding.txtDolar.text = "Valor Inválido!"
            }
        }
    }
}