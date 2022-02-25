package com.rajalakshmi.recapp_1

import android.annotation.SuppressLint
import android.graphics.fonts.Font
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.rajalakshmi.recapp_1.R.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var FontSize : Float = 22f
    var TextColorButtonPressed  = 0
    var backRoundPressed = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        findViewById<Button>(id.btnFontSize).setOnClickListener {

            if(FontSize > 50){
                FontSize = 20f
            }
            findViewById<TextView>(id.tvText).textSize = FontSize
            FontSize+=5
            findViewById<TextView>(id.tvAckText).visibility = View.VISIBLE
            findViewById<TextView>(id.tvAckText).setText(string.fontSize)
        }

        findViewById<Button>(id.btnTextColor).setOnClickListener {
            if(TextColorButtonPressed==0) {
                findViewById<TextView>(id.tvText).setTextColor(resources.getColor(R.color.purple_700))
                TextColorButtonPressed+=1
                findViewById<TextView>(id.tvAckText).visibility = View.VISIBLE
                findViewById<TextView>(id.tvAckText).setText(string.fontColor)
            }
            else if(TextColorButtonPressed==1){
                findViewById<TextView>(id.tvText).setTextColor(resources.getColor(R.color.purple_200))
                TextColorButtonPressed+=1
                findViewById<TextView>(id.tvAckText).visibility = View.VISIBLE
                findViewById<TextView>(id.tvAckText).setText(string.fontColor)

            }
            else{
                findViewById<TextView>(id.tvText).setTextColor(resources.getColor(R.color.black))
                TextColorButtonPressed=0
                findViewById<TextView>(id.tvAckText).visibility = View.VISIBLE
                findViewById<TextView>(id.tvAckText).setText(string.fontColor)
            }
        }

        findViewById<Button>(id.btnToast).setOnClickListener {
            if(backRoundPressed){
                findViewById<LinearLayout>(R.id.mainLayout).setBackgroundResource(R.color.white)
                backRoundPressed = false
            }
            else{
                findViewById<LinearLayout>(R.id.mainLayout).setBackgroundResource(R.color.purple_200)
                backRoundPressed = true
            }
        }
    }
}