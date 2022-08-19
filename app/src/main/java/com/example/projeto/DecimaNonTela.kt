package com.example.projeto

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_decima_non_tela.*
import kotlinx.android.synthetic.main.activity_decima_oitava_tela.*

private val REQUEST_IMAGE_CAPTURE8 = 1

class DecimaNonTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decima_non_tela)

        btncamera8.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE8)
        }
        btncontinuar11.setOnClickListener {
            IrVigTela()
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE8 && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            imggato8.setImageBitmap(imageBitmap)

        }
    }
    private fun IrVigTela(){

        val irvig = Intent(this,VigTela::class.java)
        startActivity(irvig)
    }
}