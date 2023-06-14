package com.kotlin2023.myintenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.myintenttest.databinding.ActivityCelsiusKelvinBinding

class CelsiusKelvinActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCelsiusKelvinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCelsiusKelvinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalc.setOnClickListener {
            if (!binding.editCelsius.text.toString().isEmpty()) {
                val edit_celsius = binding.editCelsius.text.toString().trim().toDouble()
                binding.txtKelvin.text = String.format("Kelvin: %.2f ºK", edit_celsius + 273.15)
            } else {
                binding.txtKelvin.text = "Valor Inválido!"
                Toast.makeText(applicationContext, "Valor Inválido!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}