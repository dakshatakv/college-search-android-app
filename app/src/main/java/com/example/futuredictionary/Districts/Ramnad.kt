package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Ramnad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ramnad)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Anna University Tiruchirappali, Ramanathapuram, Ramanathapuram, Ramnad","College Code : 3017","Affiliated University : Anna University - Trichy","Contact : 04567220699"))

        list.add(CollegesDataClass("Ganapathy Chettiar College of Engineering and Technology, Paramakudi, Ramnad","College Code : 3924","Affiliated University : Anna University - Trichy","Contact : 04564206636"))

        list.add(CollegesDataClass("Mohamed Sathak Engineering College, Kilakarai, Ramnad","College Code : 3907","Affiliated University : Anna University - Trichy","Contact : 04567-241327"))

        list.add(CollegesDataClass("Syed Ammal Engineering College, Ramanathapuram, Ramnad","","Affiliated University : Anna University","Contact : 04567 - 223240"))

        list.add(CollegesDataClass("The Selvam Women Excellence Engineering Technology, Ramanathapuram, Ramnad","College Code : 3858","Affiliated University : Anna University - Trichy","Contact : 04312680133"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}