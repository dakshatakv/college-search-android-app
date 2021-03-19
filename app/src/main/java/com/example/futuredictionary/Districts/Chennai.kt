package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Chennai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chennai)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("Aalim Muhammed Salegh College of Engineering, Chennai","","","Contact : 04426842086"))

        list.add(CollegesDataClass("Aarupadai Veedu Institute of Technology, Chennai","","Affiliated University : Anna University","Contact : 044 - 27443801"))

        list.add(CollegesDataClass("Agni College of Technology, Chennai","College Code : 1316","Affiliated University : Anna University",""))

        list.add(CollegesDataClass("Alpha College of Engineering, Chennai","College Code : 1228","Affiliated University : Anna University","Contact : 044 - 2649 5211"))

        list.add(CollegesDataClass("Annai Velilankanni's College Of Engineering, Chennai","","Affiliated University : Anna University","Contact : 044-22790022"))

        list.add(CollegesDataClass("Asan Memorial College of Engineering and Technology, Chengalpattu, Chennai","","Affiliated University : Anna University","Contact : 044-27447283"))

        list.add(CollegesDataClass("B.S. Abdur Rahman University (B.S. Abdur Rahman Crescent Engineering College), Chennai","","","Contact : 044-22751347"))

        list.add(CollegesDataClass("Balaji Institute of Engineering and Technology,, Kanchipuram, Chennai","College Code : 1435","Affiliated University : Anna University","Contact : 044-27498544"))

        list.add(CollegesDataClass("Bharath University (Bharath Institute of Higher Education and Research), Selaiyur, Chennai","","Affiliated University : Deemed University","Contact : 044 - 2229 0742"))

        list.add(CollegesDataClass("Central Institute of Plastic Engineering and Technology (CIPET), Guindy, Chennai","College Code : 1321","Affiliated University : Anna University","Contact : 044-22254701"))

        list.add(CollegesDataClass("Chennai Institute of Technology, Chennai","College Code : 1399","Affiliated University : Anna University",""))

        list.add(CollegesDataClass("Dhanalakshmi College of Engineering, Sriperumbudur, Chennai","College Code : 1405","Affiliated University : Anna University","Contact : 044-27178345"))

        list.add(CollegesDataClass("Dr. MGR University (Dr. M.G.R. Educational and Research Insitute), Chennai","","Affiliated University : Deemed University","Contact : 044-23782176"))

        list.add(CollegesDataClass("Easwari Engineering College, Ramapuram, Chennai","","Affiliated University : Anna University","Contact : 044 - 22490853"))

        list.add(CollegesDataClass("G.K.M. College of Engineering and Technology, Chennai","","Affiliated University : Anna University","Contact : 044 - 2279 0253"))

        list.add(CollegesDataClass("Gojan School of Business and Technology, Chennai","College Code : 1123","Affiliated University : Anna University", ""))

        list.add(CollegesDataClass("Gopal Ramalingam Memorial Engineering College, Chennai","College Code : 1429","Affiliated University : Anna University","Contact : 044-27190114"))

        list.add(CollegesDataClass("Hindustan University (Hindustan College of Engineering), Chennai","","",""))

        list.add(CollegesDataClass("Jawahar Engineering College, Chennai","College Code : 1447","Affiliated University : Anna University",""))

        list.add(CollegesDataClass("Jeppiaar Engineering College, Sholinganallur, Chennai","College Code : 1306","Affiliated University : Anna University","Contact : 044 -2450 2818"))

        list.add(CollegesDataClass("Jerusalem College of Engineering, Chennai","","Affiliated University : Anna University","Contact : 044- 22461404"))

        list.add(CollegesDataClass("K.C.G. College of Technology, Chennai","","Affiliated University : Anna University","Contact : 044-24503232"))

        list.add(CollegesDataClass("Kings Engineering College, Sriperumbudur, Chennai","College Code : 1207","Affiliated University : Anna University","Contact : 044- 2710 7244"))

        list.add(CollegesDataClass("Loyola Institute of Technology, Sriperumbudur, Chennai","College Code : 1225","Affiliated University : Anna University","Contact : 044 - 25022081"))

        list.add(CollegesDataClass("Loyola-ICAM College of Engineering and Technology, Chennai","","Affiliated University : Anna University","Contact : 044 - 28178490"))

        list.add(CollegesDataClass("Madha Engineering College, Chennai","College Code : 1411","Affiliated University : Anna University","Contact : 044 - 2478 0732"))

        list.add(CollegesDataClass("Madha Institute of Engineering and Technology, Chennai","College Code : 3200","Affiliated University : Anna University","Contact : 04428140212"))

        list.add(CollegesDataClass("Magna College of Engineering, Tiruvallur, Chennai","College Code : 1108","Affiliated University : Anna University","Contact : 044-27626303"))

        list.add(CollegesDataClass("Measi Academy of Architecture, Chennai","College Code : 1308","Affiliated University : Anna University",""))

        list.add(CollegesDataClass("Meenakshi College of Engineering, Chennai","College Code : 1509","Affiliated University : Anna University","Contact : 04423644773"))

        list.add(CollegesDataClass("Meenakshi Sundararajan Engineering College, Chennai","","Affiliated University : Anna University",""))

        list.add(CollegesDataClass("Misrimal Navajee Munoth Jain Engineering College, Chennai","College Code : 1310","Affiliated University : Anna University","Contact : 044 - 24960101"))

        list.add(CollegesDataClass("Mohamed Sathak A.J. College of Engineering, Chennai","College Code : 1301","Affiliated University : Anna University","Contact : 04114 - 235761"))

        list.add(CollegesDataClass("New Prince Shri Bhavani College of Engineering and Technology, Chennai","College Code : 1431","Affiliated University : Anna University","Contact : 044 - 22420028"))

        list.add(CollegesDataClass("P.M.R. Engineering College, Chennai","College Code : 1125","Affiliated University : Anna University","Contact : 04465155925"))

        list.add(CollegesDataClass("Panimalar Engineering College, Chennai","College Code : 1210","Affiliated University : Anna University","Contact : 044-2649 0404"))

        list.add(CollegesDataClass("Panimalar Institute of Technology, Chennai","College Code : 1231", "Affiliated University : Anna University","Contact : 044-26491113"))

        list.add(CollegesDataClass("PERI Institute of Technology, Chennai","College Code : 1452", "Affiliated University : Anna University","Contact : 96770 52534"))

        list.add(CollegesDataClass("Prince Dr. K. Vasudevan College of Engineering and Technology, Chennai","College Code : 1442", "Affiliated University : Anna University","Contact : 044-27497075"))

        list.add(CollegesDataClass("Prince Shri Venkateshwara Padmavathy Engineering College, Chengalpattu, Chennai","College Code : 1414","Affiliated University : Anna University","Contact : 044-27497075"))

        list.add(CollegesDataClass("Raja Rajeswari Engineering College, Chennai","","","Contact : 044 - 26534011"))

        list.add(CollegesDataClass("S.A. Engineering College, Chennai","","Affiliated University : Anna University","Contact : 044-26801999"))

        list.add(CollegesDataClass("S.K.R. Engineering College, Chennai","","Affiliated University	: Anna University","Contact : 044-26494205"))

        list.add(CollegesDataClass("S.M.K. Fomra Institute of Technology, Chennai","","Affiliated University : Anna University",""))

        list.add(CollegesDataClass("Sakthi Mariamman Engineering College, Chennai","College Code : 1214", "Affiliated University : Anna University","Contact Number 1	044-27156742"))

        list.add(CollegesDataClass("Sathyabama University (Sathyabama Engineering College), Chennai","","Affiliated University : Deemed University","Contact : 044-24503150"))

        list.add(CollegesDataClass("Sree Sastha Institute of Engineering and Technology, Chennai","College Code : 1217","","Contact : 044- 26810114"))

        list.add(CollegesDataClass("Sri Krishna Engineering College, Chennai","College Code : 1335", "Affiliated University : Anna University","Contact : 044-27145503"))

        list.add(CollegesDataClass("Sri Lakshmi Ammal Engineering College, Chennai","","","Contact : 044 - 22290443"))

        list.add(CollegesDataClass("Sri Muthukumaran Institute of Technology, Chennai","College Code : 1218","Affiliated University : Anna University","Contact : 044-24780002"))

        list.add(CollegesDataClass("SRET (Sri Ramachandra Engineering and Technology)","","Affiliated University : Deemed University","Contact : 91-9444-774-795"))

        list.add(CollegesDataClass("Sri Ramanujar Engineering College, Chennai","College Code : 1426","Affiliated University : Anna University","Contact : 044 -22751380"))

        list.add(CollegesDataClass("Sri Sai Ram Institute of Technology, Chennai","","Affiliated University : Anna University","Contact : 04432465554"))

        list.add(CollegesDataClass("Sri Sivasubramaniya Nadar College of Engineering, Chennai","College Code : 1315","Affiliated University : Anna University"," Contact : 044-27474844"))

        list.add(CollegesDataClass("Srinivasa Institute of Engineering and Technology, Chennai","College Code : 1221","Affiliated University : Anna University","Contact : 044-26492525"))

        list.add(CollegesDataClass("St. Peter's College of Engineering and Technology, Chennai","College Code : 1127", "Affiliated University : Anna University","Contact : 044-26558089"))

        list.add(CollegesDataClass("St. Peters Engineering College, Chennai","","Affiliated University : Anna University","Contact : 044-26558089"))

        list.add(CollegesDataClass("T.J. Institute of Technology, Chennai","","Affiliated University : Anna University","Contact : 044-66041234"))

        list.add(CollegesDataClass("Tagore Engineering College, Chennai","","Affiliated University	: Anna University","Contact : 044-27409725"))

        list.add(CollegesDataClass("Thangavelu Engineering College, Chennai","College Code : 1319","Affiliated University : Anna University","Contact : 044-24911282"))

        list.add(CollegesDataClass("University Departments of Anna University Chennai, ACT Campus, Chennai","College Code : 1002", "Affiliated University : Anna University","Contact : 04422203523"))

        list.add(CollegesDataClass("University Departments of Anna University Chennai, CEG Campus, Chennai","College Code : 1001", "Affiliated University : Anna University","Contact : 04422203200"))

        list.add(CollegesDataClass("University Departments of Anna University Chennai, MIT Campus, Chennai","College Code : 1004", "Affiliated University	Anna University","Contact : 04422516001"))

        list.add(CollegesDataClass("University Departments of Anna University Chennai, SAP Campus, Chennai","College Code : 1003", "Affiliated University : Anna University","Contact : 04422203700"))

        list.add(CollegesDataClass("Vel Tech, Chennai","College Code : 1131","Affiliated University : Anna University","Contact : 044-26841601"))

        list.add(CollegesDataClass("Vel Tech Dr.RR and Dr.SR Technical University (Vel Tech Engineering College), Chennai","","Affiliated University : Deemed University","Contact : 044-26840181"))

        list.add(CollegesDataClass("Vel Tech High Tech Dr.Rangarajan Dr.Sakunthala Engineering College, Chennai","College Code : 1122", "Affiliated University : Anna University","Contact : 044- 26840249"))

        list.add(CollegesDataClass("Vel Tech Multi Tech Dr.Rangarajan Dr.Sakunthala Engineering College, Chennai","College Code : 1118", "Affiliated University : Anna University","Contact : 044-26841061"))

        list.add(CollegesDataClass("Velammal Engineering College, Chennai","College Code : 1120", "Affiliated University : Anna University","Contact : 044 - 26591860"))

        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}