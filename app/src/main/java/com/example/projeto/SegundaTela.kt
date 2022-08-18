package com.example.projeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda_tela.*

class SegundaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)

        btn2.setOnClickListener{
            IrParaTerceiraTela()
        }

        button.setOnClickListener{
            IrParaQuartaTela()
        }

    }
    private fun IrParaTerceiraTela(){

        val terceiraTela = Intent(this,TerceiraTela::class.java)
        startActivity(terceiraTela)
    }
    private fun IrParaQuartaTela(){

        val quartaTela = Intent(this,QuartaTela::class.java)
        startActivity(quartaTela)
    }

}