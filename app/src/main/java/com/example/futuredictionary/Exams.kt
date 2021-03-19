package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.AdapterView
import android.widget.GridView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_exams.*
import kotlinx.android.synthetic.main.activity_search.*

class Exams : AppCompatActivity(){

    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_exams)

        val list = ArrayList<ExamsDataClass>()
        list.add(ExamsDataClass("JEE (Joint Entrance Examination) Main", "Admissions into the NITs, CFTIs, IIITs are provided on the basis of the " +
                "JEE Main exam. " + "The candidates who qualify this exam can not only apply for admissions in these institutes but also become eligible for " +
                "appearing in the JEE Advanced exam."))
        list.add(ExamsDataClass("JEE Advanced", "JEE Advanced is organized with the aim to select the most suitable candidates for " +
                "admissions into the prestigious Indian Institutes of Technology. The candidates who clear the JEE Main exam can apply for this exam."))
        list.add(ExamsDataClass("SAAT (Siksha ‘O’ Anusandhan University Admission Test)","Siksha ‘O’ Anusandhan conducts a national-level engineering " +
                "entrance exam, SAAT, in order to screen candidates for enrolment in UG and PG degree programmes into the constituent colleges."))
        list.add(ExamsDataClass("APIIT NAT (National Aptitude Test)","The National Aptitude Test (NAT) is conducted by the Asia Pacific Institute of" +
                " Information Technology for selecting candidates for admissions into engineering courses. it is a national-level exam and its application form is " +
                "available in the month of October."))
        list.add(ExamsDataClass("TNEA (Tamil Nadu Engineering Admissions)","Admission in the engineering colleges of Tamil Nadu is provided on the basis " +
                "of marks obtained in the qualifying exam. The Anna University carries out the TNEA admission process for the purpose of selecting candidates for admissions."))
        list.add(ExamsDataClass("SRMJEEE (SRM Joint Engineering Entrance Exam)","The SRMJEE is a university-level entrance exam conducted in the month of May" +
                " in online mode. " + "The main purpose of this exam is to select the eligible candidates for admissions into the engineering courses offered by the SRM" +
                " Institute of Science and " + "Technology."))
        list.add(ExamsDataClass("VITEEE (Vellore Institute of Technology Engineering Entrance Exam)","The Vellore Institute of Technology provides enrolment to" +
                " the candidates into its engineering degree programme on the basis of VITEEE. The exam is held in the month of November and the candidates aspiring to get " +
                "admissions in this institute can submit their application online."))
        list.add(ExamsDataClass("VMU EEE (Vinayaka Mission University Engineering Entrance Examination)","The Vinayaka Mission University conducts entrance exam for" +
                " offering the selected candidates admissions into its engineering courses. The applicants who are interested and satisfy the eligibility can apply for this " +
                "exam in both online and offline modes."))
        list.add(ExamsDataClass("VITMEE (VIT Master’s Entrance Exam)","For selecting candidates for enrolment in the masters’ degree programme in the field of " +
                "engineering, the VIT conducts university-level entrance test. The admissions are offered in the 7 schools of VIT in which the candidates can pursue the PG " +
                "course of their choice."))
        list.add(ExamsDataClass("SRMGEET (SRM Graduate Engineering Entrance Test)","The SRM University conducts a university-level exam for offering admissions " +
                "into its M.Tech degree programme. The candidates fulfilling the eligibility requirement can apply for the exam which is held in the month of May " +
                "(tentatively)."))

        val recycler_view_exams : RecyclerView = findViewById(R.id.recycler_view_exams)

        recycler_view_exams.adapter=ExamsAdapter(list)
        recycler_view_exams.layoutManager= LinearLayoutManager(this)
        recycler_view_exams.setHasFixedSize(true)

    }
}