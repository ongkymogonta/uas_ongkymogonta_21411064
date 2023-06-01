package com.example.uas_mc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ClubAdapter (private val ClubList: ArrayList<Club>): RecyclerView.Adapter<ClubAdapter.ImageViewHolder>(){

    var onItemClick : ((Club) -> Unit)? = null

    class ImageViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id._image)
        val imageTitle : TextView = itemView.findViewById(R.id._title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,
            false)
        return ImageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ClubList.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val Music = ClubList[position]
        holder.imageView.setImageResource(Music.imageSource)
        holder.imageTitle.text = Music.ImageTitle

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(Music)
        }
    }
}