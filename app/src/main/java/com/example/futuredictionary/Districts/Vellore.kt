package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Vellore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vellore)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Adhiparasakthi College of Engineering, Vellore","College Code : 1501","Affiliated University : Anna University","Contact :04173 - 242584"))

        list.add(CollegesDataClass("Annai Mira College Of Engineering And Technology, Vellore","","Affiliated University:Anna University","Contact : 04172-292925"))

        list.add(CollegesDataClass("Bharathidasan Engineering College, Tirupattur, Vellore","College Code  :1519","Affiliated University:Anna University","Contact :04179-242988"))

        list.add(CollegesDataClass("C. Abdul Hakeem College of Engineering and Technology, Melvisharam, Vellore","College Code :1505","Affiliated University:Anna University","Contact :04172 - 267387"))

        list.add(CollegesDataClass("G.G.R. College of Engineering, Vellore","College Code  :1506","Affiliated University:Anna University","Contact :04162915488"))

        list.add(CollegesDataClass("Ganadipathy Tulsi's Engineering College, Vellore","College Code:  1507","Affiliated University:Anna University","Contact :0416-2230900"))

        list.add(CollegesDataClass("Global Institute of Engineering and Technology, Walajah, Vellore","College Code:1523","Affiliated University:Anna University","Contact :04172266060"))

        list.add(CollegesDataClass("Kingston Engineering College, Katpadi, Vellore","College Code  :1520"," Affiliated University:Anna University","Contact :04162297031"))

        list.add(CollegesDataClass("Podhigai College of Engineering and Technology, Tirupattur, Vellore","College Code:1525","Affiliated University:Anna University","Contact :04179292228"))

        list.add(CollegesDataClass("Priyadarshini Engineering College, Vellore","College Code:  1510","Affiliated University:Anna University","Contact :04174 - 228477"))

        list.add(CollegesDataClass("Shri Sapthagiri Institute of Technology, Vellore","College Code:  1521","Affiliated University:Anna University","Contact :04177254374"))

        list.add(CollegesDataClass("Saraswathi Velu College of Engineering, Vellore","College Code  :1515","Affiliated University:Anna University","Contact :04172-291515"))

        list.add(CollegesDataClass("Ranippettai Engineering College, Vellore","College Code:1511","Affiliated University:Anna University","Contact :04172 - 232888"))

        list.add(CollegesDataClass("Sree Krishna College of Engineering, Vellore","College Code:  1438","Affiliated University:Anna University","Contact :0416-2913270 "))

        list.add(CollegesDataClass("Sri Krishna College of Engineering, Vellore","College Code:  2009","Affiliated University:Anna University","Contact :04177238111"))

        list.add(CollegesDataClass("Sri Nandhanam College of Engineering and Technology, Vellore","College Code:  1514","Affiliated University:Anna University","Contact:  04179-228146"))

        list.add(CollegesDataClass("St. John's College of Engineering & Technology for Women, Vellore","College Code:1527","Affiliated University:Anna University","Contact :04162233357"))

        list.add(CollegesDataClass("Thanthai Periyar Govt. Institute of Technology, Vellore","College Code  :1516","Affiliated University:Anna University","Contact :0416 - 2267762"))

        list.add(CollegesDataClass("VIT University (Vellore Institute of Technology), Vellore","","Affiliated University :Deemed University",""))
        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}