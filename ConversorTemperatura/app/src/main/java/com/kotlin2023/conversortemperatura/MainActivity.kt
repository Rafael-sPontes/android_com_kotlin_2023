package com.kotlin2023.conversortemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.conversortemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalc.setOnClickListener {
            if (!binding.editCel.text.toString().isEmpty()) {
                val cel = binding.editCel.text.toString().toDouble()
                val far = String.format("%.2f", (cel * 1.8) + 32)

                binding.txtFar.text = "$far ºF"
                Toast.makeText(applicationContext, "$far ºF", Toast.LENGTH_LONG).show()
            } else {
                binding.txtFar.text = "Temperatura Inválida!"
                Toast.makeText(applicationContext, "Temperatura Inválida!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}