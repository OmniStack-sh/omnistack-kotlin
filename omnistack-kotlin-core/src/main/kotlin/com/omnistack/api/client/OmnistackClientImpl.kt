// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.client

import com.omnistack.api.core.ClientOptions
import com.omnistack.api.core.getPackageVersion
import com.omnistack.api.models.*
import com.omnistack.api.services.blocking.*

class OmnistackClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : OmnistackClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.containsKey("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: OmnistackClientAsync by lazy { OmnistackClientAsyncImpl(clientOptions) }

    private val chats: ChatService by lazy { ChatServiceImpl(clientOptionsWithUserAgent) }

    private val completions: CompletionService by lazy {
        CompletionServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): OmnistackClientAsync = async

    override fun chats(): ChatService = chats

    override fun completions(): CompletionService = completions
}
