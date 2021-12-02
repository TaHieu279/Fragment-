package com.tavanhieu.fragment_postrait_land_infor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity(), TruyenSV {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun getData(sv: SinhVien) {
        val fragInfo = supportFragmentManager.findFragmentById(R.id.fragmentInfoLand) as FrangmentInfoSV?

        if (fragInfo != null && fragInfo.isVisible) {
            fragInfo.setData(sv)
        } else {
            fragInfo?.isRemoving
            val intent = Intent(this@MainActivity, InformationStudentActivity::class.java)
            intent.putExtra("sinhvien", sv)
            startActivity(intent)
        }
    }
}