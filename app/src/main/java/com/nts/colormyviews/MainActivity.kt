package com.nts.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()

    }

    @SuppressLint("ResourceAsColor")
    private fun setListeners() {

        val boxone: TextView = findViewById(R.id.box_one_text)
        boxone.setOnClickListener() {
            makeColored(it)
        }
        val boxtwo = findViewById<TextView>(R.id.box_two_text)
        boxtwo.setOnClickListener() {
            makeColored(it)
        }
        val boxthree = findViewById<TextView>(R.id.box_three_text)
        boxthree.setOnClickListener() {
            makeColored(it)
        }
        val boxfour = findViewById<TextView>(R.id.box_four_text)
        boxfour.setOnClickListener() {
            makeColored(it)
        }
        val boxfive = findViewById<TextView>(R.id.box_five_text)
        boxfive.setOnClickListener() {
            makeColored(it)
        }

        ///////////////////////////////////////////////////////////////////////////////

        val redButton = findViewById<Button>(R.id.red_button)
        redButton.setOnClickListener(View.OnClickListener {
            val randomColor = getRandomColor()
            boxthree.setBackgroundColor(randomColor)


        })

        val yellowButton = findViewById<Button>(R.id.yellow_button)
        yellowButton.setOnClickListener(View.OnClickListener {
            val randomColor = getRandomColor()
            boxfour.setBackgroundColor(randomColor)
        })

        val greenButton = findViewById<Button>(R.id.green_button)
        greenButton.setOnClickListener(View.OnClickListener {

            val randomColor = getRandomColor()
            boxfive.setBackgroundColor(randomColor)
        })


    }

    @SuppressLint("ResourceAsColor")
    fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            //  Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_orange_light)


            //Button in Action to change Text Box Color

//            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
//            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
//            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)
//


            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun getRandomColor(): Int {
        val r = (0..255).random()
        val g = (0..255).random()
        val b = (0..255).random()
        return Color.rgb(r, g, b)
    }
}