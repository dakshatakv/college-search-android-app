package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Namakkal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_namakkal)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Annai Mathammal Sheela Engineering College, Namakkal","College Code : 2602","Affiliated University : Anna University - Coimbatore","Contact : 04286252254"))

        list.add(CollegesDataClass("C.M.S. College of Engineering, Ernapuram, Namakkal","College Code : 2635","Affiliated University : Anna University - Coimbatore","Contact : 04286 263018"))

        list.add(CollegesDataClass("Dr. Nagarathinam's College of Engineering, Rasipuram, Namakkal","College Code : 2662","Affiliated University : Anna University - Coimbatore","Contact : 04272467048"))

        list.add(CollegesDataClass("Excel College of Architecture & Planning, Komarapalayam, Namakkal","College Code : 2667","Affiliated University : Anna University - Coimbatore","Contact : 04288 227361"))

        list.add(CollegesDataClass("Excel College of Engineering and Technology, Komarapalayam, Namakkal","College Code : 2664","Affiliated University : Anna University - Coimbatore","Contact : 04288 227361"))

        list.add(CollegesDataClass("Excel College of Technology, Komarapalayam, Namakkal","College Code : 2637","Affiliated University : Anna University - Coimbatore","Contact : 04288 227361"))

        list.add(CollegesDataClass("Excel Engineering College, Komarapalayam, Namakkal","College Code : 2634","Affiliated University : Anna University - Coimbatore","Contact : 04288 227361"))

        list.add(CollegesDataClass("Gnanamani College of Engineering, Namakkal","College Code : 2660","Affiliated University : Anna University - Coimbatore","Contact : 04286293888"))

        list.add(CollegesDataClass("Gnanamani College of Technology, Namakkal","College Code : 2624","Affiliated University : Anna University - Coimbatore","Contact : 04286 - 293888"))

        list.add(CollegesDataClass("J.K.K. Nataraja College of Engineering and Technology, Namakkal","College Code	: 2647","Affiliated University : Anna University - Coimbatore","Contact : 04288264726"))

        list.add(CollegesDataClass("K S R Institute for Engineering and Technology, Namakkal","College Code : 2328","Affiliated University : Anna University","Contact : 04288 274773"))

        list.add(CollegesDataClass("K.S. Rangasamy College of Technology, Namakkal","","Affiliated University : Anna University",""))

        list.add(CollegesDataClass("K.S.R. College of Engineering, Tiruchengode, Namakkal","","Affiliated University : Anna University","Contact : 04288-274742"))

        list.add(CollegesDataClass("King College of Technology, Nallur, Namakkal","College Code : 2631","Affiliated University : Anna University - Coimbatore","Contact : 04286292979"))

        list.add(CollegesDataClass("Mahendra Engineering College, Tiruchengode, Namakkal","College Code : 2609","Affiliated University : Anna University - Coimbatore","Contact : 04288 - 238888"))

        list.add(CollegesDataClass("Mahendra Engineering College for Women, Tiruchengode, Namakkal","College Code : 2638","Affiliated University : Anna University - Coimbatore","Contact : 04288-257007"))

        list.add(CollegesDataClass("Mahendra Institute of Engineering and Technology, Tiruchengode, Namakkal","College Code : 2665","Affiliated University : Anna University - Coimbatore","Contact : 04288-288506"))

        list.add(CollegesDataClass("Mahendra Institute of Technology, Tiruchengode, Namakkal","College Code : 2632","Affiliated University : Anna University - Coimbatore","Contact : 04288-325777"))

        list.add(CollegesDataClass("Muthayammal Engineering College, Rasipuram, Namakkal","","Affiliated University : Anna University - Coimbatore","Contact : 04287 - 220837"))

        list.add(CollegesDataClass("Muthayammal Technical Campus, Rasipuram, Namakkal","College Code : 2314","Affiliated University : Anna University","Contact : 04287 - 220737"))

        list.add(CollegesDataClass("P.G.P. College of Engineering and Technology, Namakkal","College Code : 2612","Affiliated University : Anna University - Coimbatore","Contact : 04286-267404"))

        list.add(CollegesDataClass("Paavaai Group of Institutions, Namakkal","College Code	: 2619","Affiliated University : Anna University - Coimbatore","Contact : 04286-243038"))

        list.add(CollegesDataClass("Paavai College of Engineering, Namakkal","College Code	: 2628","Affiliated University : Anna University - Coimbatore","Contact : 04286 - 243058"))

        list.add(CollegesDataClass("Paavai Engineering College, Namakkal","College Code : 2611","Affiliated University : Anna University - Coimbatore",""))

        list.add(CollegesDataClass("Pavai College of Technology, Namakkal","College Code : 2657","Affiliated University : Anna University - Coimbatore","Contact : 04286293968"))

        list.add(CollegesDataClass("S.R.G. Engineering College, Namakkal","College Code : 2767","Affiliated University : Anna University - Coimbatore","Contact : 04286266390"))

        list.add(CollegesDataClass("S.S.M. College of Engineering, Namakkal","","","Contact : 04288 - 267247"))

        list.add(CollegesDataClass("Selvam College of Technology, Namakkal","College Code : 2627","Affiliated University : Anna University - Coimbatore","Contact : 04286-645602"))

        list.add(CollegesDataClass("Sengunthar College of Engineering For Women, Namakkal","College Code : 2629","Affiliated University : Anna University - Coimbatore","Contact : 04288651733"))

        list.add(CollegesDataClass("Sengunthar Engineering College, Namakkal","College Code : 2617","Affiliated University : Anna University - Coimbatore","Contact : 04288-255716"))

        list.add(CollegesDataClass("Vidhya Vikkas College of Engineering and Technology, Tiruchengode, Namakkal","College Code : 2633","Affiliated University : Anna University - Coimbatore","Contact : 04288281122"))

        list.add(CollegesDataClass("Vivekanadha College of Engineering for Women, Tiruchengode, Namakkal","College Code : 2620","Affiliated University : Anna University - Coimbatore","Contact : 04288 - 234070"))

        list.add(CollegesDataClass("Vivekanadha Institute of Engineering and Technology for Women, Namakkal","","","Contact : 04288-234670"))

        list.add(CollegesDataClass("Vivekanandha College of Technology for Women, Tiruchengode, Namakkal","College Code : 2661","Affiliated University : Anna University - Coimbatore","Contact : 04288 - 234343"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}