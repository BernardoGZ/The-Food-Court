package com.a00570682.thefoodcourt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.a00570682.thefoodcourt.databinding.CarritoContainerBinding

class CarritoScreen : AppCompatActivity() {

    private lateinit var binding: CarritoContainerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CarritoContainerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPagar.setOnClickListener {
            val intent: Intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }

    }
}