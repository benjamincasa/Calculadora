package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txtresultado: TextView
    lateinit var rbsuma: RadioButton
    lateinit var rbresta: RadioButton
    lateinit var num1: EditText
    lateinit var num2: EditText
    lateinit var rbmultiplicacion: RadioButton
    lateinit var rbdivicion: RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inicializando
        txtresultado= findViewById(R.id.txtresultado)
        rbsuma = findViewById(R.id.rbsuma)
        rbresta= findViewById(R.id.rbresta)
        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)
        rbmultiplicacion = findViewById(R.id.rbmultiplicacion)
        rbdivicion = findViewById(R.id.rbdivicion)

    }

    /**
    Este metodo permite que la operacion se realixe al presionar el boton morado
     */
    fun accionBoton(v: View){
        val numerito1 = num1.text.toString().toInt()
        val numerito2 = num2.text.toString().toInt()
        var resultado = 0
        if (rbsuma.isChecked){
            resultado = numerito1 + numerito2

        }else if(rbresta.isChecked){
            resultado = numerito1 - numerito2
        }else if (rbmultiplicacion.isChecked){
            resultado = numerito1*numerito2
        }else if (rbdivicion.isChecked){
            resultado = numerito1/numerito2
        }
        txtresultado.text = "$resultado"
    }
}


