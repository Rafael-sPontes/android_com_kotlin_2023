package com.kotlin2023.myintenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.myintenttest.databinding.ActivityRealDolarBinding
import kotlin.math.log

class RealDolarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRealDolarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRealDolarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalc.setOnClickListener {
            if (!binding.editReal.text.toString().isEmpty()) {
                val edit_real = binding.editReal.text.toString().trim().toDouble()
                binding.txtDolar.text = String.format("Dólares: %.2f", edit_real * 0.2)
            } else {
                binding.txtDolar.text = "Sem Valor!"
                Toast.makeText(applicationContext, "Valor Inálido!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}