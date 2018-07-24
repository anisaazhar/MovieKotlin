package com.adindaekafebrianti.moviekotlin.server

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit



class ConfigRetrofit {
    var retrofit = Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/") //ini diganti sama endpoint sampe 3/
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    var service = retrofit.create<ApiService>(ApiService::class.java!!)



}