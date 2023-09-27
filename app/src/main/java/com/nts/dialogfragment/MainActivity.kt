package com.nts.dialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {

    lateinit var show: Button
    lateinit var name: TextView
    lateinit var age: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        show = findViewById(R.id.buttonShow)
        name = findViewById(R.id.textViewName)
        age = findViewById(R.id.textViewAge)


        show.setOnClickListener {

            val fragmentManager: FragmentManager = supportFragmentManager
            val myDialogFragment = MyDialogFragment()
            myDialogFragment.isCancelable = false
            myDialogFragment.show(fragmentManager, "MyDialogFragment")

        }

    }

    fun getUserData(userName: String, userAge: Int) {

        name.text = "Name :$userName"
        age.text = "Name :$userAge"
    }
}