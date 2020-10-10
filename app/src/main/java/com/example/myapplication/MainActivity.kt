package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        showHide(Button3)
    }

    /*
    private fun setTimeButton(){
        time_button.setOnClickListener {
            showMessage("Time")
        }
    }
    private fun getCurrentTime(): String{
        return Calendar.getInstance().time.toString()

    }

     private fun showMessage(message: String) {
        Toast.makeText(this, "Pushed!", Toast.LENGTH_SHORT).show()

    }
    */

    private fun showHide(view:Button) {
        Button3.setOnClickListener {
            Button3.visibility= View.INVISIBLE
        }
         }


}



