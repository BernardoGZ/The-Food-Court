package com.a00570682.thefoodcourt;

import androidx.lifecycle.ViewModel

class CarritoModelView: ViewModel() {

    private val _orderList = mutableListOf<CarritoData>()
    val orderList get() = _orderList
    val name = "Chilaquiles Tec"
    val description = "Bienvenido a los chilaquiles Tec"
    val image = "image1.png"
    val screen = "ChilaquilesTecScreen"

    //TODO: add restaurants to List from the database
    //Temporary solution:

    fun newItem(pedido: String, amount: String) {
        val newMov = CarritoData(pedido, amount)
        _orderList.add(newMov)
    }
}