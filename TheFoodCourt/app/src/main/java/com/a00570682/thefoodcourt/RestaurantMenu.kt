package com.a00570682.thefoodcourt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.a00570682.thefoodcourt.databinding.RestaurantChilaquilesBinding

class RestaurantMenu : AppCompatActivity() {
    private lateinit var binding: RestaurantChilaquilesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RestaurantChilaquilesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAgregar.setOnClickListener {

            //TODO: add orders

            val intent: Intent = Intent(this, CarritoScreen::class.java)
            startActivity(intent)
        }
    }
}