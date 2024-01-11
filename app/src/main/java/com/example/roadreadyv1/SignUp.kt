package com.example.roadreadyv1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Signup : AppCompatActivity() {
    private var lgn1Btn: Button? = null
    private var buyerBtn: Button? = null
    private var dealerBtn: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        buyerBtn = findViewById<View>(R.id.buyerBtn) as Button
        buyerBtn!!.setOnClickListener { openBuyer() }
        dealerBtn = findViewById<View>(R.id.dealerBtn) as Button
        dealerBtn!!.setOnClickListener { openDealer() }
//        lgn1Btn = findViewById<View>(R.id.lgn1Btn) as Button
//        lgn1Btn!!.setOnClickListener { openLoginAct() }
    }

//    fun openLoginAct() {
//        val intent = Intent(this, Login::class.java)
//        startActivity(intent)
//    }

    //    fun openSignupDealer() {
//        val intent = Intent(this, SignupDealership::class.java)
//        startActivity(intent)
//    }
    fun openBuyer() {
        val intent = Intent(this, SignUpBuyer::class.java)
        startActivity(intent)
    }
        fun openDealer() {
            val intent = Intent(this, SignUpDealer::class.java)
            startActivity(intent)
        }
    }
