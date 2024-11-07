package com.omnistack.api.errors

import com.omnistack.api.core.http.Headers

class UnprocessableEntityException(
    headers: Headers,
    body: String,
    error: OmnistackError,
) : OmnistackServiceException(422, headers, body, error)
