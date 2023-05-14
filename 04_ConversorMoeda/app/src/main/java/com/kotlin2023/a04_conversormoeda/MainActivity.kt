package com.kotlin2023.a04_conversormoeda

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.a04_conversormoeda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //CONVERSÃO DE EUROS PARA PESO
        binding.btnPeso.setOnClickListener { converter(10.2) }

        //CONVERSÃO DE EUROS PARA DOLAR
        binding.btnDolar.setOnClickListener { converter(0.8) }

        //CONVERSÃO DE EUROS PARA REAL
        binding.btnReal.setOnClickListener { converter(5.3) }
    }

    private fun converter(taxa: Double) {
        val euro = binding.editEuro.text.toString().trim()

        if (!euro.isEmpty()) {
            val valor = String.format("%.2f", euro.toDouble() * taxa)
            binding.txtResult.text = "$$valor"
            Toast.makeText(applicationContext, "$$valor", Toast.LENGTH_LONG).show()
        } else {
            binding.txtResult.text = "Valor Inválido!"
            Toast.makeText(applicationContext, "Valor Inválido!", Toast.LENGTH_SHORT).show()
        }
    }
}