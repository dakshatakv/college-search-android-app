package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Sivagangai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sivagangai)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("A.C. College of Engineering and Technology, Karaikudi, Sivagangai","College Code : 3901","Affiliated University : Anna University - Trichy","Contact : 04565-224535"))

        list.add(CollegesDataClass("Central Electro Chemical Research Institute, Karaikudi, Sivagangai","College Code : 3012","Affiliated University : Anna University - Trichy","Contact : 04565-225792"))

        list.add(CollegesDataClass("K.L.N. College of Engineering, Sivagangai","","Affiliated University : Anna University","Contact : 04522090971"))

        list.add(CollegesDataClass("K.L.N. College of Information Technology, Sivagangai","","Affiliated University : Anna University","Contact : 0452-6562566"))

        list.add(CollegesDataClass("Karaikudi Institute of Technology and Karaikudi Institute of Management, Sivagangai","College Code : 5533","Affiliated University : Anna University","Contact : 04565- 232366"))

        list.add(CollegesDataClass("Madurai Institute of Engineering and Technology, Manamadurai, Sivagangai","College Code : 3842","Affiliated University : Anna University - Trichy","Contact : 04522090565"))

        list.add(CollegesDataClass("Pandiyan Saraswathi Yadav Engineering College, Sivagangai","College Code : 3912","Affiliated University : Anna University - Trichy","Contact : 04575-201125"))

        list.add(CollegesDataClass("Pannai College of Engineering and Technology, Sivagangai","College Code : 3916","Affiliated University : Anna University - Trichy","Contact : 04575241411"))

        list.add(CollegesDataClass("Sree Raaja Raajan College of Engineering and Technology, Karaikudi, Sivagangai","College Code : 5502","","Contact : 04565 - 234230"))

        list.add(CollegesDataClass("St. Michael College of Engineering and Technology, Sivagangai","","Affiliated University : Anna University","Contact : 04575-232009"))
        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}