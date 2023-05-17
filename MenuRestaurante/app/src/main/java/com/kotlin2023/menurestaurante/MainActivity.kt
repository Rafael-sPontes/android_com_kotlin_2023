package com.kotlin2023.menurestaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kotlin2023.menurestaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val precoCafe = 1.0
    private val precoPao = 0.5
    private val precoChocolate = 1.2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPedido.setOnClickListener {
            val i = Intent(this, SplashScreenActivity::class.java)
            i.putExtra("qtd_cafe", binding.editQtdCafe.text.toString().trim())
            i.putExtra("qtd_pao", binding.editQtdPao.text.toString().trim())
            i.putExtra("qtd_chocolate", binding.editQtdChocolate.text.toString().trim())
            i.putExtra("preco_cafe", precoCafe)
            i.putExtra("preco_pao", precoPao)
            i.putExtra("preco_chocolate", precoChocolate)
            startActivity(i)
        }

        binding.checkCafe.setOnClickListener {
            if (binding.checkCafe.isChecked()) {
                binding.editQtdCafe.setText("1")
                binding.txtPrecoCafe.visibility = View.VISIBLE
            } else {
                binding.editQtdCafe.setText("0")
                binding.txtPrecoCafe.visibility = View.GONE
            }
        }
        binding.checkPao.setOnClickListener {
            if (binding.checkPao.isChecked()) {
                binding.editQtdPao.setText("1")
                binding.txtPrecoPao.visibility = View.VISIBLE
            } else {
                binding.editQtdPao.setText("0")
                binding.txtPrecoPao.visibility = View.GONE
            }
        }
        binding.checkChocolate.setOnClickListener {
            if (binding.checkChocolate.isChecked()) {
                binding.editQtdChocolate.setText("1")
                binding.txtPrecoChocolate.visibility = View.VISIBLE
            } else {
                binding.editQtdChocolate.setText("0")
                binding.txtPrecoChocolate.visibility = View.GONE
            }
        }
    }
}