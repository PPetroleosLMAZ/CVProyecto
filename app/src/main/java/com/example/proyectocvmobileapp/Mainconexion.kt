package com.example.proyectocvmobileapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class Mainconexion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainconexion)
        var text = findViewById<TextView>(R.id.retorno)
        text.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}