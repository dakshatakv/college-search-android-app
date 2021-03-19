package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Tuticorin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuticorin)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Chandy College of Engineering, Mullakkadu, Tuticorin","College Code:  4931","Affiliated University:Anna University","Contact :04612356953"))

        list.add(CollegesDataClass("Dr. G.U. Pope College of Engineering, Sawyerpuram, Tuticorin","College Code:  4975","Affiliated University:Anna University","Contact:04630 -273933"))

        list.add(CollegesDataClass("Dr. Sivanthi Aditanar College of Engineering, Tiruchendur, Tuticorin","College Code:4954","Affiliated University:Anna University","Contact :04639 242482"))

        list.add(CollegesDataClass("Holy Cross Engineering College, Tuticorin","College Code:4934","Affiliated University:Anna University","Contact :04612269355"))

        list.add(CollegesDataClass("Infant Jesus College of Engineering, Tuticorin","","","Contact:  04630- 262650"))

        list.add(CollegesDataClass("Jeyaraj Annapackiam CSI College of Engineering, Thiruchendur, Tuticorin","College Code:4957","Affiliated University:Anna University","Contact :04639-479905"))

        list.add(CollegesDataClass("National Engineering College, Tuticorin","College Code:  4962","Affiliated University:Anna University","Contact:04632 - 222502"))

        list.add(CollegesDataClass("St. Mother Theresa Engineering College, Tuticorin","College Code:  4933","Affiliated University:Anna University","Contact:04612269301"))

        list.add(CollegesDataClass("University VOC College of Engineering, Tuticorin","College Code:  4024","Affiliated University:Anna University","Contact :04612310044"))

        list.add(CollegesDataClass("Unnamalai Institute of Technology, Tuticorin","College Code:4941","Affiliated University:Anna University","Contact :04632295558"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}