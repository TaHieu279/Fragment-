package com.tavanhieu.fragment_postrait_land_infor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FrangmentInfoSV : Fragment() {
    lateinit var txtHoTenInfo:TextView
    lateinit var txtNamSinhInfo:TextView
    lateinit var txtDiaChiInfo:TextView
    lateinit var txtEmailInfo:TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_infor_sv, container, false)
        txtHoTenInfo    = view.findViewById(R.id.txtHoTenInfo)
        txtNamSinhInfo  = view.findViewById(R.id.txtNamSinhInfo)
        txtDiaChiInfo   = view.findViewById(R.id.txtDiaChiInfo)
        txtEmailInfo    = view.findViewById(R.id.txtEmailInfo)

        return view
    }
    fun setData(sv:SinhVien) {
        txtHoTenInfo.text   = sv.hoten
        txtNamSinhInfo.text = sv.namsinh.toString()
        txtDiaChiInfo.text  = sv.diachi
        txtEmailInfo.text   = sv.email
    }
}