package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Tirupur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tirupur)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Angel College of Engineering and Technology, Tiruppur, Tirupur","College Code:2733","Affiliated University:Anna University","Contact:04216534922"))

        list.add(CollegesDataClass("Dr. Nalini Institute of Engineering and Technology, Dharapuram, Tirupur","College Code:2771","Affiliated University:Anna University","Contact :04258221605"))

        list.add(CollegesDataClass("Erode Builder Educational Trust's Group of Institutions, Kangeayam, Tirupur","College Code:3188","Affiliated University:Anna University","Contact :04257242007"))

        list.add(CollegesDataClass("Jai Sriram College of Technology, Tiruppur, Tirupur","College Code:  2651","Affiliated University:Anna University ","Contact:04212313335"))

        list.add(CollegesDataClass("Professional Educational Trust's Group of Institutions, Tirupur","College Code:2682","Affiliated University:Anna University ","Contact:04255 - 278033"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}