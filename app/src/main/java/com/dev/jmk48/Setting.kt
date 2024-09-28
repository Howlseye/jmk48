package com.dev.jmk48

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class Setting : AppCompatActivity() {
    private lateinit var close : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.setting)

        close = findViewById(R.id.close)
        close.setOnClickListener {
            var intent = Intent(this@Setting, Beranda::class.java)
            finish()
        }

    }
}