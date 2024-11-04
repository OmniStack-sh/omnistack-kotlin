// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.services.async

import com.omnistack.api.services.async.chats.CompletionServiceAsync

interface ChatServiceAsync {

    fun completions(): CompletionServiceAsync
}
