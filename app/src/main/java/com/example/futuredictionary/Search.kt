package com.example.futuredictionary

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.WindowManager
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_search.*

class Search : AppCompatActivity() {

    lateinit var adapter: CollegeSearchAdapter

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_search)

        val recycler_view_college_search = findViewById<RecyclerView>(R.id.recycler_view_college_search)

        recycler_view_college_search.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        adapter = CollegeSearchAdapter(this, Helper.Companion.getVersionsList())
        recycler_view_college_search.adapter = adapter

        search.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                filter(p0.toString())
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

    }

    fun filter(text: String) {

        val filteredColleges: ArrayList<CollegeSearch> = ArrayList()

        val collegesAry : ArrayList<CollegeSearch> = Helper.Companion.getVersionsList()

        for (i in collegesAry) {
            if (i.Name!!.toLowerCase().contains(text.toLowerCase()) || i.Affliatedby!!.toLowerCase().contains(text.toLowerCase())) {
                filteredColleges.add(i)
            }
        }

        //calling a method of the adapter class and passing the filtered list
        adapter.filterList(filteredColleges);
    }

}
