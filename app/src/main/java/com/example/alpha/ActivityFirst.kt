package com.example.alpha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.alpha.registration.SignUpAndReg
import kotlinx.android.synthetic.main.activity_main.*

class ActivityFirst : AppCompatActivity() {
    private lateinit var first : FirstFr
    private lateinit var second : SecondFr
    private lateinit var third : ThirdFr
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        bottommn.itemIconTintList = null
//        first = FirstFr()
//        second = SecondFr()
//        third = ThirdFr()
//        bottommn.setOnNavigationItemSelectedListener {
//            when (it.itemId) {
//                R.id.one -> {
//                    setFragment(first)
//                }
//                R.id.two -> {
//                    setFragment(second)
//                }
//                R.id.three -> {
//                   setFragment(third)
//                }
//            }
//            true
//        }
        val fragments : ArrayList<Fragment> = arrayListOf(
        FirstFr(), SecondFr(), ThirdFr()
        )
        viewpager.adapter = ViewPager(fragments,this)





    }
    fun sSign(view: View){
        val intent = Intent(this@ActivityFirst, SignUpAndReg::class.java)
        startActivity(intent)
    }

//    override fun onBackPressed() {
//        if(viewpager.currentItem==0) super .onBackPressed()
//        else viewpager.currentItem = viewpager.currentItem - 1
//    }
//    private fun setFragment(fragment : Fragment){
//        val fragmentTransaction = supportFragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.frame,fragment)
//        fragmentTransaction.commit()
//    }
}