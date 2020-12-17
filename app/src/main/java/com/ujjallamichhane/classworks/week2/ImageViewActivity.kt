package com.ujjallamichhane.classworks.week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import com.ujjallamichhane.classworks.R

class ImageViewActivity : AppCompatActivity() {
    private lateinit var rdoGroup: RadioGroup
    private lateinit var rdoIllumi: RadioButton
    private lateinit var rdoSpike: RadioButton
    private lateinit var rdoDoodle: RadioButton
    private lateinit var imgProfile: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)

        rdoGroup = findViewById(R.id.rdoGroup)
        rdoIllumi = findViewById(R.id.rdoIllumi)
        rdoSpike = findViewById(R.id.rdoSpike)
        rdoDoodle = findViewById(R.id.rdoDoodle)
        imgProfile = findViewById(R.id.imgProfile)

        rdoGroup.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId == R.id.rdoIllumi){
                imgProfile.setImageResource(R.drawable.illumi)
            }
            else if(checkedId == R.id.rdoSpike){
                imgProfile.setImageResource(R.drawable.spike)
            }
            else if(checkedId == R.id.rdoDoodle){
                imgProfile.setImageResource(R.drawable.doodle)
            }
        }
    }
}