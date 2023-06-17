package com.kotlin2023.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kotlin2023.recyclerview.R
import com.kotlin2023.recyclerview.model.Carro

class CarroListAdapter(val listaCarros: ArrayList<Carro>) : RecyclerView.Adapter<CarroListAdapter.CarroViewHolder>() {

    var contOnCreate = 0
    var contOnBind = 0

    class CarroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtView: TextView = itemView.findViewById(R.id.txt_modelo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarroViewHolder {
        contOnCreate++
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.row_carro_list, parent, false
        )

        return CarroViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listaCarros.size
    }

    override fun onBindViewHolder(holder: CarroViewHolder, position: Int) {
        contOnBind++
        val carro = listaCarros[position]
        holder.txtView.setText(carro.modelo)
    }
}