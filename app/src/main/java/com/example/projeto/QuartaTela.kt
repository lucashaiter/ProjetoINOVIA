package com.example.projeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_quarta_tela.*

class QuartaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quarta_tela)

        button8.setOnClickListener{
            VoltarTerceiraTela()
        }
        button6.setOnClickListener{
            VerMaisInformacoes()
        }
        button7.setOnClickListener{
            IniciarSessao()
        }
    }
    private fun VoltarTerceiraTela(){

        val voltarterceira = Intent(this,TerceiraTela::class.java)
        startActivity(voltarterceira)
    }
    private fun VerMaisInformacoes(){

        val verinformacoes = Intent(this,QuintaTela::class.java)
        startActivity(verinformacoes)
    }
    private fun IniciarSessao(){

        val iniciarsessao = Intent(this,SextaTela::class.java)
        startActivity(iniciarsessao)
    }

}