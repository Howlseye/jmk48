package com.dev.jmk48

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Loading : AppCompatActivity() {
    private lateinit var logo : ImageView
    private lateinit var mewing : Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.loading)
        supportActionBar?.hide()

        mewing = AnimationUtils.loadAnimation(this, R.anim.mewing)
        logo = findViewById(R.id.logo)
        logo.startAnimation(mewing)

        Handler().postDelayed({
            val intent = Intent(this@Loading, Beranda::class.java)
            startActivity(intent)
            finish()
        }, 2000)


    }
}