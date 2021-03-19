package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Dindigul : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dindigul)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Anna University Tiruchirappalli, Dindigul, Dindigul","College Code : 3022","Affiliated University : Anna University - Trichy","Contact : 04512420666"))

        list.add(CollegesDataClass("Christian College of Engineering and Technology, Oddanchatram, Dindigul","","","Contact : 04553 - 241128"))

        list.add(CollegesDataClass("Gandhigram Rural University, Dindigul","","Affiliated University  Deemed University","Contact : 0451 245 2375"))

        list.add(CollegesDataClass("Kodaikanal Institute of Technology, Kodaikanal, Dindigul","College Code : 3906","Affiliated University : Anna University - Trichy","Contact : 9442626702"))

        list.add(CollegesDataClass("N.P.R. College of Engineering and Technology, Natham, Dindigul","College Code : 3832","Affiliated University : Anna University - Trichy","Contact : 04512430850"))

        list.add(CollegesDataClass("P.S.N.A. College of Engineering and Technology, Dindigul","","","Contact : 9841045657"))

        list.add(CollegesDataClass("Pannaikadu Veerammal Paramasivam College of Engineering and Technology for Women, Athoor, Dindigul","College Code : 3851","Affiliated University : Anna University - Trichy","Contact : 04543268444"))

        list.add(CollegesDataClass("R.V.S. School of Engineering and Technology, Dindigul","College Code : 5862","Affiliated University : Anna University - Tirunelveli","Contact : 04551227229"))

        list.add(CollegesDataClass("S.B.M. College of Engineering and Technology, Dindigul","College Code : 3930","Affiliated University : Anna University - Trichy","Contact : 04512050989"))

        list.add(CollegesDataClass("Sri Subramaniya College of Engineering and Technology, Palani, Dindigul","College Code : 3720","Affiliated University : Anna University - Trichy","Contact : 9842421797"))

        list.add(CollegesDataClass("SSM Institute of Engineering and Technology, Dindigul","College Code : 5530","Affiliated University : Anna University","Contact : 0451 - 2448899"))
        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}