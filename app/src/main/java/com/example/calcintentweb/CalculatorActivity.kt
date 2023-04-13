package com.example.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var Calc_answer:TextView
    lateinit var edt_firstnum:EditText
    lateinit var edt_secondnum:EditText
    lateinit var btn_add:Button
    lateinit var btn_subtract:Button
    lateinit var btn_multiply:Button
    lateinit var btn_divide:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Calc_answer=findViewById(R.id.Txt_answer)
        edt_firstnum=findViewById(R.id.edt_Fno)
        edt_secondnum=findViewById(R.id.edt_Sno)
        btn_add=findViewById(R.id.btn_Add)
        btn_subtract=findViewById(R.id.btn_Subtract)
        btn_multiply=findViewById(R.id.btn_multiply)
        btn_divide=findViewById(R.id.btn_divide)
        btn_add.setOnClickListener {
            var myfirstnum=edt_firstnum.text.toString()
            var mysecnum=edt_secondnum.text.toString()
            if (myfirstnum.isEmpty() && mysecnum.isEmpty()){
                Calc_answer.text="Please fill all inputs"
            }else{
                //lets now calculate
                var answer=myfirstnum.toDouble()+mysecnum.toDouble()
                Calc_answer.text=answer.toString()
            }
        }
        btn_subtract.setOnClickListener {
            var myfirstnum=edt_firstnum.text.toString()
            var mysecnum=edt_secondnum.text.toString()
            if (myfirstnum.isEmpty() && mysecnum.isEmpty()){
                Calc_answer.text="Please fill all inputs"
            }else{
                //lets now calculate
                var answer=myfirstnum.toDouble()-mysecnum.toDouble()
                Calc_answer.text=answer.toString()
            }
        }
        btn_multiply.setOnClickListener {
            var myfirstnum=edt_firstnum.text.toString()
            var mysecnum=edt_secondnum.text.toString()
            if (myfirstnum.isEmpty() && mysecnum.isEmpty()){
                Calc_answer.text="Please fill all inputs"
            }else{
                //lets now calculate
                var answer=myfirstnum.toDouble()*mysecnum.toDouble()
                Calc_answer.text=answer.toString()
            }
        }
        btn_divide.setOnClickListener {
            var myfirstnum=edt_firstnum.text.toString()
            var mysecnum=edt_secondnum.text.toString()
            if (myfirstnum.isEmpty() && mysecnum.isEmpty()){
                Calc_answer.text="Please fill all inputs"
            }else{
                //lets now calculate
                var answer=myfirstnum.toDouble()/mysecnum.toDouble()
                Calc_answer.text=answer.toString()
            }
        }
    }
}