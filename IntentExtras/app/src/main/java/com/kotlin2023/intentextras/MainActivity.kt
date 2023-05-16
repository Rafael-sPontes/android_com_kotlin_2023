package com.kotlin2023.intentextras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.intentextras.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOk.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("nome",binding.editNome.text.toString().trim())
            startActivity(i)

            /*val nome = binding.editNome.text.toString().trim()

            val i = Intent(this, MainActivity::class.java)
            i.putExtra("nome", nome)
            startActivity(i)*/
        }



    }
}