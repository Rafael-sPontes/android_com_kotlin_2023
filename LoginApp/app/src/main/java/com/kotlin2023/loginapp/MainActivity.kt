package com.kotlin2023.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.loginapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val user = binding.editUser.text.toString().trim()
            val pass = binding.editPass.text.toString().trim()

            if (user.equals("user") && pass.equals("pass")) {
                Toast.makeText(applicationContext, "Credenciais Válidas!", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Credencias Inválidas!", Toast.LENGTH_SHORT).show()
            }

            binding.editUser.setText("")
            binding.editPass.setText("")
        }
    }
}