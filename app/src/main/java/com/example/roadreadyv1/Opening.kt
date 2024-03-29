package com.example.roadreadyv1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Opening : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opening)
        val handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@Opening, Login::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}