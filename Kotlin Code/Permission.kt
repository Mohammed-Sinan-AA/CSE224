package com.example.a02myapplication
//
//import android.content.pm.PackageManager
//import android.os.Bundle
//import android.widget.Toast
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.content.ContextCompat
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//
//class Permission : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_permission)
//        var b1 findViewById<Button>(R.id.btnpermission)
//        b1.setOnClickListener{
//            if (ContextCompat.checkSelfPermission())
//        }
//        override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
//            super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//            if (requestCode == c){
//                if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
//                    Toast.makeText(this, "Camera permission granted", Toast.LENGTH_SHORT).show()
//                }
//                else{
//                    Toast.makeText(this, "Camera permission denied", Toast.LENGTH_SHORT).show()
//                }
//            }
//        }
//    }
//}