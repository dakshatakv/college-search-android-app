package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Theni : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theni)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Bharath Niketan Engineering College, Aundipatti, Theni","College Code : 3902","Affiliated University : Anna University - Trichy","Contact : 04546-242970"))

        list.add(CollegesDataClass("Nadar Saraswathi College of Engineering and Technology, Theni","College Code : 5865","Affiliated University : Anna University","Contact : 94890-84802"))

        list.add(CollegesDataClass("Odaiyappa College of Engineering and Technology, Theni","","","Contact : 04546-252670"))

        list.add(CollegesDataClass("Theni Kammavar Sangam College of Technology, Theni","College Code : 3988","Affiliated University : Anna University - Trichy","Contact : 04546291994"))

        list.add(CollegesDataClass("VPV College of Engineering, Theni","College Code : 5535","Affiliated University : Anna University","Contact : 04546 - 235010"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}