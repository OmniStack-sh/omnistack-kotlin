// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.services.async

import com.omnistack.api.core.RequestOptions
import com.omnistack.api.models.CompletionCreateParams
import com.omnistack.api.models.CompletionCreateResponse

interface CompletionServiceAsync {

    /** Creates a completion for the provided prompt and parameters. */
    suspend fun create(
        params: CompletionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletionCreateResponse
}
