// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.client

import com.omnistack.api.core.ClientOptions
import com.omnistack.api.models.*
import com.omnistack.api.services.async.*

class OmnistackClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : OmnistackClientAsync {

    private val sync: OmnistackClient by lazy { OmnistackClientImpl(clientOptions) }

    private val chats: ChatServiceAsync by lazy { ChatServiceAsyncImpl(clientOptions) }

    private val completions: CompletionServiceAsync by lazy {
        CompletionServiceAsyncImpl(clientOptions)
    }

    override fun sync(): OmnistackClient = sync

    override fun chats(): ChatServiceAsync = chats

    override fun completions(): CompletionServiceAsync = completions
}
