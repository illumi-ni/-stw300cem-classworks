package com.ujjallamichhane.classworks.week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.ujjallamichhane.classworks.R

class FloatingActionButtonActivity : AppCompatActivity() {
    private lateinit var btnFab: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floating_action_button)

        btnFab = findViewById(R.id.btnFab)

        btnFab.setOnClickListener {
            Toast.makeText(this@FloatingActionButtonActivity, "I am clicked!", Toast.LENGTH_SHORT)
                .show()
        }
    }
}