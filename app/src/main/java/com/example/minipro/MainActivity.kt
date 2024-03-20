package com.example.minipro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var textView: TextView
    private lateinit var user: FirebaseUser

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()
        textView = findViewById(R.id.user_details)
        user = auth.currentUser!!

        val logout: Button = findViewById(R.id.logout)
        val im1: ImageView = findViewById(R.id.im1)
        val add1: ImageView = findViewById(R.id.add1)

        if (user == null) {
            val intent = Intent(applicationContext, Login::class.java)
            startActivity(intent)
            finish()
        } else {
            textView.text = user.email
        }

        logout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(applicationContext, Login::class.java)
            startActivity(intent)
            finish()
        }
        im1.setOnClickListener {
            FirebaseAuth.getInstance()
            val intent = Intent(applicationContext, g1::class.java)
            startActivity(intent)
            finish()
        }
        add1.setOnClickListener {
            FirebaseAuth.getInstance()
            val intent = Intent(applicationContext, addQuiz::class.java)
            startActivity(intent)
            finish()
        }

    }
}