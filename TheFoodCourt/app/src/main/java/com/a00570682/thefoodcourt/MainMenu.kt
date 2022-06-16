package com.a00570682.thefoodcourt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.a00570682.thefoodcourt.databinding.MainContainerBinding

class MainMenu : AppCompatActivity() {

    private lateinit var binding: MainContainerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainContainerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOrdenar.setOnClickListener {
            val intent: Intent = Intent(this, RestaurantMenu::class.java)
            startActivity(intent)
        }

    }
}