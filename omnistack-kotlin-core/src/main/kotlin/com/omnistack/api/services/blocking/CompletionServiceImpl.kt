// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.services.blocking

import com.omnistack.api.core.ClientOptions
import com.omnistack.api.core.RequestOptions
import com.omnistack.api.core.handlers.errorHandler
import com.omnistack.api.core.handlers.jsonHandler
import com.omnistack.api.core.handlers.withErrorHandler
import com.omnistack.api.core.http.HttpMethod
import com.omnistack.api.core.http.HttpRequest
import com.omnistack.api.core.http.HttpResponse.Handler
import com.omnistack.api.core.json
import com.omnistack.api.errors.OmnistackError
import com.omnistack.api.models.CompletionCreateParams
import com.omnistack.api.models.CompletionCreateResponse

class CompletionServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CompletionService {

    private val errorHandler: Handler<OmnistackError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CompletionCreateResponse> =
        jsonHandler<CompletionCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Creates a completion for the provided prompt and parameters. */
    override fun create(
        params: CompletionCreateParams,
        requestOptions: RequestOptions
    ): CompletionCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("completions")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
