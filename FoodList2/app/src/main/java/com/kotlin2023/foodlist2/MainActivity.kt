package com.kotlin2023.foodlist2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.window.SplashScreen
import com.kotlin2023.foodlist2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val precoCafe = 2.0
    private val precoPao = 0.5
    private val precoChocolate = 6.5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkCafe.setOnClickListener {
            if (binding.checkCafe.isChecked()) {
                val qtdCafe = binding.editQtdCafe.text.toString().trim().toInt()
                if (qtdCafe <= 0 || qtdCafe.equals(null)) {
                    binding.editQtdCafe.setText("1")
                }
            } else {
                binding.editQtdCafe.setText(null)
            }
        }

        binding.checkPao.setOnClickListener {
            if (binding.checkPao.isChecked()) {
                val qtdPao = binding.editQtdPao.text.toString().trim().toInt()
                if (qtdPao <= 0 || qtdPao.equals(null)) {
                    binding.editQtdPao.setText("1")
                }
            } else {
                binding.editQtdPao.setText(null)
            }
        }
        binding.checkChocolate.setOnClickListener {
            if (binding.checkChocolate.isChecked()) {
                val qtdChocolate = binding.editQtdChocolate.text.toString().trim().toInt()
                if (qtdChocolate <= 0 || qtdChocolate.equals(null)) {}
                binding.editQtdChocolate.setText("1")
            } else {
                binding.editQtdChocolate.setText(null)
            }
        }

        binding.btnPedido.setOnClickListener {
            val i = Intent(this, SplashScreenActivity::class.java)
            i.putExtra("precoCafe", precoCafe)
            i.putExtra("precoPao", precoPao)
            i.putExtra("precoChocolate", precoChocolate)
            i.putExtra("qtdCafe", binding.editQtdCafe.text.toString().trim())
            i.putExtra("qtdPao", binding.editQtdPao.text.toString().trim())
            i.putExtra("qtdChocolate", binding.editQtdChocolate.text.toString().trim())
            startActivity(i)
        }
    }
}