package com.nyoman.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ItemAdapter(private val context: Context, private val item: List<Item>, val listener: (Item) -> Unit)
    : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgItem = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameItem =view.findViewById<TextView>(R.id.tv_item_name)
        val descItem =view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(item: Item, listener: (Item) -> Unit) {
            imgItem.setImageResource(item.imgItem)
            nameItem.text = item.nameItem
            descItem.text = item.descItem
            itemView.setOnClickListener{listener(item)}
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_legendaris, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bindView(item[position], listener)
    }

    override fun getItemCount(): Int = item.size
}
