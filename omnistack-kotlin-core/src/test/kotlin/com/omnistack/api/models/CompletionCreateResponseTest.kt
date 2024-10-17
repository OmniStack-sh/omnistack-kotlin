// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CompletionCreateResponseTest {

    @Test
    fun createCompletionCreateResponse() {
        val completionCreateResponse =
            CompletionCreateResponse.builder()
                .id("id")
                .choices(
                    listOf(
                        CompletionCreateResponse.Choice.builder()
                            .finishReason(CompletionCreateResponse.Choice.FinishReason.STOP)
                            .index(123L)
                            .logprobs(
                                CompletionCreateResponse.Choice.Logprobs.builder()
                                    .textOffset(listOf(123L))
                                    .tokenLogprobs(listOf(42.23))
                                    .tokens(listOf("string"))
                                    .topLogprobs(
                                        listOf(
                                            CompletionCreateResponse.Choice.Logprobs.TopLogprob
                                                .builder()
                                                .build()
                                        )
                                    )
                                    .build()
                            )
                            .text("text")
                            .build()
                    )
                )
                .created(123L)
                .model("model")
                .object_(CompletionCreateResponse.Object.TEXT_COMPLETION)
                .systemFingerprint("system_fingerprint")
                .usage(
                    CompletionCreateResponse.Usage.builder()
                        .completionTokens(123L)
                        .promptTokens(123L)
                        .totalTokens(123L)
                        .completionTokensDetails(
                            CompletionCreateResponse.Usage.CompletionTokensDetails.builder()
                                .reasoningTokens(123L)
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(completionCreateResponse).isNotNull
        assertThat(completionCreateResponse.id()).isEqualTo("id")
        assertThat(completionCreateResponse.choices())
            .containsExactly(
                CompletionCreateResponse.Choice.builder()
                    .finishReason(CompletionCreateResponse.Choice.FinishReason.STOP)
                    .index(123L)
                    .logprobs(
                        CompletionCreateResponse.Choice.Logprobs.builder()
                            .textOffset(listOf(123L))
                            .tokenLogprobs(listOf(42.23))
                            .tokens(listOf("string"))
                            .topLogprobs(
                                listOf(
                                    CompletionCreateResponse.Choice.Logprobs.TopLogprob.builder()
                                        .build()
                                )
                            )
                            .build()
                    )
                    .text("text")
                    .build()
            )
        assertThat(completionCreateResponse.created()).isEqualTo(123L)
        assertThat(completionCreateResponse.model()).isEqualTo("model")
        assertThat(completionCreateResponse.object_())
            .isEqualTo(CompletionCreateResponse.Object.TEXT_COMPLETION)
        assertThat(completionCreateResponse.systemFingerprint()).isEqualTo("system_fingerprint")
        assertThat(completionCreateResponse.usage())
            .isEqualTo(
                CompletionCreateResponse.Usage.builder()
                    .completionTokens(123L)
                    .promptTokens(123L)
                    .totalTokens(123L)
                    .completionTokensDetails(
                        CompletionCreateResponse.Usage.CompletionTokensDetails.builder()
                            .reasoningTokens(123L)
                            .build()
                    )
                    .build()
            )
    }
}
