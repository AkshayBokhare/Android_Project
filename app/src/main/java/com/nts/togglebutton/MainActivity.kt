package com.nts.togglebutton

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var  image: ImageView
    lateinit var result: TextView
    lateinit var toggleButton: ToggleButton

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleButton = findViewById(R.id.toggleButton)
        image = findViewById(R.id.image)
        result = findViewById(R.id.result)

        toggleButton.setOnCheckedChangeListener { compoundButton, isChecked ->

            if (isChecked) {

                image.visibility = View.INVISIBLE
                result.setText("The Image Is Invisible")
            } else {
                image.visibility = View.VISIBLE
                result.setText("The Image Is visible")

            }

        }
    }
}