package com.example.appproyecto.viewmodel

import org.junit.Assert.*
import org.junit.Test

class ComparadorViewModelTest {

    // Devuelve true cuando 2 string son iguales
    @Test
    fun testCompararTextos_TextosIguales() {
        val viewModel = ComparadorViewModel()
        val resultado = viewModel.compararTextos("Texto", "Texto")
        assertTrue(resultado)
    }

    // Devuelve false cuando 2 string son diferentes
    @Test
    fun testCompararTextos_TextosDiferentes() {
        val viewModel = ComparadorViewModel()
        val resultado = viewModel.compararTextos("Texto1", "Texto2")
        assertFalse(resultado)
    }

}