package com.example.fibo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class recyclerviewadapter(var numList:List<BigInteger>):RecyclerView.Adapter<NumViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumViewHolder {
       var item=LayoutInflater.from(parent.context).inflate(R.layout.number_list_item,parent,false)
        return NumViewHolder(item)
          }

    override fun onBindViewHolder(holder: NumViewHolder, position: Int) {
       holder.number.text=numList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numList.size
    }
}

class NumViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var number=itemView.findViewById<TextView>(R.id.tvNum)
}