package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Villupuram : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_villupuram)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("A.K.T. Memorial College of Engineering and Technology, Kallakurichi, Villupuram","College Code : 1441","Affiliated University : Anna University","Contact : 04151223577"))

        list.add(CollegesDataClass("A.R. Engineering College, Vadakuchipalayam, Villupuram","College Code : 1436","Affiliated University : Anna University","Contact : 04146232121"))

        list.add(CollegesDataClass("Annai Teresa College of Engineering, Ulundurpet, Villupuram","College Code  : 1402","Affiliated University :Anna University","Contact :04149-224058"))

        list.add(CollegesDataClass("Dr. Paul's Engineering College, Vanur, Villupuram","College Code : 1406","Affiliated University : Anna University","Contact : 0413 - 2677006"))

        list.add(CollegesDataClass("E.S. College of Engineering and Technology, Ayyankoilpattu, Villupuram","College Code : 1428","Affiliated University : Anna University", "Contact : 04146222876"))

        list.add(CollegesDataClass("I.F.E.T. College of Engineering, Villupuram","College Code : 1408","Affiliated University : Anna University","Contact :04146231456"))

        list.add(CollegesDataClass("Idhaya Engineering College for Women, Chinna Salem, Villupuram","College Code: 1605","Affiliated University : Anna University","Contact :04151-58325"))

        list.add(CollegesDataClass("Maha Bharathi Engineering College, Kallakurichi, Villupuram","College Code :  1430","Affiliated University :Anna University","Contact :04151 - 256333"))

        list.add(CollegesDataClass("Mailam Engineering College, Tindivanam, Villupuram","College Code:1412","Affiliated University : Anna University","Contact : 04147-241551"))

        list.add(CollegesDataClass("Saraswathy College of Engineering and Technology, Villupuram","College Code :1449","Affiliated University : Anna University","Contact : 04147- 291370"))

        list.add(CollegesDataClass("Sri Aravindar Engineering College, Villupuram","College Code : 1433","Affiliated University:Anna University","Contact :0413 - 2671671 / 2671672"))

        list.add(CollegesDataClass("Sri Rangapoopathi College of Engineering, Villupuram","College Code:1445","Affiliated University : Anna University","Contact :  04145231357"))

        list.add(CollegesDataClass("Surya College of Engineering and Technology, Villupuram","College Code  :1434","Affiliated University : Anna University","Contact :04146263166"))

        list.add(CollegesDataClass("T.S.M. Jain College of Technology, Kallakurichi, Villupuram","College Code:  1415","Affiliated University : Anna University","Contact :04151 222451"))

        list.add(CollegesDataClass("University College of Engineering,Tindivanam, Tindivanam, Villupuram","College Code :1014","Affiliated University :Anna University","Contact : 04147238477"))

        list.add(CollegesDataClass("University College of Engineering,Villupuram","College Code :1013","Affiliated University : Anna University","Contact :04161224500"))

        list.add(CollegesDataClass("V.R.S. College of Engineering and Technology, Ulundurpet, Villupuram","College Code : 1421","Affiliated University : Anna University", "Contact : 04149-224253"))

        list.add(CollegesDataClass("Vedhantha Institute Of Technology, Ulundurpet, Villupuram","College Code:  1136","Affiliated University : Anna University","Contact : 04149 - 209609"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}