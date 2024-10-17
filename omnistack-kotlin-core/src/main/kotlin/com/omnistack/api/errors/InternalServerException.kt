package com.omnistack.api.errors

import com.google.common.collect.ListMultimap

class InternalServerException(
    statusCode: Int,
    headers: ListMultimap<String, String>,
    body: String,
    error: OmnistackError,
) : OmnistackServiceException(statusCode, headers, body, error)
