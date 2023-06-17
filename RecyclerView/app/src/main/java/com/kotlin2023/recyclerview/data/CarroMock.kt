package com.kotlin2023.recyclerview.data

import com.kotlin2023.recyclerview.model.Carro

class CarroMock {
    var listaCarros =  ArrayList<Carro>()

    init {
        for (i in 0..100) {
            listaCarros.add(Carro(i, i.toString()))
        }
    }
}