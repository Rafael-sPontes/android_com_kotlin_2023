package com.kotlin2023.intentretorno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.intentretorno.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val j = intent
        val jnome = j.extras?.getString("editRen")

        if (jnome.equals("") || jnome == null) {
            Toast.makeText(applicationContext, "Sem retorno!", Toast.LENGTH_SHORT).show()
        } else {
            binding.txtUser.setText(jnome)
            Toast.makeText(applicationContext, "Retorno Validado!", Toast.LENGTH_LONG).show()
        }

        binding.btnRename.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("txtRen", binding.txtUser.text.toString())
            startActivity(i)
        }
    }
}