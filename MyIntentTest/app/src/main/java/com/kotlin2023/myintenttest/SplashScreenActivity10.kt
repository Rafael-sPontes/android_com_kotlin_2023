package com.kotlin2023.myintenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreenActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen10)

        val i = intent

        Handler(Looper.getMainLooper()).postDelayed({
            val j = Intent(this, ItensPedidoActivity::class.java)
            j.putExtras(i)
            startActivity(j)
            finish()
        }, 2000)
    }
}