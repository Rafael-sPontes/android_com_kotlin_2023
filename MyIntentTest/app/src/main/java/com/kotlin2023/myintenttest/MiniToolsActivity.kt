package com.kotlin2023.myintenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.window.SplashScreen
import com.kotlin2023.myintenttest.databinding.ActivityMiniToolsBinding

class MiniToolsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMiniToolsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMiniToolsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRealDolar.setOnClickListener {
            val i = Intent(this, SplashScreenActivity3::class.java)
            startActivity(i)
        }

        binding.btnRealEuro.setOnClickListener {
            val i = Intent(this, SplashScreenActivity4::class.java)
            startActivity(i)
        }

        binding.btnRealYuan.setOnClickListener() {
            val i = Intent(this, SplashScreenActivity5::class.java)
            startActivity(i)
        }

        binding.btnCelsiusFahrenheit.setOnClickListener {
            val i = Intent(this, SplashScreenActivity6::class.java)
            startActivity(i)
        }

        binding.btnCelsiusKelvin.setOnClickListener {
            val i = Intent(this, SplashScreenActivity7::class.java)
            startActivity(i)
        }

        binding.btnListReturn.setOnClickListener {
            val i = Intent(this, SplashScreenActivity8::class.java)
            startActivity(i)
        }

        binding.btnMenuItens.setOnClickListener {
            val i = Intent(this, SplashScreenActivity9::class.java)
            startActivity(i)
        }

        binding.btnStatus.setOnClickListener {
            val i = intent
            val j = Intent(this, StatusActivity::class.java)
            j.putExtras(i)
            startActivity(j)
        }

    }
}