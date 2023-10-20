package com.example.mad_practical_10_21012021016

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class ContentAdapter(val context: Context,val array: ArrayList<Contact>): ArrayAdapter<Contact>(context,0,array) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.context_item,parent)
        return super.getView(position, convertView, parent)
    }
}