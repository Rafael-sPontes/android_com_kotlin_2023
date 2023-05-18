package com.kotlin2023.myintenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreenActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen7)

        Handler(Looper.getMainLooper()).postDelayed({
            val i  = Intent(this, CelsiusKelvinActivity::class.java)
            startActivity(i)
            finish()
        }, 2000)
    }
}