package com.rajalakshmi.recapp_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.rajalakshmi.recapp_1.R.*

class MainActivity : AppCompatActivity() {
    var FontSize : Float = 22f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        findViewById<Button>(id.btnFontSize).setOnClickListener {
            findViewById<TextView>(id.tvText).textSize = FontSize++
            findViewById<TextView>(id.tvAckText).visibility = View.VISIBLE
            findViewById<TextView>(id.tvAckText).setText(string.fontSize)
        }

        findViewById<Button>(id.btnTextColor).setOnClickListener {
            findViewById<TextView>(id.tvText).setTextColor(resources.getColor(R.color.purple_700))
            findViewById<TextView>(id.tvAckText).visibility = View.VISIBLE
            findViewById<TextView>(id.tvAckText).setText(string.fontColor)
        }

        findViewById<Button>(id.btnToast).setOnClickListener {
            Toast.makeText(this,"Clicked Toast Button!!",Toast.LENGTH_LONG).show()
        }
    }
}