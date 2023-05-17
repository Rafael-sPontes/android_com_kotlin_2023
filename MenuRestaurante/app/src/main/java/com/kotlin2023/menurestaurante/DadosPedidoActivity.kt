package com.kotlin2023.menurestaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.menurestaurante.databinding.ActivityDadosPedidoBinding

class DadosPedidoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDadosPedidoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDadosPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val qtd_cafe = i.getStringExtra("qtd_cafe").toString().toInt()
        val qtd_pao = i.getStringExtra("qtd_pao").toString().toInt()
        val qtd_chocolate = i.getStringExtra("qtd_chocolate").toString().toInt()
        val preco_cafe = i.getDoubleExtra("preco_cafe", 0.0)
        val preco_pao = i.getDoubleExtra("preco_pao", 0.0)
        val preco_chocolate = i.getDoubleExtra("preco_chocolate", 0.0)

        val db_cafe = qtd_cafe * preco_cafe
        val db_pao = qtd_pao * preco_pao
        val db_chocolate = qtd_chocolate * preco_chocolate
        val tot_valor = db_cafe + db_pao + db_chocolate

        val texto = "Resumo do pedido: \n" +
                "Café: $qtd_cafe, Preço: ${qtd_cafe * preco_cafe}€\n" +
                "Pão: $qtd_pao, Preço: ${qtd_pao * preco_pao}€\n" +
                "Chocolate: $qtd_chocolate, Preço: ${qtd_chocolate * preco_chocolate}€\n" +
                "Valor Total: $tot_valor€"

        binding.txtResumo.text = texto
    }
}