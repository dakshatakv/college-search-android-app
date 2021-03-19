package com.example.futuredictionary

import android.content.Intent
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.view.WindowManager
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class Menu : AppCompatActivity() {

    private lateinit var homeBtn:ImageButton
    private lateinit var examsBtn:ImageButton
    private lateinit var notiBtn:ImageButton
    private lateinit var searchBtn:ImageButton
    private lateinit var profileBtn:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_menu)

        // init views
        homeBtn = findViewById(R.id.homeBtn)
        examsBtn = findViewById(R.id.examsBtn)
        profileBtn = findViewById(R.id.profileBtn)
        searchBtn = findViewById(R.id.searchBtn)
        notiBtn = findViewById(R.id.notiBtn)

        homeBtn.setOnClickListener {
            homeBtn.setImageResource(R.drawable.ic_baseline_home_brown)
            searchBtn.setImageResource(R.drawable.ic_baseline_search_24)
            examsBtn.setImageResource(R.drawable.ic_baseline_menu_book_24)
            notiBtn.setImageResource(R.drawable.ic_baseline_notifications_none_24)
            profileBtn.setImageResource(R.drawable.ic_baseline_person_outline_24)
            val intent = Intent(this@Menu, Home::class.java)
            startActivity(intent)
        }

        searchBtn.setOnClickListener {
            homeBtn.setImageResource(R.drawable.ic_baseline_home_24)
            searchBtn.setImageResource(R.drawable.ic_baseline_search_brown)
            examsBtn.setImageResource(R.drawable.ic_baseline_menu_book_24)
            notiBtn.setImageResource(R.drawable.ic_baseline_notifications_none_24)
            profileBtn.setImageResource(R.drawable.ic_baseline_person_outline_24)
            val intent = Intent(this@Menu, Search::class.java)
            startActivity(intent)
        }

        examsBtn.setOnClickListener {
            homeBtn.setImageResource(R.drawable.ic_baseline_home_24)
            searchBtn.setImageResource(R.drawable.ic_baseline_search_24)
            examsBtn.setImageResource(R.drawable.ic_baseline_menu_book_brown)
            notiBtn.setImageResource(R.drawable.ic_baseline_notifications_none_24)
            profileBtn.setImageResource(R.drawable.ic_baseline_person_outline_24)
            val intent = Intent(this@Menu, Exams::class.java)
            startActivity(intent)
        }

        notiBtn.setOnClickListener {
            homeBtn.setImageResource(R.drawable.ic_baseline_home_24)
            searchBtn.setImageResource(R.drawable.ic_baseline_search_24)
            examsBtn.setImageResource(R.drawable.ic_baseline_menu_book_24)
            notiBtn.setImageResource(R.drawable.ic_baseline_notifications_none_brown)
            profileBtn.setImageResource(R.drawable.ic_baseline_person_outline_24)
            val intent = Intent(this@Menu, Notification::class.java)
            startActivity(intent)
        }

        profileBtn.setOnClickListener {
            homeBtn.setImageResource(R.drawable.ic_baseline_home_24)
            searchBtn.setImageResource(R.drawable.ic_baseline_search_24)
            examsBtn.setImageResource(R.drawable.ic_baseline_menu_book_24)
            notiBtn.setImageResource(R.drawable.ic_baseline_notifications_none_24)
            profileBtn.setImageResource(R.drawable.ic_baseline_person_outline_brown)
            val intent = Intent(this@Menu, Profile::class.java)
            startActivity(intent)
        }

    }
}





