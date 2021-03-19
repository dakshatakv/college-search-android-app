package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Madurai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_madurai)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("C.R. Engineering College, Madurai","College Code : 5531","Affiliated University : Anna University","Contact : 0452-2470327"))

        list.add(CollegesDataClass("Fatima Michael College of Engineering & Technology, Madurai","College Code : 4935","Affiliated University : Anna University - Tirunelveli","Contact : 04522094658"))

        list.add(CollegesDataClass("Kamaraj College of Engineering and Technology, Thirumangalam, Madurai","College Code : 4959","Affiliated University : Anna University - Tirunelveli","Contact : 04549-278171"))

        list.add(CollegesDataClass("Latha Mathavan Engineering College, Melur, Madurai","","Affiliated University : Anna University - Tirunelveli","Contact : 04526454125"))

        list.add(CollegesDataClass("P.T.R. College of Engineering and Technology, Madurai","College Code : 4911","Affiliated University : Anna University - Tirunelveli","Contact : 0452-2489001"))

        list.add(CollegesDataClass("Raja College of Engineering and Technology, Madurai","College Code : 4914","Affiliated University : Anna University - Tirunelveli","Contact : 0452- 2429280"))

        list.add(CollegesDataClass("SACS M.A.V.M.M. Engineering College, Madurai","","Affiliated University : Anna University","Contact : 04522-470500"))

        list.add(CollegesDataClass("Thiagarajar College of Engineering, Madurai","College Code : 4008","Affiliated University : Anna University - Tirunelveli","Contact : 0452 -2482240"))

        list.add(CollegesDataClass("Ultra College of Engineering & Technology for Women, Madurai","College Code : 3225","Affiliated University : Anna University - Tirunelveli","Contact : 04522422057"))

        list.add(CollegesDataClass("Velammal College of Engineering and Technology, Madurai","College Code : 4986","Affiliated University : Anna University - Tirunelveli","Contact : 04522465285"))

        list.add(CollegesDataClass("Vickram College of Engineering, Madurai","","Affiliated University : Anna University","Contact : 04575-203611"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}