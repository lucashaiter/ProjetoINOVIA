package com.example.projeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_oitava_tela.*

class OitavaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oitava_tela)

        button22.setOnClickListener{
            IrNonaTela()
        }
    }
    private fun IrNonaTela(){

        val irnona = Intent(this,NonaTela::class.java)
        startActivity(irnona)
    }
}