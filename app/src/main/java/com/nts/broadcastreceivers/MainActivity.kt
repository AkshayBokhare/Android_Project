package com.nts.broadcastreceivers

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nts.broadcastreceivers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var br = BroadcastReceiverExample ()

    //Enable ViewBinding
    lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Set Main Binding
        mainBinding=ActivityMainBinding.inflate(layoutInflater)
        val view =mainBinding.root
        setContentView(view)

        val filter = IntentFilter()
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        this.registerReceiver(br,filter)

        //Access Design/layout using View Binding

        mainBinding.button.setOnClickListener {
            mainBinding.textViewResult.text=mainBinding.editTextName.text.toString()
        }
    }

}