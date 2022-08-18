package com.example.projeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sexta_tela.*

class SextaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sexta_tela)

        button20.setOnClickListener{
            IrSetimaTela()
        }
    }
    private fun IrSetimaTela(){

        val irsetimatela = Intent(this,SetimaTela::class.java)
        startActivity(irsetimatela)
    }
}