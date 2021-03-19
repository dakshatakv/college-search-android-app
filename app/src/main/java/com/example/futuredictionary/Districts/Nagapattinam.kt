package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Nagapattinam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nagapattinam)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("A.V.C. College of Engineering, Mayiladutarai, Nagapattinam","College Code : 3801", "Affiliated University : Anna University - Trichy","Contact : 04364 - 227202"))

        list.add(CollegesDataClass("Anna University Tiruchirappali, Thirukkuvalai, Nagapatinam, Nagapattinam","College Code : 3018","Affiliated University : Anna University - Trichy","Contact : 04366245234"))

        list.add(CollegesDataClass("Edayathangudi G.S. Pillay Engineering College, Nagore, Nagapattinam","College Code : 3806", "Affiliated University : Anna University - Trichy",""))

        list.add(CollegesDataClass("Sembodai Rukmani Varatharajan Engineering College, Nagapatinam, Nagapattinam","College Code : 3859", "Affiliated University : Anna University - Trichy","Contact : 04369276481"))

        list.add(CollegesDataClass("Sir Issac Newton College of Engineering and Technology, Nagapatinam, Nagapattinam","College Code : 3760", "Affiliated University : Anna University - Trichy","Contact : 04365 - 220262"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}