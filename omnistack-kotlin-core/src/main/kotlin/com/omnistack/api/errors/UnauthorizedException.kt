package com.omnistack.api.errors

import com.omnistack.api.core.http.Headers

class UnauthorizedException(
    headers: Headers,
    body: String,
    error: OmnistackError,
) : OmnistackServiceException(401, headers, body, error)
