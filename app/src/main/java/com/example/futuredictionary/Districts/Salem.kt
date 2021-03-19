package com.example.futuredictionary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Salem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salem)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("A.V.S. Engineering College, Ammapet, Salem","College Code : 2636","Affiliated University : Anna University - Coimbatore","Contact : 04272295797"))

        list.add(CollegesDataClass("Annaporna Engineering College, Salem","College Code : 2648","Affiliated University : Anna University - Coimbatore","Contact :  0427 - 2917010"))

        list.add(CollegesDataClass("Bharathiyar Institute of Engineering for Women, Attur, Salem","College Code : 2643","Affiliated University : Anna University - Coimbatore","Contact :  04282230199"))

        list.add(CollegesDataClass("Dhirajlal Gandhi College of Technology, Salem","College Code : 2345","Affiliated University : Anna University","Contact : 04290 2330000"))

        list.add(CollegesDataClass("Ganesh College of Engineering, Salem","College Code : 2341","Affiliated University : Anna University","Contact : 0427-2911019"))

        list.add(CollegesDataClass("Government College of Engineering, Omalur, Salem","College Code : 2615","Affiliated University : Anna University - Coimbatore","Contact : 0427-2346157"))

        list.add(CollegesDataClass("Greentech College of Engineering for Women, Attur, Salem","College Code : 2644","Affiliated University : Anna University - Coimbatore","Contact : 04282281560"))

        list.add(CollegesDataClass("Knowledge Institute of Technology, Kakapalayam, Salem","College Code : 2653","Affiliated University : Anna University - Coimbatore","Contact : 04272496900"))

        list.add(CollegesDataClass("Maha College of Engineering, Valapadi, Salem","College Code : 2623","Affiliated University : Anna University - Coimbatore","Contact : 0427 - 2482886"))

        list.add(CollegesDataClass("Narasu's Sarathy Institute of Technology, Omalur, Salem","College Code: 2639","Affiliated University : Anna University - Coimbatore","Contact : 04290-249661"))

        list.add(CollegesDataClass("Rabidhranath Tagore College of Engineering for Women, Salem","College Code : 2645","Affiliated University : Anna University - Coimbatore","Contact : 04288227554"))

        list.add(CollegesDataClass("S.R.S. College of Engineering & Technology, Salem","College Code : 2663","Affiliated University : Anna University - Coimbatore","Contact : 04272489444"))

        list.add(CollegesDataClass("Salem College of Engineering and Technology, Salem","College Code : 2659","Affiliated University : Anna University - Coimbatore","Contact : 04272482556"))

        list.add(CollegesDataClass("Sona College of Technology, Salem","","","Contact : 0427-6455543"))

        list.add(CollegesDataClass("Sri Shanmugha College of Engineering and Technology, Salem","College Code : 2302","Affiliated University : Anna University","Contact : 04283 261199"))

        list.add(CollegesDataClass("Tagore Institute of Engineering and Technology, Attur, Salem","College Code : 2646","Affiliated University : Anna University - Coimbatore","Contact : 04282231374"))

        list.add(CollegesDataClass("The Kavery College of Engineering, Mettur, Salem","College Code : 2666","Affiliated University : Anna University - Coimbatore","Contact : 04298278156"))

        list.add(CollegesDataClass("V.S.A. Educational and Charitable Trust,s Group of Institutions, Salem","College Code : 2658","Affiliated University : Anna University - Coimbatore","Contact : 04272339988"))

        list.add(CollegesDataClass("Vinayaka Mission's Kirupanada Variyar Engineering College, Salem","","Affiliated University : Anna University","Contact : 0427-477218"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}