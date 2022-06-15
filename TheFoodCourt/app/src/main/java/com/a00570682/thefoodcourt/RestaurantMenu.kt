package com.a00570682.thefoodcourt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.a00570682.thefoodcourt.databinding.RestaurantChilaquilesBinding

class RestaurantMenu : AppCompatActivity() {
    private lateinit var binding: RestaurantChilaquilesBinding
    private var _orderList  = mutableListOf<CarritoData>()
    val orderList get() = _orderList

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RestaurantChilaquilesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var pedido = ""
        var amount = ""
        var carrito = CarritoData(pedido, amount)

        binding.btnAgregar.setOnClickListener {

            pedido = binding.radioGroup.checkedRadioButtonId.toString()
            amount = "$80"
            carrito = CarritoData(pedido, amount)
            _orderList.add(carrito)

            pedido = binding.radioGroup2.checkedRadioButtonId.toString()
            amount = "$10"
            carrito = CarritoData(pedido, amount)
            _orderList.add(carrito)

            if (binding.checkBoxPollo.isSelected){
                pedido = "Pollo"
                amount = "$15"
                carrito = CarritoData(pedido, amount)
                _orderList.add(carrito)
            }
            if (binding.checkBoxChicharron.isSelected){
                pedido = "Chicharron"
                amount = "$25"
                carrito = CarritoData(pedido, amount)
                _orderList.add(carrito)
            }
            if (binding.checkBoxQueso.isSelected){
                pedido = "Queso"
                amount = "$10"
                carrito = CarritoData(pedido, amount)
                _orderList.add(carrito)
            }

            val intent: Intent = Intent(this, CarritoScreen::class.java)
            startActivity(intent)
        }
    }
}