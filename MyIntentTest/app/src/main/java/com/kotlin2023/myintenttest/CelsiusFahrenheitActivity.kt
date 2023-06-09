package com.kotlin2023.myintenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.myintenttest.databinding.ActivityCelsiusFahrenheitBinding

class CelsiusFahrenheitActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCelsiusFahrenheitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCelsiusFahrenheitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalc.setOnClickListener {
            if (!binding.editCelsius.text.toString().isEmpty()) {
                val edit_celsius = binding.editCelsius.text.toString().trim().toDouble()
                binding.txtFahrenheit.text = String.format("Fahrenheit: %.1f ºF", (edit_celsius * 1.8) + 32)
            } else {
                binding.txtFahrenheit.text = "Sem Valor!"
                Toast.makeText(applicationContext, "Valor Inválido!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}