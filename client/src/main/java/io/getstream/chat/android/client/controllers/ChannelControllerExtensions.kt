package io.getstream.chat.android.client.controllers

import io.getstream.chat.android.client.events.ChatEvent
import io.getstream.chat.android.client.utils.observable.Disposable
import kotlin.reflect.KClass

inline fun <reified T : ChatEvent> ChannelController.subscribeFor(
    crossinline listener: (event: T) -> Unit
): Disposable {
    return this.subscribeFor(
        T::class.java,
        listener = { event ->
            listener(event as T)
        }
    )
}

fun ChannelController.subscribeFor(
    vararg eventTypes: KClass<out ChatEvent>,
    listener: (event: ChatEvent) -> Unit
): Disposable {
    val javaClassTypes: Array<Class<out ChatEvent>> = eventTypes.map { it.java }.toTypedArray()
    return subscribeFor(*javaClassTypes, listener = listener)
}

inline fun <reified T : ChatEvent> ChannelController.subscribeForSingle(
    noinline listener: (event: T) -> Unit
): Disposable {
    return this.subscribeForSingle(T::class.java, listener)
}
