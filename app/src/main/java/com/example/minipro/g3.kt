package com.example.minipro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class g3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_g3)
        val b1: Button = findViewById(R.id.b1)
        val b2: Button = findViewById(R.id.b2)
        val b3: Button = findViewById(R.id.b3)
        val b4: Button = findViewById(R.id.b4)

        val receivedIntent = intent
        val nrand = receivedIntent.getIntExtra("jumeng", 0)


        b4.setOnClickListener {
            val intent = Intent(this, g4::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        b3.setOnClickListener {
            val intent = Intent(this, g4::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        b2.setOnClickListener {
            val intent = Intent(this, g4::class.java)
            intent.putExtra("jumeng", nrand )
            startActivity(intent)
        }

        b1.setOnClickListener {
            val intent = Intent(this, g4::class.java)
            intent.putExtra("jumeng", nrand +1)
            startActivity(intent)
        }
    }
}