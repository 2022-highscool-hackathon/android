package com.example.data.remote.response

import com.example.domain.entity.JobEntity
import com.google.gson.annotations.SerializedName

data class JobResponse(
    @SerializedName("city") val city: String,
    @SerializedName("province") val province: String,
    @SerializedName("name") val name: String,
    @SerializedName("state") val state: String,
    @SerializedName("workplace") val workplace: String
)

fun JobResponse.toEntity() = JobEntity(
    city = city,
    province = province,
    name = name,
    state = state,
    workplace = workplace
)