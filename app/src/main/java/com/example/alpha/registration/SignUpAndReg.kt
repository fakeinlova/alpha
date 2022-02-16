package com.example.alpha.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.alpha.MainActivity
import com.example.alpha.R
import kotlinx.android.synthetic.main.activity_sign_up.*
import kotlinx.android.synthetic.main.fragment_signupup.*

class  SignUpAndReg : AppCompatActivity() {

    val loginFragment by lazy { Signupup() }
    val registrationFr by lazy { Regregreg() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        setFragment(this, R.id.frameframe , loginFragment)
    }

//    fun reg(view: View) {
//        startActivity(Intent(this@SignUpAndReg, Registration::class.java))
//    }
//    fun succeed(view: View) {
//        if(editTextTextEmailAddress.text!!.isEmpty() || editTextTextPassword.text!!.isEmpty()) {
//                fun EditText.isEmailValid(): Boolean {
//                return android.util.Patterns.EMAIL_ADDRESS.matcher(this.text.toString()).matches()
//            }
//            Toast.makeText(this, "поле заполненно не верно", Toast.LENGTH_SHORT).show()
//            }else{
//            startActivity(Intent(this@SignUpAndReg, MainActivity::class.java))
//        }
//        }

    fun vhod(){}

    fun succeedsecond(){}

    fun registrationfun(view: View){
        setFragment(this, R.id.frameframe ,  registrationFr)
    }

    fun login(view: View){
        setFragment(this, R.id.frameframe , loginFragment)
    }
}