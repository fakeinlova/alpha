package com.example.alpha.registration

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun setFragment(context : AppCompatActivity, frame : Int , fragment: Fragment){
    val tranz = context.supportFragmentManager.beginTransaction()
    tranz.replace(frame , fragment)
    tranz.commit()


}