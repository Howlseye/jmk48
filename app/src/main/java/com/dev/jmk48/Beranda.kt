package com.dev.jmk48

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Beranda : AppCompatActivity() {
    private lateinit var logo : TextView
    private lateinit var btnmain : Button
    private lateinit var btnset : Button
    private lateinit var btnexit : Button
    private var backPressedTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.mainmenu)

        logo = findViewById(R.id.logo)
        btnmain = findViewById(R.id.btnmain)
        btnset = findViewById(R.id.btnset)
        btnexit = findViewById(R.id.btnexit)
        val btncolor = getColorStateList(R.color.btn)

        btnmain.backgroundTintList = btncolor
        btnset.backgroundTintList = btncolor
        btnexit.backgroundTintList = btncolor

        btnmain.setOnClickListener {
            val intent = Intent(this@Beranda, Main::class.java)
            startActivity(intent)
        }
        btnset.setOnClickListener {
            val intent = Intent(this@Beranda, Setting::class.java)
            startActivity(intent)
        }
        btnexit.setOnClickListener(){
            System.exit(0)
        }
    }

    override fun onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed()
        } else {
            Toast.makeText(applicationContext, "Tekan Lagi Pack Buat Keluar", Toast.LENGTH_SHORT).show()
        }
        backPressedTime = System.currentTimeMillis()
    }

}