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
                val edit_celsius = binding.editCelsius.text.toString().toDouble()
                binding.txtFahrenheit.text = "$edit_celsius ºC"
            } else {
                binding.txtFahrenheit.text = "Sem Valor!"
                Toast.makeText(applicationContext, "Valor Inválido!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}