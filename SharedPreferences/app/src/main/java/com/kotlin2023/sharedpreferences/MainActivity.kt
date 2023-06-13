package com.kotlin2023.sharedpreferences

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = this.getSharedPreferences("valores", Context.MODE_PRIVATE)
        val valor = sharedPreferences.getString("valor", "")

        binding.txtValor.setText(valor)

        binding.btnGravar.setOnClickListener {
            val novoValor = binding.editValor.text.toString().trim()

            if (!novoValor.equals("")) {
                binding.txtValor.setText(novoValor)

                val editor = sharedPreferences.edit()
                editor.putString("valor", novoValor)
                editor.apply()
            } else {
                Toast.makeText(applicationContext, "Valor Inválido!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}