package com.nts.sharedpreference

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var userName:EditText
    lateinit var userMessage:EditText
    lateinit var counter:Button
    lateinit var remember:CheckBox
    var count:Int=0

    var name:String?=null
    var message:String?=null
    var isChecked:Boolean?=null

    //Createv Object From Shared Preference Class

    lateinit var sharedPreference:SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userName=findViewById(R.id.editTextName)
        userMessage=findViewById(R.id.editTextMessage)
        counter=findViewById(R.id.button)
        remember=findViewById(R.id.checkBox)

        counter.setOnClickListener {
            count= count+1
            counter.setText(""+count)
        }
    }

    override fun onPause() {
        super.onPause()

        saveData()
    }

    fun saveData(){

        sharedPreference=this.getSharedPreferences("saveData",Context.MODE_PRIVATE)
        name =userName.text.toString()
        message=userMessage.text.toString()
        isChecked= remember.isChecked

        //save data
        val editor=sharedPreference.edit()

        editor.putString("key name",name)
        editor.putString("key message",message)
        editor.putInt("key count",count)
        editor.putBoolean("key remember",isChecked!!)

        editor.apply()

        Toast.makeText(this,"Data Is Saved",Toast.LENGTH_SHORT).show()


    }

    fun retriveData(){
        sharedPreference=this.getSharedPreferences("saveData",Context.MODE_PRIVATE)

        name = sharedPreference.getString("key name",null)

        message = sharedPreference.getString("key message",null)
        count= sharedPreference.getInt("key count",0)
        isChecked = sharedPreference.getBoolean("key remember",false)

        //SET DATA

        userName.setText(name)
        userMessage.setText(message)
        counter.setText(""+count)
        remember.isChecked=isChecked!!

        Toast.makeText(this,"Data Retrive",Toast.LENGTH_SHORT).show()

    }

    override fun onResume() {
        super.onResume()

        retriveData()
    }

}