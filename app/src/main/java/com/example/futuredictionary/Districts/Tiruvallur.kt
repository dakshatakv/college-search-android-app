package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Tiruvallur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiruvallur)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("B.K.R. College of Engineering and Technology, Arakkonam, Tiruvallur","College Code:1238","Affiliated University:Anna University","Contact:04427885400"))

        list.add(CollegesDataClass("Bhajarang Engineering College, Thirunindravur, Tiruvallur","College Code:  1102","Affiliated University:Anna University","Contact :04116-224664"))

        list.add(CollegesDataClass("D.M.I. College of Engineering, Tiruvallur","College Code:1202","Affiliated University:Anna University",""))

        list.add(CollegesDataClass("GRT Institute of Engineering and Technology, TIRUTTANI, Tiruvallur","","Affiliated University:Anna University","Contact:044-27885400"))

        list.add(CollegesDataClass("Indira Institute of Engineering and Technology, Thiruvallur, Tiruvallur","College Code:1229","Affiliated University:Anna University","Contact:044-27650118"))

        list.add(CollegesDataClass("J.N.N. Institute of Engineering, Tiruvallur","College Code:1126","Affiliated University:Anna University","Contact :044-27629611"))

        list.add(CollegesDataClass("Jaya Engineering College, Thiruninravur, Tiruvallur","College Code:  1106","Affiliated University:Anna University","Contact:044-26390041"))

        list.add(CollegesDataClass("Jaya Suriya Engineering College, Tiruvallur","College Code:1440","Affiliated University:Anna University","Contact:044-27680286"))

        list.add(CollegesDataClass("John Bosco Engineering College, Tiruvallur","College Code:1245","Affiliated University:Anna University","Contact:04427600666"))

        list.add(CollegesDataClass("Lakshmi Chand Rajani College of Engineering and Technology, Thiruthani, Tiruvallur","College Code:1107","Affiliated University:Anna University","Contact:044-27874444"))

        list.add(CollegesDataClass("Prathyusha Institute of Technology and Management, Tiruvallur","College Code:1110","Affiliated University:Anna University","Contact :04427620512"))

        list.add(CollegesDataClass("R.M.D. Engineering College, Tiruvallur","","","Contact:04427925562"))

        list.add(CollegesDataClass("R.M.K. College of Engineering and Technology, Tiruvallur","College Code:  1128","Affiliated University:Anna University","Contact:04437983829"))

        list.add(CollegesDataClass("R.V.S. Padhmavathy College of Engineering and Technology, Tiruvallur","College Code:1141","Affiliated University:Anna University",""))

        list.add(CollegesDataClass("Rajalakshmi Institute of Technology, thriuvallur, Tiruvallur","","","Contact :04437181600"))

        list.add(CollegesDataClass("Sakthi Engineering College, tiruvallur, Tiruvallur","College Code:  1416","Affiliated University:Anna University","Contact:044-64522272"))

        list.add(CollegesDataClass("SAMS College of Engineering and Technology,Tiruvallur","College Code:1124","Affiliated University:Anna University","Contact:044-42173160,"))

        list.add(CollegesDataClass("Siva Institute of Frontier Technology - Technical Campus, Thiruvallur, Tiruvallur","College Code:1139","Affiliated University:Anna University","Contact:044-27626029 "))

        list.add(CollegesDataClass("Sree Sastha College of Engineering, Thiruvallur, Tiruvallur","College Code:  1242","Affiliated University:Anna University","Contact:04426810121"))

        list.add(CollegesDataClass("Sri Kalaimagal College of Engineering, Tiruvallur","College Code:  1244","Affiliated University:Anna University","Contact :04427655531"))

        list.add(CollegesDataClass("Sri Ram Engineering College, Tiruvallur","","Affiliated University:Anna University","Contact:044 27689364"))

        list.add(CollegesDataClass("Sri Venkateswara College of Engineering and Technology, Tiruvallur","College Code:1116","Affiliated University:Anna University","Contact :04116 - 264444"))

        list.add(CollegesDataClass("Sri Venkateswara Institute of Science and Technology, Tiruvallur","College Code:1121","Affiliated University:Anna University","Contact :044-27666699"))

        list.add(CollegesDataClass("T.J.S. Engineering College, Tiruvallur","College Code:1241","Affiliated University:Anna University","Contact:04427925111"))

        list.add(CollegesDataClass("Velammal Institute of Technology, Tiruvallur","College Code:  1237","Affiliated University:Anna University","Contact :04427984397"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}