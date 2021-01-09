package com.rahul.routineit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class TeacherLogin : AppCompatActivity() {



    lateinit var etEditOne:EditText
    lateinit var etEditTwo:EditText
    lateinit var btnLogin:Button
    lateinit var txtForgotPass: TextView
    lateinit var txtNewAcct:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher_login)

        etEditOne = findViewById(R.id.etEditOne)
        etEditTwo = findViewById(R.id.etEditTwo)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPass = findViewById(R.id.txtForgotPass)
        txtNewAcct = findViewById(R.id.txtNewAcct)

        btnLogin.setOnClickListener {

            val intent = Intent(this@TeacherLogin , MainActivity::class.java)
            startActivity(intent)
        }

        txtForgotPass.setOnClickListener {
            val intent = Intent(this@TeacherLogin , ForgotPassword::class.java)
            startActivity(intent)
        }

        txtNewAcct.setOnClickListener {
            val intent = Intent(this@TeacherLogin , SignupModules::class.java)
            startActivity(intent)
        }
    }

}
