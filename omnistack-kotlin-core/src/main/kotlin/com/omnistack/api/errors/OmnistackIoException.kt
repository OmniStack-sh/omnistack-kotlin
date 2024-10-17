package com.omnistack.api.errors

class OmnistackIoException(message: String? = null, cause: Throwable? = null) :
    OmnistackException(message, cause)
