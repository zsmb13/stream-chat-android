package io.getstream.chat.android.client.api2.model.requests

import com.squareup.moshi.JsonClass
import io.getstream.chat.android.client.api2.model.dto.UpstreamUserDto

@JsonClass(generateAdapter = true)
internal class RunActionRequest(
    val formData: Map<String, String>,
    val userId: String,
    val userDto: UpstreamUserDto
)
