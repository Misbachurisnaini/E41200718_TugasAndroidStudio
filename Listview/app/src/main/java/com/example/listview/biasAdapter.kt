package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

//sebagai menjembatani dengan adapter view (list view) dengan dengan data
class biasAdapter (var mContext: Context, var resources: Int, var items:List<bias>): ArrayAdapter<bias>(mContext, resources, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        //layout inflater digunakan untuk membuat objek view dari layout yang sudah kita buat di xml
        val layoutInflater:LayoutInflater = LayoutInflater.from(mContext)
        val view:View = layoutInflater.inflate(resources, null)

        //inisialisasi
        val imageView:ImageView = view.findViewById(R.id.photo)
        val namabias: TextView = view.findViewById(R.id.tvNama)
        val deskripsi: TextView = view.findViewById(R.id.tvDeskripsi)

        var mItem:bias = items[position]
        imageView.setImageDrawable(mContext.resources.getDrawable(mItem.photo))
        namabias.text = mItem.nama
        deskripsi.text = mItem.deskripsi

        return view
    }
}