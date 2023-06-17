package com.kotlin2023.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kotlin2023.recyclerview.adapter.CarroListAdapter
import com.kotlin2023.recyclerview.data.CarroMock
import com.kotlin2023.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recView.layoutManager = LinearLayoutManager(this)

        val mock = CarroMock()
        binding.recView.adapter = CarroListAdapter(mock.listaCarros)
    }
}