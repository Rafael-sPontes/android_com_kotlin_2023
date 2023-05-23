package com.kotlin2023.reverseintentapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.reverseintentapplication2.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        binding.btnRegist.setOnClickListener {
            i.putExtra("username", binding.editUser.text.toString())
            setResult(1, i)
            finish()
        }

        binding.btnCancel.setOnClickListener {
            setResult(2, i)
            finish()
        }
    }
}