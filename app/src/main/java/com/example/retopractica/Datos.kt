package com.example.retopractica

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Datos : AppCompatActivity() {

    lateinit var txtNombre: TextView
    lateinit var txtCarrera: TextView
     var txtTel: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtNombre= findViewById(R.id.txtNombre2)
        txtCarrera= findViewById(R.id.txtCarrera)
        txtTel= findViewById(R.id.txtTel)

    }

    override fun onResume() {
        super.onResume()
        val preferencias = getSharedPreferences("mis datos", Context.MODE_PRIVATE)
        val valor= preferencias.getString("valor", "todavía no se graba nombre")
        val valor2=preferencias.getString("valor2", "todavía no se graba carrera")
        val valor3 = preferencias.getInt("valor3", 134)
        txtNombre.text= valor
        txtCarrera.text=valor2
        txtTel =valor3
    }
    fun grabarValor(v: View){
        val preferencias = getSharedPreferences("mis datos", Context.MODE_PRIVATE)
        //Editor que nos permite grabar lo que yo quiera
        //ESCRITURA con putString y el commit()
        val editor= preferencias.edit()
        val nuevoValor= txtNombre.text.toString()
        val nuevoValor2= txtCarrera.text.toString()
        val nuevoValor3 = txtTel.toString()
        editor.putString("valor",nuevoValor)
        editor.commit()
        Toast.makeText(this, "Se grabo", Toast.LENGTH_LONG).show()
        txtNombre.text=nuevoValor
        txtCarrera.text= nuevoValor2
      //  txtTel= nuevoValor3


    }



}