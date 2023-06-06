package com.kotlin2023.foodlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.kotlin2023.foodlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val precoCafe = 2.0
    private val precoPao = 0.5
    private val precoChocolate = 6.5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Button setOnClick
        binding.btnPedido.setOnClickListener {
            val i = Intent(this, SplashScreenActivity::class.java)
            i.putExtra("qtdCafe", binding.editQtdCafe.text.toString().trim())
            i.putExtra("qtdPao", binding.editQtdPao.text.toString().trim())
            i.putExtra("qtdChocolate", binding.editQtdChocolate.text.toString().trim())
            i.putExtra("precoCafe", precoCafe)
            i.putExtra("precoPao", precoPao)
            i.putExtra("precoChocolate", precoChocolate)
            startActivity(i)
        }

        //CheckBox setOnClick
        binding.checkCafe.setOnClickListener {
            if (binding.checkCafe.isChecked()) {
                binding.editQtdCafe.setText("1")
                binding.txtValorCafe.visibility = View.VISIBLE
            } else {
                binding.editQtdCafe.setText(null)
                binding.txtValorCafe.visibility = View.GONE
            }
        }

        binding.checkPao.setOnClickListener {
            if (binding.checkPao.isChecked()) {
                binding.editQtdPao.setText("1")
                binding.txtValorPao.visibility = View.VISIBLE
            } else {
                binding.editQtdPao.setText(null)
                binding.txtValorPao.visibility = View.GONE
            }
        }

        binding.checkChocolate.setOnClickListener {
            if (binding.checkChocolate.isChecked()) {
                binding.editQtdChocolate.setText("1")
                binding.txtValorChocolate.visibility = View.VISIBLE
            } else {
                binding.editQtdChocolate.setText(null)
                binding.txtValorChocolate.visibility = View.GONE
            }
        }
    }
}