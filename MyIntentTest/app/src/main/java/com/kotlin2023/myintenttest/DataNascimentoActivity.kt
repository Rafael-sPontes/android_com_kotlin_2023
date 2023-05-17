package com.kotlin2023.myintenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.myintenttest.databinding.ActivityDataNascimentoBinding
import com.kotlin2023.myintenttest.databinding.ActivitySplashScreen2Binding

class DataNascimentoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDataNascimentoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataNascimentoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnContData.setOnClickListener {
            val i = intent
            val j = Intent(this, ActivitySplashScreen2Binding::class.java)
            startActivity(j)
        }

    }
}