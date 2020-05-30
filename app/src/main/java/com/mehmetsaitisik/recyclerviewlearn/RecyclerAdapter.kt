package com.mehmetsaitisik.recyclerviewlearn

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class RecyclerAdapter(val countryList: MutableList<veri>) : RecyclerView.Adapter<RecyclerAdapter.ModelViewHolder>() {

    class ModelViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val Titles: TextView = view.findViewById(R.id.tv_title)
        val Descriptions: TextView = view.findViewById(R.id.tv_description)
        val Image: ImageView = view.findViewById(R.id.imgLogo)

        fun bindItems(item: veri) {
            Titles.setText(item.Titles)
            Descriptions.setText(item.Description)
            Image.setImageResource(item.Images)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ModelViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        holder.bindItems(countryList.get(position))
    }
}