package com.example.projeto

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_decima_set_tela.*
import kotlinx.android.synthetic.main.activity_decima_sex_tela.*

private val REQUEST_IMAGE_CAPTURE6 = 1

class DecimaSetTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decima_set_tela)

        btncamera6.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE6)
        }
        btncontinuar9.setOnClickListener {
            IrDecimaOitTela()
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE6 && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            imggato6.setImageBitmap(imageBitmap)

        }
    }
    private fun IrDecimaOitTela(){

        val irdecimaoit = Intent(this,DecimaOitavaTela::class.java)
        startActivity(irdecimaoit)
    }

}