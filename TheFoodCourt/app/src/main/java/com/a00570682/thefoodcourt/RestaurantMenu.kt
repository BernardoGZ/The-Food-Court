package com.a00570682.thefoodcourt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.a00570682.thefoodcourt.databinding.ChilaquilesTecScreenBinding

class RestaurantMenu : AppCompatActivity() {
    private lateinit var binding: ChilaquilesTecScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ChilaquilesTecScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}