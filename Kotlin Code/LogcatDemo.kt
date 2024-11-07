package com.example.a02myapplication

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LogcatDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_logcat_demo)
        var btn = findViewById<Button>(R.id.button2)
        btn.setOnClickListener {
            Log.v(TAG, "Verbose log: lowest priority, detailed entry, no use")
            Log.d(TAG, "Debug log: highest priority, This is used for debugging")
            Log.i(TAG, "Info log: Moderate Level of priority, Informational")
            Log.w(TAG, "Warning log: This is a warning message for unexpected behaviour")
        }
    }
}