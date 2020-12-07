package com.example.retopractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflate:MenuInflater= menuInflater
        inflate.inflate(R.menu.menu_editar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId){
    R.id.menu_editar -> {
        setContentView(R.layout.configuracion_perfil);
        Toast.makeText(this, "si sirve", Toast.LENGTH_LONG).show()
        
        true

        }
        else ->{

            true
        }
      //  return super.onOptionsItemSelected(item)
    }
}