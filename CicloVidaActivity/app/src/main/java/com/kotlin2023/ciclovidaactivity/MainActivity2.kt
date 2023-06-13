package com.kotlin2023.ciclovidaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.ciclovidaactivity.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        Toast.makeText(applicationContext, "onCreate 2", Toast.LENGTH_SHORT).show()
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRetroceder.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        Toast.makeText(applicationContext, "onStart 2", Toast.LENGTH_SHORT).show()
        super.onStart()
    }

    override fun onResume() {
        Toast.makeText(applicationContext, "onResume 2", Toast.LENGTH_SHORT).show()
        super.onResume()
    }

    override fun onPause() {
        Toast.makeText(applicationContext, "onPause 2", Toast.LENGTH_SHORT).show()
        super.onPause()
    }

    override fun onStop() {
        Toast.makeText(applicationContext, "onStop 2", Toast.LENGTH_SHORT).show()
        super.onStop()
    }

    override fun onDestroy() {
        Toast.makeText(applicationContext, "onDestroy 2", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }
}