package com.omnistack.api.errors

class OmnistackInvalidDataException(message: String? = null, cause: Throwable? = null) :
    OmnistackException(message, cause)
