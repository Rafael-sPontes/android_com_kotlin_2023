package com.kotlin2023.myintenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.myintenttest.databinding.ActivityMenuItensBinding

class MenuItensActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuItensBinding
    private val precoCafe = 2.0
    private val precoPao = 0.5
    private val precoChocolate = 6.5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuItensBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkCafe.setOnClickListener {
            if (binding.checkCafe.isChecked()) {
                binding.editQtdCafe.setText("1")
                Toast.makeText(applicationContext, "Café Adicionado!", Toast.LENGTH_SHORT).show()
            } else {
                binding.editQtdCafe.setText(null)
                Toast.makeText(applicationContext, "Café Removido!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.checkPao.setOnClickListener {
            if (binding.checkPao.isChecked()) {
                binding.editQtdPao.setText("1")
                Toast.makeText(applicationContext, "Pão Adicionado!", Toast.LENGTH_SHORT).show()
            } else {
                binding.editQtdPao.setText(null)
                Toast.makeText(applicationContext, "Pão Removido!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.checkChocolate.setOnClickListener {
            if (binding.checkChocolate.isChecked()) {
                binding.editQtdChocolate.setText("1")
                Toast.makeText(applicationContext, "Chocolate Adicionado!", Toast.LENGTH_SHORT).show()
            } else {
                binding.editQtdChocolate.setText(null)
                Toast.makeText(applicationContext, "Chocolate Removido!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnPedido.setOnClickListener {

            if (!binding.checkCafe.isChecked() && !binding.checkPao.isChecked() && !binding.checkChocolate.isChecked()) {
                Toast.makeText(applicationContext, "Pedido Vazio!", Toast.LENGTH_SHORT).show()
            } else {
                val i = Intent(this, SplashScreenActivity10::class.java)
                i.putExtra("precoCafe", precoCafe)
                i.putExtra("precoPao", precoPao)
                i.putExtra("precoChocolate", precoChocolate)

                if (binding.checkCafe.isChecked()) {
                    i.putExtra("qtdCafe", binding.editQtdCafe.text.toString().trim())
                } else {
                    i.putExtra("qtdCafe", "0")
                }

                if (binding.checkPao.isChecked()) {
                    i.putExtra("qtdPao", binding.editQtdPao.text.toString().trim())
                } else {
                    i.putExtra("qtdPao", "0")
                }

                if (binding.checkChocolate.isChecked()) {
                    i.putExtra("qtdChocolate", binding.editQtdChocolate.text.toString().trim())
                } else {
                    i.putExtra("qtdChocolate", "0")
                }

                startActivity(i)
            }
        }
    }
}