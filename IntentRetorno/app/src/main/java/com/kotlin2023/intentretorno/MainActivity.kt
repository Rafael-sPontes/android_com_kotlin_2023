package com.kotlin2023.intentretorno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import com.kotlin2023.intentretorno.databinding.ActivityMain2Binding
import com.kotlin2023.intentretorno.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var result: ActivityResultLauncher<Intent>
    private var iRen = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRename.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("iRen", iRen)
            //startActivity(i)
            result.launch(i)
        }

        result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.data != null || it.resultCode == 1) {
                iRen = it.data?.getStringExtra("iRen").toString()
                binding.txtUser.text = "Olá, $iRen!"
            } else if (it.data != null || it.resultCode == 2) {
                Toast.makeText(applicationContext, "Operação Cancelada!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Erro ao atualizar o nome!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}