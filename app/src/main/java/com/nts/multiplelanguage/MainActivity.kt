package com.nts.multiplelanguage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var toast:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast=findViewById(R.id.button)

        toast.setOnClickListener {

            Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT).show()
        }



    }

}