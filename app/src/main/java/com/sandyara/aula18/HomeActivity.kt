package com.sandyara.aula18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class HomeActivity : AppCompatActivity() {

    private lateinit var vwpContent : ViewPager
    private lateinit var tblMenu : TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        vwpContent = findViewById(R.id.vwpContent)
        vwpContent.adapter = FragmentAdapter(supportFragmentManager)

        tblMenu = findViewById(R.id.tblMenu)
        tblMenu.setupWithViewPager(vwpContent)
        val texto = "Ainda está em construção"
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
    }
}