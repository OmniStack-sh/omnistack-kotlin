package com.omnistack.api.errors

import com.omnistack.api.core.http.Headers

class BadRequestException(
    headers: Headers,
    body: String,
    error: OmnistackError,
) : OmnistackServiceException(400, headers, body, error)
