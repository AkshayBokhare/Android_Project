package com.nts.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var name: EditText
    lateinit var button: Button
    lateinit var result: TextView


    lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.editTextText)
        button = findViewById(R.id.buttonOk)
        result = findViewById(R.id.result)

        image = findViewById(R.id.imageEx)

        button.setOnClickListener {

            image.setImageResource(R.drawable.pic2)

            var userName: String = name.text.toString()
            result.setText(userName)

        }


//        myText=findViewById(R.id.text_area)
//        myButton1 = findViewById(R.id.button_1)
//        myButton2 = findViewById(R.id.button_2)
//
//        myButton1.setOnClickListener {
//            myButton1.setBackgroundColor(Color.BLACK)
//            myButton1.setTextColor(Color.WHITE)
//            myText.setTextColor(Color.DKGRAY)
//
//        }
//
//        myButton2.setOnClickListener {
//            myButton1.setBackgroundColor(Color.RED)
//            myButton1.setTextColor(Color.WHITE)
//            myText.setTextColor(Color.YELLOW)
//
//        }


    }
}