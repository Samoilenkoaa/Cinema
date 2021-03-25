package com.example.androidwithkotlin.model

interface Repository {
    fun getCinemaFromServer(): Cinema
    fun getCinemaFromLocalStorage(): Cinema
}
