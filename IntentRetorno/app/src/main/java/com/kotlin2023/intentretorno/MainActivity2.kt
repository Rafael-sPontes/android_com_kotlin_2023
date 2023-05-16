package com.kotlin2023.intentretorno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.intentretorno.databinding.ActivityMain2Binding
import com.kotlin2023.intentretorno.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val iRen = i.extras?.getString("iRen")

        binding.editNome.setText(iRen)

        binding.btnRename.setOnClickListener {
            i.putExtra("iRen", binding.editNome.text.toString().trim())
            setResult(1, i)
            finish()
        }

        binding.btnCancel.setOnClickListener {
            setResult(2, i)
            finish()
        }
    }
}