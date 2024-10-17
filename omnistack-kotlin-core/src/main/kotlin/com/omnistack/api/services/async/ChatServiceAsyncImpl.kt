// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.services.async

import com.omnistack.api.core.ClientOptions
import com.omnistack.api.services.async.chats.CompletionServiceAsync
import com.omnistack.api.services.async.chats.CompletionServiceAsyncImpl

class ChatServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ChatServiceAsync {

    private val completions: CompletionServiceAsync by lazy {
        CompletionServiceAsyncImpl(clientOptions)
    }

    override fun completions(): CompletionServiceAsync = completions
}
