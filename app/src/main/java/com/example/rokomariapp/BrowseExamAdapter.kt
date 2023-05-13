package com.example.rokomariapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BrowseExamAdapter(private val list: List<BrowseExamData>) :
    RecyclerView.Adapter<BrowseExamAdapter.viewholder>() {
    class viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val browse_img: ImageView = itemView.findViewById(R.id.browse_img)
        val browse_title: TextView = itemView.findViewById(R.id.browse_tv)

        fun bind(item: BrowseExamData) {
            browse_img.setImageResource(item.examImg)
            browse_title.text = item.examTitle
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.browse_exams_list, parent, false)
        return viewholder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        val data = list[position]
        holder.bind(data)
    }
}
