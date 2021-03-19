package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Erode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_erode)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Aishwarya College of Engineering and Technology, Erode","College Code : 2332","Affiliated University : Anna University","Contact : 04256 256633"))

        list.add(CollegesDataClass("Al-Ameen Engineering College, Erode","College Code : 2652","Affiliated University : Anna University - Coimbatore","Contact : 04242500354"))

        list.add(CollegesDataClass("Bannari Amman Institute of Technology, Sathyamangalam, Erode","College Code : 2702","Affiliated University : Anna University - Coimbatore","Contact : 9842217170"))

        list.add(CollegesDataClass("Erode Sengunthar Engineering College, Perundurai, Erode","College Code : 2707","Affiliated University : Anna University - Coimbatore","Contact : 04294 -232702"))

        list.add(CollegesDataClass("Institute of Road and Transport Technology, Erode","College Code : 2709","Affiliated University : Anna University - Coimbatore","Contact : 9443777541"))

        list.add(CollegesDataClass("J.K.K. Muniraja College of Technology, Gobi, Erode","College Code : 2758","Affiliated University : Anna University - Coimbatore","Contact : 04285260263"))

        list.add(CollegesDataClass("Kongu Engineering College, Perundurai, Erode","College Code : 2711","Affiliated University : Anna University - Coimbatore","Contact : 04294 - 226644"))

        list.add(CollegesDataClass("M.P.Nachimuthu M.Jaganathan Engineering College, Perundurai, Erode","College Code : 2713","Affiliated University : Anna University - Coimbatore","Contact : 9443023112"))

        list.add(CollegesDataClass("Maharaja Engineering College for Women, Perundurai, Erode","College Code : 2742","Affiliated University : Anna University - Coimbatore","Contact : 9842760128"))

        list.add(CollegesDataClass("Nandha College of Technology, Erode","College Code  2752","Affiliated University : Anna University - Coimbatore","Contact : 9443493936"))

        list.add(CollegesDataClass("Sasurie College of Engineering, Erode","College Code : 2717","Affiliated University : Anna University - Coimbatore","Contact : 9442593809"))

        list.add(CollegesDataClass("Shree Venkateshwara Hi-Tech Engineering College, Erode","College Code : 2747","Affiliated University : Anna University - Coimbatore","Contact : 04285266199"))

        list.add(CollegesDataClass("Sri Ramanathan Engineering College, Erode","College Code : 1971","Affiliated University : Anna University - Coimbatore","Contact : 0424243807"))

        list.add(CollegesDataClass("Surya Engineering College, Erode","College Code : 2748","Affiliated University : Anna University - Coimbatore","Contact : 04242555855"))

        list.add(CollegesDataClass("Velalar College of Engineering and Technology, Erode","College Code : 2723","Affiliated University : Anna University - Coimbatore","Contact : 9444130824"))

        list.add(CollegesDataClass("Vidhya Mandhir Institute of Technology, Erode","College Code : 2337","Affiliated University : Anna University","Contact : 9364155600"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}