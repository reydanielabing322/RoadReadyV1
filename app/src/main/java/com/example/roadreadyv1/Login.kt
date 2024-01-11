package com.example.roadreadyv1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    private var signupBtn: Button? = null
    private var lgnBtn: Button? = null
    private var email: EditText? = null
    private var passEditText: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        email = findViewById<View>(R.id.email) as EditText
        passEditText = findViewById<View>(R.id.passEditText) as EditText
        lgnBtn = findViewById<View>(R.id.lgnBtn) as Button
        lgnBtn!!.setOnClickListener {
            if (email!!.text.toString() == "dealer" && passEditText!!.text.toString() == "dealer") {
                openNav()
            } else if (email!!.text.toString() == "buyer" && passEditText!!.text.toString() == "buyer") {
                openBuyerHome()
            } else {
                Toast.makeText(this@Login, "Invalid Input", Toast.LENGTH_LONG).show()
            }

        }
        signupBtn = findViewById<View>(R.id.signupBtn) as Button
        signupBtn!!.setOnClickListener { openSignup() }
    }

    fun openSignup() {
        val intent = Intent(this, Signup::class.java)
        startActivity(intent)
    }

    fun openNav() {
        val intent = Intent(this, DealerActivity::class.java)
        startActivity(intent)
    }

    fun openBuyerHome() {
        val intent = Intent(this, BuyerMain::class.java)
        startActivity(intent)
    }
}