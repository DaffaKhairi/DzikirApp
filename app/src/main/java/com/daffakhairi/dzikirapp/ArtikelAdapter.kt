package com.daffakhairi.dzikirapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ArtikelAdapter(val listArtikel: ArrayList<Artikel>) :
    RecyclerView.Adapter<ArtikelAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgArtikel: ImageView = view.findViewById(R.id.img_artikel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_artikel, parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.imgArtikel.setImageResource(listArtikel[position].imgArtikel)
        holder.imgArtikel.setOnClickListener {
            Toast.makeText(
                holder.imgArtikel.context,
                listArtikel[position].titleArtikel,
                Toast.LENGTH_SHORT
            ).show()

            val intent = Intent(holder.imgArtikel.context, DetailArtikelActivity::class.java)
            intent.putExtra("title", listArtikel[position].titleArtikel)
            intent.putExtra("desc", listArtikel[position].descArtikel)
            intent.putExtra("image", listArtikel[position].imgArtikel)
            holder.imgArtikel.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = listArtikel.size
}
