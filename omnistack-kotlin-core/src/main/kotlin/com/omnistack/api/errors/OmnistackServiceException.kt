package com.omnistack.api.errors

import com.google.common.collect.ListMultimap

abstract class OmnistackServiceException(
    private val statusCode: Int,
    private val headers: ListMultimap<String, String>,
    private val body: String,
    private val error: OmnistackError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : OmnistackException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): ListMultimap<String, String> = headers

    fun body(): String = body

    fun error(): OmnistackError = error
}
