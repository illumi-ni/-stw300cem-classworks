package com.ujjallamichhane.classworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var etFirst: EditText
    private lateinit var etSecond: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etFirst = findViewById(R.id.etFirst)
        etSecond = findViewById(R.id.etSecond)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvResult = findViewById(R.id.tvResult)

        btnCalculate.setOnClickListener {
            if (checkEmptyValues()) {
                retrieveValues()
            }
        }
    }

    private fun retrieveValues() {
        val first: Int = etFirst.text.toString().toInt()
        val second: Int = etSecond.text.toString().toInt()
        add(first, second)
    }

    private fun add(first: Int, second: Int) {
        val result = first + second
        tvResult.text = result.toString()
    }

    private fun checkEmptyValues(): Boolean {
        var flag = true
        if (TextUtils.isEmpty(etFirst.text)) {
            etFirst.error = "Please enter the first number"
            etFirst.requestFocus()
            flag = false
        } else if (TextUtils.isEmpty(etSecond.text)) {
            etSecond.error = "Please enter the first number"
            etSecond.requestFocus()
            flag = false
        }
        return flag
    }
}