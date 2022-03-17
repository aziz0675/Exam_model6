package com.example.exam2.networking

import com.example.exam2.model.Cards
import retrofit2.Call
import retrofit2.http.*

interface UserService {

    @GET("Cards")
    fun getAllCards(): Call<ArrayList<Cards>>

    @GET("Cards/{id}")
    fun getCards(@Path("id") id: Int): Call<Cards>

    @POST("Cards")
    fun createCards(@Body cards: Cards): Call<Cards>

    @PUT("Cards/{id}")
    fun updateCards(@Path("id") id: Int, @Body cards: Cards): Call<Cards>

    @DELETE("Cards/{id}")
    fun deleteCards(@Path("id") id: Int): Call<Cards>
}