package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Ariyalur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ariyalur)

        val list = ArrayList<CollegesDataClass>()

        list.add(CollegesDataClass("K.K.C. College of Engineering and Technology, Jayankondam, Ariyalur", "College Code : 3781", "Affliated University : Anna University - Trichy", "Contact : 04331250358"))

        list.add(CollegesDataClass("Meenakshi Ramaswamy Engineering College, Udayarpalayam, Ariyalur","College Code : 3857", "Affiliated University : Anna University","Contact : 04331-245492"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}