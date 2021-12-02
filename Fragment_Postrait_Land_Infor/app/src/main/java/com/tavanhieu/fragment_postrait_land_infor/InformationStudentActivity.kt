package com.tavanhieu.fragment_postrait_land_infor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlin.Exception

class InformationStudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information_student)

        try {
            val sv = intent.getSerializableExtra("sinhvien") as SinhVien
            val infoSVActivity = supportFragmentManager.findFragmentById(R.id.fragmentInfoChiTiet) as FrangmentInfoSV?

            //Error: No contain FragmentInfoSV in this layout
            if (infoSVActivity != null) {
                if(infoSVActivity.isInLayout) {
                    infoSVActivity.setData(sv)
                } else {
                    Toast.makeText(this, "No contain fragment", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this, "infoAcitivity null", Toast.LENGTH_LONG).show()
            }
        } catch (e: Exception) {
            Toast.makeText(this, e.message.toString(), Toast.LENGTH_LONG).show()
        }
    }
}