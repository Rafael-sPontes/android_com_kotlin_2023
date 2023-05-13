package com.kotlin2023.conversortemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.conversortemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalc.setOnClickListener {
            val cel = binding.editCel.text.toString().toDouble()
            val far = String.format("%.2f", (cel * 1.8) + 32)

            binding.txtFar.text = "$far ºF"
        }
    }
}