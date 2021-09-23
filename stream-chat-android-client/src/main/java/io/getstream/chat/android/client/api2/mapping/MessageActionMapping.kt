package io.getstream.chat.android.client.api2.mapping

import io.getstream.chat.android.client.api2.model.dto.MessageActionDto
import io.getstream.chat.android.client.models.AttachmentAction

internal fun AttachmentAction.toDto(): MessageActionDto {
    return MessageActionDto(
        name = name,
        text = text,
        style = style,
        type = type,
        value = value
    )
}

internal fun MessageActionDto.toDomain(): AttachmentAction {
    return AttachmentAction(
        name = name,
        text = text,
        style = style,
        type = type,
        value = value
    )
}
