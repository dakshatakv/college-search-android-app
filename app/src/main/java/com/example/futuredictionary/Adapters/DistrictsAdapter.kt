package com.example.futuredictionary

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.location_item.view.*

class DistrictsAdapter(private val context: Home, private val DistrictsList: ArrayList<String>) :
    RecyclerView.Adapter<DistrictsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.location_item, parent, false))
    }

    override fun getItemCount(): Int {
        return DistrictsList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.districtName?.text = DistrictsList.get(position)

        holder.itemView.setOnClickListener{

            if (DistrictsList.get(position).equals("Ariyalur")) {
                val intent = Intent(context, Ariyalur::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Chennai")) {
                val intent = Intent(context, Chennai::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Coimbatore")) {
                val intent = Intent(context, Coimbatore::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Cuddalore")) {
                val intent = Intent(context, Cuddalore::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Dharmapuri")) {
                val intent = Intent(context, Dharmapuri::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Dindigul")) {
                val intent = Intent(context, Dindigul::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Erode")) {
                val intent = Intent(context, Erode::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Kanchipuram")) {
                val intent = Intent(context, Kanchipuram::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Kanyakumari")) {
                val intent = Intent(context, Kanyakumari::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Karur")) {
                val intent = Intent(context, Karur::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Krishnagiri")) {
                val intent = Intent(context, Krishnagiri::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Madurai")) {
                val intent = Intent(context, Madurai::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Nagapattinam")) {
                val intent = Intent(context, Nagapattinam::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Namakkal")) {
                val intent = Intent(context, Namakkal::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Nilgiris")) {
                val intent = Intent(context, Nilgiris::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Perambalur")) {
                val intent = Intent(context, Perambalur::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Pudukottai")) {
                val intent = Intent(context, Pudukottai::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Ramnad")) {
                val intent = Intent(context, Ramnad::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Salem")) {
                val intent = Intent(context, Salem::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Sivagangai")) {
                val intent = Intent(context, Sivagangai::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Thanjavur")) {
                val intent = Intent(context, Thanjavur::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Theni")) {
                val intent = Intent(context, Theni::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Tirunelveli")) {
                val intent = Intent(context, Tirunelveli::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Tirupur")) {
                val intent = Intent(context, Tirupur::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Tiruvallur")) {
                val intent = Intent(context, Tiruvallur::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Tiruvanamalai")) {
                val intent = Intent(context, Tiruvanamalai::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Tiruvarur")) {
                val intent = Intent(context, Tiruvarur::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Trichy")) {
                val intent = Intent(context, Trichy::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Tuticorin")) {
                val intent = Intent(context, Tuticorin::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Vellore")) {
                val intent = Intent(context, Vellore::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Villupuram")) {
                val intent = Intent(context, Villupuram::class.java)
                context.startActivity(intent)
            }
            else if (DistrictsList.get(position).equals("Virudhunagar")) {
                val intent = Intent(context, Virudhunagar::class.java)
                context.startActivity(intent)
            }
        }

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val districtName = view.districtName


   /*         init{
                view.setOnClickListener{
                    val intent = Intent(view.context, Ariyalur::class.java)
                    view.context.startActivity(intent)
                }
            }      */

    }
}
