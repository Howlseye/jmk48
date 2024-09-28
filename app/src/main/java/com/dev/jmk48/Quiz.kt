package com.dev.jmk48

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Quiz : AppCompatActivity() {
    private lateinit var btnback : ImageView
    private lateinit var btnnext : ImageView
    private lateinit var pertanyaan : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.quiz)

        btnback = findViewById(R.id.btnback)
        btnnext = findViewById(R.id.btnnext)
        pertanyaan = findViewById(R.id.pertanyaan)

        btnback.setOnClickListener {
            val intent = Intent(this@Quiz, Main::class.java)
            finish()
        }
    }
}