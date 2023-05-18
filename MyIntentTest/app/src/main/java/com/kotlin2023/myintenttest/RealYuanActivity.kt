package com.kotlin2023.myintenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.myintenttest.databinding.ActivityRealYuanBinding

class RealYuanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRealYuanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRealYuanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalc.setOnClickListener {
            if (!binding.editReal.text.toString().isEmpty()) {
                val edit_real = binding.editReal.text.toString().trim().toDouble()
                binding.txtYuan.text = String.format("Yuan: %.2f¥", edit_real * 1.42)
            } else {
                binding.txtYuan.text = "Sem Valor!"
                Toast.makeText(applicationContext, "Valor Inválido!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}