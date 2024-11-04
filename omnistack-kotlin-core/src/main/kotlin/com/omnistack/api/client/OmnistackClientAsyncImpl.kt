// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.client

import com.omnistack.api.core.ClientOptions
import com.omnistack.api.core.getPackageVersion
import com.omnistack.api.models.*
import com.omnistack.api.services.async.*

class OmnistackClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : OmnistackClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.containsKey("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: OmnistackClient by lazy { OmnistackClientImpl(clientOptions) }

    private val chats: ChatServiceAsync by lazy { ChatServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val completions: CompletionServiceAsync by lazy {
        CompletionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): OmnistackClient = sync

    override fun chats(): ChatServiceAsync = chats

    override fun completions(): CompletionServiceAsync = completions
}
