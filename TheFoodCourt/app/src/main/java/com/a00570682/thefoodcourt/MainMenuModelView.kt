package com.a00570682.thefoodcourt;

import androidx.lifecycle.ViewModel
import java.util.*

class MainMenuViewModel: ViewModel() {

    private val _foodRestaurants = mutableListOf<RestaurantCardData>()
    val restaurantsList get() = _foodRestaurants
    val name = "Chilaquiles Tec"
    val description = "Bienvenido a los chilaquiles Tec"
    val image = "image1.png"
    val screen = "ChilaquilesTecScreen"

    /** Temporary solution
     * Database failure
     * **/
    //TODO: add restaurants to List from the database

    fun newRestaurant() {
        val newRest = RestaurantCardData(name, description, image, screen);
        _foodRestaurants.add(newRest)
    }


}