package com.kotlin2023.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import com.kotlin2023.loginapp.databinding.ActivityLoginValidoBinding

class LoginValidoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginValidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginValidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogout.setOnClickListener { finish() }
    }
}