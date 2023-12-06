package com.example.introduccionkotlin.model

import com.example.introduccionkotlin.database.DummyDatabase.Companion.database

interface CarRepoContract {

    fun addCar(car: Car)
    fun getAllCars(): List<Car>
    fun deleteCar(car: Car): Boolean
}

class CarRepo(
    private val carDatabase: MutableList<Car> = database
) : CarRepoContract {

    override fun addCar(car: Car) {
        carDatabase.add(car)
    }

    override fun getAllCars(): List<Car> = carDatabase

    override fun deleteCar(car: Car): Boolean {
        carDatabase.remove(car)
        return true
    }

}

