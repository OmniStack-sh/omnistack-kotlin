package com.omnistack.api.errors

open class OmnistackException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
