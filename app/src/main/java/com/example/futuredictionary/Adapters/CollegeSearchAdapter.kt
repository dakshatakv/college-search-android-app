package com.example.futuredictionary

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CollegeSearchAdapter(val context : Context, var collegeList: ArrayList<CollegeSearch>) : RecyclerView.Adapter<CollegeSearchAdapter.ViewHolder>() {

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0?.collegeName?.text = collegeList[p1].Name
        p0?.collegeCode?.text = collegeList[p1].Code
        p0?.collegeAffliatedBy?.text = collegeList[p1].Affliatedby
        p0?.collegePhoneno?.text = collegeList[p1].Phoneno
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.colleges_item, p0, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return collegeList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val collegeName = itemView.findViewById<TextView>(R.id.collegeName)
        val collegeCode = itemView.findViewById<TextView>(R.id.collegeCode)
        val collegeAffliatedBy = itemView.findViewById<TextView>(R.id.collegeAffliatedBy)
        val collegePhoneno = itemView.findViewById<TextView>(R.id.collegePhoneNo)
    }

    // To get the data to search Category
    fun filterList(filteredCourseList: ArrayList<CollegeSearch>) {
        this.collegeList = filteredCourseList;
        notifyDataSetChanged();
    }
}