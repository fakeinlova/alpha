package com.example.alpha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }

    fun reg(view: View) {
        startActivity(Intent(this@SignUp, Registration::class.java))
    }
    fun succeed(view: View) {
        startActivity(Intent(this@SignUp, MainActivity::class.java))
    }
}