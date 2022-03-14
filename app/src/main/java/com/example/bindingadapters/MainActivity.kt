package com.example.bindingadapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import com.example.bindingadapters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.post = Posts("Rishabh the best android developer",
            "Rishabh",
        "https://www.bugatti.com/fileadmin/_processed_/sei/p54/se-image-4799f9106491ebb58ca3351f6df5c44a.jpg")
    }
}