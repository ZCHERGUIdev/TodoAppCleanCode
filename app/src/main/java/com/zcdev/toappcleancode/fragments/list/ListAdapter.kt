package com.zcdev.toappcleancode.fragments.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zcdev.toappcleancode.R
import java.util.zip.Inflater

class ListAdapter:RecyclerView.Adapter<ListAdapter.My_ViewHolder>() {


    var dataList= emptyList<String>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.My_ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false)
        return My_ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListAdapter.My_ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class My_ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}
