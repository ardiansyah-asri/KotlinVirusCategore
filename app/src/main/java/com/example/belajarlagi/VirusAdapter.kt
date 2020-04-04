package com.example.belajarlagi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_list_virus.view.*

class VirusAdapter(var items: ArrayList<Virus>, var clickListener: OnVirusItemClickListener) : RecyclerView.Adapter<VirusAdapter.VirusViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VirusViewHolder {
        return VirusViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list_virus,parent,false ))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: VirusViewHolder, position: Int) {
       holder.initialize(items.get(position),clickListener)
        val coba = items[position]
        Glide.with(holder.itemView.context).load(coba.logo).apply(RequestOptions().override(55,55)).into(holder.VirusLogo)
    }

    class VirusViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        var VirusName = itemView.tvVirusName
        var VirusDetail = itemView.tvVirusDetail
        var VirusLogo = itemView.poto
        fun initialize(item: Virus, action: OnVirusItemClickListener){
            VirusName.text = item.name
            VirusDetail.text = item.detail
            itemView.setOnClickListener{
                action.onItemClick(item, adapterPosition)
            }

        }

    }
    interface OnVirusItemClickListener{
        fun onItemClick(item: Virus, position: Int)
    }
}