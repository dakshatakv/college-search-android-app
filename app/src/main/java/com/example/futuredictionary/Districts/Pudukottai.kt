package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Pudukottai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pudukottai)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Chendhuran College of Engineering and Technology, Thiurmayam, Pudukottai","College Code : 3926","Affiliated University : Anna University - Trichy","Contact : 0433 3277575"))

        list.add(CollegesDataClass("Kings College of Engineering, Pudukottai","","","Contact : 04362- 282474"))

        list.add(CollegesDataClass("M.A.R. College of Engineering and Technology, Illuppur, Pudukottai","College Code : 3925","Affiliated University : Anna University - Trichy","Contact : 04312660108"))

        list.add(CollegesDataClass("M.N.S.K. College of Engineering, Alangudy, Pudukottai","College Code : 3923","Affiliated University : Anna University - Trichy","Contact : 04322-260171"))

        list.add(CollegesDataClass("Mahath Amma Institute of Engineering and Technology, Illupur, Pudukottai","College Code : 3854","Affiliated University : Anna University - Trichy","Contact : 04339230308"))

        list.add(CollegesDataClass("Mookambigai College of Engineering, Keerarur, Pudukottai","College Code : 3812","Affiliated University : Anna University - Trichy","Contact : 04339- 262273"))

        list.add(CollegesDataClass("Mother Terasa College of Engineering and Technology, Illuppur, Pudukottai","College Code : 3846","Affiliated University : Anna University","Contact : 9942904535"))

        list.add(CollegesDataClass("Mount Zion College of Engineering and Technology, Thirumayam, Pudukottai","College Code : 3908","Affiliated University : Anna University - Trichy","Contact : 04333-277565"))

        list.add(CollegesDataClass("Shanmuganathan Engineering College, Pudukkottai, Pudukottai","College Code : 3918","Affiliated University : Anna University - Trichy","Contact : 04333 -274913"))

        list.add(CollegesDataClass("Sri Bharathi Engineering College for Women, Pudukkottai, Pudukottai","College Code : 3852","Affiliated University : Anna University - Trichy","Contact : 04322221937"))

        list.add(CollegesDataClass("Sudharsan Engineering College, Pudukkottai, Pudukottai","College Code : 3920","Affiliated University : Anna University - Trichy","Contact : 04339 - 240830"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}