package com.kotlin2023.bundleextras

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.bundleextras.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val bundle = i.extras

        binding.btnOk.setOnClickListener {
            val num = binding.editNum.text.toString().trim().toInt()

            var i = Intent(this, MainActivity3::class.java)
            if (bundle != null) {
                i.putExtras(bundle)
            }
            i.putExtra("num2", num)
            startActivity(i)
        }
    }
}