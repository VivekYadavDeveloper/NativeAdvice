package com.create.nativeadvice.model

data class AdviceResponse(

    val slip: Slip,
)

data class Slip(
    val advice: String,
    val slipId: String,
)