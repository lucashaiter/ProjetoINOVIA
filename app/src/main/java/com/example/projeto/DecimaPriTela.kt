package com.example.projeto

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_decima_pri_tela.*
import kotlinx.android.synthetic.main.activity_decima_tela.*

private val REQUEST_IMAGE_CAPTURE2 = 1

class DecimaPriTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decima_pri_tela)

        btncamera2.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE2)
        }
        btncontinuar2.setOnClickListener{
            IrDecimaSegTela()
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE2 && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            imggato2.setImageBitmap(imageBitmap)

        }
    }
    private fun IrDecimaSegTela(){

        val irdecimaseg = Intent(this,DecimaSegTela::class.java)
        startActivity(irdecimaseg)
    }
}