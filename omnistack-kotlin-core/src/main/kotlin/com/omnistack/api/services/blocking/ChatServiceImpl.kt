// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.services.blocking

import com.omnistack.api.core.ClientOptions
import com.omnistack.api.services.blocking.chats.CompletionService
import com.omnistack.api.services.blocking.chats.CompletionServiceImpl

class ChatServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ChatService {

    private val completions: CompletionService by lazy { CompletionServiceImpl(clientOptions) }

    override fun completions(): CompletionService = completions
}
