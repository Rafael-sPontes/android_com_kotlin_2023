package com.kotlin2023.ciclovidaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.ciclovidaactivity.databinding.ActivityMain2Binding
import com.kotlin2023.ciclovidaactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Toast.makeText(applicationContext, "onCreate 1", Toast.LENGTH_SHORT).show()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnProsseguir.setOnClickListener {
            startActivity(Intent(this, ActivityMain2Binding::class.java))
        }
    }

    override fun onStart() {
        Toast.makeText(applicationContext, "onStart 1", Toast.LENGTH_SHORT).show()
        super.onStart()
    }

    override fun onResume() {
        Toast.makeText(applicationContext, "onResume 1", Toast.LENGTH_SHORT).show()
        super.onResume()
    }

    override fun onPause() {
        Toast.makeText(applicationContext, "onPause 1", Toast.LENGTH_SHORT).show()
        super.onPause()
    }

    override fun onStop() {
        Toast.makeText(applicationContext, "onStop 1", Toast.LENGTH_SHORT).show()
        super.onStop()
    }

    override fun onDestroy() {
        Toast.makeText(applicationContext, "onDestroy 1", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }
}