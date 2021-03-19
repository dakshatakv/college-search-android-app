package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Cuddalore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuddalore)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Anna University Tiruchirappali, Panruti, Panruti, Cuddalore","College Code : 3019","Affiliated University : Anna University - Trichy","Contact : 04142251135"))

        list.add(CollegesDataClass("Annamalai University, Chidambaram, Cuddalore","","Affiliated University : Annamalai University","Contact : 04144-238263"))

        list.add(CollegesDataClass("Dr. Navalar Nedunchezhiyan College of Engineering, Tholudur, Cuddalore","College Code : 3822","Affiliated University : Anna University - Trichy","Contact : 04143 -257610"))

        list.add(CollegesDataClass("Krishnasamy College of Engineering and Technology, Cuddalore","College Code : 3410","Affiliated University : Anna University - Trichy","Contact : 9443088267"))

        list.add(CollegesDataClass("M.R.K. Institute of Technology, Cuddalore","College Code : 3843","Affiliated University : Anna University - Trichy","Contact : 04144262728"))

        list.add(CollegesDataClass("Sri Jayaram Engineering College, Cudalore, Cuddalore","College Code : 3425","Affiliated University : Anna University","Contact : 04142- 227046"))

        list.add(CollegesDataClass("St. Anne's College of Engineering and Technology, Cuddalore","College Code : 3860","Affiliated University : Anna University - Trichy","Contact : 04142242661"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}