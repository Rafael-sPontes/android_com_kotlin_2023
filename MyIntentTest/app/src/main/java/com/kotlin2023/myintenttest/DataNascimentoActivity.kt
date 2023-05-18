package com.kotlin2023.myintenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin2023.myintenttest.databinding.ActivityDataNascimentoBinding
import com.kotlin2023.myintenttest.databinding.ActivitySplashScreen2Binding

class DataNascimentoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDataNascimentoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataNascimentoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnContData.setOnClickListener {
            val edit_dia = binding.editDia.text.toString().trim()
            val edit_mes = binding.editMes.text.toString().trim()
            val edit_ano = binding.editAno.text.toString().trim()

            if (edit_dia.isEmpty() || edit_mes.isEmpty() || edit_ano.isEmpty()) {
                Toast.makeText(applicationContext, "Dia / Mês / Ano \nSão campos obrigatórios!", Toast.LENGTH_SHORT).show()
            } else if (
                (binding.editDia.text.toString() < "1" || binding.editDia.text.toString() > "31") ||
                (binding.editMes.text.toString() < "1" || binding.editMes.text.toString() > "12")
            ) {
                Toast.makeText(applicationContext, "Dia / Mês / Ano \nDatas Inválidas!", Toast.LENGTH_SHORT).show()
            } else {
                val i = intent
                val j = Intent(this, SplashScreenActivity2::class.java)
                j.putExtra("edit_dia", edit_dia)
                j.putExtra("edit_mes", edit_mes)
                j.putExtra("edit_ano", edit_ano)
                j.putExtras(i)
                startActivity(j)
            }
        }
    }
}