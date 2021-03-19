package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Kanchipuram : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kanchipuram)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("A.C.T. College of Engineering and Technology, Maduranthagam, Kanchipuram","College Code : 1323","Affiliated University : Anna University","Contact : 04427293090"))

        list.add(CollegesDataClass("A.R.M. College of Engineering and Technology, Chengalpet, Kanchipuram","College Code : 1232","Affiliated University : Anna University","Contact : 044 37411244"))

        list.add(CollegesDataClass("Adhi College of Engineering and Technology, Sankarapuram, Kanchipuram","College Code : 1233","Affiliated University : Anna University","Contact : 04427290096"))

        list.add(CollegesDataClass("Adhiparasakthi Engineering College, Kanchipuram","College Code : 1401","Affiliated University : Anna University","Contact : 044-27529247"))

        list.add(CollegesDataClass("Aksheyaa College of Engineering, Kanchipuram","College Code : 1331","Affiliated University : Anna University","Contact : 04427568003"))

        list.add(CollegesDataClass("Anand Institute of Higher Technology, Chengalpattu, Kanchipuram","College Code : 1303","Affiliated University : Anna University","Contact : 044-27475530"))

        list.add(CollegesDataClass("Apollo Engineering College, Sriperambudur, Kanchipuram","College Code : 1230","Affiliated University : Anna University","Contact : 04426812300"))

        list.add(CollegesDataClass("Apollo Priyadarshanam Institute of Technology, Sriperumbudur, Kanchipuram","College Code : 1455","Affiliated University : Anna University","Contact : 044 - 2436 2183"))

        list.add(CollegesDataClass("Arasu Engineering College, Kumbakonam, Kanchipuram","College Code : 3804","Affiliated University : Anna University - Trichy","Contact : 0435-3299999"))

        list.add(CollegesDataClass("Arignar Anna Institute of Science and Technology, Sriperambudur, Kanchipuram","College Code : 1201","Affiliated University : Anna University","Contact : 044 - 27162344"))

        list.add(CollegesDataClass("Balamani Arunachalam Educational & Charitable Trust's Group of Institution, Chengalpet, Kanchipuram","College Code : 1334","Affiliated University : Anna University","Contact : 044-37413999"))

        list.add(CollegesDataClass("Chendu College of Engineering and Technology, Kanchipuram","College Code : 1444","Affiliated University : Anna University","Contact : 044 - 26288558"))

        list.add(CollegesDataClass("Dhaanish Ahmed College of Engineering, Padappai, Kanchipuram","College Code : 1424","Affiliated University : Anna University","Contact : 044 - 71736800"))

        list.add(CollegesDataClass("Dhanalakshmi Srinivasan College of Engineering and Technology, Mamallapuram, Kanchipuram","","Affiliated University : Anna University","Contact : 044-27442844"))

        list.add(CollegesDataClass("Indira Gandhi College of Engineering and Technology for Women, Chengalpattu, Kanchipuram","College Code : 1234","Affiliated University : Anna University","Contact : 044-27493419"))

        list.add(CollegesDataClass("JEI Mathaajee College of Engineering, Kanchipuram","College Code : 1235","Affiliated University : Anna University","Contact : 04427294569"))

        list.add(CollegesDataClass("Jeppiaar Institute of Technology, Kanchipuram","College Code : 1140","Affiliated University : Anna University","Contact : 044-27159000"))

        list.add(CollegesDataClass("Kalsar College of Engineering, Sriperambudur, Kanchipuram","College Code : 1204","Affiliated University : Anna University","Contact : 04424994666"))

        list.add(CollegesDataClass("Kanchi Pallavan Engineering College, Kanchipuram","College Code : 1208","Affiliated University : Anna University","Contact : 04112 - 242223"))

        list.add(CollegesDataClass("Karpaga Vinayaga College of Engineering and Technology, Maduranthagam, Kanchipuram","","","Contact : 044-27565486"))

        list.add(CollegesDataClass("Lord Ayyappa Institute of Engineering and Technology, Walajabad, Kanchipuram","College Code : 1443","Affiliated University : Anna University","Contact : 04427290702"))

        list.add(CollegesDataClass("Lord Venkateshwara Engineering College, Walajabad, Kanchipuram","College Code : 1205","Affiliated University : Anna University","Contact : 044 - 27258047"))

        list.add(CollegesDataClass("Maamallan Institute of Technology, Sriperambudur, Kanchipuram","","Affiliated University : Anna University","Contact : 044 - 27107071"))

        list.add(CollegesDataClass("P.B. College of Engineering, Sriperambudur, Kanchipuram","College Code : 1222","Affiliated University : Anna University","Contact : 044- 24766386"))

        list.add(CollegesDataClass("P.T. Lee Chengalvaraya Naicker College of Engineering and Technology, Kanchipuram","College Code : 1226","Affiliated University : Anna University","Contact : 04427294308"))

        list.add(CollegesDataClass("Pallava Raja College of Engineering, Kanchipuram","College Code : 1104","Affiliated University : Anna University","Contact : 044 - 27290799"))

        list.add(CollegesDataClass("Pallavan College of Engineering, Iyyengarkulam, Kanchipuram","College Code : 1209","Affiliated University : Anna University","Contact : 044 - 27277967"))

        list.add(CollegesDataClass("Rajalakshmi Engineering College, Sriperambudur, Kanchipuram","College Code : 1211","Affiliated University : Anna University","Contact : 04427156750"))

        list.add(CollegesDataClass("Rajalakshmi Institute of Technology, Sriperambudur, Kanchipuram","College Code  : 1432","Affiliated University : Anna University","Contact : 04426442472"))

        list.add(CollegesDataClass("Rajiv Gandhi College of Engineering, Sriperumbudur, Kanchipuram","","Affiliated University : Anna University","Contact : 044-27163100"))

        list.add(CollegesDataClass("Rrase College of Engineering, Sriperambudur, Kanchipuram","College Code : 1437","Affiliated University : Anna University","Contact : 04464500437"))

        list.add(CollegesDataClass("S.R.R. Engineering College, Kanchipuram","College Code  : 1320","Affiliated University : Anna University","Contact : 04114-274839"))

        list.add(CollegesDataClass("Saveetha Engineering College, Sriperumbudur, Kanchipuram","College Code : 1216","Affiliated University : Anna University","Contact : 044-26811499"))

        list.add(CollegesDataClass("SCSVMV University (Sri Chandrasekharendra Saraswathi Viswa Mahavidyalaya), Kanchipuram","","Affiliated University : Deemed University",""))

        list.add(CollegesDataClass("Shri Andal Alagar College of Engineering, Kanchipuram","College Code : 1417","Affiliated University : Anna University","Contact : 044-27565662"))

        list.add(CollegesDataClass("Sri Krishna Institute of Technology, Sriperambudur, Kanchipuram","College Code : 1427","Affiliated University : Anna University","Contact : 04427145520"))

        list.add(CollegesDataClass("Sri Padmavathy College of Engineering, Sriperambudur, Kanchipuram","College Code : 1220","Affiliated University : Anna University","Contact : 044-27197501"))

        list.add(CollegesDataClass("Sri Venkateswara College of Engineering, Sriperambudur, Kanchipuram","College Code : 1219","Affiliated University :Anna University","Contact : 044-27152000"))

        list.add(CollegesDataClass("Sri Venkateswaraa College of Technology, Sriperambudur, Kanchipuram","College Code : 1413","Affiliated University : Anna University","Contact : 044-30139431"))

        list.add(CollegesDataClass("St. Joseph College of Engineering, Sriperumpudur, Kanchipuram","College Code : 1325","Affiliated University : Anna University","Contact : 04427107072"))

        list.add(CollegesDataClass("St. Joseph's College of Engineering, Kanchipuram","College Code : 1317","Affiliated University : Anna University","Contact : 04424501060"))

        list.add(CollegesDataClass("St.Joseph's Institute of Technology, Kanchipuram","College Code : 1149","Affiliated University : Anna University","Contact : 04427107072"))

        list.add(CollegesDataClass("The New Royal College of Engineering and Technology, Kanchipuram","College Code : 1326","Affiliated University : Anna University","Contact : 04427443116"))

        list.add(CollegesDataClass("Thirumalai Engineering College, Kanchipuram","College Code : 1517","Affiliated University : Anna University","Contact : 044-27277898"))

        list.add(CollegesDataClass("University College of Engineering, Kanchipuram","College Code : 1026","Affiliated University : Anna University",""))

        list.add(CollegesDataClass("V.I. Institute of Technology, Chengalpet, Kanchipuram","College Code : 1333","Affiliated University : Anna University","Contact : 04427401696"))

        list.add(CollegesDataClass("V.K.K. Vijayan Engineering College, Sriperambudur, Kanchipuram","College Code : 1227","Affiliated University : Anna University","Contact : 044-27190706"))

        list.add(CollegesDataClass("Valliammai Engineering College, Kanchipuram","","Affiliated University : Anna University","Contact : 044 - 27454784"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}