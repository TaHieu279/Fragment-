package com.tavanhieu.fragment_postrait_land_infor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.fragment.app.ListFragment

class FrangmentSinhVienList : ListFragment() {
    lateinit var arr: ArrayList<SinhVien>
    lateinit var adaper: AdapterSinhVien
    lateinit var main: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        arr = ArrayList()
        AddSV()
        adaper = AdapterSinhVien(requireContext(), R.layout.dong_sinh_vien, arr)
        listAdapter = adaper

        return inflater.inflate(R.layout.fragment_list_sv, container, false)
    }

    override fun onListItemClick(l: ListView, v: View, position: Int, id: Long) {
        main = requireActivity() as MainActivity
        main.getData(arr[position])

        super.onListItemClick(l, v, position, id)
    }

    fun AddSV() {
        arr.add(SinhVien("Nguyễn Văn A", 2001, "Hà Nội", "nva@gmail.com"))
        arr.add(SinhVien("Nguyễn Văn B", 1990, "Hà Nam", "nvb@gmail.com"))
        arr.add(SinhVien("Nguyễn Văn C", 2006, "Hà Tây", "nvc@gmail.com"))
        arr.add(SinhVien("Nguyễn Văn D", 1999, "Thái Bình", "nvd@gmail.com"))
        arr.add(SinhVien("Nguyễn Văn E", 2000, "Hải Phòng", "nve@gmail.com"))
        arr.add(SinhVien("Nguyễn Văn F", 2003, "Hải Dương", "nvf@gmail.com"))
        arr.add(SinhVien("Nguyễn Văn G", 2001, "Nam Định", "nvg@gmail.com"))
        arr.add(SinhVien("Nguyễn Văn H", 1998, "Bắc Ninh", "nvh@gmail.com"))
    }
}