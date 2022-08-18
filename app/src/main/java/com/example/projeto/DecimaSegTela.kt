
package com.example.projeto

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_decima_pri_tela.*
import kotlinx.android.synthetic.main.activity_decima_seg_tela.*

private val REQUEST_IMAGE_CAPTURE3 = 1

class DecimaSegTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decima_seg_tela)

        btncamera3.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, REQUEST_IMAGE_CAPTURE3)
        }
        btncontinuar3.setOnClickListener{
            IrDecimaTercTela()
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE3 && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            imggato3.setImageBitmap(imageBitmap)

        }
    }
    private fun IrDecimaTercTela(){

        val irdecimaterc = Intent(this,DecimaTercTela::class.java)
        startActivity(irdecimaterc)
    }
}