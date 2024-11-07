package com.omnistack.api.errors

import com.omnistack.api.core.http.Headers

class UnexpectedStatusCodeException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: OmnistackError,
) : OmnistackServiceException(statusCode, headers, body, error)
