package com.omnistack.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OmnistackError,
) : OmnistackServiceException(429, headers, body, error)
