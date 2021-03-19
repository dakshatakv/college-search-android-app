package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Perambalur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perambalur)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Dhanalakshmi Srinivasan Engineering College, Perambalur","College Code : 3805","Affiliated University : Anna University - Trichy","Contact : 04328-20444"))

        list.add(CollegesDataClass("Roever College of Engineering and Technology, Perambalur","College Code : 3847","Affiliated University : Anna University - Trichy","Contact : 04328325117"))

        list.add(CollegesDataClass("Roever Engineering College, Perambalur","College Code : 3817","Affiliated University : Anna University - Trichy","Contact : 04328-276320"))

        list.add(CollegesDataClass("Srinivasan Engineering College, Perambalur","College Code : 3823","Affiliated University : Anna University - Trichy","Contact : 04328220554"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}