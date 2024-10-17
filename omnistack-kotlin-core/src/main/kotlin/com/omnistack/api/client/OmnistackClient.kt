// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.omnistack.api.client

import com.omnistack.api.models.*
import com.omnistack.api.services.blocking.*

interface OmnistackClient {

    fun async(): OmnistackClientAsync

    fun chats(): ChatService

    fun completions(): CompletionService
}
