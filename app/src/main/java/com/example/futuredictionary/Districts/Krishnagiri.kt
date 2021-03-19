package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Krishnagiri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_krishnagiri)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Adhiyamaan College of Engineering, Hosur, Krishnagiri","College Code : 2601","Affiliated University : Anna University - Coimbatore","Contact : 04344-260570"))

        list.add(CollegesDataClass("Archana Institute of Technology, Thimapuram, Krishnagiri","College Code : 2668","Affiliated University : Anna University - Coimbatore","Contact : 04343252188"))

        list.add(CollegesDataClass("Er. Perumal Manimekalai College of Engineering, Hosur, Krishnagiri","College Code : 2621","Affiliated University : Anna University - Coimbatore","Contact : 04344-295171"))

        list.add(CollegesDataClass("Government College of Engineering, Bargur, Krishnagiri","College Code : 2603","Affiliated University : Anna University - Coimbatore","Contact : 04343266067"))

        list.add(CollegesDataClass("P.S.V. College of Engineering and Technology, Krishnagiri","College Code : 1961","Affiliated University : Anna University - Coimbatore","Contact : 04343268333"))

        list.add(CollegesDataClass("Sri Venkateshwara Institute of Engineering, Krishanagiri, Krishnagiri","College Code : 2340","Affiliated University : Anna University","Contact : 044 - 27163783"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}