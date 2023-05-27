package com.kotlin2023.intentrev

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.intentrev.databinding.ActivityTelaUserNameBinding

class TelaUserName : AppCompatActivity() {

    private lateinit var binding: ActivityTelaUserNameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaUserNameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        binding.btnRegUser.setOnClickListener {
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