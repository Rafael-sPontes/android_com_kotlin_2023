package com.kotlin2023.myintenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreenActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen5)

        Handler(Looper.getMainLooper()).postDelayed({
            val i = Intent(this, RealYuanActivity::class.java)
            startActivity(i)
            finish()
        }, 2000)
    }
}