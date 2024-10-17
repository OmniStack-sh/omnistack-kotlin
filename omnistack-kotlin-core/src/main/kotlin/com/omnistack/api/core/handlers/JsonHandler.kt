@file:JvmName("JsonHandler")

package com.omnistack.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.omnistack.api.core.http.HttpResponse
import com.omnistack.api.core.http.HttpResponse.Handler
import com.omnistack.api.errors.OmnistackException

internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw OmnistackException("Error reading response", e)
            }
        }
    }
