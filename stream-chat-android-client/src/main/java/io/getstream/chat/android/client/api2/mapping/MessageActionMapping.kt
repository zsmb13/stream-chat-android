package io.getstream.chat.android.client.api2.mapping

import io.getstream.chat.android.client.api2.model.dto.MessageActionDto
import io.getstream.chat.android.client.models.MessageAction

internal fun MessageAction.toDto(): MessageActionDto {
    return MessageActionDto(
        name = name,
        text = text,
        style = style,
        type = type,
        value = value
    )
}

internal fun MessageActionDto.toDomain(): MessageAction {
    return MessageAction(
        name = name,
        text = text,
        style = style,
        type = type,
        value = value
    )
}
