package com.kotlin2023.foodlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            val i = intent
            val j = Intent(this, VisualizarPedido::class.java)
            j.putExtras(i)
            startActivity(j)
        }, 2000)
    }
}