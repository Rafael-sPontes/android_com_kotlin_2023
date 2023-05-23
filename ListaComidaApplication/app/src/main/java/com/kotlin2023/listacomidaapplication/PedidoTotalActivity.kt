package com.kotlin2023.listacomidaapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.listacomidaapplication.databinding.ActivityPedidoTotalBinding

class PedidoTotalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPedidoTotalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPedidoTotalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val qtd_cafe = i.getStringExtra("qtd_cafe").toString().toInt()
        val qtd_pao = i.getStringExtra("qtd_pao").toString().toInt()
        val qtd_chocolate = i.getStringExtra("qtd_chocolate").toString().toInt()
        val preco_cafe = i.getDoubleExtra("preco_cafe", 0.0)
        val preco_pao = i.getDoubleExtra("preco_pao", 0.0)
        val preco_chocolate = i.getDoubleExtra("preco_chocolate", 0.0)

        val texto = "Resumo do Pedido: \n" +
                "Café: $qtd_cafe: Preço: ${qtd_cafe * preco_cafe}$\n" +
                "Pão: $qtd_pao: Preço: ${qtd_pao * preco_pao}$\n" +
                "Café: $qtd_chocolate: Preço: ${qtd_chocolate * preco_chocolate}$\n"

        binding.txtPedido.text = texto
    }
}