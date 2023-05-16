package com.kotlin2023.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.kotlin2023.loginapp.databinding.ActivityLoginInvalidoBinding

class LoginInvalidoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginInvalidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginInvalidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVoltar.setOnClickListener { finish() }
    }
}