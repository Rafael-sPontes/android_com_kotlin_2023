package com.kotlin2023.myintenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.myintenttest.databinding.ActivityListMakeBinding

class ListMakeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListMakeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListMakeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        binding.txtItem1.text = i.getStringExtra("txt_item1")
        binding.txtItem2.text = i.getStringExtra("txt_item2")
        binding.txtItem3.text = i.getStringExtra("txt_item3")
        binding.txtItem4.text = i.getStringExtra("txt_item4")
        binding.txtItem5.text = i.getStringExtra("txt_item5")
        binding.txtItem6.text = i.getStringExtra("txt_item6")

        binding.btnRegistrar.setOnClickListener {
            i.putExtra("txt_item1", binding.editItem1.text.toString().trim())
            i.putExtra("txt_item2", binding.editItem2.text.toString().trim())
            i.putExtra("txt_item3", binding.editItem3.text.toString().trim())
            i.putExtra("txt_item4", binding.editItem4.text.toString().trim())
            i.putExtra("txt_item5", binding.editItem5.text.toString().trim())
            i.putExtra("txt_item6", binding.editItem6.text.toString().trim())

            setResult(1, i)
            finish()
        }

        binding.btnCancelar.setOnClickListener {
            finish()
        }
    }
}