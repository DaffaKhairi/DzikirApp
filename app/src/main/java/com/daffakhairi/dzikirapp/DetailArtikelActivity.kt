package com.daffakhairi.dzikirapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailArtikelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_detail_artikel)

        val dataTitle = intent.getStringExtra("title")
        val dataDesc = intent.getStringExtra("desc")
        val dataImage = intent.getIntExtra("image", 0)

        val tvTitle = findViewById<TextView>(R.id.tv_title_detail_artikel)
        tvTitle.text = dataTitle
        val tvDesc = findViewById<TextView>(R.id.tv_desc_artikel1)
        tvDesc.text = dataDesc
        val imgArtikel = findViewById<ImageView>(R.id.img_detail_artikel)
        imgArtikel.setImageResource(dataImage)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}