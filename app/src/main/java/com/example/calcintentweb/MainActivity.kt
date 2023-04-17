package com.example.calcintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var Buttoncalc:Button
    lateinit var ButtonIntent:Button
    lateinit var ButtonWeb:Button
    lateinit var ButtonListview:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttoncalc=findViewById(R.id.btn_calc)
        ButtonIntent=findViewById(R.id.btn_intent)
        ButtonWeb=findViewById(R.id.btn_web)
        ButtonListview=findViewById(R.id.btn_listview)
        Buttoncalc.setOnClickListener {
            val intent=Intent(this,CalculatorActivity::class.java)
            startActivity(intent)
        }
        ButtonIntent.setOnClickListener {
            val int=Intent(this,IntentActivity::class.java)
            startActivity(int)
        }
        ButtonWeb.setOnClickListener {
            val web=Intent(this,WebActivity::class.java)
            startActivity(web)
        }
        ButtonListview.setOnClickListener {
            val inte=Intent(this,simplelistview::class.java)
            startActivity(inte)
        }
    }
}