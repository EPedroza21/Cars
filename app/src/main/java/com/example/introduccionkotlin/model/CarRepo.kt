package com.example.introduccionkotlin.model

interface CarRepoContract {

    fun addCar(car: Car)
    fun getAllCars(): List<Car>
    fun deleteCar(car: Car): Boolean
}

class CarRepo : CarRepoContract {

    private val carRepo = mutableListOf(
        Car(
            "Serie 3", "BMW", 2006,
            listOf(
                Models(
                    "M3", "330i", "320i"
                )
            )
        ),
        Car(
            "WRX", "Subaru", 2014,
            listOf(
                Models(
                    "STI", "Sport", "Impreza"
                )
            )
        ),
        Car(
            "GT3", "Porsche", 2023,
            listOf(
                Models(
                    "RS", "912", "911"
                )
            )
        ),
        Car(
            "Leon", "Cupra", 2021,
            listOf(
                Models(
                    "Premium", "Medium", "Basic"
                )
            )
        ),
        Car(
            "BRZ", "Subaru", 2021,
            listOf(
                Models(
                    "STI", "Sport", "CVT"
                )
            )
        )
    )

    override fun addCar(car: Car) {
        carRepo.add(car)
    }

    override fun getAllCars(): List<Car> = carRepo


    override fun deleteCar(car: Car): Boolean {
        carRepo.remove(car)
        return true
    }
}