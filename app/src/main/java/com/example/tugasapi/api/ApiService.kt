package com.example.tugasapi.api


import com.example.tugasapi.model.ResponseWisata
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("wisata")
    fun getRecipes(): Call<ResponseWisata>
}