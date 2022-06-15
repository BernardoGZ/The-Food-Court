package com.a00570682.thefoodcourt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.a00570682.thefoodcourt.databinding.CarritoContainerBinding
//import androidx.navigation.fragment.NavHostFragment
//import androidx.navigation.ui.NavigationUI.setupWithNavController

class CarritoScreen : AppCompatActivity() {
    //private val viewModel : MainMenuViewModel by activityViewModels()

    private lateinit var binding: CarritoContainerBinding
    private val _foodRestaurants = mutableListOf<RestaurantCardData>()
    val restaurantsList get() = _foodRestaurants
    val name = "Ch"
    val description = "osidfanfdosa"
    val image = "image1.png"
    val screen = "ChilaquilesTecScreen"

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