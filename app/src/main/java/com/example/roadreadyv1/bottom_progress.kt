package com.example.roadreadyv1

import android.content.Intent
import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [bottom_progress.newInstance] factory method to
 * create an instance of this fragment.
 */
class bottom_progress : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var registrationBtn: Button? = null
    private var appBtn: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_bottom_progress, container, false)


        registrationBtn = view.findViewById(R.id.registrationBtn)
        appBtn = view.findViewById(R.id.appBtn)


        registrationBtn?.setOnClickListener {
            openRegProgress()
        }
        appBtn?.setOnClickListener {
            openAppProgress()
        }

        return view
    }
    fun openRegProgress() {
        registrationBtn = view?.findViewById(R.id.registrationBtn)
        registrationBtn?.setOnClickListener {
            val intent = Intent(context, RegistrationProgress::class.java)
            startActivity(intent)
        }
    }
        fun openAppProgress() {
            appBtn = view?.findViewById(R.id.appBtn)
            appBtn?.setOnClickListener {
                val intent = Intent(context, ApplicationProgress::class.java)
                startActivity(intent)
            }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment bottom_progress.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            bottom_progress().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
//        fun openApplicationProgress() {
//            val intent = Intent(this, BuyerMain::class.java)
//            startActivity(intent)
        }
    }
