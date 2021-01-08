package com.rahul.routineit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import java.util.*

class WelcomePage : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)

        //Following code will hide the status bar  , and will make the SPLASH SCREEN  as full screen activity
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN ,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // postDelayed(runnable , time) method of Handler() class is used to send a message/runnable with delayed time .
        Handler().postDelayed({

            // Intent class used to switch to the next activity
            val intent  = Intent(this , LoginModules::class.java)
            startActivity(intent)
            finish()
        },5000)

    }
}
