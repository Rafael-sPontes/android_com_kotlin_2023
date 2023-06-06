package com.kotlin2023.foodlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.foodlist.databinding.ActivityVisualizarPedidoBinding

class VisualizarPedido : AppCompatActivity() {

    private lateinit var binding: ActivityVisualizarPedidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVisualizarPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val qtdCafe = i.getStringExtra("qtdCafe").toString().toInt()
        val qtdPao = i.getStringExtra("qtdPao").toString().toInt()
        val qtdChocolate = i.getStringExtra("qtdChocolate").toString().toInt()
        val precoCafe = i.getDoubleExtra("precoCafe", 0.0)
        val precoPao = i.getDoubleExtra("precoPao", 0.0)
        val precoChocolate = i.getDoubleExtra("precoChocolate", 0.0)

        val totCafe = String.format("%.2f", qtdCafe * precoCafe)
        val totPao = String.format("%.2f", qtdPao * precoPao)
        val totChocolate = String.format("%.2f", qtdChocolate * precoChocolate)
        val totPedido = String.format("%.2f", (qtdCafe * precoCafe) + (qtdPao * precoPao) + (qtdChocolate * precoChocolate))

        val txtTot = "Pedido\n" +
                "Café: R$$totCafe\n" +
                "Pão: R$$totPao\n" +
                "Chocolate: R$$totChocolate\n" +
                "Total: R$$totPedido"

        binding.txtPedido.text = txtTot
    }
}