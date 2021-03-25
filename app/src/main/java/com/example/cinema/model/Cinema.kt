package com.example.androidwithkotlin.model

import com.example.cinema.model.Movie

data class Cinema(
    val cinema: Movie = getDefaultCinema(),
    val rating: Int = 0

)

fun getDefaultCinema() = Movie("Трансформеры", 10)