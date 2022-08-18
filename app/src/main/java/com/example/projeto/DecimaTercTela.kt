package com.example.projeto

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_decima_seg_tela.*
import kotlinx.android.synthetic.main.activity_decima_terc_tela.*

private val REQUEST_IMAGE_CAPTURE4 = 1

class DecimaTercTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decima_terc_tela)

        btncamera4.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE4)
        }
        btncontinuar4.setOnClickListener{
            IrDecimaQuarTela()
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE4 && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            imggato4.setImageBitmap(imageBitmap)

        }
    }
    private fun IrDecimaQuarTela(){

        val irdecimaquar = Intent(this,DecimaQuarTela::class.java)
        startActivity(irdecimaquar)
    }
}