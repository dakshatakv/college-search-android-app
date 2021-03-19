package com.example.futuredictionary

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.colleges_item.view.*
import kotlinx.android.synthetic.main.exam_item.view.*

class ExamsAdapter(private val examsList : List<ExamsDataClass>) : RecyclerView.Adapter<ExamsAdapter.ExamsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExamsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.exam_item,
            parent, false)
        return ExamsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExamsViewHolder,position:Int) {
        val currentItem = examsList[position]
        holder.ExamTitle.text = currentItem.Title
        holder.ExamDesc.text = currentItem.Description
    }

        override fun getItemCount() = examsList.size

    class ExamsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ExamTitle: TextView = itemView.title
        val ExamDesc: TextView = itemView.description
    }
}