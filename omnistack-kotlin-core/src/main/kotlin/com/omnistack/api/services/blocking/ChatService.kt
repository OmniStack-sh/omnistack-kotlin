// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.services.blocking

import com.omnistack.api.services.blocking.chats.CompletionService

interface ChatService {

    fun completions(): CompletionService
}
