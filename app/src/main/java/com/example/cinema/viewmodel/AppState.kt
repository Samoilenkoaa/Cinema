package com.example.androidwithkotlin.viewmodel

import com.example.androidwithkotlin.model.Cinema

sealed class AppState {
    data class Success(val cinemaData: Cinema) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
