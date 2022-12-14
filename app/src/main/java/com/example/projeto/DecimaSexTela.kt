package com.example.projeto

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_decima_pri_tela.*
import kotlinx.android.synthetic.main.activity_decima_sex_tela.*

private val REQUEST_IMAGE_CAPTURE5 = 1

class DecimaSexTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decima_sex_tela)

        btncamera5.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE5)
        }
        btncontinuar8.setOnClickListener{
            IrDecimaSetTela()
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE5 && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            imggato5.setImageBitmap(imageBitmap)

        }
    }
    private fun IrDecimaSetTela(){

        val irdecimaset = Intent(this,DecimaSetTela::class.java)
        startActivity(irdecimaset)
    }
}