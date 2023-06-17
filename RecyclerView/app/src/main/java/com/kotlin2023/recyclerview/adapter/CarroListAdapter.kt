package com.kotlin2023.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kotlin2023.recyclerview.R

class CarroListAdapter : RecyclerView.Adapter<CarroListAdapter.CarroViewHolder>() {
    class CarroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtView: TextView = itemView.findViewById(R.id.txt_modelo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarroViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.row_carro_list, parent, false
        )

        return CarroViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CarroViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}