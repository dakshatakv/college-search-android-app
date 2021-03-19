package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Kanyakumari : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kanyakumari)

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

        list.add(CollegesDataClass("Annai Vailankanni College of Engineering, Pottalkulam, Kanyakumari","College Code : 4999","Affiliated University : Anna University - Tirunelveli","Contact : 04652266500"))

        list.add(CollegesDataClass("Arunachala College of Engineering for Women, Nagercoil, Kanyakumari","College Code : 4944","Affiliated University : Anna University - Tirunelveli","Contact : 04651 - 200100"))

        list.add(CollegesDataClass("Bethlahem Institute of Engineering, Nadutheri, Kanyakumari","College Code : 4992","Affiliated University : Anna University - Tirunelveli","Contact : 04651298193"))

        list.add(CollegesDataClass("C.S.I. Institute of Technology, Thovalai, Kanyakumari","College Code : 4952","Affiliated University : Anna University - Tirunelveli","Contact : 04652-262146"))

        list.add(CollegesDataClass("D.M.I. Engineering College, Thovalai, Kanyakumari","College Code : 4946","Affiliated University : Anna University - Tirunelveli","Contact : 04652262066"))

        list.add(CollegesDataClass("Immanuel Arasar J J College of Engineering, Marthandam, Kanyakumari","College Code : 4932","Affiliated University : Anna University - Tirunelveli","Contact : 04651270853"))

        list.add(CollegesDataClass("James College of Engineering and Technology, Kanyakumari","College Code : 4987","Affiliated University : Anna University - Tirunelveli","Contact : 04652299812"))

        list.add(CollegesDataClass("Jayamatha Engineering College, Aralvaimozhi, Kanyakumari","College Code : 4956","Affiliated University : Anna University - Tirunelveli","Contact : 04652-2634401"))

        list.add(CollegesDataClass("K.N.S.K. College of Engineering, Agasteeswaram, Kanyakumari","College Code : 4985","Affiliated University : Anna University - Tirunelveli","Contact : 04652275922"))

        list.add(CollegesDataClass("Lord Jegannath College of Engineering and Technology, Kumarapuram, Kanyakumari","College Code : 4983","Affiliated University : Anna University - Tirunelveli","Contact : 04652-254917"))

        list.add(CollegesDataClass("Loyola Institute of Technology and Science, Agastheeswaram, Kanyakumari","College Code : 4993","Affiliated University : Anna University - Tirunelveli","Contact : 04652293571"))

        list.add(CollegesDataClass("M.E.T. Engineering College, Thovalai, Kanyakumari","College Code : 4929","Affiliated University : Anna University - Tirunelveli","Contact : 04652262623"))

        list.add(CollegesDataClass("Mar Ephraem College of Engineering and Technology, Kanyakumari","College Code : 4928","Affiliated University : Anna University","Contact : 04651271111"))

        list.add(CollegesDataClass("Maria Collge of Engineering and Technology, Kalkulam, Kanyakumari","College Code : 4927","Affiliated University : Anna University - Tirunelveli","Contact : 04651282577"))

        list.add(CollegesDataClass("Marthandam College of Engineering and Technology, Kanyakumari","College Code : 4984","Affiliated University : Anna University - Tirunelveli","Contact : 04651-210030"))

        list.add(CollegesDataClass("Narayanaguru College of Engineering, Kanyakumari","College Code : 4977","Affiliated University : Anna University - Tirunelveli","Contact : 04651284200"))

        list.add(CollegesDataClass("Noorul Islam University (Noorul Islam College of Engineering), Kanyakumari","","Affiliated University : Deemed University","Contact : 04651 -250566"))

        list.add(CollegesDataClass("Ponjesly College of Engineering, Agasteeswaram, Kanyakumari","College Code : 4981","Affiliated University : Anna University - Tirunelveli","Contact : 04652 -259680"))

        list.add(CollegesDataClass("Rajas International Institute of Technology for Women, Nagercoil, Kanyakumari","College Code : 4948","Affiliated University : Anna University - Tirunelveli","Contact : 04652 272223"))

        list.add(CollegesDataClass("Satyam College of Engineering & Technology, Kanyakumari","College Code  : 4943","Affiliated University : Anna University - Tirunelveli","Contact : 04652644224"))

        list.add(CollegesDataClass("Sivaji College of Engineering and Technology, Kanyakumari","College Code : 4938","Affiliated University : Anna University","Contact : 04712253115"))

        list.add(CollegesDataClass("St. Xavier Catholic College of Engineering, Kanyakumari","College Code  : 4971","Affiliated University : Anna University - Tirunelveli","Contact : 0465-2232560"))

        list.add(CollegesDataClass("Sun College of Engineering and Technology, Kanyakumari","College Code : 4972","Affiliated University : Anna University - Tirunelveli","Contact : 04652-281462"))

        list.add(CollegesDataClass("Tamizhan College of Engineering and Technology, Kanyakumari","College Code : 4950","Affiliated University : Anna University - Tirunelveli","Contact : 04652293877"))

        list.add(CollegesDataClass("Udaya School of Engineering, Kanyakumari","College Code : 4978","Affiliated University : Anna University - Tirunelveli","Contact : 04651 -239900"))

        list.add(CollegesDataClass("University College of Engineering, Nagercoil, Kanyakumari","College Code : 4023","Affiliated University : Anna University - Tirunelveli","Contact : 04652260510"))

        list.add(CollegesDataClass("Vins Christian College of Engineering, Kanyakumari","College Code : 4982","Affiliated University : Anna University - Tirunelveli","Contact : 04651 - 231650"))

        list.add(CollegesDataClass("Vins Christian Women's College of Engineering, Nagercoil, Kanyakumari","College Code : 4945","Affiliated University : Anna University - Tirunelveli","Contact : 04651231201"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}