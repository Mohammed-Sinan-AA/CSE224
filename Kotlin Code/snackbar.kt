package com.example.a02myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class snackbar : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snackbar)
        val sid = findViewById<Button>(R.id.snackbar1)
        sid.setOnClickListener { view ->
            Snackbar.make(view, "This is a snackbar", Snackbar.LENGTH_LONG)
                .setAction("Here is your Snackbar Action", null).show()
                    Toast.makeText(this, "undo was clicked", Toast.LENGTH_SHORT).show()
        }
    }
}