
package com.example.projeto

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_decima_oitava_tela.*
import kotlinx.android.synthetic.main.activity_decima_set_tela.*

private val REQUEST_IMAGE_CAPTURE7 = 1

class DecimaOitavaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decima_oitava_tela)

        btncamera7.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE7)
        }
        btncontinuar10.setOnClickListener {
            IrDecimaNonTela()
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE7 && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            imggato7.setImageBitmap(imageBitmap)

        }
    }
    private fun IrDecimaNonTela(){

        val irdecimanon = Intent(this,DecimaNonTela::class.java)
        startActivity(irdecimanon)
    }
}