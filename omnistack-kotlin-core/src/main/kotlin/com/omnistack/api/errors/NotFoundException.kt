package com.omnistack.api.errors

import com.omnistack.api.core.http.Headers

class NotFoundException(
    headers: Headers,
    body: String,
    error: OmnistackError,
) : OmnistackServiceException(404, headers, body, error)
