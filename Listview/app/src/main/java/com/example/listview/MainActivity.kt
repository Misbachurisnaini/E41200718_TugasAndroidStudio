package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //menambahkan variabel
        var listView = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<bias>()

        //menambahkan data, berupa sebuah list; setiap list akan berisi nama, deskripsi, dan juga foto
        list.add(bias(nama = "Chenle", deskripsi = "Zong Chenle NCT Dream", R.drawable.chenle))
        list.add(bias(nama = "Haechan", deskripsi = "Lee Haechan NCT 127 dan Dream", R.drawable.ecan))
        list.add(bias(nama = "Jaehyun", deskripsi = "Jung Jaehyun NCT 127", R.drawable.jh))
        list.add(bias(nama = "Taehyung", deskripsi = "Kim Taehyung BTS", R.drawable.kth))
        list.add(bias(nama = "Lucas", deskripsi = "Wong Yuk Hei WayV", R.drawable.lucas))
        list.add(bias(nama = "Mark", deskripsi = "Mark Lee NCT 127 dan Dream", R.drawable.mark))
        list.add(bias(nama = "Mingyu", deskripsi = "Kim Mingyu Seventeen", R.drawable.mgyu))
        list.add(bias(nama = "Jaemin", deskripsi = "Park Jaemin NCT Dream", R.drawable.nana))
        list.add(bias(nama = "Sehun", deskripsi = "Ooh Sehun EXO", R.drawable.osh))
        list.add(bias(nama = "Chanyeol", deskripsi = "Park Chaneyol EXO", R.drawable.pcy))
        list.add(bias(nama = "Jimin", deskripsi = "Park Jimin BTS", R.drawable.pjm))
        list.add(bias(nama = "Ten", deskripsi = "Chittapon Leechaiyapornkul WayV", R.drawable.ten))
        list.add(bias(nama = "Taeyong", deskripsi = "Lee Taeyong NCT 127", R.drawable.ty))
        list.add(bias(nama = "Yuta", deskripsi = "Nakomoto Yuta NCT 127", R.drawable.yuta))

        //memanggil adapternya
        listView.adapter = biasAdapter ( this, R.layout.listbias, list)

        //menambahkan kondisi, menggunakan when
        listView.setOnItemClickListener { adapterView, view, i, l -> when(i){
            0 -> Toast.makeText(this, "Kamu memilih Chenle", Toast.LENGTH_SHORT).show()
            1 -> Toast.makeText(this, "Kamu memilih Haechan", Toast.LENGTH_SHORT).show()
            2 -> Toast.makeText(this, "Kamu memilih Jaehyun", Toast.LENGTH_SHORT).show()
            3 -> Toast.makeText(this, "Kamu memilih Kim Taehyung", Toast.LENGTH_SHORT).show()
            4 -> Toast.makeText(this, "Kamu memilih Lucas", Toast.LENGTH_SHORT).show()
            5 -> Toast.makeText(this, "Kamu memilih Mark", Toast.LENGTH_SHORT).show()
            6 -> Toast.makeText(this, "Kamu memilih Mingyu", Toast.LENGTH_SHORT).show()
            7 -> Toast.makeText(this, "Kamu memilih Jaemin", Toast.LENGTH_SHORT).show()
            8 -> Toast.makeText(this, "Kamu memilih Sehun", Toast.LENGTH_SHORT).show()
            9 -> Toast.makeText(this, "Kamu memilih Chanyeol", Toast.LENGTH_SHORT).show()
            10 -> Toast.makeText(this, "Kamu memilih Jimin", Toast.LENGTH_SHORT).show()
            11-> Toast.makeText(this, "Kamu memilih Ten", Toast.LENGTH_SHORT).show()
            12-> Toast.makeText(this, "Kamu memilih Taeyong", Toast.LENGTH_SHORT).show()
            13 -> Toast.makeText(this, "Kamu memilih Yuta", Toast.LENGTH_SHORT).show()
        }
        }
    }
}