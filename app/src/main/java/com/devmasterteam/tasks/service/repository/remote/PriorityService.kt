package com.devmasterteam.tasks.service.repository.remote

import retrofit2.Call
import com.devmasterteam.tasks.service.model.PriorityModel
import retrofit2.http.GET

interface PriorityService {

    @GET("Priority")
    fun list(): Call<List<PriorityModel>>

}