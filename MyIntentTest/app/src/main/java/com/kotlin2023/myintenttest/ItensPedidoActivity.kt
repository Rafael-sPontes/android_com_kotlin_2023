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

        val qtd_cafe = i.getStringExtra("qtd_cafe")
        val qtd_pao = i.getStringExtra("qtd_pao")
        val qtd_chocolate = i.getStringExtra("qtd_chocolate")
        val preco_cafe = i.getDoubleExtra("preco_cafe", 0.0)
        val preco_pao = i.getDoubleExtra("preco_pao", 0.0)
        val preco_chocolate = i.getDoubleExtra("preco_chocolate", 0.0)

        val preco_final_cafe = (qtd_cafe.toString().toDouble()) * preco_cafe
        val preco_final_pao = (qtd_pao.toString().toDouble()) * preco_pao
        val preco_final_chocolate = (qtd_chocolate.toString().toDouble()) * preco_chocolate
        val valor_final = preco_final_cafe + preco_final_pao + preco_chocolate

        /*binding.txtPedido.text = "Pedido:\n" +
                "Café: ${qtd_cafe}x | R$${preco_final_cafe}\n" +
                "Pão: ${qtd_pao}x | R$${preco_final_pao}\n" +
                "Chocolate: ${qtd_chocolate}x | R$${preco_final_chocolate}\n" +
                "Valor Total: R$$valor_final"*/
    }
}