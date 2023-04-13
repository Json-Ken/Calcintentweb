package com.example.calcintentweb

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class IntentActivity : AppCompatActivity() {
    lateinit var btn_cam:Button
    lateinit var btn_dial:Button
    lateinit var btn_sms:Button
    lateinit var btn_call:Button
    lateinit var btn_Stk:Button
    lateinit var btn_share:Button
    lateinit var btn_eml:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        btn_cam=findViewById(R.id.btn_camera)
        btn_call=findViewById(R.id.btn_call)
        btn_sms=findViewById(R.id.btn_sms)
        btn_dial=findViewById(R.id.btn_dial)
        btn_Stk=findViewById(R.id.btn_stk)
        btn_share=findViewById(R.id.btn_share)
        btn_eml=findViewById(R.id.btn_email)
        btn_sms.setOnClickListener {
            val uri= Uri.parse("smsto:0769098135")
            val intent=Intent(Intent.ACTION_SENDTO,uri)
            intent.putExtra("Hello","Good Morning")
            startActivity(intent)
        }
       btn_cam.setOnClickListener {
           val takepic=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
           startActivityForResult(takepic,1)
       }
        btn_dial.setOnClickListener {
            val namba="+25469098135"
            val intent=Intent(Intent.ACTION_DIAL,Uri.fromParts("tel",namba,null))
            startActivity(intent)
        }
        btn_eml.setOnClickListener {
            val emailintent= Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","jsonken2@gmail.com",null))
            emailintent.putExtra(Intent.EXTRA_SUBJECT,"subject")
            emailintent.putExtra(Intent.EXTRA_TEXT,"Body")
            startActivity(Intent.createChooser(emailintent,"send email..."))
        }
        btn_Stk.setOnClickListener {
            val simToolKitLaunchIntent=applicationContext.packageManager.getLaunchIntentForPackage("com.andriod.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        btn_share.setOnClickListener {
            val shareIntent=Intent(Intent.ACTION_SEND)
            shareIntent.flags=Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type="text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT,"Hi, click to download")
            startActivity(shareIntent)
        }
        btn_call.setOnClickListener {

        }
        }

    }
