package io.getstream.chat.android.client.api2.model.dto

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal class MessageActionDto(
    val name: String,
    val text: String,
    val style: String,
    val type: String,
    val value: String,
)
