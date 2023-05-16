package com.kotlin2023.bundleextras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.bundleextras.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOk.setOnClickListener {
            val num = binding.editNum.text.toString().trim().toInt()

            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("num1", num)
            startActivity(i)
        }
    }
}