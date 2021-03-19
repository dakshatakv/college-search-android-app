package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Tiruvanamalai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiruvanamalai)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Annamalaiar College of Engineering, Polur, Tiruvanamalai","College Code:  1524","Affiliated University:Anna University","Contact :04173247442"))

        list.add(CollegesDataClass("Arulmigu Meenakshi Amman College of Engineering, Cheyyar, Tiruvanamalai","College Code:1503","Affiliated University:Anna University","Contact:04182-47226"))

        list.add(CollegesDataClass("Arunai Engineering College, Mathur, Tiruvanamalai","College Code:  1504","Affiliated University:Anna University","Contact:04175-237419"))

        list.add(CollegesDataClass("K.R.S. College of Engineering, Vandavasi, Tiruvanamalai","College Code  :1528","Affiliated University:Anna University","Contact:04183292444"))

        list.add(CollegesDataClass("Kamban Engineering College, Mathur, Tiruvanamalai","","","Contact:04175-237079"))

        list.add(CollegesDataClass("Oxford College of Engineering, Thiruvannamalai, Tiruvanamalai","College Code:1529","Affiliated University:Anna University","Contact:04181223677"))

        list.add(CollegesDataClass("S.K.P. Engineering College, Tiruvannamalai, Tiruvanamalai","College Code:  1512","Affiliated University:Anna University","Contact:04175-252633"))

        list.add(CollegesDataClass("S.R.I. College of Engineering and Technology, Tiruvannamalai, Tiruvanamalai","College Code:1439","Affiliated University:Anna University","Contact:04183291569"))

        list.add(CollegesDataClass("Sri Balaji Chockalingam Engineering College, Tiruvannamalai, Tiruvanamalai","College Code:1513","Affiliated University:Anna University","Contact:04173 - 227393"))

        list.add(CollegesDataClass("Sri Ramana Maharishi College of Engineering, Tiruvannamalai, Tiruvanamalai","College Code:1448","Affiliated University:Anna University","Contact:04182 - 202155"))

        list.add(CollegesDataClass("Thiruvalluvar College of Engineering and Technology, Tiruvannamalai, Tiruvanamalai","College Code:1518","Affiliated University:Anna University","Contact :04183 - 203083"))

        list.add(CollegesDataClass("University College of Engineering,Thiruvannamalai, Arni, Tiruvanamalai","College Code  1015","Affiliated University:Anna University","Contact :04173223600"))
        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}