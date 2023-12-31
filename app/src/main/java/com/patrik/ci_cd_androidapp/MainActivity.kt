package com.patrik.ci_cd_androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.patrik.ci_cd_androidapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)


        binding.btnClickMe.setOnClickListener {
            Toast.makeText(this@MainActivity, "Someone clicked me", Toast.LENGTH_SHORT).show()
        }

        // Let's send one more message
    }
}