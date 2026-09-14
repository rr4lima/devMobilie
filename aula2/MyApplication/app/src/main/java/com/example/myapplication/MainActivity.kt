package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }


//    fun clique(view: View) {
//        println("foi clicado!!!")

        fun sortear(view: View) {
            val textoResultado = findViewById<TextView>(R.id.txtResultado)
            val numero = Random.nextInt(7)
            textoResultado.setText("Resultado gerado: $numero")
            val cor = numero %2
            if (cor == 0) {
                textoResultado.setTextColor(Color.RED)
            } else {
                 textoResultado.setTextColor(Color.CYAN)
            }
        }
    fun zerar (view: View){
        val textoResultado = findViewById<TextView>(R.id.txtResultado)
        textoResultado.setText("Resultado")
    }


    }






