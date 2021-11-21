package com.example.footify

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class recycler_adapter:RecyclerView.Adapter<recycler_adapter.Myviewholder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false);
        return Myviewholder(view);
    }

    override fun onBindViewHolder(holder: Myviewholder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 4;
    }

    class Myviewholder(itemview:View):RecyclerView.ViewHolder(itemview) {

    }
}