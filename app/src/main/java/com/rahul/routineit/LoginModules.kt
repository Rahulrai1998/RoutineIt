package com.rahul.routineit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class LoginModules : AppCompatActivity() {


    lateinit var cardTeacher:CardView
    lateinit var cardParent:CardView
    lateinit var cardStudent:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_modules)

        cardTeacher = findViewById(R.id.cardTeacher)
        cardParent = findViewById(R.id.cardParent)
        cardStudent = findViewById(R.id.cardStudent)

        cardTeacher.setOnClickListener {
            val intent  = Intent(this@LoginModules , TeacherLogin::class.java)
            startActivity(intent)
        }
    }
}
