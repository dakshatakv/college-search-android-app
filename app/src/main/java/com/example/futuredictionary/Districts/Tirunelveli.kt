package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Tirunelveli : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tirunelveli)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("A.R. College of Engineering and Technology, Ambasamudram, Tirunelveli","College Code:4937","Affiliated University:Anna University","Contact:04634240772"))

        list.add(CollegesDataClass("Arul College of Technology, Tirunelveli","College Code:4940","Affiliated University:Anna University","Contact:04637 200096"))

        list.add(CollegesDataClass("Cape Institute of Technology, Radhapuram, Tirunelveli","College Code:  4953","Affiliated University:Anna University","Contact :04652 - 266076"))

        list.add(CollegesDataClass("Einstein College of Engineering, Seethaparpanallur, Tirunelveli","College Code:4980","Affiliated University:Anna University ","Contact:0462 -2487111"))

        list.add(CollegesDataClass("Francis Xavier Engineering College, Palayamkottai, Tirunelveli","College Code:4955","Affiliated University:Anna University ","Contact:0462 - 2502283"))

        list.add(CollegesDataClass("Government College of Engineering, Tirunelveli","College Code:4974","Affiliated University:Anna University","Contact :0462-2552448"))

        list.add(CollegesDataClass("J.P. College of Engineering, Tenkasi, Tirunelveli","College Code:  4994","Affiliated University:Anna University ","Contact :04633268320"))

        list.add(CollegesDataClass("Joe Suresh Engineering College,Palayamkottai, Tirunelveli","College Code:  4958","Affiliated University:Anna University ","Contact:0462- 2484314"))

        list.add(CollegesDataClass("Mahakavi Bharathiyar College of Engineering and Technology, Vasudevanallur, Tirunelveli","College Code:4998","Affiliated University  :Anna University ","Contact :04636293571"))

        list.add(CollegesDataClass("National College of Engineering, Tirunelveli","College Code:4961","Affiliated University:Anna University","Contact:04635 - 256343"))

        list.add(CollegesDataClass("P.S.N. College of Engineering and Technology, Palayamkottai, Tirunelveli","College Code:4964","Affiliated University:Anna University","Contact:04634 - 279680"))

        list.add(CollegesDataClass("PET Engineering College, Tirunelveli","","","Contact:04637-220999"))

        list.add(CollegesDataClass("S. Veerasamy Chettiar College of Engineering and Technology, Tirunelveli","College Code:4967","Affiliated University:Anna University",""))

        list.add(CollegesDataClass("Sardar Raja College of Engineering, Tirunelveli","College Code:4968","Affiliated University:Anna University","Contact:04633-272798"))

        list.add(CollegesDataClass("SCAD College of Engineering and Technology, Tirunelveli","College Code:  4969","Affiliated University:Anna University","Contact:04634-261701"))

        list.add(CollegesDataClass("Thamirabharani Engineering College, Tirunelveli","College Code:4669","Affiliated University:Anna University","Contact:0462- 2301266"))

        list.add(CollegesDataClass("The Rajaas Engineering College, Tirunelveli","College Code:4973","Affiliated University:Anna University","Contact :04637-232021"))

        list.add(CollegesDataClass("Universal College of Engineering and Technology, Tirunelveli","College Code  :4675","Affiliated University:Anna University","Contact:04637-294519"))

        list.add(CollegesDataClass("University Departments of Anna University Tirunelveli, Tirunelveli","College Code:4020","Affiliated University:Anna University",""))

        list.add(CollegesDataClass("V.V. College of Engineering, Tirunelveli","College Code:4864","Affiliated University:Anna University ","Contact :04637274300-29"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}