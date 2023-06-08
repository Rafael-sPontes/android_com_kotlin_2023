package com.kotlin2023.foodlist2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.foodlist2.databinding.ActivityPedidoBinding

class PedidoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPedidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val qtdCafe = i.getStringExtra("qtdCafe").toString().toInt()
        val qtdPao = i.getStringExtra("qtdPao").toString().toInt()
        val qtdChocolate = i.getStringExtra("qtdChocolate").toString().toInt()
        val precoCafe = i.getDoubleExtra("precoCafe", 0.0)
        val precoPao = i.getDoubleExtra("precoPao", 0.0)
        val precoChocolate = i.getDoubleExtra("precoChocolate", 0.0)

        val totCafe = String.format("%.2f", precoCafe * qtdCafe)
        val totPao = String.format("%.2f", precoPao * qtdPao)
        val totChocolate = String.format("%.2f", precoChocolate * qtdChocolate)
        val valTot = String.format("%.2f", (precoCafe * qtdCafe) + (precoPao * qtdPao) + (precoChocolate * qtdChocolate))

         val totPedido = "Café: ${qtdCafe}x = $totCafe\n" +
                "Pão: ${qtdPao}x = $totPao\n" +
                "Chocolate: ${qtdChocolate}x = $totChocolate"

        binding.txtPedido.text = totPedido
    }
}