// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.omnistack.api.services.async

import com.omnistack.api.services.async.chats.CompletionServiceAsync

interface ChatServiceAsync {

    fun completions(): CompletionServiceAsync
}
