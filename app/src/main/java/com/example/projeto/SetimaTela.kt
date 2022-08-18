package com.example.projeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_setima_tela.*

class SetimaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setima_tela)

        button21.setOnClickListener{
            IrOitavaTela()
        }
    }
    private fun IrOitavaTela(){

        val iroitavatela = Intent(this,OitavaTela::class.java)
        startActivity(iroitavatela)
    }

}