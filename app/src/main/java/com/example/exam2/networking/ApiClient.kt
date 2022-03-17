package com.example.exam2.networking

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    companion object{

        private val TAG: String = ApiClient::class.java.simpleName
        const val IS_TESTER: Boolean = true
        private const val SERVER_DEVELOPMENT = "https://6232b03d8364d63035c1ad49.mockapi.io/"
        private const val SERVER_PRODUCTION = "https://6232b03d8364d63035c1ad49.mockapi.io/"

        private fun server(): String{
            return if(IS_TESTER){
                SERVER_DEVELOPMENT
            }else{
                SERVER_PRODUCTION
            }
        }

        private fun getRetrofit(): Retrofit{
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(server())
                .build()
        }

        val apiService = getRetrofit().create(ApiService::class.java)
    }
}