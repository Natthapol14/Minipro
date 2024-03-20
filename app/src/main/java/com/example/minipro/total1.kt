package com.example.minipro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class total1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_total1)
        val tot: TextView = findViewById(R.id.tot)
        val main: Button = findViewById(R.id.main)
        val result: Button = findViewById(R.id.result)
        val receivedIntent = intent
        val nrand = receivedIntent.getIntExtra("jumeng", 0)

        tot.setText(nrand.toString())

        main.setOnClickListener {
            FirebaseAuth.getInstance()
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        result.setOnClickListener {
            FirebaseAuth.getInstance()
            val intent = Intent(applicationContext, ResultAll::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
            finish()
        }
    }
}