package com.example.projeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_terceira_tela.*

class TerceiraTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira_tela)

        btn.setOnClickListener{
            VoltarParaSegundaTela()
        }
        button3.setOnClickListener{
            ParaQuartaTela()
        }
    }
    private fun VoltarParaSegundaTela(){

        val voltarSegunda = Intent(this,SegundaTela::class.java)
        startActivity(voltarSegunda)
    }
    private fun ParaQuartaTela(){

        val irQuartaTela = Intent(this,QuartaTela::class.java)
        startActivity(irQuartaTela)
    }
}