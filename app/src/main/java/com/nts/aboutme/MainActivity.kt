package com.nts.aboutme

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.databinding.DataBindingUtil
import com.nts.aboutme.databinding.ActivityMainBinding
import com.nts.aboutme.ui.theme.AboutMeTheme

class MainActivity : ComponentActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     //   setContentView(R.layout.activity_main)

        //Binding Object
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

//        findViewById<Button>(R.id.done_button).setOnClickListener {
//            addNickname(it)
//        }

        //Access Done Button using databinding object

        binding.doneButton.setOnClickListener{

            addNickname(it)
        }


    }
    @SuppressLint("ServiceCast")
    fun addNickname(view: View) {

        binding.apply {

            nicknameText.text=binding.nicknameEdit.text
            nicknameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE
        }



//        val editText = findViewById<EditText>(R.id.nickname_edit)
//        val nicknameTextview = findViewById<TextView>(R.id.nickname_text)
//
//        nicknameTextview.text = editText.text
//        editText.visibility = View.GONE
//        view.visibility = View.GONE
//        nicknameTextview.visibility = View.VISIBLE

        //HIde THe Keyboard
        val imm = getSystemService(Context.INPUT_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}