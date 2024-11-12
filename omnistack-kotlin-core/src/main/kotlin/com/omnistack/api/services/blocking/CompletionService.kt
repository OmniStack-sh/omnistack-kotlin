// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.services.blocking

import com.omnistack.api.core.RequestOptions
import com.omnistack.api.models.CompletionCreateParams
import com.omnistack.api.models.CompletionCreateResponse

interface CompletionService {

    /** Creates a completion for the provided prompt and parameters. */
    fun create(
        params: CompletionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletionCreateResponse
}
