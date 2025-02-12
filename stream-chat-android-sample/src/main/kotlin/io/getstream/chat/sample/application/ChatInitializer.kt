package io.getstream.chat.sample.application

import android.content.Context
import com.getstream.sdk.chat.ChatUI
import io.getstream.chat.android.client.ChatClient
import io.getstream.chat.android.client.logger.ChatLogLevel
import io.getstream.chat.android.client.notifications.handler.NotificationConfig
import io.getstream.chat.android.livedata.ChatDomain
import io.getstream.chat.android.pushprovider.firebase.FirebasePushDeviceGenerator
import io.getstream.chat.sample.BuildConfig
import io.getstream.chat.sample.R

class ChatInitializer(private val context: Context) {

    @Suppress("UNUSED_VARIABLE")
    fun init(apiKey: String) {
        val notificationConfig =
            NotificationConfig(
                smallIcon = R.drawable.ic_chat_bubble,
                pushDeviceGenerators = listOf(FirebasePushDeviceGenerator())
            )
        val notificationHandler = SampleNotificationHandler(context, notificationConfig)
        val logLevel = if (BuildConfig.DEBUG) ChatLogLevel.ALL else ChatLogLevel.NOTHING
        val client = ChatClient.Builder(apiKey, context)
            .loggerHandler(FirebaseLogger)
            .notifications(notificationHandler)
            .logLevel(logLevel)
            .build()

        val domain = ChatDomain.Builder(client, context)
            .offlineEnabled()
            .build()

        val ui = ChatUI.Builder(context).build()
    }

    fun isUserSet(): Boolean {
        return ChatClient.isInitialized && ChatClient.instance().getCurrentUser() != null
    }
}
