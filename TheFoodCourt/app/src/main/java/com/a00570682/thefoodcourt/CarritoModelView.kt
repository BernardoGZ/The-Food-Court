package com.a00570682.thefoodcourt;

import androidx.lifecycle.ViewModel

class CarritoModelView: ViewModel() {

    private val _orderList = mutableListOf<CarritoData>()
    val orderList get() = _orderList

    //TODO: add restaurants to List from the database
    //Temporary solution:

    fun newItem(pedido: String, amount: String) {
        val newMov = CarritoData(pedido, amount)
        _orderList.add(newMov)
    }
}