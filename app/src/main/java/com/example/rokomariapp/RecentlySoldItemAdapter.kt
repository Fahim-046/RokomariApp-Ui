package com.example.rokomariapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecentlySoldItemAdapter(private val list: List<RecentlySoldItemData>) :
    RecyclerView.Adapter<RecentlySoldItemAdapter.viewholder>() {
    class viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val img: ImageView = itemView.findViewById(R.id.book_img)
        val book_title: TextView = itemView.findViewById(R.id.book_img_tv)

        fun bind(item: RecentlySoldItemData) {
            img.setImageResource(item.book_img)
            book_title.text = item.book_name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recenty_sold_item_list, parent, false)
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
