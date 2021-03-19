package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Thanjavur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thanjavur)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Anna University Tiruchirappalli, Pattukkottai, Pattukkottai, Thanjavur","College Code : 3021","Affiliated University : Anna University - Trichy","Contact : 04373293301"))

        list.add(CollegesDataClass("Annai College of Engineering and Technology, Kumbakonam, Thanjavur","College Code : 3849","Affiliated University : Anna University - Trichy","Contact : 04352402243"))

        list.add(CollegesDataClass("As-Salam College of Engineering and Technology, Thanjavur","College Code : 3855","Affiliated University : Anna University - Trichy","Contact : 0435-2473355"))

        list.add(CollegesDataClass("K.S.K College of Engineering and Technology, Kumbakonam, Thanjavur","College Code : 3456","Affiliated University : Anna University","Contact : 0435 2417588"))

        list.add(CollegesDataClass("Parisutham Institute of Technology and Science, Thanjavur","College Code : 3833","Affiliated University : Anna University - Trichy","Contact : 04362 256585"))

        list.add(CollegesDataClass("Periyar Maniammai University (Periyar Maniammai College of Technology for Women), Vallam, Thanjavur","","Affiliated University  : Deemed University","Contact : 04362-264642"))

        list.add(CollegesDataClass("Ponnaiyah Ramajayam College of Engineering and Technology, Thanjavur","College Code : 3824","Affiliated University : Anna University - Trichy","Contact : 04362266950"))

        list.add(CollegesDataClass("PRIST University (P.R. Engineering College), Thanjavur","College Code : 3814","Affiliated University : Deemed University",""))

        list.add(CollegesDataClass("SASTRA University (Shanmugha Arts, Science, Technology and Research Academy), Thanjavur","","Affiliated University : Deemed University",""))

        list.add(CollegesDataClass("SMR East Coast College of Engineering and Technology, Thanjavur","College Code  : 3451","Affiliated University : Anna University - Trichy","Contact : 04373-279430"))

        list.add(CollegesDataClass("St. Joseph's College of Engineering and Technology, Thanjavur","","Affiliated University : Anna University","Contact : 04362282465"))

        list.add(CollegesDataClass("Star Lion College of Engineering and Technology, Thanjavur","College Code : 3766","Affiliated University : Anna University - Trichy","Contact : 04374-243243"))

        list.add(CollegesDataClass("Vandayar Engineering College, Thanjavur","College Code : 3848","Affiliated University : Anna University - Trichy","Contact : 04362267055"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}