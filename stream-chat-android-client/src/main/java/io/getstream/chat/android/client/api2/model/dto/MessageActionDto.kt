package io.getstream.chat.android.client.api2.model.dto

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal class MessageActionDto(
    val name: String? = null,
    val text: String? = null,
    val style: String? = null,
    val type: String? = null,
    val value: String? = null,
)
