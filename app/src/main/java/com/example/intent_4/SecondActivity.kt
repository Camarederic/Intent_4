package com.example.intent_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intent_4.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var i = intent
        if (i != null){
            binding.textViewMessage.text = i.getStringExtra("hello")
        }
    }
}