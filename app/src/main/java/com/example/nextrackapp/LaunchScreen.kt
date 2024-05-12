package com.example.nextrackapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class LaunchScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_screen)

        val handler = Handler(mainLooper)
        handler.postDelayed({
            startActivity(Intent(this@LaunchScreen, MainActivity::class.java))
            finish()
        }, 4000)
    }
}