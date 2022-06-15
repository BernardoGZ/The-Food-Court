package com.a00570682.thefoodcourt

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import com.a00570682.thefoodcourt.databinding.ItemMenuFoodcardBinding

class Adapter(var restaurants: List<RestaurantCardData>) : RecyclerView.Adapter<Adapter.ViewHolder>()
{
    class ViewHolder(val binding: ItemMenuFoodcardBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemMenuFoodcardBinding.inflate(layoutInflater,parent,false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.apply {
            restName.text = restaurants[position].name
            restDescription.text = restaurants[position].description
        }
    }

    override fun getItemCount(): Int {
        return restaurants.size
    }
}