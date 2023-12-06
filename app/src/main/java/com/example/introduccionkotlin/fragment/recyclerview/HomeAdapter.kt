package com.example.introduccionkotlin.fragment.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.introduccionkotlin.R
import com.example.introduccionkotlin.database.DummyDatabase
import com.example.introduccionkotlin.databinding.HomeViewholderBinding
import com.example.introduccionkotlin.model.Car

class HomeAdapter(
) : RecyclerView.Adapter<HomeViewHolder>() {

    private val cars: MutableList<Car> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = HomeViewholderBinding.inflate(inflater, parent, false)
        return HomeViewHolder(binding)
    }

    override fun getItemCount(): Int = cars.size

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = cars[position]
        holder.onBindViewCreated(item)
    }

    fun addCars(cars: List<Car>){
        this.cars.addAll(cars)
        notifyDataSetChanged()
    }
}