package com.example.alpha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import java.util.*
import java.util.concurrent.CountDownLatch

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val timer = object : CountDownTimer(3000 , 1000){
            override fun onTick(p0: Long) {
            }

            override fun onFinish() {
                startActivity(Intent(this@SplashScreen, ActivityFirst::class.java))
            }

        }.start()
    }
}