package com.kotlin2023.sharedpreferences

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = this.getSharedPreferences("valores", Context.MODE_PRIVATE)
        val valor = sharedPreferences.getString("valor", "")

        binding.txtValor.text = valor

        binding.btnGravar.setOnClickListener {
            val novoValor = binding.editValor.text.toString().trim()
            binding.txtValor.text = novoValor

            val editor = sharedPreferences.edit()
            editor.putString("valor", novoValor)
            editor.apply()
        }
    }
}