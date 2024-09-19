package com.dev.jmk48

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainMenu : AppCompatActivity() {
    private lateinit var logo : TextView
    private lateinit var btnmain : Button
    private lateinit var btnset : Button
    private lateinit var btnexit : Button

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

    }
}