package com.dev.jmk48

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Main : AppCompatActivity() {
    private lateinit var btncrot : Button
    private lateinit var btnquiz : Button
    private lateinit var close : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main)

        btncrot = findViewById(R.id.btncrot)
        btnquiz = findViewById(R.id.btnquiz)
        close = findViewById(R.id.close)

        btncrot.backgroundTintList = getColorStateList(R.color.btn2)

        btncrot.setOnClickListener {
            val intent = Intent(this@Main, Cerita::class.java)
            startActivity(intent)
        }
        btnquiz.setOnClickListener {
            val intent = Intent(this@Main, Quiz::class.java)
            startActivity(intent)
        }
        close.setOnClickListener {
            val intent = Intent(this@Main, Beranda::class.java)
            finish()
        }

    }
}