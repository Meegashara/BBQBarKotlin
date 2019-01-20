package com.example.android.bbqbar

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.menu_item.view.*

class ItemAdapter(private val items: ArrayList<Item>, private val context: Context): RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameItem.text = items[position].getName()
        holder.imageItem.setImageResource(items[position].getImage()!!)
        holder.imageItem.setOnClickListener {
            val intent = Intent(context, ItemDetails::class.java)
            intent.putExtra("image", items[position].getImage()!!)
            intent.putExtra("name", items[position].getName()!!)
            intent.putExtra("description", items[position].getDescription()!!)
            context.startActivity(intent)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.menu_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val nameItem = itemView.name_item!!
        val imageItem = itemView.image_item!!

    }
}