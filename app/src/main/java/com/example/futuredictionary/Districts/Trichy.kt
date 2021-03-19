package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Trichy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trichy)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Anna University Tiruchirappali, Ariyalur Campus, Ariyalur, Trichy","College Code:3016","Affiliated University:Anna University","Contact :04329220303"))

        list.add(CollegesDataClass("C.A.R.E. School of Engineering, Srirangam, Trichy","College Code:  3841","Affiliated University:Anna University ","Contact :0431-2690505"))

        list.add(CollegesDataClass("Cauvery College of Engineering and Technology, Perur, Trichy","College Code:  3828","Affiliated University:Anna University","Contact:04312902565"))

        list.add(CollegesDataClass("Imayam College of Engineering, Thuraiyur, Trichy","College Code:  3845","Affiliated University:Anna University","Contact:  04327239663"))

        list.add(CollegesDataClass("Indra Ganesan College of Engineering, Srirangam, Trichy","College Code  :3831","Affiliated University:Anna University ","Contact:04312906565"))

        list.add(CollegesDataClass("J.J. College of Engineering and Technology, Srirangam, Trichy","College Code:3807","Affiliated University:Anna University ","Contact:0431 2695607"))

        list.add(CollegesDataClass("Jayaram College of Engineering and Technology, Thuraiyur, Trichy","College Code:3808","Affiliated University:Anna University","Contact:04327-230270"))

        list.add(CollegesDataClass("K. Ramakrishnan College of Engineering, Manachanallur, Trichy","College Code:3830","Affiliated University:Anna University ","Contact :04312910699"))

        list.add(CollegesDataClass("K. Ramakrishnan College of Technology, Trichy","College Code:  3701","Affiliated University:Anna University ","Contact:04312670799"))

        list.add(CollegesDataClass("Kongunadu College of Engineering and Technology, Thottiam, Trichy","College Code  3826","Affiliated University  Anna University","Contact Number 1  04326277571"))

        list.add(CollegesDataClass("Kurinji College of Engineering and Technology, Manapparai, Trichy","College Code:3809","Affiliated University:Anna University","Contact:04332 - 260488"))

        list.add(CollegesDataClass("M.A.M. College of Engineering and Technology, Mannachanallur, Trichy","College Code:3829","Affiliated University:Anna University","Contact :04312650521"))

        list.add(CollegesDataClass("M.I.E.T. Engineering College, Gundur, Trichy","College Code:  3811","Affiliated University:Anna University ","Contact :0431-2660303"))

        list.add(CollegesDataClass("Mahalakshmi Engineering College, Trichy","College Code:3403","Affiliated University:Anna University","Contact:0431-2620488"))

        list.add(CollegesDataClass("National Institute of Technology, Trichy","","Affiliated University:  Deemed University",""))

        list.add(CollegesDataClass("OAS Institute of Technology and Management, Trichy","College Code:  3782","Affiliated University:Anna University",""))

        list.add(CollegesDataClass("Oxford Engineering College, Trichy","College Code:3813","Affiliated University:Anna University","Contact :0431-2403450"))

        list.add(CollegesDataClass("Pavendar Bharathidasan Institute of Information Technology, Trichy","College Code:3856","Affiliated University:Anna University ","Contact :04339250850"))

        list.add(CollegesDataClass("Saranathan College of Engineering, Srirangam, Trichy","College Code  3819","Affiliated University  Anna University","Contact Number 1  04312-473286"))

        list.add(CollegesDataClass("Shivani Engneering College, Trichy","College Code:3844","Affiliated University:Anna University ","Contact:04312914306"))

        list.add(CollegesDataClass("Shivani Institute of Technology, Trichy","College Code:3853","Affiliated University:Anna University","Contact:04312906379"))

        list.add(CollegesDataClass("Shri Angala Amman College of Engineering and Technology, Trichy","College Code:3802","Affiliated University:Anna University ","Contact:0431 -2650336"))

        list.add(CollegesDataClass("Trichy Engineering College, Trichy","College Code:3820","Affiliated University:Anna University","Contact :0431-2650266"))

        list.add(CollegesDataClass("TRP Engineering College, Trichy","College Code:3795","Affiliated University:  Anna University ","Contact :0431 2908060"))

        list.add(CollegesDataClass("University Departments of Anna University Tiruchirappalli, BIT Campus, Trichy","CollegeCode:3011","AffiliatedUniversity:AnnaUniversity","Contact:04312407946"))

        list.add(CollegesDataClass("Vetri Vinayaha College of Engineering and Technology, Trichy","College Code:  3850","Affiliated University:Anna University ","Contact :04326277333"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}