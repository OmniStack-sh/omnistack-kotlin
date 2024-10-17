@file:JvmName("ErrorHandler")

package com.omnistack.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.google.common.collect.ListMultimap
import com.omnistack.api.core.http.HttpResponse
import com.omnistack.api.core.http.HttpResponse.Handler
import com.omnistack.api.errors.BadRequestException
import com.omnistack.api.errors.InternalServerException
import com.omnistack.api.errors.NotFoundException
import com.omnistack.api.errors.OmnistackError
import com.omnistack.api.errors.PermissionDeniedException
import com.omnistack.api.errors.RateLimitException
import com.omnistack.api.errors.UnauthorizedException
import com.omnistack.api.errors.UnexpectedStatusCodeException
import com.omnistack.api.errors.UnprocessableEntityException
import java.io.ByteArrayInputStream
import java.io.InputStream

internal fun errorHandler(jsonMapper: JsonMapper): Handler<OmnistackError> {
    val handler = jsonHandler<OmnistackError>(jsonMapper)

    return object : Handler<OmnistackError> {
        override fun handle(response: HttpResponse): OmnistackError =
            try {
                handler.handle(response)
            } catch (e: Exception) {
                OmnistackError.builder().build()
            }
    }
}

internal fun <T> Handler<T>.withErrorHandler(errorHandler: Handler<OmnistackError>): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            when (val statusCode = response.statusCode()) {
                in 200..299 -> {
                    return this@withErrorHandler.handle(response)
                }
                400 -> {
                    val buffered = response.buffered()
                    throw BadRequestException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                401 -> {
                    val buffered = response.buffered()
                    throw UnauthorizedException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                403 -> {
                    val buffered = response.buffered()
                    throw PermissionDeniedException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                404 -> {
                    val buffered = response.buffered()
                    throw NotFoundException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                422 -> {
                    val buffered = response.buffered()
                    throw UnprocessableEntityException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                429 -> {
                    val buffered = response.buffered()
                    throw RateLimitException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                in 500..599 -> {
                    val buffered = response.buffered()
                    throw InternalServerException(
                        statusCode,
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                else -> {
                    val buffered = response.buffered()
                    throw UnexpectedStatusCodeException(
                        statusCode,
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
            }
        }
    }

private fun HttpResponse.buffered(): HttpResponse {
    val body = body().readBytes()

    return object : HttpResponse {
        override fun statusCode(): Int = this@buffered.statusCode()

        override fun headers(): ListMultimap<String, String> = this@buffered.headers()

        override fun body(): InputStream = ByteArrayInputStream(body)

        override fun close() = this@buffered.close()
    }
}
