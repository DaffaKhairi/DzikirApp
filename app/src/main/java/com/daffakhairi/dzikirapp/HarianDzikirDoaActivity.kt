package com.daffakhairi.dzikirapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HarianDzikirDoaActivity : AppCompatActivity() {

    // data kosong yang ditampilkan terlebih dahulu
    private val listHarianDzikir: ArrayList<DzikirDoa> = arrayListOf()

    // data harus dipersiapkan terlebih dahulu
//    private lateinit var listHarianDzikir: ArrayList<DzikirDoa>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_harian_dzikir_doa)

        initData()
        initView()
    }

    // inisalisation(melakukan pengisisan) view nantinya berguna untuk menampilkan data
    private fun initView() {
        val rvHarianDzikirDoa: RecyclerView = findViewById(R.id.rv_harian_dzikir_doa)
        rvHarianDzikirDoa.layoutManager = LinearLayoutManager(this)
        rvHarianDzikirDoa.adapter = DzikirDoaAdapter(listHarianDzikir)
    }

    // inisalisation(melakukan pengisian) data berguna untuk mengambil data dari sting yang nantinya akan dimasukan ke init view
    private fun initData() {
        val descHarianDzikir = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafazHaraianDzikir = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemahanHarianDzikir =
            resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        for (data in descHarianDzikir.indices) {
            val list = DzikirDoa(
                descHarianDzikir[data],
                lafazHaraianDzikir[data],
                terjemahanHarianDzikir[data]
            )

            listHarianDzikir.add(list)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}