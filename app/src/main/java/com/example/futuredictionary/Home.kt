package com.example.futuredictionary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    val DistrictsList: ArrayList<String> = ArrayList()

    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_home)

        DistrictsList.add("Ariyalur")
        DistrictsList.add("Chennai")
        DistrictsList.add("Coimbatore")
        DistrictsList.add("Cuddalore")
        DistrictsList.add("Dharmapuri")
        DistrictsList.add("Dindigul")
        DistrictsList.add("Erode")
        DistrictsList.add("Kanchipuram")
        DistrictsList.add("Kanyakumari")
        DistrictsList.add("Karur")
        DistrictsList.add("Krishnagiri")
        DistrictsList.add("Madurai")
        DistrictsList.add("Nagapattinam")
        DistrictsList.add("Namakkal")
        DistrictsList.add("Nilgiris")
        DistrictsList.add("Perambalur")
        DistrictsList.add("Pudukottai")
        DistrictsList.add("Ramnad")
        DistrictsList.add("Salem")
        DistrictsList.add("Sivagangai")
        DistrictsList.add("Thanjavur")
        DistrictsList.add("Theni")
        DistrictsList.add("Tirunelveli")
        DistrictsList.add("Tirupur")
        DistrictsList.add("Tiruvallur")
        DistrictsList.add("Tiruvanamalai")
        DistrictsList.add("Tiruvarur")
        DistrictsList.add("Trichy")
        DistrictsList.add("Tuticorin")
        DistrictsList.add("Vellore")
        DistrictsList.add("Villupuram")
        DistrictsList.add("Virudhunagar")

        layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager
        recycler_view.adapter = DistrictsAdapter(this, DistrictsList)

    }
}