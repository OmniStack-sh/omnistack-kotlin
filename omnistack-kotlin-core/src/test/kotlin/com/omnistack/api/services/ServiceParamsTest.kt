// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.omnistack.api.client.OmnistackClient
import com.omnistack.api.client.okhttp.OmnistackOkHttpClient
import com.omnistack.api.core.JsonString
import com.omnistack.api.core.JsonValue
import com.omnistack.api.core.jsonMapper
import com.omnistack.api.models.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private lateinit var client: OmnistackClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            OmnistackOkHttpClient.builder()
                .apiKey("My API Key")
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .build()
    }

    @Test
    fun completionsCreateWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val additionalBodyProperties = mutableMapOf<String, JsonValue>()

        additionalBodyProperties.put("testBodyProperty", JsonString.of("ghi890"))

        val params =
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
                .additionalHeaders(additionalHeaders)
                .additionalBodyProperties(additionalBodyProperties)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
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

        stubFor(
            post(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .withRequestBody(matchingJsonPath("$.testBodyProperty", equalTo("ghi890")))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.completions().create(params)

        verify(postRequestedFor(anyUrl()))
    }
}
