package com.omnistack.api.errors

import com.omnistack.api.core.http.Headers

class PermissionDeniedException(
    headers: Headers,
    body: String,
    error: OmnistackError,
) : OmnistackServiceException(403, headers, body, error)
