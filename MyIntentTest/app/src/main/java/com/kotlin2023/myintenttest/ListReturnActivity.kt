package com.kotlin2023.myintenttest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.kotlin2023.myintenttest.databinding.ActivityListReturnBinding

class ListReturnActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListReturnBinding
    private lateinit var result: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListReturnBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnListar.setOnClickListener {
            val i = Intent(this, ListMakeActivity::class.java)

            i.putExtra("txt_item1", "")
            i.putExtra("txt_item2", "")
            i.putExtra("txt_item3", "")
            i.putExtra("txt_item4", "")
            i.putExtra("txt_item5", "")
            i.putExtra("txt_item6", "")

            result.launch(i)
        }

        result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.data != null && it.resultCode == 1) {
                Toast.makeText(applicationContext, "Lista Atualizada!", Toast.LENGTH_SHORT).show()
                val txt_item1 = it.data?.getStringExtra("txt_item1").toString()
                val txt_item2 = it.data?.getStringExtra("txt_item2").toString()
                val txt_item3 = it.data?.getStringExtra("txt_item3").toString()
                val txt_item4 = it.data?.getStringExtra("txt_item4").toString()
                val txt_item5 = it.data?.getStringExtra("txt_item5").toString()
                val txt_item6 = it.data?.getStringExtra("txt_item6").toString()

                binding.txtItem1.text = txt_item1
                binding.txtItem2.text = txt_item2
                binding.txtItem3.text = txt_item3
                binding.txtItem4.text = txt_item4
                binding.txtItem5.text = txt_item5
                binding.txtItem6.text = txt_item6
            } else {
                Toast.makeText(applicationContext, "Erro ao atualizar!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}