package com.kotlin2023.myintenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.myintenttest.databinding.ActivityMenuItensBinding

class MenuItensActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuItensBinding
    private val precoCafe = 1.0
    private val precoPao = 0.5
    private val precoChocolate = 1.2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuItensBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPedido.setOnClickListener {
            val i = Intent(this, SplashScreenActivity10::class.java)


            i.putExtra("qtd_cafe", binding.editQtdCafe.text.toString().toDouble())
            i.putExtra("qtd_cafe", binding.editQtdPao.text.toString().toDouble())
            i.putExtra("qtd_cafe", binding.editQtdChocolate.text.toString().toDouble())
            i.putExtra("preco_cafe", precoCafe)
            i.putExtra("preco_pao", precoPao)
            i.putExtra("preco_chocolate", precoChocolate)

            startActivity(i)
        }

        binding.checkCafe.setOnClickListener {
            if (binding.checkCafe.isChecked()) {
                val qtdCafe = String.format("%.2f", binding.editQtdCafe).toDouble()
                binding.txtPrecoCafe.text = "R$" + (precoCafe * qtdCafe)
            } else {
                binding.editQtdCafe.setText("")
            }
        }

        binding.checkPao.setOnClickListener {
            if (binding.checkPao.isChecked()) {
                val qtdPao = String.format("%.2f", binding.editQtdPao).toDouble()
                binding.txtPrecoPao.text = "R$" + (precoPao * qtdPao)
            } else {
                binding.editQtdPao.setText("")
            }
        }

        binding.checkPao.setOnClickListener {
            if (binding.checkChocolate.isChecked()) {
                val qtdChocolate = String.format("%.2f", binding.editQtdChocolate).toDouble()
                binding.txtPrecoChocolate.text = "R$" + (precoChocolate * qtdChocolate)
            } else {
                binding.editQtdChocolate.setText("")
            }
        }
    }
}