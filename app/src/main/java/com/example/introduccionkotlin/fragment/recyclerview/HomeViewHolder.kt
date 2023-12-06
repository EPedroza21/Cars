package com.example.introduccionkotlin.fragment.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.introduccionkotlin.databinding.HomeViewholderBinding
import com.example.introduccionkotlin.model.Car

class HomeViewHolder (
    private val binding: HomeViewholderBinding
): RecyclerView.ViewHolder(binding.root){

    fun onBindViewCreated(car: Car){
        binding.carName.text = car.name
        binding.carManufacturer.text = car.manufacturer
        binding.carYear.text = car.year.toString()
        binding.carModel.text = car.model.joinToString {
            "Premium: ${it.premium} Medium: ${it.medium} Basic: ${it.basic}"
        }
        Glide.with(binding.root)
            .load(car.photo)
            .into(binding.carImageViewHolder)
    }
}