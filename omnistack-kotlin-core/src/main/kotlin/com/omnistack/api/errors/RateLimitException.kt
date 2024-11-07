package com.omnistack.api.errors

import com.omnistack.api.core.http.Headers

class RateLimitException(
    headers: Headers,
    body: String,
    error: OmnistackError,
) : OmnistackServiceException(429, headers, body, error)
