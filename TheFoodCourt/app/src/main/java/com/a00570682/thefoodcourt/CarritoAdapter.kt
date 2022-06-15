package com.a00570682.thefoodcourt

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.a00570682.thefoodcourt.databinding.ItemDetallesBinding

class CarritoAdapter (var items: List<CarritoData>) : RecyclerView.Adapter<CarritoAdapter.ViewHolder>()
{
    class ViewHolder(val binding: ItemDetallesBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemDetallesBinding.inflate(layoutInflater,parent,false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.apply {
            textViewPedido.text = items[position].pedido
            textViewAmount.text = items[position].amount
        }


    }

    override fun getItemCount(): Int {
        return items.size
    }
}