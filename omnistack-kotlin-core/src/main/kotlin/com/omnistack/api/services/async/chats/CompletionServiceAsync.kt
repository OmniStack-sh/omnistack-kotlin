// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.services.async.chats

import com.omnistack.api.core.RequestOptions
import com.omnistack.api.models.ChatCompletionCreateParams
import com.omnistack.api.models.ChatCompletionCreateResponse

interface CompletionServiceAsync {

    /** Creates a model response for the given chat conversation. */
    suspend fun create(
        params: ChatCompletionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ChatCompletionCreateResponse
}
