package com.omnistack.api.errors

import com.omnistack.api.core.http.Headers

abstract class OmnistackServiceException(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: String,
    private val error: OmnistackError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : OmnistackException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): OmnistackError = error
}
