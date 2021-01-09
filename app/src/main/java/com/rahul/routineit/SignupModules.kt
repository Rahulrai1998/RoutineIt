package com.rahul.routineit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class SignupModules : AppCompatActivity() {

    lateinit var cardTeacherSnp:CardView
    lateinit var cardParentSnp:CardView
    lateinit var cardStudentSnp:CardView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_modules)

        cardTeacherSnp = findViewById(R.id.cardTeacherSnp)

        cardTeacherSnp.setOnClickListener{

            val intent  = Intent(this@SignupModules , SignupTeacher::class.java)
            startActivity(intent)
        }
    }
}
