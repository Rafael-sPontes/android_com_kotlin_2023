package com.kotlin2023.myintenttest

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.myintenttest.databinding.ActivityRealEuroBinding

class RealEuroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRealEuroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRealEuroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalc.setOnClickListener {
            if (!binding.editReal.text.toString().isEmpty()) {
                val edit_real = binding.editReal.text.toString().trim().toDouble()
                binding.txtEuro.text = String.format("Euros: %.2f$", edit_real * 0.19)
            } else {
                binding.txtEuro.text = "Sem Valor!"
                Toast.makeText(applicationContext, "Valor Inválido!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}