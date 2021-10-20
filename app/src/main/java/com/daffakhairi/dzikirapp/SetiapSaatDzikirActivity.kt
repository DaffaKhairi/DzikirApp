package com.daffakhairi.dzikirapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SetiapSaatDzikirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_setiap_saat_dzikir)

        val rvDzikirSetiapSaat = findViewById<RecyclerView>(R.id.rv_setiap_saat_dzikir)
        rvDzikirSetiapSaat.layoutManager = LinearLayoutManager(this)
        rvDzikirSetiapSaat.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikir)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}