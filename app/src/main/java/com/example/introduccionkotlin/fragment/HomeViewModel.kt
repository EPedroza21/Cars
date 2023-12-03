package com.example.introduccionkotlin.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.introduccionkotlin.model.Car
import com.example.introduccionkotlin.model.CarRepoContract

class HomeViewModel(
    private val carRepo: CarRepoContract
): ViewModel() {

    private val _result = MutableLiveData<CarState>()
    val result: LiveData<CarState> =_result

    fun fetchAllCars(){
        _result.postValue(CarState.Loading)
        var carResponse = carRepo.getAllCars()
        _result.postValue(CarState.Success(carResponse))
    }
}

sealed class CarState{
    data object Loading: CarState()
    data class Success(val data: List<Car>) : CarState()
    data class Failure(val error: String): CarState()

}