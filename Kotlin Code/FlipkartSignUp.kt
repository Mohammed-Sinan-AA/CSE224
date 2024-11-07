package com.example.a02myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FlipkartSignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flipkart_sign_up)
        var a = findViewById<EditText>(R.id.firstname)
        var b = findViewById<EditText>(R.id.surname)
        var c = findViewById<EditText>(R.id.phoneno)
        var d = findViewById<EditText>(R.id.email)
        var btn = findViewById<Button>(R.id.CreateAccBtn)
        var SignIntxtvw = findViewById<TextView>(R.id.SignIn)
        SignIntxtvw.setOnClickListener {
            val intent = Intent(this, FlipkartLogin::class.java)
            startActivity(intent)
        }
    }
}