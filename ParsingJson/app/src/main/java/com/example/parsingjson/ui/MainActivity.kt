package com.example.parsingjson.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parsingjson.R
import com.example.parsingjson.roomdatabase.getDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // object of JsonDataBase
        val dataBase= getDatabase(this)

    }
}