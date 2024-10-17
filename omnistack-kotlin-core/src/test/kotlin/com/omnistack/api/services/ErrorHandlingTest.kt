// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import com.omnistack.api.client.OmnistackClient
import com.omnistack.api.client.okhttp.OmnistackOkHttpClient
import com.omnistack.api.core.JsonString
import com.omnistack.api.core.jsonMapper
import com.omnistack.api.errors.BadRequestException
import com.omnistack.api.errors.InternalServerException
import com.omnistack.api.errors.NotFoundException
import com.omnistack.api.errors.OmnistackError
import com.omnistack.api.errors.OmnistackException
import com.omnistack.api.errors.PermissionDeniedException
import com.omnistack.api.errors.RateLimitException
import com.omnistack.api.errors.UnauthorizedException
import com.omnistack.api.errors.UnexpectedStatusCodeException
import com.omnistack.api.errors.UnprocessableEntityException
import com.omnistack.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.assertj.guava.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val OMNISTACK_ERROR: OmnistackError =
        OmnistackError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

    private lateinit var client: OmnistackClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            OmnistackOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun completionsCreate200() {
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
                .build()

        val expected =
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

        stubFor(post(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.completions().create(params)).isEqualTo(expected)
    }

    @Test
    fun completionsCreate400() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(OMNISTACK_ERROR)))
        )

        assertThatThrownBy({ client.completions().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of("Foo", "Bar"), OMNISTACK_ERROR)
            })
    }

    @Test
    fun completionsCreate401() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(OMNISTACK_ERROR)))
        )

        assertThatThrownBy({ client.completions().create(params) })
            .satisfies({ e ->
                assertUnauthorized(e, ImmutableListMultimap.of("Foo", "Bar"), OMNISTACK_ERROR)
            })
    }

    @Test
    fun completionsCreate403() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(OMNISTACK_ERROR)))
        )

        assertThatThrownBy({ client.completions().create(params) })
            .satisfies({ e ->
                assertPermissionDenied(e, ImmutableListMultimap.of("Foo", "Bar"), OMNISTACK_ERROR)
            })
    }

    @Test
    fun completionsCreate404() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(OMNISTACK_ERROR)))
        )

        assertThatThrownBy({ client.completions().create(params) })
            .satisfies({ e ->
                assertNotFound(e, ImmutableListMultimap.of("Foo", "Bar"), OMNISTACK_ERROR)
            })
    }

    @Test
    fun completionsCreate422() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(OMNISTACK_ERROR)))
        )

        assertThatThrownBy({ client.completions().create(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    OMNISTACK_ERROR
                )
            })
    }

    @Test
    fun completionsCreate429() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(OMNISTACK_ERROR)))
        )

        assertThatThrownBy({ client.completions().create(params) })
            .satisfies({ e ->
                assertRateLimit(e, ImmutableListMultimap.of("Foo", "Bar"), OMNISTACK_ERROR)
            })
    }

    @Test
    fun completionsCreate500() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(OMNISTACK_ERROR)))
        )

        assertThatThrownBy({ client.completions().create(params) })
            .satisfies({ e ->
                assertInternalServer(e, ImmutableListMultimap.of("Foo", "Bar"), OMNISTACK_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
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
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(OMNISTACK_ERROR)))
        )

        assertThatThrownBy({ client.completions().create(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    toJson(OMNISTACK_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
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
                .build()

        stubFor(post(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.completions().create(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(OmnistackException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
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
                .build()

        stubFor(post(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.completions().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of(), OmnistackError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: ListMultimap<String, String>,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertBadRequest(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OmnistackError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnauthorized(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OmnistackError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OmnistackError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertNotFound(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OmnistackError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OmnistackError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertRateLimit(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OmnistackError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: OmnistackError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }
}
