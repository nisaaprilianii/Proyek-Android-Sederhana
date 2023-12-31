package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var tombol: Button

        tombol = findViewById(R.id.btn)

        tombol.setOnClickListener {
            Toast.makeText(this, "Selamat Datang di Android", Toast.LENGTH_LONG).show()
        }

    }
}