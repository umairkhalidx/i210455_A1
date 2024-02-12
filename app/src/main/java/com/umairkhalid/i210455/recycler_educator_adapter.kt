package com.umairkhalid.i210455

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class recycler_educator_adapter(val itemslist: ArrayList<recycler_educator_data>)
    : RecyclerView.Adapter<recycler_educator_adapter.educator_viewholder>()

{

    inner class educator_viewholder(itemView: View) : RecyclerView.ViewHolder(itemView){
        lateinit var display_pic :ImageView
        lateinit var title : TextView
        lateinit var designation : TextView
        lateinit var status : TextView

        init {
            display_pic= itemView.findViewById(R.id.display_image)
            title = itemView.findViewById(R.id.title)
            designation = itemView.findViewById(R.id.designation)
            status = itemView.findViewById(R.id.status)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): educator_viewholder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_item_educator,parent,false)

        return educator_viewholder(v)
    }

    override fun getItemCount(): Int {
        return itemslist.size
    }

    override fun onBindViewHolder(holder: educator_viewholder, position: Int) {

        holder.display_pic.setImageResource(itemslist[position].img)
        holder.title.setText(itemslist[position].title)
        holder.designation.setText(itemslist[position].desig)
        holder.status.setText(itemslist[position].status)

    }

}