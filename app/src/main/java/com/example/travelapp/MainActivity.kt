package com.example.travelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Contacts
import android.view.View
import androidx.core.content.IntentCompat
import kotlinx.android.synthetic.main.activity_createaccount.*
import kotlinx.android.synthetic.main.activitymain.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitymain)
        createaccount_textview.setOnClickListener {
            val intent = Intent(this, createaccount_activity::class.java)
            startActivity(intent)
        }
        //Set click listner on Sign in button to open a Home Activity
        signin_button.setOnClickListener {
           Explicitintent()
        }


    }
    //Explicit Extend
    fun Explicitintent(){
        val explicitintent=Intent(this, home_activity::class.java)
        explicitintent.putExtra("Username",username_edittext.text.toString())
        explicitintent.putExtra("Password",Integer.valueOf(signinpassword_editText.text.toString()))
        explicitintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(explicitintent)
        finish()
    }
}

