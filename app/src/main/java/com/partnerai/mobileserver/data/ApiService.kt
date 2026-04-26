package com.partnerai.mobileserver.data

import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {
    @GET("servers")
    suspend fun getServers(@Header("Authorization") token: String): List<Any>
}