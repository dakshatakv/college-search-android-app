package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Dharmapuri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dharmapuri)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Jayalakshmi Institute of Technology, Thoppur, Dharmapuri","College Code : 2640","Affiliated University : Anna University - Coimbatore","Contact : 04342246666"))

        list.add(CollegesDataClass("Jayam College of Engineering and Technology, Nallanur, Dharmapuri","College Code : 2606","Affiliated University : Anna University - Coimbatore","Contact : 04342 - 257255"))

        list.add(CollegesDataClass("Sapthagiri College of Engineering, Dharmapuri","College Code : 2616","Affiliated University : Anna University - Coimbatore","Contact : 04348-247212"))

        list.add(CollegesDataClass("Shreenivasa Engineering College, Dharmapuri","College Code : 2683","Affiliated University : Anna University - Coimbatore","Contact : 04346-294079"))

        list.add(CollegesDataClass("Varuvan Vadivelan Institute of Technology, Dharmapuri","College Code : 2641","Affiliated University : Anna University","Contact : 9942113333"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}