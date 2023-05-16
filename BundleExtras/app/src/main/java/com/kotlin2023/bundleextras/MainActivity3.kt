package com.kotlin2023.bundleextras

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.bundleextras.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        val num1 = i.extras?.getInt("num1")
        val num2 = i.extras?.getInt("num2")

        if (num1 != null && num2 != null) {
            val soma = num1 + num2
            binding.txtResult.text = "Soma: $soma"
        } else {
            binding.txtResult.text = "Valores Inválidos!"
        }
    }
}