// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.services.blocking.chats

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
import com.omnistack.api.models.ChatCompletionCreateParams
import com.omnistack.api.models.ChatCompletionCreateResponse

class CompletionServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CompletionService {

    private val errorHandler: Handler<OmnistackError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ChatCompletionCreateResponse> =
        jsonHandler<ChatCompletionCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Creates a model response for the given chat conversation. */
    override fun create(
        params: ChatCompletionCreateParams,
        requestOptions: RequestOptions
    ): ChatCompletionCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("chat", "completions")
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
