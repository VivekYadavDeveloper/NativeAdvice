package com.create.nativeadvice.api

import com.create.nativeadvice.model.AdviceResponse
import retrofit2.http.GET

interface AdviceApiServices {
    @GET("advice")
    suspend fun getAdvice(): AdviceResponse

}