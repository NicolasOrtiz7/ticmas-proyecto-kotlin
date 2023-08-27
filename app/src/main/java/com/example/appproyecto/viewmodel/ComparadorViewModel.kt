package com.example.appproyecto.viewmodel

import androidx.lifecycle.ViewModel
import com.example.appproyecto.model.Comparador

class ComparadorViewModel : ViewModel() {

    private val comparador = Comparador()

    fun compararTextos(texto1: String, texto2: String): Boolean {
        return comparador.compararTextos(texto1, texto2)
    }

}