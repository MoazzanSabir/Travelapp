package com.example.travelapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_createaccount.*

class createaccount_activity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_createaccount)
        create_textview.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        button_register.setOnClickListener {
            ExplicitIntent()
        }


    }
    //Explicit Intent
    fun ExplicitIntent()
    {
        val explicitintent=Intent(this,home_activity::class.java)
        explicitintent.putExtra("Register_username",createaccountname_edittext.text.toString())
        explicitintent.putExtra("Register_password",Integer.valueOf(craeteaccount_password.text.toString()))
        explicitintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

        startActivity(explicitintent)
        finish()
    }
}