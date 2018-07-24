package com.adindaekafebrianti.moviekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.adindaekafebrianti.moviekotlin.server.ConfigRetrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get configuration
        val config = ConfigRetrofit().service

        //get request
        val request = config.ambilDatamovie()

        request.enqueue(object : Callback<ResponseMovie>{
            override fun onFailure(call: Call<ResponseMovie>?, t: Throwable?) {
                Log.d("error server", t?.message)
                Toast.makeText(this@MainActivity,t?.message,Toast.LENGTH_SHORT)
            }

            override fun onResponse(call: Call<ResponseMovie>?, response: Response<ResponseMovie>?) {
                val datajson = response?.body()?.production_companies

                Log.d("Response server", datajson.toString())
                Toast.makeText(this@MainActivity,datajson?.toString(),Toast.LENGTH_SHORT)
            }

        })
    }

}
