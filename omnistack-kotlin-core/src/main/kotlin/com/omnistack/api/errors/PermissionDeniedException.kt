package com.omnistack.api.errors

import com.google.common.collect.ListMultimap

class PermissionDeniedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: OmnistackError,
) : OmnistackServiceException(403, headers, body, error)
