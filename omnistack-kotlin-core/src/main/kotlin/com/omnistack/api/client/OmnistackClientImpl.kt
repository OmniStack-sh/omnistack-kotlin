// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.client

import com.omnistack.api.core.ClientOptions
import com.omnistack.api.models.*
import com.omnistack.api.services.blocking.*

class OmnistackClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : OmnistackClient {

    private val async: OmnistackClientAsync by lazy { OmnistackClientAsyncImpl(clientOptions) }

    private val chats: ChatService by lazy { ChatServiceImpl(clientOptions) }

    private val completions: CompletionService by lazy { CompletionServiceImpl(clientOptions) }

    override fun async(): OmnistackClientAsync = async

    override fun chats(): ChatService = chats

    override fun completions(): CompletionService = completions
}
