package com.example.projeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nona_tela.*

class NonaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nona_tela)

        butto.setOnClickListener{
            IrParaDecimaTela()
        }
        button23.setOnClickListener{
            IrDecSexta()
        }

    }
    private fun IrParaDecimaTela(){

        val irdecima = Intent(this,DecimaTela::class.java)
        startActivity(irdecima)
    }
    private fun IrDecSexta(){

        val irdecsexta = Intent(this,DecimaSexTela::class.java)
        startActivity(irdecsexta)
    }

}