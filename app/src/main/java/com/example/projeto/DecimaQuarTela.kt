package com.example.projeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_decima_quar_tela.*

class DecimaQuarTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decima_quar_tela)

        btncontinuar6.setOnClickListener{
            EditarMedidas()
        }
        btncontinuar5.setOnClickListener{
            IrParaDecimaSexta()
        }
    }
    private fun EditarMedidas(){

        val editarmedidas = Intent(this,DecimaQuinTela::class.java)
        startActivity(editarmedidas)
    }
    private fun IrParaDecimaSexta(){

        val irparadecimasexta = Intent(this,DecimaSexTela::class.java)
        startActivity(irparadecimasexta)
    }
}