package com.example.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class simplelistview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simplelistview)
        val mylistview=findViewById<ListView>(R.id.listview)
        val names= arrayOf("Kenya", "Uganda","Tanzania","Ethiopia","Burundi","Rwanda","S.Sudan","Sudan")
        val myarrayadapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,names)
        mylistview.adapter=myarrayadapter
        mylistview.setOnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this,"You have Clicked "+names[position],Toast.LENGTH_LONG).show()
        }
    }
}