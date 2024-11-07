package com.example.a02myapplication

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class LPUBranches : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lpubranches)
        val imageButton11 = findViewById<ImageButton>(R.id.imageButton11)
        val imageButton12 = findViewById<ImageButton>(R.id.imageButton12)
        val imageButton2 = findViewById<ImageButton>(R.id.imageButton2)
        val imageButton9 = findViewById<ImageButton>(R.id.imageButton9)
        val imageButton10 = findViewById<ImageButton>(R.id.imageButton10)
        val imageButton13 = findViewById<ImageButton>(R.id.imageButton13)
        val imageButton14 = findViewById<ImageButton>(R.id.imageButton14)
        val imageButton15 = findViewById<ImageButton>(R.id.imageButton15)
        val imageButton16 = findViewById<ImageButton>(R.id.imageButton16)

        imageButton11.setOnClickListener { showSnackbar(it, "Computer Science and Engineering") }
        imageButton12.setOnClickListener { showSnackbar(it, "MITTAL School of Business") }
        imageButton2.setOnClickListener { showSnackbar(it, "School of Law") }
        imageButton9.setOnClickListener { showSnackbar(it, "Physical Education") }
        imageButton10.setOnClickListener { showSnackbar(it, "Electronics and Electrical Engineering") }
        imageButton13.setOnClickListener { showSnackbar(it, "Design III - Multimedia and Animation") }
        imageButton14.setOnClickListener { showSnackbar(it, "Hotel Management and Tourism") }
        imageButton15.setOnClickListener { showSnackbar(it, "Design I - Fashion") }
        imageButton16.setOnClickListener { showSnackbar(it, "Mechanical Engineering") }
    }

    private fun showSnackbar(view: View, message: String) {
        Snackbar.make(view, message, Snackbar.LENGTH_LONG)
            .setAction("Ok") {
                Toast.makeText(this, "Ok was clicked", Toast.LENGTH_SHORT).show()
            }.show()
    }
}
