package com.nts.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private lateinit var spinner: Spinner
    private lateinit var result: TextView
    private lateinit var showToast:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        showToast = findViewById(R.id.button_Hint)
        spinner = findViewById(R.id.spinnerCountry)
        result = findViewById(R.id.result)

        spinner.onItemSelectedListener = this

//        showToast.setOnClickListener {
//            //Toast Masseage
//            Toast.makeText(this,
//                "Button Is Click",
//                Toast.LENGTH_SHORT).show()
//        }

        val arrayAdapter = ArrayAdapter.createFromResource(
            this,
            R.array.Countries,
            android.R.layout.simple_spinner_item
        )
        arrayAdapter.setDropDownViewResource(com.google.android.material.R.layout.support_simple_spinner_dropdown_item)
        spinner.adapter = arrayAdapter

    }
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        if (parent != null) {
            result.text = parent.getItemAtPosition(position).toString()
        }

    }
    override fun onNothingSelected(p0: AdapterView<*>?) {
    }



}