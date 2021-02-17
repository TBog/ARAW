package com.kirkbushman.araw.models.requests

import com.kirkbushman.araw.models.MultiSub
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AddMultiSubReq(

    @Json(name = "model")
    val model: MultiSub
)
