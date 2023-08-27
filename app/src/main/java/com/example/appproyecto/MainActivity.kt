package com.example.appproyecto

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.example.appproyecto.viewmodel.ComparadorViewModel

class MainActivity : ComponentActivity() {

   private lateinit var comparadorViewModel: ComparadorViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Establece la vista principal
        setContentView(R.layout.activity_main)

        comparadorViewModel = ViewModelProvider(this).get(ComparadorViewModel::class.java)

        // Selecciona los elementos
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val textViewResultado = findViewById<TextView>(R.id.textViewResultado)
        val buttonComparar = findViewById<Button>(R.id.buttonComparar)

        // Evento al apretar el botón
        buttonComparar.setOnClickListener {

            // Obtiene los valores de los editText
             val texto1 = editText1.text.toString()
             val texto2 = editText2.text.toString()

            // Compara los dos strings
             val sonIguales = comparadorViewModel.compararTextos(texto1, texto2)

             if (sonIguales) {
                 textViewResultado.text = "Los textos son iguales"
                 textViewResultado.setTextColor(ContextCompat.getColor(this, R.color.verde)) // Cambia al color verde
             } else {
                 textViewResultado.text = "Los textos son diferentes"
                 textViewResultado.setTextColor(ContextCompat.getColor(this, R.color.rojo)) // Cambia al color rojo
             }
         }



    }
}
