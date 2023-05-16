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
        val inome = i.extras?.getString("txtRen")

        if (inome.equals("") || inome == null) {
            Toast.makeText(applicationContext, "Nome não inserido!", Toast.LENGTH_SHORT).show()
        } else {
            binding.editNome.setText(inome)
            Toast.makeText(applicationContext, "Nome Validado!", Toast.LENGTH_LONG).show()
        }

        binding.btnRename.setOnClickListener {
            val j = Intent(this, ActivityMain2Binding::class.java)
            j.putExtra("editRen", binding.editNome.text.toString().trim())
            startActivity(j)
        }
    }
}