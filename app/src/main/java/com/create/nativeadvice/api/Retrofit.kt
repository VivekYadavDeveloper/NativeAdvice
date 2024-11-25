package com.create.nativeadvice.api


import com.create.nativeadvice.utils.Constant.BASEURL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {


    val api: AdviceApiServices by lazy {

        Retrofit.Builder().baseUrl(BASEURL).addConverterFactory(GsonConverterFactory.create())
            .build().create(AdviceApiServices::class.java)

    }
}