package com.kotlin2023.myintenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.myintenttest.databinding.ActivityItensPedidoBinding

class ItensPedidoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityItensPedidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItensPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        val qtdCafe = i.getStringExtra("qtdCafe").toString().toInt()
        val qtdPao = i.getStringExtra("qtdPao").toString().toInt()
        val qtdChocolate = i.getStringExtra("qtdChocolate").toString().toInt()
        val precoCafe = i.getDoubleExtra("precoCafe", 0.0)
        val precoPao = i.getDoubleExtra("precoPao", 0.0)
        val precoChocolate = i.getDoubleExtra("precoChocolate", 0.0)

        val totCafe = precoCafe * qtdCafe
        val totPao = precoPao * qtdPao
        val totChocolate = precoChocolate * qtdChocolate
        val totPedido = String.format("%.2f", totCafe + totPao + totChocolate)

        val pedido = "Pedido\n" +
                "Café: ${qtdCafe}x = $totCafe\n" +
                "Pão: ${qtdPao}x = $totPao\n" +
                "Chocolate: ${qtdChocolate}x = $totChocolate\n" +
                "Total Pedido: $totPedido"

        binding.txtPedido.text = pedido
    }
}