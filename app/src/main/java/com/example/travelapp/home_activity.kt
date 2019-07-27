package com.example.travelapp

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activitymain.*

class home_activity:AppCompatActivity(){
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val username=intent.getStringExtra("Username")
        val password = intent.getIntExtra("Password",0)
        welcome_textView.text=welcome_textView.text.toString() +"\nUsername is"+username+"\npassword is"+password
        val regusername=intent.getStringExtra("Register_username")
         val regpassword=intent.getIntExtra("Register_password",0)
        welcome_textView.text=welcome_textView.text.toString() +"\nUsername is"+regusername+"\npassword is"+regpassword
        logout_button.setOnClickListener {
            logoutconfirmation()
        }

    }
    //Logout Function
    fun logout()
    {
        val logintent=Intent(this, MainActivity::class.java)
        logintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(logintent)
        finish()
    }
    fun logoutconfirmation(){
        val builder=AlertDialog.Builder(this,R.style.CoutomDialogTheme)
        builder.setTitle("Logout Confiration")
        builder.setMessage("Are you sure to want to logout ?")
        builder.setPositiveButton("Yes"){ dialog,which->
            logout()
        }
        builder.setNegativeButton("No"){
            Dialog,which->
        }
        builder.setNeutralButton("cance"){
            Dialog,which->
        }
        //Aftercalling setter now create builder
        builder.create()
        //now we can prevent the dialog box dimiss when we touch outside of dialog box
        //We use setcancel on touchoutside
        builder.setCancelable(false)
        builder.show()
    }


}