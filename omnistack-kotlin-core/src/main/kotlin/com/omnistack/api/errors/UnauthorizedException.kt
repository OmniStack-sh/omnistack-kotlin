package com.omnistack.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OmnistackError,
) : OmnistackServiceException(401, headers, body, error)
