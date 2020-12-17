package com.ujjallamichhane.classworks.week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.ujjallamichhane.classworks.R

class SimpleInterestActivity : AppCompatActivity() {
    private lateinit var etPrincipal: EditText
    private lateinit var etTime: EditText
    private lateinit var etRate: EditText
    private lateinit var btnCalc: Button
    private lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_interest)

        etPrincipal = findViewById(R.id.etPrincipal)
        etTime = findViewById(R.id.etTime)
        etRate = findViewById(R.id.etRate)
        btnCalc = findViewById(R.id.btnCalc)
        tvResult = findViewById(R.id.tvResult)

        btnCalc.setOnClickListener {
            val principal = etPrincipal.text.toString().toFloat()
            val time = etTime.text.toString().toFloat()
            val rate = etRate.text.toString().toFloat()

            val si: Float = (principal * time * rate)/100

            tvResult.text = "The simple interest is: $si"
        }
    }
}