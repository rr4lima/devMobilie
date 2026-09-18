package br.ulbra.exemplo


import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Random

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
//    }

    fun sortear(view: View) {
        val textoResultado = findViewById<TextView>(R.id.ResultadoTxt)
        val numero = Random().nextInt(7)

        if (numero % 2 == 0) {
            textoResultado.setTextColor(Color.BLUE)
        } else {
            textoResultado.setTextColor(Color.RED)
        }

        textoResultado.text = "Resultado gerado: $numero"
    }


    fun zerar(view: View) {
        val textoResultado = findViewById<TextView>(R.id.ResultadoTxt)
        textoResultado.setText("Resultado")
    }


}




