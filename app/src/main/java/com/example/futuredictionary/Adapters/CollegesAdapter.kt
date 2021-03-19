package com.example.futuredictionary

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.colleges_item.view.*

class CollegesAdapter(private val collegesList : List<CollegesDataClass>) : RecyclerView.Adapter<CollegesAdapter.CollegeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollegeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.colleges_item,
            parent, false)
        return CollegeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CollegeViewHolder,position:Int){
        val currentItem = collegesList[position]
        holder.collegeName.text=currentItem.Name
        holder.collegeCode.text=currentItem.Code
        holder.collegeAffliatedBy.text=currentItem.Affliatedby
        holder.collegePhoneNo.text=currentItem.Phoneno

        holder.itemView.setOnClickListener {

            if (holder.collegeName.text.equals("K.K.C. College of Engineering and Technology, Jayankondam, Ariyalur")) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.colleges-in-tamilnadu.com/colleges/727/K-K-C-College-of-Engineering-and-Technology.html"))
                holder.itemView.context.startActivity(intent)
            } else if (holder.collegeName.text.equals("Meenakshi Ramaswamy Engineering College, Udayarpalayam, Ariyalur")) {
                val intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("http://www.colleges-in-tamilnadu.com/colleges/802/Meenakshi-Ramaswamy-Engineering-College.html")
                )
                holder.itemView.context.startActivity(intent)
            }

        }
    }

    override fun getItemCount() = collegesList.size

    class CollegeViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var collegeName: TextView = itemView.collegeName
        val collegeCode: TextView = itemView.collegeCode
        var collegeAffliatedBy: TextView = itemView.collegeAffliatedBy
        val collegePhoneNo: TextView = itemView.collegePhoneNo

        init{
            itemView.setOnClickListener{
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"))
                itemView.context.startActivity(intent)
            }
        }
    }
}