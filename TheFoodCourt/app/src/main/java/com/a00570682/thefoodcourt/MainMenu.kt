package com.a00570682.thefoodcourt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
//import androidx.navigation.fragment.NavHostFragment
//import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.a00570682.thefoodcourt.databinding.MainContainerBinding

class MainMenu : AppCompatActivity() {
    //private val viewModel : MainMenuViewModel by activityViewModels()

    private lateinit var binding: MainContainerBinding
    private val _foodRestaurants = mutableListOf<RestaurantCardData>()
    val restaurantsList get() = _foodRestaurants
    val name = "Ch"
    val description = "osidfanfdosa"
    val image = "image1.png"
    val screen = "ChilaquilesTecScreen"

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