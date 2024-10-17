// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.services.blocking

import com.omnistack.api.TestServerExtension
import com.omnistack.api.client.okhttp.OmnistackOkHttpClient
import com.omnistack.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CompletionServiceTest {

    @Test
    fun callCreate() {
        val client =
            OmnistackOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val completionService = client.completions()
        val completionCreateResponse =
            completionService.create(
                CompletionCreateParams.builder()
                    .model(CompletionCreateParams.Model.ofString("string"))
                    .prompt(CompletionCreateParams.Prompt.ofString("This is a test."))
                    .bestOf(20L)
                    .echo(true)
                    .frequencyPenalty(2.0)
                    .logitBias(CompletionCreateParams.LogitBias.builder().build())
                    .logprobs(5L)
                    .maxTokens(123L)
                    .n(123L)
                    .presencePenalty(2.0)
                    .seed(123L)
                    .stop(CompletionCreateParams.Stop.ofString("\n"))
                    .stream(true)
                    .streamOptions(
                        CompletionCreateParams.StreamOptions.builder().includeUsage(true).build()
                    )
                    .suffix("test.")
                    .temperature(2.0)
                    .topP(1.0)
                    .user("user-1234")
                    .build()
            )
        println(completionCreateResponse)
        completionCreateResponse.validate()
    }
}
