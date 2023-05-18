package com.kotlin2023.myintenttest

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.myintenttest.databinding.ActivityStatusBinding

class StatusActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStatusBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStatusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        binding.txtNome.text = i.getStringExtra("edit_nome")
        binding.txtSobrenome.text = i.getStringExtra("edit_sobrenome")
        binding.txtDia.text = i.getStringExtra("edit_dia")
        binding.txtMes.text = i.getStringExtra("edit_mes")
        binding.txtAno.text = i.getStringExtra("edit_ano")
    }
}