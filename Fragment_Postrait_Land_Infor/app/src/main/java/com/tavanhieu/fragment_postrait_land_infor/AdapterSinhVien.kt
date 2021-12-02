package com.tavanhieu.fragment_postrait_land_infor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class AdapterSinhVien (var context: Context, var layout: Int, var arr:ArrayList<SinhVien>): BaseAdapter() {
    override fun getCount(): Int {
        return arr.size
    }

    override fun getItem(position: Int): Any {
        return arr[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    class ViewHolder() {
        lateinit var txtTen: TextView
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var view = convertView
        var holder: ViewHolder
        if(view == null) {
            holder = ViewHolder()
            val inflater:LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(layout, null)
            holder.txtTen = view.findViewById(R.id.txtTenSVDongSV)
            view.tag = holder
        } else {
            holder = view.tag as ViewHolder
        }

        val sv = arr[position]
        holder.txtTen.text = sv.hoten

        return view
    }
}