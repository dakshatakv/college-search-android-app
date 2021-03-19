package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Virudhunagar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_virudhunagar)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Kalasalingam Institute of Technology, Srivilliputtur, Virudhunagar","College Code : 4991","Affiliated University: Anna University ","Contact : 04563-299530"))

        list.add(CollegesDataClass("Kalasalingam University (Arulmigu Kalasalingam College of Engineering), Virudhunagar"," ","Affiliated University : Deemed University"," "))

        list.add(CollegesDataClass("MEPCO Schlenk Engineering College, Sivakasi, Virudhunagar"," ","Affiliated University : Anna University","Contact : 04562 - 235000"))

        list.add(CollegesDataClass("P.S.R. Engineering College, Sivakasi, Virudhunagar","College Code : 4965","Affiliated University : Anna University","Contact : 04562-239178"))

        list.add(CollegesDataClass("P.S.R. Rengasamy College of Engineering for Women, Sivakasi, Virudhunagar","College Code : 4995","Affiliated University : Anna University","Contact : 04562239055"))

        list.add(CollegesDataClass("Renganayagi Varatharaj College of Engineering, Virudhunagar","College Code :  4676","Affiliated University : Anna University","Contact : 04562-275665"))

        list.add(CollegesDataClass("Sethu Institute of Technology, Virudhunagar","","Affiliated University  : Anna University","Contact : 04566 - 308001"))

        list.add(CollegesDataClass("Sree Sowdambika College of Engineering, Virudhunagar","College Code : 4970","Affiliated University : Anna University","Contact :04566-223953"))

        list.add(CollegesDataClass("Sri Vidya College of Engineering and Technology, Virudhunagar","College Code : 4996","Affiliated University : Anna University","Contact : 04562-267467"))

        list.add(CollegesDataClass("V.P.M.M. Engineering College for Women, Virudhunagar","","Affiliated University : Anna University","Contact : 04563- 289001"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}