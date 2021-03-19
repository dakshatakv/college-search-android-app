package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Nilgiris : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nilgiris)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("C.S.I. Engineering College, Ketti, Nilgiris","","Affiliated University : Anna University - Coimbatore","Contact : 0423-2517474"))

        list.add(CollegesDataClass("McGan's Ooty School of Architecture, Nilgiris","College Code : 2759", "Affiliated University : Anna University - Coimbatore","Contact : 0423-2225970"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}