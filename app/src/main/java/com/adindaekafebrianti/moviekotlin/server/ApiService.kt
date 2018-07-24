package com.adindaekafebrianti.moviekotlin.server

import com.adindaekafebrianti.moviekotlin.ResponseMovie
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("movie/550?api_key=61a732264fa2977939306018c139391c")
    fun ambilDatamovie(): Call<ResponseMovie>
}