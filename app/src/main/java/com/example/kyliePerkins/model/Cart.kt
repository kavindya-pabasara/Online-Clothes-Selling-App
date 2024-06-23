package com.example.kyliePerkins.model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.labexam2.R

class Cart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        val checkOutButton: Button = findViewById(R.id.CheckOut)

        checkOutButton.setOnClickListener {
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
            finish()
        }
        val cancelButton: Button = findViewById(R.id.Cancel)

        cancelButton.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }
        val backView: ImageView = findViewById(R.id.Back)

        backView.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }
        val homeImg: ImageView = findViewById(R.id.Home)

        homeImg.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }
        val searchImg: ImageView = findViewById(R.id.Search)

        searchImg.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }
        val accImg: ImageView = findViewById(R.id.Account)

        accImg.setOnClickListener {
            val intent = Intent(this, Account::class.java)
            startActivity(intent)
            finish()
        }
    }
}