package com.example.minipro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class ResultAll : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_all)



        val back: Button = findViewById(R.id.back)
        val email3: TextView = findViewById(R.id.email3)
        val email4: TextView = findViewById(R.id.email4)
        val email5: TextView = findViewById(R.id.email5)
        val email6: TextView = findViewById(R.id.email6)
        val email7: TextView = findViewById(R.id.email7)
        val email8: TextView = findViewById(R.id.email8)
        val email9: TextView = findViewById(R.id.email9)
        val email10: TextView = findViewById(R.id.email10)


        val receivedIntent = intent
        val tot1: TextView = findViewById(R.id.tot1)
        val nrand = receivedIntent.getIntExtra("jumeng", 0)
        val user = FirebaseAuth.getInstance().currentUser


        tot1.setText(nrand.toString())

        val email2 = FirebaseAuth.getInstance().currentUser
        if (user != null) {
            val textView = findViewById<TextView>(R.id.email2)
            textView.text = user.email
        }

        val email1 = FirebaseAuth.getInstance().currentUser
        if (user != null) {
            val textViewEmail = findViewById<TextView>(R.id.email1)
            textViewEmail.text = user.email
        }



        back.setOnClickListener {
            FirebaseAuth.getInstance()
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}