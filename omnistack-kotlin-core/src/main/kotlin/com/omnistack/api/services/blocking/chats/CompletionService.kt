// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.omnistack.api.services.blocking.chats

import com.omnistack.api.core.RequestOptions
import com.omnistack.api.models.ChatCompletionCreateParams
import com.omnistack.api.models.ChatCompletionCreateResponse

interface CompletionService {

    /** Creates a model response for the given chat conversation. */
    fun create(
        params: ChatCompletionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ChatCompletionCreateResponse
}
