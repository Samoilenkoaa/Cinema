package com.example.androidwithkotlin.model

class RepositoryImpl : Repository {

    override fun getCinemaFromServer(): Cinema {
        return Cinema()
    }

    override fun getCinemaFromLocalStorage(): Cinema {
        return Cinema()
    }
}
