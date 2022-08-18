package com.example.projeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_decima_quin_tela.*

class DecimaQuinTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decima_quin_tela)

        btncontinuar7.setOnClickListener{
            IrDecimaSex()
        }
    }
    private fun IrDecimaSex(){

        val irdecimasex = Intent(this,DecimaSexTela::class.java)
        startActivity(irdecimasex)
    }
}