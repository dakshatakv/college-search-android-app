package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Karur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_karur)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Chettinad College of Engineering and Technology, Puliyur, Karur","College Code : 2630","Affiliated University : Anna University - Coimbatore","Contact : 04324 250940"))

        list.add(CollegesDataClass("Karur College of Engineering, Karur","College Code : 2649","Affiliated University : Anna University - Coimbatore","Contact :  04324 - 267350"))

        list.add(CollegesDataClass("M. Kumarasamy College of Engineering, Karur","College Code : 2608","Affiliated University : Anna University - Coimbatore","Contact : 04324-272155"))

        list.add(CollegesDataClass("N.S.N. College of Engineering and Technology, Karur","College Code : 2327","Affiliated University : Anna University","Contact  : 04324 - 293 999"))

        list.add(CollegesDataClass("V.K.S. College of Engineering and Technology, Karur","College Code : 2655","Affiliated University : Anna University - Coimbatore","Contact : 04323291173"))

        list.add(CollegesDataClass("V.S.B. Engineering College, Karur","College Code : 2622","Affiliated University : Anna University - Coimbatore","Contact : 04324651408"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}