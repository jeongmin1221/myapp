package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
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
}



