// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.client

import com.omnistack.api.models.*
import com.omnistack.api.services.blocking.*

interface OmnistackClient {

    fun async(): OmnistackClientAsync

    fun chats(): ChatService

    fun completions(): CompletionService
}
