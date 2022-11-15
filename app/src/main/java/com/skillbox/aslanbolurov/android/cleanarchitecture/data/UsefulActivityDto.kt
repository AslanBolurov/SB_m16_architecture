package com.skillbox.aslanbolurov.android.cleanarchitecture.data

import com.skillbox.aslanbolurov.android.cleanarchitecture.entity.UsefulActivity
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class UsefulActivityDto(

    override var activity: String,
    override var type: String,
    override var participants: String,
    override var price: String,
    override var link: String,
    override var key: String,
    override var accessibility: String

):UsefulActivity