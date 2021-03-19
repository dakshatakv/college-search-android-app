package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Tiruvarur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiruvarur)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("A.R.J. College of Engineering and Technology, Mannargudi, Tiruvarur","College Code:3821","Affiliated University:Anna University ","Contact:04367-250947"))

        list.add(CollegesDataClass("Anjalai Ammal Mahalingam Engineering College, Thiruvarur, Tiruvarur","College Code:3803","Affiliated University:Anna University","Contact :04374 232516"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}