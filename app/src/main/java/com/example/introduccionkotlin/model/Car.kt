package com.example.introduccionkotlin.model


data class Car(
    val name: String,
    val manufacturer: String,
    val year: Int,
    val model: List<Models>
)

data class Models(
    val premium: String,
    val medium: String,
    val basic: String
)
