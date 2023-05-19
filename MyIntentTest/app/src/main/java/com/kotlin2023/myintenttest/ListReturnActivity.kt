package com.kotlin2023.myintenttest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin2023.myintenttest.databinding.ActivityListReturnBinding

class ListReturnActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListReturnBinding

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

            startActivity(i)
        }
    }
}