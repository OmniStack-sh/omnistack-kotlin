// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.services.blocking.chats

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
        val completionService = client.chats().completions()
        val chatCompletionCreateResponse =
            completionService.create(
                ChatCompletionCreateParams.builder()
                    .messages(
                        listOf(
                            ChatCompletionCreateParams.Message.ofChatCompletionRequestSystemMessage(
                                ChatCompletionCreateParams.Message
                                    .ChatCompletionRequestSystemMessage
                                    .builder()
                                    .content(
                                        ChatCompletionCreateParams.Message
                                            .ChatCompletionRequestSystemMessage
                                            .Content
                                            .ofString("string")
                                    )
                                    .role(
                                        ChatCompletionCreateParams.Message
                                            .ChatCompletionRequestSystemMessage
                                            .Role
                                            .SYSTEM
                                    )
                                    .name("name")
                                    .build()
                            )
                        )
                    )
                    .model(ChatCompletionCreateParams.Model.ofString("string"))
                    .frequencyPenalty(2.0)
                    .functionCall(
                        ChatCompletionCreateParams.FunctionCall.ofUnionMember0(
                            ChatCompletionCreateParams.FunctionCall.UnionMember0.NONE
                        )
                    )
                    .functions(
                        listOf(
                            ChatCompletionCreateParams.Function.builder()
                                .name("name")
                                .description("description")
                                .parameters(
                                    ChatCompletionCreateParams.Function.Parameters.builder().build()
                                )
                                .build()
                        )
                    )
                    .logitBias(ChatCompletionCreateParams.LogitBias.builder().build())
                    .logprobs(true)
                    .maxCompletionTokens(123L)
                    .maxTokens(123L)
                    .n(123L)
                    .parallelToolCalls(true)
                    .presencePenalty(2.0)
                    .responseFormat(
                        ChatCompletionCreateParams.ResponseFormat.ofResponseFormatText(
                            ChatCompletionCreateParams.ResponseFormat.ResponseFormatText.builder()
                                .type(
                                    ChatCompletionCreateParams.ResponseFormat.ResponseFormatText
                                        .Type
                                        .TEXT
                                )
                                .build()
                        )
                    )
                    .seed(123L)
                    .serviceTier(ChatCompletionCreateParams.ServiceTier.AUTO)
                    .stop(ChatCompletionCreateParams.Stop.ofString("string"))
                    .stream(true)
                    .streamOptions(
                        ChatCompletionCreateParams.StreamOptions.builder()
                            .includeUsage(true)
                            .build()
                    )
                    .temperature(2.0)
                    .toolChoice(
                        ChatCompletionCreateParams.ToolChoice.ofUnionMember0(
                            ChatCompletionCreateParams.ToolChoice.UnionMember0.NONE
                        )
                    )
                    .tools(
                        listOf(
                            ChatCompletionCreateParams.Tool.builder()
                                .function(
                                    ChatCompletionCreateParams.Tool.Function.builder()
                                        .name("name")
                                        .description("description")
                                        .parameters(
                                            ChatCompletionCreateParams.Tool.Function.Parameters
                                                .builder()
                                                .build()
                                        )
                                        .strict(true)
                                        .build()
                                )
                                .type(ChatCompletionCreateParams.Tool.Type.FUNCTION)
                                .build()
                        )
                    )
                    .topLogprobs(20L)
                    .topP(1.0)
                    .user("user-1234")
                    .build()
            )
        println(chatCompletionCreateResponse)
        chatCompletionCreateResponse.validate()
    }
}
