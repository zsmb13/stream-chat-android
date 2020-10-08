package io.getstream.chat.android.client.helpers

import io.getstream.chat.android.client.models.Attachment
import io.getstream.chat.android.client.utils.SystemTimeProvider
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull

class AttachmentHelper(private val systemTimeProvider: SystemTimeProvider = SystemTimeProvider()) {

    fun hasValidUrl(attachment: Attachment): Boolean {
        val url = attachment.url?.toHttpUrlOrNull() ?: return false
        if (url.queryParameterNames.contains(QUERY_KEY_NAME_EXPIRES).not()) {
            return true
        }
        return url.queryParameter(QUERY_KEY_NAME_EXPIRES)?.toLongOrNull()
            ?.let { timestamp -> timestamp > systemTimeProvider.provideTime() } ?: false
    }

    companion object {
        private const val QUERY_KEY_NAME_EXPIRES = "Expires"
    }
}
