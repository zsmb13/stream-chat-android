package io.getstream.chat.ui.sample

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import io.getstream.chat.android.client.ChatClient
import io.getstream.chat.android.livedata.service.sync.PushMessageSyncHandler
import io.getstream.chat.ui.sample.application.AppConfig
import io.getstream.chat.ui.sample.application.ChatInitializer

internal class MyOfflineSyncFirebaseMessagingService : FirebaseMessagingService() {
    private val pushDataSyncHandler: PushMessageSyncHandler = PushMessageSyncHandler(this)
    private val chatInitializer: ChatInitializer = ChatInitializer(this)

    override fun onNewToken(token: String) {
        // Those who don't want to init SDK in the Application class need to ensure that SDK is initialized
        if (!ChatClient.isInitialized) {
            chatInitializer.init(AppConfig.apiKey)
        }

        pushDataSyncHandler.onNewToken(token)
    }

    override fun onMessageReceived(message: RemoteMessage) {
        // Those who don't want to init SDK in the Application class need to ensure that SDK is initialized
        if (!ChatClient.isInitialized) {
            chatInitializer.init(AppConfig.apiKey)
        }

        pushDataSyncHandler.onMessageReceived(message)
        stopSelf()
    }
}
