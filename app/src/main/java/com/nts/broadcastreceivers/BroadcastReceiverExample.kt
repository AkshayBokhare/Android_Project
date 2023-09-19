package com.nts.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadcastReceiverExample : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        val isAroplaneMode:Boolean=intent!!.getBooleanExtra("state",false)
        if (isAroplaneMode) {

            Toast.makeText(context, "Aropalne Mode is On", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(context, "Aropalne Mode is Off", Toast.LENGTH_SHORT).show()
        }
    }
}