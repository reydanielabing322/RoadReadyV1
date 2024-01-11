package com.example.roadreadyv1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import java.util.Arrays

class SignUpDealer : AppCompatActivity() {
    private val spinner: Spinner? = null
    private var lgnBtn2: Button? = null
    private var sgnupBtn: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_dealer)

        val gender = Arrays.asList("Gender", "Male", "Female")
        val spinner = findViewById<Spinner>(R.id.spinner)
        val adapter: ArrayAdapter<*> = ArrayAdapter<Any?>(applicationContext, android.R.layout.simple_spinner_item, gender as List<Any?>)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View, i: Int, l: Long) {
                val newItem = spinner.selectedItem.toString()
            }

            override fun onNothingSelected(adapterView: AdapterView<*>?) {}
        }
        sgnupBtn = findViewById<View>(R.id.sgnupBtn) as Button
        sgnupBtn!!.setOnClickListener { openDealer() }

        lgnBtn2 = findViewById<View>(R.id.lgnBtn2) as Button
        lgnBtn2!!.setOnClickListener { openLogin() }
    }


    fun openLogin() {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }
    @SuppressLint("SuspiciousIndentation")
    fun openDealer() {
        val intent = Intent(this, DealerActivity::class.java)
        startActivity(intent)
    }
}