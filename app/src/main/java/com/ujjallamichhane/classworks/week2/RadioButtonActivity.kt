package com.ujjallamichhane.classworks.week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import com.ujjallamichhane.classworks.R

class RadioButtonActivity : AppCompatActivity() {
    private lateinit var etFirst: EditText
    private lateinit var etSecond: EditText

    private lateinit var radio: RadioGroup

    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        etFirst = findViewById(R.id.etFirst)
        etSecond = findViewById(R.id.etSecond)
        radio = findViewById(R.id.radio)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvResult = findViewById(R.id.tvResult)

        btnCalculate.setOnClickListener {
            if (checkEmptyValues()) {
                val id = radio.checkedRadioButtonId

                val first: Int = etFirst.text.toString().toInt()
                val second: Int = etSecond.text.toString().toInt()
                var result: Int = 0
                when (id) {
                    R.id.rdoSum -> {
                        result = first + second
                    }
                    R.id.rdoSubtract -> {
                        result = first - second
                    }
                    R.id.rdoMultiply -> {
                        result = first * second
                    }
                }
                tvResult.text = "The result is: $result"
            }
        }
    }

    private fun checkEmptyValues(): Boolean {
        var flag = true
        if (TextUtils.isEmpty(etFirst.text)) {
            etFirst.error = "Please enter the first number"
            etFirst.requestFocus()
            flag = false
        } else if (TextUtils.isEmpty(etSecond.text)) {
            etSecond.error = "Please enter the second number"
            etSecond.requestFocus()
            flag = false
        }
        return flag
    }
}
