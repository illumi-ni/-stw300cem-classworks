package com.ujjallamichhane.classworks.week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.ujjallamichhane.classworks.R

class FloatingActionButtonClassworkActivity : AppCompatActivity() {
    private lateinit var btnAdd: FloatingActionButton
    private lateinit var etFirst: EditText
    private lateinit var etSecond: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floating_action_button_classwork)

        btnAdd = findViewById(R.id.btnAdd)
        etFirst = findViewById(R.id.etFirst)
        etSecond = findViewById(R.id.etSecond)

        btnAdd.setOnClickListener {
            val first = etFirst.text.toString().toInt()
            val second = etSecond.text.toString().toInt()

            val sum = first + second

            Toast.makeText(this, "Sum is: $sum", Toast.LENGTH_SHORT).show()
        }
    }
}