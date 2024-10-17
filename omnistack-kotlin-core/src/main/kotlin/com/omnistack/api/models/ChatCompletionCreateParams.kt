// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.omnistack.api.core.BaseDeserializer
import com.omnistack.api.core.BaseSerializer
import com.omnistack.api.core.Enum
import com.omnistack.api.core.ExcludeMissing
import com.omnistack.api.core.JsonField
import com.omnistack.api.core.JsonMissing
import com.omnistack.api.core.JsonValue
import com.omnistack.api.core.NoAutoDetect
import com.omnistack.api.core.getOrThrow
import com.omnistack.api.core.toUnmodifiable
import com.omnistack.api.errors.OmnistackInvalidDataException
import com.omnistack.api.models.*
import java.util.Objects

class ChatCompletionCreateParams
constructor(
    private val messages: List<Message>,
    private val model: Model,
    private val frequencyPenalty: Double?,
    private val functionCall: FunctionCall?,
    private val functions: List<Function>?,
    private val logitBias: LogitBias?,
    private val logprobs: Boolean?,
    private val maxCompletionTokens: Long?,
    private val maxTokens: Long?,
    private val n: Long?,
    private val parallelToolCalls: Boolean?,
    private val presencePenalty: Double?,
    private val responseFormat: ResponseFormat?,
    private val seed: Long?,
    private val serviceTier: ServiceTier?,
    private val stop: Stop?,
    private val stream: Boolean?,
    private val streamOptions: StreamOptions?,
    private val temperature: Double?,
    private val toolChoice: ToolChoice?,
    private val tools: List<Tool>?,
    private val topLogprobs: Long?,
    private val topP: Double?,
    private val user: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun messages(): List<Message> = messages

    fun model(): Model = model

    fun frequencyPenalty(): Double? = frequencyPenalty

    fun functionCall(): FunctionCall? = functionCall

    fun functions(): List<Function>? = functions

    fun logitBias(): LogitBias? = logitBias

    fun logprobs(): Boolean? = logprobs

    fun maxCompletionTokens(): Long? = maxCompletionTokens

    fun maxTokens(): Long? = maxTokens

    fun n(): Long? = n

    fun parallelToolCalls(): Boolean? = parallelToolCalls

    fun presencePenalty(): Double? = presencePenalty

    fun responseFormat(): ResponseFormat? = responseFormat

    fun seed(): Long? = seed

    fun serviceTier(): ServiceTier? = serviceTier

    fun stop(): Stop? = stop

    fun stream(): Boolean? = stream

    fun streamOptions(): StreamOptions? = streamOptions

    fun temperature(): Double? = temperature

    fun toolChoice(): ToolChoice? = toolChoice

    fun tools(): List<Tool>? = tools

    fun topLogprobs(): Long? = topLogprobs

    fun topP(): Double? = topP

    fun user(): String? = user

    internal fun getBody(): ChatCompletionCreateBody {
        return ChatCompletionCreateBody(
            messages,
            model,
            frequencyPenalty,
            functionCall,
            functions,
            logitBias,
            logprobs,
            maxCompletionTokens,
            maxTokens,
            n,
            parallelToolCalls,
            presencePenalty,
            responseFormat,
            seed,
            serviceTier,
            stop,
            stream,
            streamOptions,
            temperature,
            toolChoice,
            tools,
            topLogprobs,
            topP,
            user,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ChatCompletionCreateBody.Builder::class)
    @NoAutoDetect
    class ChatCompletionCreateBody
    internal constructor(
        private val messages: List<Message>?,
        private val model: Model?,
        private val frequencyPenalty: Double?,
        private val functionCall: FunctionCall?,
        private val functions: List<Function>?,
        private val logitBias: LogitBias?,
        private val logprobs: Boolean?,
        private val maxCompletionTokens: Long?,
        private val maxTokens: Long?,
        private val n: Long?,
        private val parallelToolCalls: Boolean?,
        private val presencePenalty: Double?,
        private val responseFormat: ResponseFormat?,
        private val seed: Long?,
        private val serviceTier: ServiceTier?,
        private val stop: Stop?,
        private val stream: Boolean?,
        private val streamOptions: StreamOptions?,
        private val temperature: Double?,
        private val toolChoice: ToolChoice?,
        private val tools: List<Tool>?,
        private val topLogprobs: Long?,
        private val topP: Double?,
        private val user: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * A list of messages comprising the conversation so far.
         * [Example Python code](https://cookbook.openai.com/examples/how_to_format_inputs_to_chatgpt_models).
         */
        @JsonProperty("messages") fun messages(): List<Message>? = messages

        /**
         * ID of the model to use. See the
         * [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for
         * details on which models work with the Chat API.
         */
        @JsonProperty("model") fun model(): Model? = model

        /**
         * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing
         * frequency in the text so far, decreasing the model's likelihood to repeat the same line
         * verbatim.
         *
         * [See more information about frequency and presence
         * penalties.](/docs/guides/text-generation/parameter-details)
         */
        @JsonProperty("frequency_penalty") fun frequencyPenalty(): Double? = frequencyPenalty

        /**
         * Deprecated in favor of `tool_choice`.
         *
         * Controls which (if any) function is called by the model. `none` means the model will not
         * call a function and instead generates a message. `auto` means the model can pick between
         * generating a message or calling a function. Specifying a particular function via
         * `{"name": "my_function"}` forces the model to call that function.
         *
         * `none` is the default when no functions are present. `auto` is the default if functions
         * are present.
         */
        @JsonProperty("function_call") fun functionCall(): FunctionCall? = functionCall

        /**
         * Deprecated in favor of `tools`.
         *
         * A list of functions the model may generate JSON inputs for.
         */
        @JsonProperty("functions") fun functions(): List<Function>? = functions

        /**
         * Modify the likelihood of specified tokens appearing in the completion.
         *
         * Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to
         * an associated bias value from -100 to 100. Mathematically, the bias is added to the
         * logits generated by the model prior to sampling. The exact effect will vary per model,
         * but values between -1 and 1 should decrease or increase likelihood of selection; values
         * like -100 or 100 should result in a ban or exclusive selection of the relevant token.
         */
        @JsonProperty("logit_bias") fun logitBias(): LogitBias? = logitBias

        /**
         * Whether to return log probabilities of the output tokens or not. If true, returns the log
         * probabilities of each output token returned in the `content` of `message`.
         */
        @JsonProperty("logprobs") fun logprobs(): Boolean? = logprobs

        /**
         * An upper bound for the number of tokens that can be generated for a completion, including
         * visible output tokens and [reasoning tokens](/docs/guides/reasoning).
         */
        @JsonProperty("max_completion_tokens")
        fun maxCompletionTokens(): Long? = maxCompletionTokens

        /**
         * The maximum number of [tokens](/tokenizer) that can be generated in the chat completion.
         * This value can be used to control [costs](https://openai.com/api/pricing/) for text
         * generated via API.
         *
         * This value is now deprecated in favor of `max_completion_tokens`, and is not compatible
         * with [o1 series models](/docs/guides/reasoning).
         */
        @JsonProperty("max_tokens") fun maxTokens(): Long? = maxTokens

        /**
         * How many chat completion choices to generate for each input message. Note that you will
         * be charged based on the number of generated tokens across all of the choices. Keep `n` as
         * `1` to minimize costs.
         */
        @JsonProperty("n") fun n(): Long? = n

        /**
         * Whether to enable
         * [parallel function calling](/docs/guides/function-calling/parallel-function-calling)
         * during tool use.
         */
        @JsonProperty("parallel_tool_calls") fun parallelToolCalls(): Boolean? = parallelToolCalls

        /**
         * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they
         * appear in the text so far, increasing the model's likelihood to talk about new topics.
         *
         * [See more information about frequency and presence
         * penalties.](/docs/guides/text-generation/parameter-details)
         */
        @JsonProperty("presence_penalty") fun presencePenalty(): Double? = presencePenalty

        /**
         * An object specifying the format that the model must output. Compatible with
         * [GPT-4o](/docs/models/gpt-4o), [GPT-4o mini](/docs/models/gpt-4o-mini),
         * [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than
         * `gpt-3.5-turbo-1106`.
         *
         * Setting to `{ "type": "json_schema", "json_schema": {...} }` enables Structured Outputs
         * which ensures the model will match your supplied JSON schema. Learn more in the
         * [Structured Outputs guide](/docs/guides/structured-outputs).
         *
         * Setting to `{ "type": "json_object" }` enables JSON mode, which ensures the message the
         * model generates is valid JSON.
         *
         * **Important:** when using JSON mode, you **must** also instruct the model to produce JSON
         * yourself via a system or user message. Without this, the model may generate an unending
         * stream of whitespace until the generation reaches the token limit, resulting in a
         * long-running and seemingly "stuck" request. Also note that the message content may be
         * partially cut off if `finish_reason="length"`, which indicates the generation exceeded
         * `max_tokens` or the conversation exceeded the max context length.
         */
        @JsonProperty("response_format") fun responseFormat(): ResponseFormat? = responseFormat

        /**
         * This feature is in Beta. If specified, our system will make a best effort to sample
         * deterministically, such that repeated requests with the same `seed` and parameters should
         * return the same result. Determinism is not guaranteed, and you should refer to the
         * `system_fingerprint` response parameter to monitor changes in the backend.
         */
        @JsonProperty("seed") fun seed(): Long? = seed

        /**
         * Specifies the latency tier to use for processing the request. This parameter is relevant
         * for customers subscribed to the scale tier service:
         * - If set to 'auto', and the Project is Scale tier enabled, the system will utilize scale
         *   tier credits until they are exhausted.
         * - If set to 'auto', and the Project is not Scale tier enabled, the request will be
         *   processed using the default service tier with a lower uptime SLA and no latency
         *   guarentee.
         * - If set to 'default', the request will be processed using the default service tier with
         *   a lower uptime SLA and no latency guarentee.
         * - When not set, the default behavior is 'auto'.
         *
         * When this parameter is set, the response body will include the `service_tier` utilized.
         */
        @JsonProperty("service_tier") fun serviceTier(): ServiceTier? = serviceTier

        /** Up to 4 sequences where the API will stop generating further tokens. */
        @JsonProperty("stop") fun stop(): Stop? = stop

        /**
         * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as
         * data-only
         * [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format)
         * as they become available, with the stream terminated by a `data: [DONE]` message.
         * [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions).
         */
        @JsonProperty("stream") fun stream(): Boolean? = stream

        /** Options for streaming response. Only set this when you set `stream: true`. */
        @JsonProperty("stream_options") fun streamOptions(): StreamOptions? = streamOptions

        /**
         * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the
         * output more random, while lower values like 0.2 will make it more focused and
         * deterministic.
         *
         * We generally recommend altering this or `top_p` but not both.
         */
        @JsonProperty("temperature") fun temperature(): Double? = temperature

        /**
         * Controls which (if any) tool is called by the model. `none` means the model will not call
         * any tool and instead generates a message. `auto` means the model can pick between
         * generating a message or calling one or more tools. `required` means the model must call
         * one or more tools. Specifying a particular tool via `{"type": "function", "function":
         * {"name": "my_function"}}` forces the model to call that tool.
         *
         * `none` is the default when no tools are present. `auto` is the default if tools are
         * present.
         */
        @JsonProperty("tool_choice") fun toolChoice(): ToolChoice? = toolChoice

        /**
         * A list of tools the model may call. Currently, only functions are supported as a tool.
         * Use this to provide a list of functions the model may generate JSON inputs for. A max of
         * 128 functions are supported.
         */
        @JsonProperty("tools") fun tools(): List<Tool>? = tools

        /**
         * An integer between 0 and 20 specifying the number of most likely tokens to return at each
         * token position, each with an associated log probability. `logprobs` must be set to `true`
         * if this parameter is used.
         */
        @JsonProperty("top_logprobs") fun topLogprobs(): Long? = topLogprobs

        /**
         * An alternative to sampling with temperature, called nucleus sampling, where the model
         * considers the results of the tokens with top_p probability mass. So 0.1 means only the
         * tokens comprising the top 10% probability mass are considered.
         *
         * We generally recommend altering this or `temperature` but not both.
         */
        @JsonProperty("top_p") fun topP(): Double? = topP

        /**
         * A unique identifier representing your end-user, which can help OpenAI to monitor and
         * detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
         */
        @JsonProperty("user") fun user(): String? = user

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var messages: List<Message>? = null
            private var model: Model? = null
            private var frequencyPenalty: Double? = null
            private var functionCall: FunctionCall? = null
            private var functions: List<Function>? = null
            private var logitBias: LogitBias? = null
            private var logprobs: Boolean? = null
            private var maxCompletionTokens: Long? = null
            private var maxTokens: Long? = null
            private var n: Long? = null
            private var parallelToolCalls: Boolean? = null
            private var presencePenalty: Double? = null
            private var responseFormat: ResponseFormat? = null
            private var seed: Long? = null
            private var serviceTier: ServiceTier? = null
            private var stop: Stop? = null
            private var stream: Boolean? = null
            private var streamOptions: StreamOptions? = null
            private var temperature: Double? = null
            private var toolChoice: ToolChoice? = null
            private var tools: List<Tool>? = null
            private var topLogprobs: Long? = null
            private var topP: Double? = null
            private var user: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(chatCompletionCreateBody: ChatCompletionCreateBody) = apply {
                this.messages = chatCompletionCreateBody.messages
                this.model = chatCompletionCreateBody.model
                this.frequencyPenalty = chatCompletionCreateBody.frequencyPenalty
                this.functionCall = chatCompletionCreateBody.functionCall
                this.functions = chatCompletionCreateBody.functions
                this.logitBias = chatCompletionCreateBody.logitBias
                this.logprobs = chatCompletionCreateBody.logprobs
                this.maxCompletionTokens = chatCompletionCreateBody.maxCompletionTokens
                this.maxTokens = chatCompletionCreateBody.maxTokens
                this.n = chatCompletionCreateBody.n
                this.parallelToolCalls = chatCompletionCreateBody.parallelToolCalls
                this.presencePenalty = chatCompletionCreateBody.presencePenalty
                this.responseFormat = chatCompletionCreateBody.responseFormat
                this.seed = chatCompletionCreateBody.seed
                this.serviceTier = chatCompletionCreateBody.serviceTier
                this.stop = chatCompletionCreateBody.stop
                this.stream = chatCompletionCreateBody.stream
                this.streamOptions = chatCompletionCreateBody.streamOptions
                this.temperature = chatCompletionCreateBody.temperature
                this.toolChoice = chatCompletionCreateBody.toolChoice
                this.tools = chatCompletionCreateBody.tools
                this.topLogprobs = chatCompletionCreateBody.topLogprobs
                this.topP = chatCompletionCreateBody.topP
                this.user = chatCompletionCreateBody.user
                additionalProperties(chatCompletionCreateBody.additionalProperties)
            }

            /**
             * A list of messages comprising the conversation so far.
             * [Example Python code](https://cookbook.openai.com/examples/how_to_format_inputs_to_chatgpt_models).
             */
            @JsonProperty("messages")
            fun messages(messages: List<Message>) = apply { this.messages = messages }

            /**
             * ID of the model to use. See the
             * [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for
             * details on which models work with the Chat API.
             */
            @JsonProperty("model") fun model(model: Model) = apply { this.model = model }

            /**
             * Number between -2.0 and 2.0. Positive values penalize new tokens based on their
             * existing frequency in the text so far, decreasing the model's likelihood to repeat
             * the same line verbatim.
             *
             * [See more information about frequency and presence
             * penalties.](/docs/guides/text-generation/parameter-details)
             */
            @JsonProperty("frequency_penalty")
            fun frequencyPenalty(frequencyPenalty: Double) = apply {
                this.frequencyPenalty = frequencyPenalty
            }

            /**
             * Deprecated in favor of `tool_choice`.
             *
             * Controls which (if any) function is called by the model. `none` means the model will
             * not call a function and instead generates a message. `auto` means the model can pick
             * between generating a message or calling a function. Specifying a particular function
             * via `{"name": "my_function"}` forces the model to call that function.
             *
             * `none` is the default when no functions are present. `auto` is the default if
             * functions are present.
             */
            @JsonProperty("function_call")
            fun functionCall(functionCall: FunctionCall) = apply {
                this.functionCall = functionCall
            }

            /**
             * Deprecated in favor of `tools`.
             *
             * A list of functions the model may generate JSON inputs for.
             */
            @JsonProperty("functions")
            fun functions(functions: List<Function>) = apply { this.functions = functions }

            /**
             * Modify the likelihood of specified tokens appearing in the completion.
             *
             * Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer)
             * to an associated bias value from -100 to 100. Mathematically, the bias is added to
             * the logits generated by the model prior to sampling. The exact effect will vary per
             * model, but values between -1 and 1 should decrease or increase likelihood of
             * selection; values like -100 or 100 should result in a ban or exclusive selection of
             * the relevant token.
             */
            @JsonProperty("logit_bias")
            fun logitBias(logitBias: LogitBias) = apply { this.logitBias = logitBias }

            /**
             * Whether to return log probabilities of the output tokens or not. If true, returns the
             * log probabilities of each output token returned in the `content` of `message`.
             */
            @JsonProperty("logprobs")
            fun logprobs(logprobs: Boolean) = apply { this.logprobs = logprobs }

            /**
             * An upper bound for the number of tokens that can be generated for a completion,
             * including visible output tokens and [reasoning tokens](/docs/guides/reasoning).
             */
            @JsonProperty("max_completion_tokens")
            fun maxCompletionTokens(maxCompletionTokens: Long) = apply {
                this.maxCompletionTokens = maxCompletionTokens
            }

            /**
             * The maximum number of [tokens](/tokenizer) that can be generated in the chat
             * completion. This value can be used to control
             * [costs](https://openai.com/api/pricing/) for text generated via API.
             *
             * This value is now deprecated in favor of `max_completion_tokens`, and is not
             * compatible with [o1 series models](/docs/guides/reasoning).
             */
            @JsonProperty("max_tokens")
            fun maxTokens(maxTokens: Long) = apply { this.maxTokens = maxTokens }

            /**
             * How many chat completion choices to generate for each input message. Note that you
             * will be charged based on the number of generated tokens across all of the choices.
             * Keep `n` as `1` to minimize costs.
             */
            @JsonProperty("n") fun n(n: Long) = apply { this.n = n }

            /**
             * Whether to enable
             * [parallel function calling](/docs/guides/function-calling/parallel-function-calling)
             * during tool use.
             */
            @JsonProperty("parallel_tool_calls")
            fun parallelToolCalls(parallelToolCalls: Boolean) = apply {
                this.parallelToolCalls = parallelToolCalls
            }

            /**
             * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether
             * they appear in the text so far, increasing the model's likelihood to talk about new
             * topics.
             *
             * [See more information about frequency and presence
             * penalties.](/docs/guides/text-generation/parameter-details)
             */
            @JsonProperty("presence_penalty")
            fun presencePenalty(presencePenalty: Double) = apply {
                this.presencePenalty = presencePenalty
            }

            /**
             * An object specifying the format that the model must output. Compatible with
             * [GPT-4o](/docs/models/gpt-4o), [GPT-4o mini](/docs/models/gpt-4o-mini),
             * [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer
             * than `gpt-3.5-turbo-1106`.
             *
             * Setting to `{ "type": "json_schema", "json_schema": {...} }` enables Structured
             * Outputs which ensures the model will match your supplied JSON schema. Learn more in
             * the [Structured Outputs guide](/docs/guides/structured-outputs).
             *
             * Setting to `{ "type": "json_object" }` enables JSON mode, which ensures the message
             * the model generates is valid JSON.
             *
             * **Important:** when using JSON mode, you **must** also instruct the model to produce
             * JSON yourself via a system or user message. Without this, the model may generate an
             * unending stream of whitespace until the generation reaches the token limit, resulting
             * in a long-running and seemingly "stuck" request. Also note that the message content
             * may be partially cut off if `finish_reason="length"`, which indicates the generation
             * exceeded `max_tokens` or the conversation exceeded the max context length.
             */
            @JsonProperty("response_format")
            fun responseFormat(responseFormat: ResponseFormat) = apply {
                this.responseFormat = responseFormat
            }

            /**
             * This feature is in Beta. If specified, our system will make a best effort to sample
             * deterministically, such that repeated requests with the same `seed` and parameters
             * should return the same result. Determinism is not guaranteed, and you should refer to
             * the `system_fingerprint` response parameter to monitor changes in the backend.
             */
            @JsonProperty("seed") fun seed(seed: Long) = apply { this.seed = seed }

            /**
             * Specifies the latency tier to use for processing the request. This parameter is
             * relevant for customers subscribed to the scale tier service:
             * - If set to 'auto', and the Project is Scale tier enabled, the system will utilize
             *   scale tier credits until they are exhausted.
             * - If set to 'auto', and the Project is not Scale tier enabled, the request will be
             *   processed using the default service tier with a lower uptime SLA and no latency
             *   guarentee.
             * - If set to 'default', the request will be processed using the default service tier
             *   with a lower uptime SLA and no latency guarentee.
             * - When not set, the default behavior is 'auto'.
             *
             * When this parameter is set, the response body will include the `service_tier`
             * utilized.
             */
            @JsonProperty("service_tier")
            fun serviceTier(serviceTier: ServiceTier) = apply { this.serviceTier = serviceTier }

            /** Up to 4 sequences where the API will stop generating further tokens. */
            @JsonProperty("stop") fun stop(stop: Stop) = apply { this.stop = stop }

            /**
             * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as
             * data-only
             * [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format)
             * as they become available, with the stream terminated by a `data: [DONE]` message.
             * [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions).
             */
            @JsonProperty("stream") fun stream(stream: Boolean) = apply { this.stream = stream }

            /** Options for streaming response. Only set this when you set `stream: true`. */
            @JsonProperty("stream_options")
            fun streamOptions(streamOptions: StreamOptions) = apply {
                this.streamOptions = streamOptions
            }

            /**
             * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make
             * the output more random, while lower values like 0.2 will make it more focused and
             * deterministic.
             *
             * We generally recommend altering this or `top_p` but not both.
             */
            @JsonProperty("temperature")
            fun temperature(temperature: Double) = apply { this.temperature = temperature }

            /**
             * Controls which (if any) tool is called by the model. `none` means the model will not
             * call any tool and instead generates a message. `auto` means the model can pick
             * between generating a message or calling one or more tools. `required` means the model
             * must call one or more tools. Specifying a particular tool via `{"type": "function",
             * "function": {"name": "my_function"}}` forces the model to call that tool.
             *
             * `none` is the default when no tools are present. `auto` is the default if tools are
             * present.
             */
            @JsonProperty("tool_choice")
            fun toolChoice(toolChoice: ToolChoice) = apply { this.toolChoice = toolChoice }

            /**
             * A list of tools the model may call. Currently, only functions are supported as a
             * tool. Use this to provide a list of functions the model may generate JSON inputs for.
             * A max of 128 functions are supported.
             */
            @JsonProperty("tools") fun tools(tools: List<Tool>) = apply { this.tools = tools }

            /**
             * An integer between 0 and 20 specifying the number of most likely tokens to return at
             * each token position, each with an associated log probability. `logprobs` must be set
             * to `true` if this parameter is used.
             */
            @JsonProperty("top_logprobs")
            fun topLogprobs(topLogprobs: Long) = apply { this.topLogprobs = topLogprobs }

            /**
             * An alternative to sampling with temperature, called nucleus sampling, where the model
             * considers the results of the tokens with top_p probability mass. So 0.1 means only
             * the tokens comprising the top 10% probability mass are considered.
             *
             * We generally recommend altering this or `temperature` but not both.
             */
            @JsonProperty("top_p") fun topP(topP: Double) = apply { this.topP = topP }

            /**
             * A unique identifier representing your end-user, which can help OpenAI to monitor and
             * detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
             */
            @JsonProperty("user") fun user(user: String) = apply { this.user = user }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ChatCompletionCreateBody =
                ChatCompletionCreateBody(
                    checkNotNull(messages) { "`messages` is required but was not set" }
                        .toUnmodifiable(),
                    checkNotNull(model) { "`model` is required but was not set" },
                    frequencyPenalty,
                    functionCall,
                    functions?.toUnmodifiable(),
                    logitBias,
                    logprobs,
                    maxCompletionTokens,
                    maxTokens,
                    n,
                    parallelToolCalls,
                    presencePenalty,
                    responseFormat,
                    seed,
                    serviceTier,
                    stop,
                    stream,
                    streamOptions,
                    temperature,
                    toolChoice,
                    tools?.toUnmodifiable(),
                    topLogprobs,
                    topP,
                    user,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChatCompletionCreateBody && this.messages == other.messages && this.model == other.model && this.frequencyPenalty == other.frequencyPenalty && this.functionCall == other.functionCall && this.functions == other.functions && this.logitBias == other.logitBias && this.logprobs == other.logprobs && this.maxCompletionTokens == other.maxCompletionTokens && this.maxTokens == other.maxTokens && this.n == other.n && this.parallelToolCalls == other.parallelToolCalls && this.presencePenalty == other.presencePenalty && this.responseFormat == other.responseFormat && this.seed == other.seed && this.serviceTier == other.serviceTier && this.stop == other.stop && this.stream == other.stream && this.streamOptions == other.streamOptions && this.temperature == other.temperature && this.toolChoice == other.toolChoice && this.tools == other.tools && this.topLogprobs == other.topLogprobs && this.topP == other.topP && this.user == other.user && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(messages, model, frequencyPenalty, functionCall, functions, logitBias, logprobs, maxCompletionTokens, maxTokens, n, parallelToolCalls, presencePenalty, responseFormat, seed, serviceTier, stop, stream, streamOptions, temperature, toolChoice, tools, topLogprobs, topP, user, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ChatCompletionCreateBody{messages=$messages, model=$model, frequencyPenalty=$frequencyPenalty, functionCall=$functionCall, functions=$functions, logitBias=$logitBias, logprobs=$logprobs, maxCompletionTokens=$maxCompletionTokens, maxTokens=$maxTokens, n=$n, parallelToolCalls=$parallelToolCalls, presencePenalty=$presencePenalty, responseFormat=$responseFormat, seed=$seed, serviceTier=$serviceTier, stop=$stop, stream=$stream, streamOptions=$streamOptions, temperature=$temperature, toolChoice=$toolChoice, tools=$tools, topLogprobs=$topLogprobs, topP=$topP, user=$user, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChatCompletionCreateParams && this.messages == other.messages && this.model == other.model && this.frequencyPenalty == other.frequencyPenalty && this.functionCall == other.functionCall && this.functions == other.functions && this.logitBias == other.logitBias && this.logprobs == other.logprobs && this.maxCompletionTokens == other.maxCompletionTokens && this.maxTokens == other.maxTokens && this.n == other.n && this.parallelToolCalls == other.parallelToolCalls && this.presencePenalty == other.presencePenalty && this.responseFormat == other.responseFormat && this.seed == other.seed && this.serviceTier == other.serviceTier && this.stop == other.stop && this.stream == other.stream && this.streamOptions == other.streamOptions && this.temperature == other.temperature && this.toolChoice == other.toolChoice && this.tools == other.tools && this.topLogprobs == other.topLogprobs && this.topP == other.topP && this.user == other.user && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(messages, model, frequencyPenalty, functionCall, functions, logitBias, logprobs, maxCompletionTokens, maxTokens, n, parallelToolCalls, presencePenalty, responseFormat, seed, serviceTier, stop, stream, streamOptions, temperature, toolChoice, tools, topLogprobs, topP, user, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ChatCompletionCreateParams{messages=$messages, model=$model, frequencyPenalty=$frequencyPenalty, functionCall=$functionCall, functions=$functions, logitBias=$logitBias, logprobs=$logprobs, maxCompletionTokens=$maxCompletionTokens, maxTokens=$maxTokens, n=$n, parallelToolCalls=$parallelToolCalls, presencePenalty=$presencePenalty, responseFormat=$responseFormat, seed=$seed, serviceTier=$serviceTier, stop=$stop, stream=$stream, streamOptions=$streamOptions, temperature=$temperature, toolChoice=$toolChoice, tools=$tools, topLogprobs=$topLogprobs, topP=$topP, user=$user, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var messages: MutableList<Message> = mutableListOf()
        private var model: Model? = null
        private var frequencyPenalty: Double? = null
        private var functionCall: FunctionCall? = null
        private var functions: MutableList<Function> = mutableListOf()
        private var logitBias: LogitBias? = null
        private var logprobs: Boolean? = null
        private var maxCompletionTokens: Long? = null
        private var maxTokens: Long? = null
        private var n: Long? = null
        private var parallelToolCalls: Boolean? = null
        private var presencePenalty: Double? = null
        private var responseFormat: ResponseFormat? = null
        private var seed: Long? = null
        private var serviceTier: ServiceTier? = null
        private var stop: Stop? = null
        private var stream: Boolean? = null
        private var streamOptions: StreamOptions? = null
        private var temperature: Double? = null
        private var toolChoice: ToolChoice? = null
        private var tools: MutableList<Tool> = mutableListOf()
        private var topLogprobs: Long? = null
        private var topP: Double? = null
        private var user: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chatCompletionCreateParams: ChatCompletionCreateParams) = apply {
            this.messages(chatCompletionCreateParams.messages)
            this.model = chatCompletionCreateParams.model
            this.frequencyPenalty = chatCompletionCreateParams.frequencyPenalty
            this.functionCall = chatCompletionCreateParams.functionCall
            this.functions(chatCompletionCreateParams.functions ?: listOf())
            this.logitBias = chatCompletionCreateParams.logitBias
            this.logprobs = chatCompletionCreateParams.logprobs
            this.maxCompletionTokens = chatCompletionCreateParams.maxCompletionTokens
            this.maxTokens = chatCompletionCreateParams.maxTokens
            this.n = chatCompletionCreateParams.n
            this.parallelToolCalls = chatCompletionCreateParams.parallelToolCalls
            this.presencePenalty = chatCompletionCreateParams.presencePenalty
            this.responseFormat = chatCompletionCreateParams.responseFormat
            this.seed = chatCompletionCreateParams.seed
            this.serviceTier = chatCompletionCreateParams.serviceTier
            this.stop = chatCompletionCreateParams.stop
            this.stream = chatCompletionCreateParams.stream
            this.streamOptions = chatCompletionCreateParams.streamOptions
            this.temperature = chatCompletionCreateParams.temperature
            this.toolChoice = chatCompletionCreateParams.toolChoice
            this.tools(chatCompletionCreateParams.tools ?: listOf())
            this.topLogprobs = chatCompletionCreateParams.topLogprobs
            this.topP = chatCompletionCreateParams.topP
            this.user = chatCompletionCreateParams.user
            additionalQueryParams(chatCompletionCreateParams.additionalQueryParams)
            additionalHeaders(chatCompletionCreateParams.additionalHeaders)
            additionalBodyProperties(chatCompletionCreateParams.additionalBodyProperties)
        }

        /**
         * A list of messages comprising the conversation so far.
         * [Example Python code](https://cookbook.openai.com/examples/how_to_format_inputs_to_chatgpt_models).
         */
        fun messages(messages: List<Message>) = apply {
            this.messages.clear()
            this.messages.addAll(messages)
        }

        /**
         * A list of messages comprising the conversation so far.
         * [Example Python code](https://cookbook.openai.com/examples/how_to_format_inputs_to_chatgpt_models).
         */
        fun addMessage(message: Message) = apply { this.messages.add(message) }

        /**
         * ID of the model to use. See the
         * [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for
         * details on which models work with the Chat API.
         */
        fun model(model: Model) = apply { this.model = model }

        /**
         * ID of the model to use. See the
         * [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for
         * details on which models work with the Chat API.
         */
        fun model(string: String) = apply { this.model = Model.ofString(string) }

        /**
         * ID of the model to use. See the
         * [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for
         * details on which models work with the Chat API.
         */
        fun model(unionMember1: Model.UnionMember1) = apply {
            this.model = Model.ofUnionMember1(unionMember1)
        }

        /**
         * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing
         * frequency in the text so far, decreasing the model's likelihood to repeat the same line
         * verbatim.
         *
         * [See more information about frequency and presence
         * penalties.](/docs/guides/text-generation/parameter-details)
         */
        fun frequencyPenalty(frequencyPenalty: Double) = apply {
            this.frequencyPenalty = frequencyPenalty
        }

        /**
         * Deprecated in favor of `tool_choice`.
         *
         * Controls which (if any) function is called by the model. `none` means the model will not
         * call a function and instead generates a message. `auto` means the model can pick between
         * generating a message or calling a function. Specifying a particular function via
         * `{"name": "my_function"}` forces the model to call that function.
         *
         * `none` is the default when no functions are present. `auto` is the default if functions
         * are present.
         */
        fun functionCall(functionCall: FunctionCall) = apply { this.functionCall = functionCall }

        /**
         * Deprecated in favor of `tool_choice`.
         *
         * Controls which (if any) function is called by the model. `none` means the model will not
         * call a function and instead generates a message. `auto` means the model can pick between
         * generating a message or calling a function. Specifying a particular function via
         * `{"name": "my_function"}` forces the model to call that function.
         *
         * `none` is the default when no functions are present. `auto` is the default if functions
         * are present.
         */
        fun functionCall(unionMember0: FunctionCall.UnionMember0) = apply {
            this.functionCall = FunctionCall.ofUnionMember0(unionMember0)
        }

        /**
         * Deprecated in favor of `tool_choice`.
         *
         * Controls which (if any) function is called by the model. `none` means the model will not
         * call a function and instead generates a message. `auto` means the model can pick between
         * generating a message or calling a function. Specifying a particular function via
         * `{"name": "my_function"}` forces the model to call that function.
         *
         * `none` is the default when no functions are present. `auto` is the default if functions
         * are present.
         */
        fun functionCall(
            chatCompletionFunctionCallOption: FunctionCall.ChatCompletionFunctionCallOption
        ) = apply {
            this.functionCall =
                FunctionCall.ofChatCompletionFunctionCallOption(chatCompletionFunctionCallOption)
        }

        /**
         * Deprecated in favor of `tools`.
         *
         * A list of functions the model may generate JSON inputs for.
         */
        fun functions(functions: List<Function>) = apply {
            this.functions.clear()
            this.functions.addAll(functions)
        }

        /**
         * Deprecated in favor of `tools`.
         *
         * A list of functions the model may generate JSON inputs for.
         */
        fun addFunction(function: Function) = apply { this.functions.add(function) }

        /**
         * Modify the likelihood of specified tokens appearing in the completion.
         *
         * Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to
         * an associated bias value from -100 to 100. Mathematically, the bias is added to the
         * logits generated by the model prior to sampling. The exact effect will vary per model,
         * but values between -1 and 1 should decrease or increase likelihood of selection; values
         * like -100 or 100 should result in a ban or exclusive selection of the relevant token.
         */
        fun logitBias(logitBias: LogitBias) = apply { this.logitBias = logitBias }

        /**
         * Whether to return log probabilities of the output tokens or not. If true, returns the log
         * probabilities of each output token returned in the `content` of `message`.
         */
        fun logprobs(logprobs: Boolean) = apply { this.logprobs = logprobs }

        /**
         * An upper bound for the number of tokens that can be generated for a completion, including
         * visible output tokens and [reasoning tokens](/docs/guides/reasoning).
         */
        fun maxCompletionTokens(maxCompletionTokens: Long) = apply {
            this.maxCompletionTokens = maxCompletionTokens
        }

        /**
         * The maximum number of [tokens](/tokenizer) that can be generated in the chat completion.
         * This value can be used to control [costs](https://openai.com/api/pricing/) for text
         * generated via API.
         *
         * This value is now deprecated in favor of `max_completion_tokens`, and is not compatible
         * with [o1 series models](/docs/guides/reasoning).
         */
        fun maxTokens(maxTokens: Long) = apply { this.maxTokens = maxTokens }

        /**
         * How many chat completion choices to generate for each input message. Note that you will
         * be charged based on the number of generated tokens across all of the choices. Keep `n` as
         * `1` to minimize costs.
         */
        fun n(n: Long) = apply { this.n = n }

        /**
         * Whether to enable
         * [parallel function calling](/docs/guides/function-calling/parallel-function-calling)
         * during tool use.
         */
        fun parallelToolCalls(parallelToolCalls: Boolean) = apply {
            this.parallelToolCalls = parallelToolCalls
        }

        /**
         * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they
         * appear in the text so far, increasing the model's likelihood to talk about new topics.
         *
         * [See more information about frequency and presence
         * penalties.](/docs/guides/text-generation/parameter-details)
         */
        fun presencePenalty(presencePenalty: Double) = apply {
            this.presencePenalty = presencePenalty
        }

        /**
         * An object specifying the format that the model must output. Compatible with
         * [GPT-4o](/docs/models/gpt-4o), [GPT-4o mini](/docs/models/gpt-4o-mini),
         * [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than
         * `gpt-3.5-turbo-1106`.
         *
         * Setting to `{ "type": "json_schema", "json_schema": {...} }` enables Structured Outputs
         * which ensures the model will match your supplied JSON schema. Learn more in the
         * [Structured Outputs guide](/docs/guides/structured-outputs).
         *
         * Setting to `{ "type": "json_object" }` enables JSON mode, which ensures the message the
         * model generates is valid JSON.
         *
         * **Important:** when using JSON mode, you **must** also instruct the model to produce JSON
         * yourself via a system or user message. Without this, the model may generate an unending
         * stream of whitespace until the generation reaches the token limit, resulting in a
         * long-running and seemingly "stuck" request. Also note that the message content may be
         * partially cut off if `finish_reason="length"`, which indicates the generation exceeded
         * `max_tokens` or the conversation exceeded the max context length.
         */
        fun responseFormat(responseFormat: ResponseFormat) = apply {
            this.responseFormat = responseFormat
        }

        /**
         * An object specifying the format that the model must output. Compatible with
         * [GPT-4o](/docs/models/gpt-4o), [GPT-4o mini](/docs/models/gpt-4o-mini),
         * [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than
         * `gpt-3.5-turbo-1106`.
         *
         * Setting to `{ "type": "json_schema", "json_schema": {...} }` enables Structured Outputs
         * which ensures the model will match your supplied JSON schema. Learn more in the
         * [Structured Outputs guide](/docs/guides/structured-outputs).
         *
         * Setting to `{ "type": "json_object" }` enables JSON mode, which ensures the message the
         * model generates is valid JSON.
         *
         * **Important:** when using JSON mode, you **must** also instruct the model to produce JSON
         * yourself via a system or user message. Without this, the model may generate an unending
         * stream of whitespace until the generation reaches the token limit, resulting in a
         * long-running and seemingly "stuck" request. Also note that the message content may be
         * partially cut off if `finish_reason="length"`, which indicates the generation exceeded
         * `max_tokens` or the conversation exceeded the max context length.
         */
        fun responseFormat(responseFormatText: ResponseFormat.ResponseFormatText) = apply {
            this.responseFormat = ResponseFormat.ofResponseFormatText(responseFormatText)
        }

        /**
         * An object specifying the format that the model must output. Compatible with
         * [GPT-4o](/docs/models/gpt-4o), [GPT-4o mini](/docs/models/gpt-4o-mini),
         * [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than
         * `gpt-3.5-turbo-1106`.
         *
         * Setting to `{ "type": "json_schema", "json_schema": {...} }` enables Structured Outputs
         * which ensures the model will match your supplied JSON schema. Learn more in the
         * [Structured Outputs guide](/docs/guides/structured-outputs).
         *
         * Setting to `{ "type": "json_object" }` enables JSON mode, which ensures the message the
         * model generates is valid JSON.
         *
         * **Important:** when using JSON mode, you **must** also instruct the model to produce JSON
         * yourself via a system or user message. Without this, the model may generate an unending
         * stream of whitespace until the generation reaches the token limit, resulting in a
         * long-running and seemingly "stuck" request. Also note that the message content may be
         * partially cut off if `finish_reason="length"`, which indicates the generation exceeded
         * `max_tokens` or the conversation exceeded the max context length.
         */
        fun responseFormat(responseFormatJsonObject: ResponseFormat.ResponseFormatJsonObject) =
            apply {
                this.responseFormat =
                    ResponseFormat.ofResponseFormatJsonObject(responseFormatJsonObject)
            }

        /**
         * An object specifying the format that the model must output. Compatible with
         * [GPT-4o](/docs/models/gpt-4o), [GPT-4o mini](/docs/models/gpt-4o-mini),
         * [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than
         * `gpt-3.5-turbo-1106`.
         *
         * Setting to `{ "type": "json_schema", "json_schema": {...} }` enables Structured Outputs
         * which ensures the model will match your supplied JSON schema. Learn more in the
         * [Structured Outputs guide](/docs/guides/structured-outputs).
         *
         * Setting to `{ "type": "json_object" }` enables JSON mode, which ensures the message the
         * model generates is valid JSON.
         *
         * **Important:** when using JSON mode, you **must** also instruct the model to produce JSON
         * yourself via a system or user message. Without this, the model may generate an unending
         * stream of whitespace until the generation reaches the token limit, resulting in a
         * long-running and seemingly "stuck" request. Also note that the message content may be
         * partially cut off if `finish_reason="length"`, which indicates the generation exceeded
         * `max_tokens` or the conversation exceeded the max context length.
         */
        fun responseFormat(responseFormatJsonSchema: ResponseFormat.ResponseFormatJsonSchema) =
            apply {
                this.responseFormat =
                    ResponseFormat.ofResponseFormatJsonSchema(responseFormatJsonSchema)
            }

        /**
         * This feature is in Beta. If specified, our system will make a best effort to sample
         * deterministically, such that repeated requests with the same `seed` and parameters should
         * return the same result. Determinism is not guaranteed, and you should refer to the
         * `system_fingerprint` response parameter to monitor changes in the backend.
         */
        fun seed(seed: Long) = apply { this.seed = seed }

        /**
         * Specifies the latency tier to use for processing the request. This parameter is relevant
         * for customers subscribed to the scale tier service:
         * - If set to 'auto', and the Project is Scale tier enabled, the system will utilize scale
         *   tier credits until they are exhausted.
         * - If set to 'auto', and the Project is not Scale tier enabled, the request will be
         *   processed using the default service tier with a lower uptime SLA and no latency
         *   guarentee.
         * - If set to 'default', the request will be processed using the default service tier with
         *   a lower uptime SLA and no latency guarentee.
         * - When not set, the default behavior is 'auto'.
         *
         * When this parameter is set, the response body will include the `service_tier` utilized.
         */
        fun serviceTier(serviceTier: ServiceTier) = apply { this.serviceTier = serviceTier }

        /** Up to 4 sequences where the API will stop generating further tokens. */
        fun stop(stop: Stop) = apply { this.stop = stop }

        /** Up to 4 sequences where the API will stop generating further tokens. */
        fun stop(string: String) = apply { this.stop = Stop.ofString(string) }

        /** Up to 4 sequences where the API will stop generating further tokens. */
        fun stopOfStrings(strings: List<String>) = apply { this.stop = Stop.ofStrings(strings) }

        /**
         * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as
         * data-only
         * [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format)
         * as they become available, with the stream terminated by a `data: [DONE]` message.
         * [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions).
         */
        fun stream(stream: Boolean) = apply { this.stream = stream }

        /** Options for streaming response. Only set this when you set `stream: true`. */
        fun streamOptions(streamOptions: StreamOptions) = apply {
            this.streamOptions = streamOptions
        }

        /**
         * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the
         * output more random, while lower values like 0.2 will make it more focused and
         * deterministic.
         *
         * We generally recommend altering this or `top_p` but not both.
         */
        fun temperature(temperature: Double) = apply { this.temperature = temperature }

        /**
         * Controls which (if any) tool is called by the model. `none` means the model will not call
         * any tool and instead generates a message. `auto` means the model can pick between
         * generating a message or calling one or more tools. `required` means the model must call
         * one or more tools. Specifying a particular tool via `{"type": "function", "function":
         * {"name": "my_function"}}` forces the model to call that tool.
         *
         * `none` is the default when no tools are present. `auto` is the default if tools are
         * present.
         */
        fun toolChoice(toolChoice: ToolChoice) = apply { this.toolChoice = toolChoice }

        /**
         * Controls which (if any) tool is called by the model. `none` means the model will not call
         * any tool and instead generates a message. `auto` means the model can pick between
         * generating a message or calling one or more tools. `required` means the model must call
         * one or more tools. Specifying a particular tool via `{"type": "function", "function":
         * {"name": "my_function"}}` forces the model to call that tool.
         *
         * `none` is the default when no tools are present. `auto` is the default if tools are
         * present.
         */
        fun toolChoice(unionMember0: ToolChoice.UnionMember0) = apply {
            this.toolChoice = ToolChoice.ofUnionMember0(unionMember0)
        }

        /**
         * Controls which (if any) tool is called by the model. `none` means the model will not call
         * any tool and instead generates a message. `auto` means the model can pick between
         * generating a message or calling one or more tools. `required` means the model must call
         * one or more tools. Specifying a particular tool via `{"type": "function", "function":
         * {"name": "my_function"}}` forces the model to call that tool.
         *
         * `none` is the default when no tools are present. `auto` is the default if tools are
         * present.
         */
        fun toolChoice(chatCompletionNamedToolChoice: ToolChoice.ChatCompletionNamedToolChoice) =
            apply {
                this.toolChoice =
                    ToolChoice.ofChatCompletionNamedToolChoice(chatCompletionNamedToolChoice)
            }

        /**
         * A list of tools the model may call. Currently, only functions are supported as a tool.
         * Use this to provide a list of functions the model may generate JSON inputs for. A max of
         * 128 functions are supported.
         */
        fun tools(tools: List<Tool>) = apply {
            this.tools.clear()
            this.tools.addAll(tools)
        }

        /**
         * A list of tools the model may call. Currently, only functions are supported as a tool.
         * Use this to provide a list of functions the model may generate JSON inputs for. A max of
         * 128 functions are supported.
         */
        fun addTool(tool: Tool) = apply { this.tools.add(tool) }

        /**
         * An integer between 0 and 20 specifying the number of most likely tokens to return at each
         * token position, each with an associated log probability. `logprobs` must be set to `true`
         * if this parameter is used.
         */
        fun topLogprobs(topLogprobs: Long) = apply { this.topLogprobs = topLogprobs }

        /**
         * An alternative to sampling with temperature, called nucleus sampling, where the model
         * considers the results of the tokens with top_p probability mass. So 0.1 means only the
         * tokens comprising the top 10% probability mass are considered.
         *
         * We generally recommend altering this or `temperature` but not both.
         */
        fun topP(topP: Double) = apply { this.topP = topP }

        /**
         * A unique identifier representing your end-user, which can help OpenAI to monitor and
         * detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
         */
        fun user(user: String) = apply { this.user = user }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): ChatCompletionCreateParams =
            ChatCompletionCreateParams(
                checkNotNull(messages) { "`messages` is required but was not set" }
                    .toUnmodifiable(),
                checkNotNull(model) { "`model` is required but was not set" },
                frequencyPenalty,
                functionCall,
                if (functions.size == 0) null else functions.toUnmodifiable(),
                logitBias,
                logprobs,
                maxCompletionTokens,
                maxTokens,
                n,
                parallelToolCalls,
                presencePenalty,
                responseFormat,
                seed,
                serviceTier,
                stop,
                stream,
                streamOptions,
                temperature,
                toolChoice,
                if (tools.size == 0) null else tools.toUnmodifiable(),
                topLogprobs,
                topP,
                user,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(using = Message.Deserializer::class)
    @JsonSerialize(using = Message.Serializer::class)
    class Message
    private constructor(
        private val chatCompletionRequestSystemMessage: ChatCompletionRequestSystemMessage? = null,
        private val chatCompletionRequestUserMessage: ChatCompletionRequestUserMessage? = null,
        private val chatCompletionRequestAssistantMessage: ChatCompletionRequestAssistantMessage? =
            null,
        private val chatCompletionRequestToolMessage: ChatCompletionRequestToolMessage? = null,
        private val chatCompletionRequestFunctionMessage: ChatCompletionRequestFunctionMessage? =
            null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun chatCompletionRequestSystemMessage(): ChatCompletionRequestSystemMessage? =
            chatCompletionRequestSystemMessage

        fun chatCompletionRequestUserMessage(): ChatCompletionRequestUserMessage? =
            chatCompletionRequestUserMessage

        fun chatCompletionRequestAssistantMessage(): ChatCompletionRequestAssistantMessage? =
            chatCompletionRequestAssistantMessage

        fun chatCompletionRequestToolMessage(): ChatCompletionRequestToolMessage? =
            chatCompletionRequestToolMessage

        fun chatCompletionRequestFunctionMessage(): ChatCompletionRequestFunctionMessage? =
            chatCompletionRequestFunctionMessage

        fun isChatCompletionRequestSystemMessage(): Boolean =
            chatCompletionRequestSystemMessage != null

        fun isChatCompletionRequestUserMessage(): Boolean = chatCompletionRequestUserMessage != null

        fun isChatCompletionRequestAssistantMessage(): Boolean =
            chatCompletionRequestAssistantMessage != null

        fun isChatCompletionRequestToolMessage(): Boolean = chatCompletionRequestToolMessage != null

        fun isChatCompletionRequestFunctionMessage(): Boolean =
            chatCompletionRequestFunctionMessage != null

        fun asChatCompletionRequestSystemMessage(): ChatCompletionRequestSystemMessage =
            chatCompletionRequestSystemMessage.getOrThrow("chatCompletionRequestSystemMessage")

        fun asChatCompletionRequestUserMessage(): ChatCompletionRequestUserMessage =
            chatCompletionRequestUserMessage.getOrThrow("chatCompletionRequestUserMessage")

        fun asChatCompletionRequestAssistantMessage(): ChatCompletionRequestAssistantMessage =
            chatCompletionRequestAssistantMessage.getOrThrow(
                "chatCompletionRequestAssistantMessage"
            )

        fun asChatCompletionRequestToolMessage(): ChatCompletionRequestToolMessage =
            chatCompletionRequestToolMessage.getOrThrow("chatCompletionRequestToolMessage")

        fun asChatCompletionRequestFunctionMessage(): ChatCompletionRequestFunctionMessage =
            chatCompletionRequestFunctionMessage.getOrThrow("chatCompletionRequestFunctionMessage")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                chatCompletionRequestSystemMessage != null ->
                    visitor.visitChatCompletionRequestSystemMessage(
                        chatCompletionRequestSystemMessage
                    )
                chatCompletionRequestUserMessage != null ->
                    visitor.visitChatCompletionRequestUserMessage(chatCompletionRequestUserMessage)
                chatCompletionRequestAssistantMessage != null ->
                    visitor.visitChatCompletionRequestAssistantMessage(
                        chatCompletionRequestAssistantMessage
                    )
                chatCompletionRequestToolMessage != null ->
                    visitor.visitChatCompletionRequestToolMessage(chatCompletionRequestToolMessage)
                chatCompletionRequestFunctionMessage != null ->
                    visitor.visitChatCompletionRequestFunctionMessage(
                        chatCompletionRequestFunctionMessage
                    )
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Message = apply {
            if (!validated) {
                if (
                    chatCompletionRequestSystemMessage == null &&
                        chatCompletionRequestUserMessage == null &&
                        chatCompletionRequestAssistantMessage == null &&
                        chatCompletionRequestToolMessage == null &&
                        chatCompletionRequestFunctionMessage == null
                ) {
                    throw OmnistackInvalidDataException("Unknown Message: $_json")
                }
                chatCompletionRequestSystemMessage?.validate()
                chatCompletionRequestUserMessage?.validate()
                chatCompletionRequestAssistantMessage?.validate()
                chatCompletionRequestToolMessage?.validate()
                chatCompletionRequestFunctionMessage?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Message && this.chatCompletionRequestSystemMessage == other.chatCompletionRequestSystemMessage && this.chatCompletionRequestUserMessage == other.chatCompletionRequestUserMessage && this.chatCompletionRequestAssistantMessage == other.chatCompletionRequestAssistantMessage && this.chatCompletionRequestToolMessage == other.chatCompletionRequestToolMessage && this.chatCompletionRequestFunctionMessage == other.chatCompletionRequestFunctionMessage /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(chatCompletionRequestSystemMessage, chatCompletionRequestUserMessage, chatCompletionRequestAssistantMessage, chatCompletionRequestToolMessage, chatCompletionRequestFunctionMessage) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                chatCompletionRequestSystemMessage != null ->
                    "Message{chatCompletionRequestSystemMessage=$chatCompletionRequestSystemMessage}"
                chatCompletionRequestUserMessage != null ->
                    "Message{chatCompletionRequestUserMessage=$chatCompletionRequestUserMessage}"
                chatCompletionRequestAssistantMessage != null ->
                    "Message{chatCompletionRequestAssistantMessage=$chatCompletionRequestAssistantMessage}"
                chatCompletionRequestToolMessage != null ->
                    "Message{chatCompletionRequestToolMessage=$chatCompletionRequestToolMessage}"
                chatCompletionRequestFunctionMessage != null ->
                    "Message{chatCompletionRequestFunctionMessage=$chatCompletionRequestFunctionMessage}"
                _json != null -> "Message{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Message")
            }
        }

        companion object {

            fun ofChatCompletionRequestSystemMessage(
                chatCompletionRequestSystemMessage: ChatCompletionRequestSystemMessage
            ) = Message(chatCompletionRequestSystemMessage = chatCompletionRequestSystemMessage)

            fun ofChatCompletionRequestUserMessage(
                chatCompletionRequestUserMessage: ChatCompletionRequestUserMessage
            ) = Message(chatCompletionRequestUserMessage = chatCompletionRequestUserMessage)

            fun ofChatCompletionRequestAssistantMessage(
                chatCompletionRequestAssistantMessage: ChatCompletionRequestAssistantMessage
            ) =
                Message(
                    chatCompletionRequestAssistantMessage = chatCompletionRequestAssistantMessage
                )

            fun ofChatCompletionRequestToolMessage(
                chatCompletionRequestToolMessage: ChatCompletionRequestToolMessage
            ) = Message(chatCompletionRequestToolMessage = chatCompletionRequestToolMessage)

            fun ofChatCompletionRequestFunctionMessage(
                chatCompletionRequestFunctionMessage: ChatCompletionRequestFunctionMessage
            ) = Message(chatCompletionRequestFunctionMessage = chatCompletionRequestFunctionMessage)
        }

        interface Visitor<out T> {

            fun visitChatCompletionRequestSystemMessage(
                chatCompletionRequestSystemMessage: ChatCompletionRequestSystemMessage
            ): T

            fun visitChatCompletionRequestUserMessage(
                chatCompletionRequestUserMessage: ChatCompletionRequestUserMessage
            ): T

            fun visitChatCompletionRequestAssistantMessage(
                chatCompletionRequestAssistantMessage: ChatCompletionRequestAssistantMessage
            ): T

            fun visitChatCompletionRequestToolMessage(
                chatCompletionRequestToolMessage: ChatCompletionRequestToolMessage
            ): T

            fun visitChatCompletionRequestFunctionMessage(
                chatCompletionRequestFunctionMessage: ChatCompletionRequestFunctionMessage
            ): T

            fun unknown(json: JsonValue?): T {
                throw OmnistackInvalidDataException("Unknown Message: $json")
            }
        }

        class Deserializer : BaseDeserializer<Message>(Message::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Message {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<ChatCompletionRequestSystemMessage>()) {
                        it.validate()
                    }
                    ?.let {
                        return Message(chatCompletionRequestSystemMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ChatCompletionRequestUserMessage>()) {
                        it.validate()
                    }
                    ?.let {
                        return Message(chatCompletionRequestUserMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ChatCompletionRequestAssistantMessage>()) {
                        it.validate()
                    }
                    ?.let {
                        return Message(chatCompletionRequestAssistantMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ChatCompletionRequestToolMessage>()) {
                        it.validate()
                    }
                    ?.let {
                        return Message(chatCompletionRequestToolMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ChatCompletionRequestFunctionMessage>()) {
                        it.validate()
                    }
                    ?.let {
                        return Message(chatCompletionRequestFunctionMessage = it, _json = json)
                    }

                return Message(_json = json)
            }
        }

        class Serializer : BaseSerializer<Message>(Message::class) {

            override fun serialize(
                value: Message,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.chatCompletionRequestSystemMessage != null ->
                        generator.writeObject(value.chatCompletionRequestSystemMessage)
                    value.chatCompletionRequestUserMessage != null ->
                        generator.writeObject(value.chatCompletionRequestUserMessage)
                    value.chatCompletionRequestAssistantMessage != null ->
                        generator.writeObject(value.chatCompletionRequestAssistantMessage)
                    value.chatCompletionRequestToolMessage != null ->
                        generator.writeObject(value.chatCompletionRequestToolMessage)
                    value.chatCompletionRequestFunctionMessage != null ->
                        generator.writeObject(value.chatCompletionRequestFunctionMessage)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Message")
                }
            }
        }

        @JsonDeserialize(builder = ChatCompletionRequestSystemMessage.Builder::class)
        @NoAutoDetect
        class ChatCompletionRequestSystemMessage
        private constructor(
            private val content: JsonField<Content>,
            private val role: JsonField<Role>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The contents of the system message. */
            fun content(): Content = content.getRequired("content")

            /** The role of the messages author, in this case `system`. */
            fun role(): Role = role.getRequired("role")

            /**
             * An optional name for the participant. Provides the model information to differentiate
             * between participants of the same role.
             */
            fun name(): String? = name.getNullable("name")

            /** The contents of the system message. */
            @JsonProperty("content") @ExcludeMissing fun _content() = content

            /** The role of the messages author, in this case `system`. */
            @JsonProperty("role") @ExcludeMissing fun _role() = role

            /**
             * An optional name for the participant. Provides the model information to differentiate
             * between participants of the same role.
             */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ChatCompletionRequestSystemMessage = apply {
                if (!validated) {
                    content()
                    role()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var content: JsonField<Content> = JsonMissing.of()
                private var role: JsonField<Role> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    chatCompletionRequestSystemMessage: ChatCompletionRequestSystemMessage
                ) = apply {
                    this.content = chatCompletionRequestSystemMessage.content
                    this.role = chatCompletionRequestSystemMessage.role
                    this.name = chatCompletionRequestSystemMessage.name
                    additionalProperties(chatCompletionRequestSystemMessage.additionalProperties)
                }

                /** The contents of the system message. */
                fun content(content: Content) = content(JsonField.of(content))

                /** The contents of the system message. */
                @JsonProperty("content")
                @ExcludeMissing
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** The role of the messages author, in this case `system`. */
                fun role(role: Role) = role(JsonField.of(role))

                /** The role of the messages author, in this case `system`. */
                @JsonProperty("role")
                @ExcludeMissing
                fun role(role: JsonField<Role>) = apply { this.role = role }

                /**
                 * An optional name for the participant. Provides the model information to
                 * differentiate between participants of the same role.
                 */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * An optional name for the participant. Provides the model information to
                 * differentiate between participants of the same role.
                 */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ChatCompletionRequestSystemMessage =
                    ChatCompletionRequestSystemMessage(
                        content,
                        role,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val textContent: String? = null,
                private val arrayOfContentParts:
                    List<ChatCompletionRequestMessageContentPartText>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                private var validated: Boolean = false

                /** The contents of the system message. */
                fun textContent(): String? = textContent
                /**
                 * An array of content parts with a defined type. For system messages, only type
                 * `text` is supported.
                 */
                fun arrayOfContentParts(): List<ChatCompletionRequestMessageContentPartText>? =
                    arrayOfContentParts

                fun isTextContent(): Boolean = textContent != null

                fun isArrayOfContentParts(): Boolean = arrayOfContentParts != null

                fun asTextContent(): String = textContent.getOrThrow("textContent")

                fun asArrayOfContentParts(): List<ChatCompletionRequestMessageContentPartText> =
                    arrayOfContentParts.getOrThrow("arrayOfContentParts")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        textContent != null -> visitor.visitTextContent(textContent)
                        arrayOfContentParts != null ->
                            visitor.visitArrayOfContentParts(arrayOfContentParts)
                        else -> visitor.unknown(_json)
                    }
                }

                fun validate(): Content = apply {
                    if (!validated) {
                        if (textContent == null && arrayOfContentParts == null) {
                            throw OmnistackInvalidDataException("Unknown Content: $_json")
                        }
                        arrayOfContentParts?.forEach { it.validate() }
                        validated = true
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Content && this.textContent == other.textContent && this.arrayOfContentParts == other.arrayOfContentParts /* spotless:on */
                }

                override fun hashCode(): Int {
                    return /* spotless:off */ Objects.hash(textContent, arrayOfContentParts) /* spotless:on */
                }

                override fun toString(): String {
                    return when {
                        textContent != null -> "Content{textContent=$textContent}"
                        arrayOfContentParts != null ->
                            "Content{arrayOfContentParts=$arrayOfContentParts}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }
                }

                companion object {

                    fun ofTextContent(textContent: String) = Content(textContent = textContent)

                    fun ofArrayOfContentParts(
                        arrayOfContentParts: List<ChatCompletionRequestMessageContentPartText>
                    ) = Content(arrayOfContentParts = arrayOfContentParts)
                }

                interface Visitor<out T> {

                    fun visitTextContent(textContent: String): T

                    fun visitArrayOfContentParts(
                        arrayOfContentParts: List<ChatCompletionRequestMessageContentPartText>
                    ): T

                    fun unknown(json: JsonValue?): T {
                        throw OmnistackInvalidDataException("Unknown Content: $json")
                    }
                }

                class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            return Content(textContent = it, _json = json)
                        }
                        tryDeserialize(
                                node,
                                jacksonTypeRef<List<ChatCompletionRequestMessageContentPartText>>()
                            ) {
                                it.forEach { it.validate() }
                            }
                            ?.let {
                                return Content(arrayOfContentParts = it, _json = json)
                            }

                        return Content(_json = json)
                    }
                }

                class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider
                    ) {
                        when {
                            value.textContent != null -> generator.writeObject(value.textContent)
                            value.arrayOfContentParts != null ->
                                generator.writeObject(value.arrayOfContentParts)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(
                    builder = ChatCompletionRequestMessageContentPartText.Builder::class
                )
                @NoAutoDetect
                class ChatCompletionRequestMessageContentPartText
                private constructor(
                    private val type: JsonField<Type>,
                    private val text: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    /** The type of the content part. */
                    fun type(): Type = type.getRequired("type")

                    /** The text content. */
                    fun text(): String = text.getRequired("text")

                    /** The type of the content part. */
                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    /** The text content. */
                    @JsonProperty("text") @ExcludeMissing fun _text() = text

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): ChatCompletionRequestMessageContentPartText = apply {
                        if (!validated) {
                            type()
                            text()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var type: JsonField<Type> = JsonMissing.of()
                        private var text: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            chatCompletionRequestMessageContentPartText:
                                ChatCompletionRequestMessageContentPartText
                        ) = apply {
                            this.type = chatCompletionRequestMessageContentPartText.type
                            this.text = chatCompletionRequestMessageContentPartText.text
                            additionalProperties(
                                chatCompletionRequestMessageContentPartText.additionalProperties
                            )
                        }

                        /** The type of the content part. */
                        fun type(type: Type) = type(JsonField.of(type))

                        /** The type of the content part. */
                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        /** The text content. */
                        fun text(text: String) = text(JsonField.of(text))

                        /** The text content. */
                        @JsonProperty("text")
                        @ExcludeMissing
                        fun text(text: JsonField<String>) = apply { this.text = text }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): ChatCompletionRequestMessageContentPartText =
                            ChatCompletionRequestMessageContentPartText(
                                type,
                                text,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class Type
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val TEXT = Type(JsonField.of("text"))

                            fun of(value: String) = Type(JsonField.of(value))
                        }

                        enum class Known {
                            TEXT,
                        }

                        enum class Value {
                            TEXT,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                TEXT -> Value.TEXT
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                TEXT -> Known.TEXT
                                else -> throw OmnistackInvalidDataException("Unknown Type: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ChatCompletionRequestMessageContentPartText && this.type == other.type && this.text == other.text && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(type, text, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "ChatCompletionRequestMessageContentPartText{type=$type, text=$text, additionalProperties=$additionalProperties}"
                }
            }

            class Role
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val SYSTEM = Role(JsonField.of("system"))

                    fun of(value: String) = Role(JsonField.of(value))
                }

                enum class Known {
                    SYSTEM,
                }

                enum class Value {
                    SYSTEM,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        SYSTEM -> Value.SYSTEM
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        SYSTEM -> Known.SYSTEM
                        else -> throw OmnistackInvalidDataException("Unknown Role: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ChatCompletionRequestSystemMessage && this.content == other.content && this.role == other.role && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(content, role, name, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ChatCompletionRequestSystemMessage{content=$content, role=$role, name=$name, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = ChatCompletionRequestUserMessage.Builder::class)
        @NoAutoDetect
        class ChatCompletionRequestUserMessage
        private constructor(
            private val content: JsonField<Content>,
            private val role: JsonField<Role>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The contents of the user message. */
            fun content(): Content = content.getRequired("content")

            /** The role of the messages author, in this case `user`. */
            fun role(): Role = role.getRequired("role")

            /**
             * An optional name for the participant. Provides the model information to differentiate
             * between participants of the same role.
             */
            fun name(): String? = name.getNullable("name")

            /** The contents of the user message. */
            @JsonProperty("content") @ExcludeMissing fun _content() = content

            /** The role of the messages author, in this case `user`. */
            @JsonProperty("role") @ExcludeMissing fun _role() = role

            /**
             * An optional name for the participant. Provides the model information to differentiate
             * between participants of the same role.
             */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ChatCompletionRequestUserMessage = apply {
                if (!validated) {
                    content()
                    role()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var content: JsonField<Content> = JsonMissing.of()
                private var role: JsonField<Role> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    chatCompletionRequestUserMessage: ChatCompletionRequestUserMessage
                ) = apply {
                    this.content = chatCompletionRequestUserMessage.content
                    this.role = chatCompletionRequestUserMessage.role
                    this.name = chatCompletionRequestUserMessage.name
                    additionalProperties(chatCompletionRequestUserMessage.additionalProperties)
                }

                /** The contents of the user message. */
                fun content(content: Content) = content(JsonField.of(content))

                /** The contents of the user message. */
                @JsonProperty("content")
                @ExcludeMissing
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** The role of the messages author, in this case `user`. */
                fun role(role: Role) = role(JsonField.of(role))

                /** The role of the messages author, in this case `user`. */
                @JsonProperty("role")
                @ExcludeMissing
                fun role(role: JsonField<Role>) = apply { this.role = role }

                /**
                 * An optional name for the participant. Provides the model information to
                 * differentiate between participants of the same role.
                 */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * An optional name for the participant. Provides the model information to
                 * differentiate between participants of the same role.
                 */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ChatCompletionRequestUserMessage =
                    ChatCompletionRequestUserMessage(
                        content,
                        role,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val textContent: String? = null,
                private val arrayOfContentParts:
                    List<ChatCompletionRequestUserMessageContentPart>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                private var validated: Boolean = false

                /** The text contents of the message. */
                fun textContent(): String? = textContent
                /**
                 * An array of content parts with a defined type, each can be of type `text` or
                 * `image_url` when passing in images. You can pass multiple images by adding
                 * multiple `image_url` content parts. Image input is only supported when using the
                 * `gpt-4o` model.
                 */
                fun arrayOfContentParts(): List<ChatCompletionRequestUserMessageContentPart>? =
                    arrayOfContentParts

                fun isTextContent(): Boolean = textContent != null

                fun isArrayOfContentParts(): Boolean = arrayOfContentParts != null

                fun asTextContent(): String = textContent.getOrThrow("textContent")

                fun asArrayOfContentParts(): List<ChatCompletionRequestUserMessageContentPart> =
                    arrayOfContentParts.getOrThrow("arrayOfContentParts")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        textContent != null -> visitor.visitTextContent(textContent)
                        arrayOfContentParts != null ->
                            visitor.visitArrayOfContentParts(arrayOfContentParts)
                        else -> visitor.unknown(_json)
                    }
                }

                fun validate(): Content = apply {
                    if (!validated) {
                        if (textContent == null && arrayOfContentParts == null) {
                            throw OmnistackInvalidDataException("Unknown Content: $_json")
                        }
                        validated = true
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Content && this.textContent == other.textContent && this.arrayOfContentParts == other.arrayOfContentParts /* spotless:on */
                }

                override fun hashCode(): Int {
                    return /* spotless:off */ Objects.hash(textContent, arrayOfContentParts) /* spotless:on */
                }

                override fun toString(): String {
                    return when {
                        textContent != null -> "Content{textContent=$textContent}"
                        arrayOfContentParts != null ->
                            "Content{arrayOfContentParts=$arrayOfContentParts}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }
                }

                companion object {

                    fun ofTextContent(textContent: String) = Content(textContent = textContent)

                    fun ofArrayOfContentParts(
                        arrayOfContentParts: List<ChatCompletionRequestUserMessageContentPart>
                    ) = Content(arrayOfContentParts = arrayOfContentParts)
                }

                interface Visitor<out T> {

                    fun visitTextContent(textContent: String): T

                    fun visitArrayOfContentParts(
                        arrayOfContentParts: List<ChatCompletionRequestUserMessageContentPart>
                    ): T

                    fun unknown(json: JsonValue?): T {
                        throw OmnistackInvalidDataException("Unknown Content: $json")
                    }
                }

                class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            return Content(textContent = it, _json = json)
                        }
                        tryDeserialize(
                                node,
                                jacksonTypeRef<List<ChatCompletionRequestUserMessageContentPart>>()
                            )
                            ?.let {
                                return Content(arrayOfContentParts = it, _json = json)
                            }

                        return Content(_json = json)
                    }
                }

                class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider
                    ) {
                        when {
                            value.textContent != null -> generator.writeObject(value.textContent)
                            value.arrayOfContentParts != null ->
                                generator.writeObject(value.arrayOfContentParts)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(
                    using = ChatCompletionRequestUserMessageContentPart.Deserializer::class
                )
                @JsonSerialize(
                    using = ChatCompletionRequestUserMessageContentPart.Serializer::class
                )
                class ChatCompletionRequestUserMessageContentPart
                private constructor(
                    private val chatCompletionRequestMessageContentPartText:
                        ChatCompletionRequestMessageContentPartText? =
                        null,
                    private val chatCompletionRequestMessageContentPartImage:
                        ChatCompletionRequestMessageContentPartImage? =
                        null,
                    private val _json: JsonValue? = null,
                ) {

                    private var validated: Boolean = false

                    fun chatCompletionRequestMessageContentPartText():
                        ChatCompletionRequestMessageContentPartText? =
                        chatCompletionRequestMessageContentPartText

                    fun chatCompletionRequestMessageContentPartImage():
                        ChatCompletionRequestMessageContentPartImage? =
                        chatCompletionRequestMessageContentPartImage

                    fun isChatCompletionRequestMessageContentPartText(): Boolean =
                        chatCompletionRequestMessageContentPartText != null

                    fun isChatCompletionRequestMessageContentPartImage(): Boolean =
                        chatCompletionRequestMessageContentPartImage != null

                    fun asChatCompletionRequestMessageContentPartText():
                        ChatCompletionRequestMessageContentPartText =
                        chatCompletionRequestMessageContentPartText.getOrThrow(
                            "chatCompletionRequestMessageContentPartText"
                        )

                    fun asChatCompletionRequestMessageContentPartImage():
                        ChatCompletionRequestMessageContentPartImage =
                        chatCompletionRequestMessageContentPartImage.getOrThrow(
                            "chatCompletionRequestMessageContentPartImage"
                        )

                    fun _json(): JsonValue? = _json

                    fun <T> accept(visitor: Visitor<T>): T {
                        return when {
                            chatCompletionRequestMessageContentPartText != null ->
                                visitor.visitChatCompletionRequestMessageContentPartText(
                                    chatCompletionRequestMessageContentPartText
                                )
                            chatCompletionRequestMessageContentPartImage != null ->
                                visitor.visitChatCompletionRequestMessageContentPartImage(
                                    chatCompletionRequestMessageContentPartImage
                                )
                            else -> visitor.unknown(_json)
                        }
                    }

                    fun validate(): ChatCompletionRequestUserMessageContentPart = apply {
                        if (!validated) {
                            if (
                                chatCompletionRequestMessageContentPartText == null &&
                                    chatCompletionRequestMessageContentPartImage == null
                            ) {
                                throw OmnistackInvalidDataException(
                                    "Unknown ChatCompletionRequestUserMessageContentPart: $_json"
                                )
                            }
                            chatCompletionRequestMessageContentPartText?.validate()
                            chatCompletionRequestMessageContentPartImage?.validate()
                            validated = true
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ChatCompletionRequestUserMessageContentPart && this.chatCompletionRequestMessageContentPartText == other.chatCompletionRequestMessageContentPartText && this.chatCompletionRequestMessageContentPartImage == other.chatCompletionRequestMessageContentPartImage /* spotless:on */
                    }

                    override fun hashCode(): Int {
                        return /* spotless:off */ Objects.hash(chatCompletionRequestMessageContentPartText, chatCompletionRequestMessageContentPartImage) /* spotless:on */
                    }

                    override fun toString(): String {
                        return when {
                            chatCompletionRequestMessageContentPartText != null ->
                                "ChatCompletionRequestUserMessageContentPart{chatCompletionRequestMessageContentPartText=$chatCompletionRequestMessageContentPartText}"
                            chatCompletionRequestMessageContentPartImage != null ->
                                "ChatCompletionRequestUserMessageContentPart{chatCompletionRequestMessageContentPartImage=$chatCompletionRequestMessageContentPartImage}"
                            _json != null ->
                                "ChatCompletionRequestUserMessageContentPart{_unknown=$_json}"
                            else ->
                                throw IllegalStateException(
                                    "Invalid ChatCompletionRequestUserMessageContentPart"
                                )
                        }
                    }

                    companion object {

                        fun ofChatCompletionRequestMessageContentPartText(
                            chatCompletionRequestMessageContentPartText:
                                ChatCompletionRequestMessageContentPartText
                        ) =
                            ChatCompletionRequestUserMessageContentPart(
                                chatCompletionRequestMessageContentPartText =
                                    chatCompletionRequestMessageContentPartText
                            )

                        fun ofChatCompletionRequestMessageContentPartImage(
                            chatCompletionRequestMessageContentPartImage:
                                ChatCompletionRequestMessageContentPartImage
                        ) =
                            ChatCompletionRequestUserMessageContentPart(
                                chatCompletionRequestMessageContentPartImage =
                                    chatCompletionRequestMessageContentPartImage
                            )
                    }

                    interface Visitor<out T> {

                        fun visitChatCompletionRequestMessageContentPartText(
                            chatCompletionRequestMessageContentPartText:
                                ChatCompletionRequestMessageContentPartText
                        ): T

                        fun visitChatCompletionRequestMessageContentPartImage(
                            chatCompletionRequestMessageContentPartImage:
                                ChatCompletionRequestMessageContentPartImage
                        ): T

                        fun unknown(json: JsonValue?): T {
                            throw OmnistackInvalidDataException(
                                "Unknown ChatCompletionRequestUserMessageContentPart: $json"
                            )
                        }
                    }

                    class Deserializer :
                        BaseDeserializer<ChatCompletionRequestUserMessageContentPart>(
                            ChatCompletionRequestUserMessageContentPart::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): ChatCompletionRequestUserMessageContentPart {
                            val json = JsonValue.fromJsonNode(node)
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ChatCompletionRequestMessageContentPartText>()
                                ) {
                                    it.validate()
                                }
                                ?.let {
                                    return ChatCompletionRequestUserMessageContentPart(
                                        chatCompletionRequestMessageContentPartText = it,
                                        _json = json
                                    )
                                }
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ChatCompletionRequestMessageContentPartImage>()
                                ) {
                                    it.validate()
                                }
                                ?.let {
                                    return ChatCompletionRequestUserMessageContentPart(
                                        chatCompletionRequestMessageContentPartImage = it,
                                        _json = json
                                    )
                                }

                            return ChatCompletionRequestUserMessageContentPart(_json = json)
                        }
                    }

                    class Serializer :
                        BaseSerializer<ChatCompletionRequestUserMessageContentPart>(
                            ChatCompletionRequestUserMessageContentPart::class
                        ) {

                        override fun serialize(
                            value: ChatCompletionRequestUserMessageContentPart,
                            generator: JsonGenerator,
                            provider: SerializerProvider
                        ) {
                            when {
                                value.chatCompletionRequestMessageContentPartText != null ->
                                    generator.writeObject(
                                        value.chatCompletionRequestMessageContentPartText
                                    )
                                value.chatCompletionRequestMessageContentPartImage != null ->
                                    generator.writeObject(
                                        value.chatCompletionRequestMessageContentPartImage
                                    )
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid ChatCompletionRequestUserMessageContentPart"
                                    )
                            }
                        }
                    }

                    @JsonDeserialize(
                        builder = ChatCompletionRequestMessageContentPartText.Builder::class
                    )
                    @NoAutoDetect
                    class ChatCompletionRequestMessageContentPartText
                    private constructor(
                        private val type: JsonField<Type>,
                        private val text: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        /** The type of the content part. */
                        fun type(): Type = type.getRequired("type")

                        /** The text content. */
                        fun text(): String = text.getRequired("text")

                        /** The type of the content part. */
                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        /** The text content. */
                        @JsonProperty("text") @ExcludeMissing fun _text() = text

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): ChatCompletionRequestMessageContentPartText = apply {
                            if (!validated) {
                                type()
                                text()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var type: JsonField<Type> = JsonMissing.of()
                            private var text: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(
                                chatCompletionRequestMessageContentPartText:
                                    ChatCompletionRequestMessageContentPartText
                            ) = apply {
                                this.type = chatCompletionRequestMessageContentPartText.type
                                this.text = chatCompletionRequestMessageContentPartText.text
                                additionalProperties(
                                    chatCompletionRequestMessageContentPartText.additionalProperties
                                )
                            }

                            /** The type of the content part. */
                            fun type(type: Type) = type(JsonField.of(type))

                            /** The type of the content part. */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            /** The text content. */
                            fun text(text: String) = text(JsonField.of(text))

                            /** The text content. */
                            @JsonProperty("text")
                            @ExcludeMissing
                            fun text(text: JsonField<String>) = apply { this.text = text }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): ChatCompletionRequestMessageContentPartText =
                                ChatCompletionRequestMessageContentPartText(
                                    type,
                                    text,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Type
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val TEXT = Type(JsonField.of("text"))

                                fun of(value: String) = Type(JsonField.of(value))
                            }

                            enum class Known {
                                TEXT,
                            }

                            enum class Value {
                                TEXT,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    TEXT -> Value.TEXT
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    TEXT -> Known.TEXT
                                    else ->
                                        throw OmnistackInvalidDataException("Unknown Type: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ChatCompletionRequestMessageContentPartText && this.type == other.type && this.text == other.text && this.additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        private var hashCode: Int = 0

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = /* spotless:off */ Objects.hash(type, text, additionalProperties) /* spotless:on */
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "ChatCompletionRequestMessageContentPartText{type=$type, text=$text, additionalProperties=$additionalProperties}"
                    }

                    @JsonDeserialize(
                        builder = ChatCompletionRequestMessageContentPartImage.Builder::class
                    )
                    @NoAutoDetect
                    class ChatCompletionRequestMessageContentPartImage
                    private constructor(
                        private val type: JsonField<Type>,
                        private val imageUrl: JsonField<ImageUrl>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        /** The type of the content part. */
                        fun type(): Type = type.getRequired("type")

                        fun imageUrl(): ImageUrl = imageUrl.getRequired("image_url")

                        /** The type of the content part. */
                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonProperty("image_url") @ExcludeMissing fun _imageUrl() = imageUrl

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): ChatCompletionRequestMessageContentPartImage = apply {
                            if (!validated) {
                                type()
                                imageUrl().validate()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var type: JsonField<Type> = JsonMissing.of()
                            private var imageUrl: JsonField<ImageUrl> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(
                                chatCompletionRequestMessageContentPartImage:
                                    ChatCompletionRequestMessageContentPartImage
                            ) = apply {
                                this.type = chatCompletionRequestMessageContentPartImage.type
                                this.imageUrl =
                                    chatCompletionRequestMessageContentPartImage.imageUrl
                                additionalProperties(
                                    chatCompletionRequestMessageContentPartImage
                                        .additionalProperties
                                )
                            }

                            /** The type of the content part. */
                            fun type(type: Type) = type(JsonField.of(type))

                            /** The type of the content part. */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun imageUrl(imageUrl: ImageUrl) = imageUrl(JsonField.of(imageUrl))

                            @JsonProperty("image_url")
                            @ExcludeMissing
                            fun imageUrl(imageUrl: JsonField<ImageUrl>) = apply {
                                this.imageUrl = imageUrl
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): ChatCompletionRequestMessageContentPartImage =
                                ChatCompletionRequestMessageContentPartImage(
                                    type,
                                    imageUrl,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        @JsonDeserialize(builder = ImageUrl.Builder::class)
                        @NoAutoDetect
                        class ImageUrl
                        private constructor(
                            private val url: JsonField<String>,
                            private val detail: JsonField<Detail>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            /** Either a URL of the image or the base64 encoded image data. */
                            fun url(): String = url.getRequired("url")

                            /**
                             * Specifies the detail level of the image. Learn more in the
                             * [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
                             */
                            fun detail(): Detail? = detail.getNullable("detail")

                            /** Either a URL of the image or the base64 encoded image data. */
                            @JsonProperty("url") @ExcludeMissing fun _url() = url

                            /**
                             * Specifies the detail level of the image. Learn more in the
                             * [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
                             */
                            @JsonProperty("detail") @ExcludeMissing fun _detail() = detail

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): ImageUrl = apply {
                                if (!validated) {
                                    url()
                                    detail()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                fun builder() = Builder()
                            }

                            class Builder {

                                private var url: JsonField<String> = JsonMissing.of()
                                private var detail: JsonField<Detail> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(imageUrl: ImageUrl) = apply {
                                    this.url = imageUrl.url
                                    this.detail = imageUrl.detail
                                    additionalProperties(imageUrl.additionalProperties)
                                }

                                /** Either a URL of the image or the base64 encoded image data. */
                                fun url(url: String) = url(JsonField.of(url))

                                /** Either a URL of the image or the base64 encoded image data. */
                                @JsonProperty("url")
                                @ExcludeMissing
                                fun url(url: JsonField<String>) = apply { this.url = url }

                                /**
                                 * Specifies the detail level of the image. Learn more in the
                                 * [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
                                 */
                                fun detail(detail: Detail) = detail(JsonField.of(detail))

                                /**
                                 * Specifies the detail level of the image. Learn more in the
                                 * [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
                                 */
                                @JsonProperty("detail")
                                @ExcludeMissing
                                fun detail(detail: JsonField<Detail>) = apply {
                                    this.detail = detail
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                                @JsonAnySetter
                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    this.additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun build(): ImageUrl =
                                    ImageUrl(
                                        url,
                                        detail,
                                        additionalProperties.toUnmodifiable(),
                                    )
                            }

                            class Detail
                            @JsonCreator
                            private constructor(
                                private val value: JsonField<String>,
                            ) : Enum {

                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return /* spotless:off */ other is Detail && this.value == other.value /* spotless:on */
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()

                                companion object {

                                    val AUTO = Detail(JsonField.of("auto"))

                                    val LOW = Detail(JsonField.of("low"))

                                    val HIGH = Detail(JsonField.of("high"))

                                    fun of(value: String) = Detail(JsonField.of(value))
                                }

                                enum class Known {
                                    AUTO,
                                    LOW,
                                    HIGH,
                                }

                                enum class Value {
                                    AUTO,
                                    LOW,
                                    HIGH,
                                    _UNKNOWN,
                                }

                                fun value(): Value =
                                    when (this) {
                                        AUTO -> Value.AUTO
                                        LOW -> Value.LOW
                                        HIGH -> Value.HIGH
                                        else -> Value._UNKNOWN
                                    }

                                fun known(): Known =
                                    when (this) {
                                        AUTO -> Known.AUTO
                                        LOW -> Known.LOW
                                        HIGH -> Known.HIGH
                                        else ->
                                            throw OmnistackInvalidDataException(
                                                "Unknown Detail: $value"
                                            )
                                    }

                                fun asString(): String = _value().asStringOrThrow()
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is ImageUrl && this.url == other.url && this.detail == other.detail && this.additionalProperties == other.additionalProperties /* spotless:on */
                            }

                            private var hashCode: Int = 0

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode = /* spotless:off */ Objects.hash(url, detail, additionalProperties) /* spotless:on */
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "ImageUrl{url=$url, detail=$detail, additionalProperties=$additionalProperties}"
                        }

                        class Type
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val IMAGE_URL = Type(JsonField.of("image_url"))

                                fun of(value: String) = Type(JsonField.of(value))
                            }

                            enum class Known {
                                IMAGE_URL,
                            }

                            enum class Value {
                                IMAGE_URL,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    IMAGE_URL -> Value.IMAGE_URL
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    IMAGE_URL -> Known.IMAGE_URL
                                    else ->
                                        throw OmnistackInvalidDataException("Unknown Type: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ChatCompletionRequestMessageContentPartImage && this.type == other.type && this.imageUrl == other.imageUrl && this.additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        private var hashCode: Int = 0

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = /* spotless:off */ Objects.hash(type, imageUrl, additionalProperties) /* spotless:on */
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "ChatCompletionRequestMessageContentPartImage{type=$type, imageUrl=$imageUrl, additionalProperties=$additionalProperties}"
                    }
                }
            }

            class Role
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val USER = Role(JsonField.of("user"))

                    fun of(value: String) = Role(JsonField.of(value))
                }

                enum class Known {
                    USER,
                }

                enum class Value {
                    USER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        USER -> Value.USER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        USER -> Known.USER
                        else -> throw OmnistackInvalidDataException("Unknown Role: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ChatCompletionRequestUserMessage && this.content == other.content && this.role == other.role && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(content, role, name, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ChatCompletionRequestUserMessage{content=$content, role=$role, name=$name, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = ChatCompletionRequestAssistantMessage.Builder::class)
        @NoAutoDetect
        class ChatCompletionRequestAssistantMessage
        private constructor(
            private val content: JsonField<Content>,
            private val refusal: JsonField<String>,
            private val role: JsonField<Role>,
            private val name: JsonField<String>,
            private val toolCalls: JsonField<List<ToolCall>>,
            private val functionCall: JsonField<FunctionCall>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /**
             * The contents of the assistant message. Required unless `tool_calls` or
             * `function_call` is specified.
             */
            fun content(): Content? = content.getNullable("content")

            /** The refusal message by the assistant. */
            fun refusal(): String? = refusal.getNullable("refusal")

            /** The role of the messages author, in this case `assistant`. */
            fun role(): Role = role.getRequired("role")

            /**
             * An optional name for the participant. Provides the model information to differentiate
             * between participants of the same role.
             */
            fun name(): String? = name.getNullable("name")

            /** The tool calls generated by the model, such as function calls. */
            fun toolCalls(): List<ToolCall>? = toolCalls.getNullable("tool_calls")

            /**
             * Deprecated and replaced by `tool_calls`. The name and arguments of a function that
             * should be called, as generated by the model.
             */
            fun functionCall(): FunctionCall? = functionCall.getNullable("function_call")

            /**
             * The contents of the assistant message. Required unless `tool_calls` or
             * `function_call` is specified.
             */
            @JsonProperty("content") @ExcludeMissing fun _content() = content

            /** The refusal message by the assistant. */
            @JsonProperty("refusal") @ExcludeMissing fun _refusal() = refusal

            /** The role of the messages author, in this case `assistant`. */
            @JsonProperty("role") @ExcludeMissing fun _role() = role

            /**
             * An optional name for the participant. Provides the model information to differentiate
             * between participants of the same role.
             */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            /** The tool calls generated by the model, such as function calls. */
            @JsonProperty("tool_calls") @ExcludeMissing fun _toolCalls() = toolCalls

            /**
             * Deprecated and replaced by `tool_calls`. The name and arguments of a function that
             * should be called, as generated by the model.
             */
            @JsonProperty("function_call") @ExcludeMissing fun _functionCall() = functionCall

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ChatCompletionRequestAssistantMessage = apply {
                if (!validated) {
                    content()
                    refusal()
                    role()
                    name()
                    toolCalls()?.forEach { it.validate() }
                    functionCall()?.validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var content: JsonField<Content> = JsonMissing.of()
                private var refusal: JsonField<String> = JsonMissing.of()
                private var role: JsonField<Role> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var toolCalls: JsonField<List<ToolCall>> = JsonMissing.of()
                private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    chatCompletionRequestAssistantMessage: ChatCompletionRequestAssistantMessage
                ) = apply {
                    this.content = chatCompletionRequestAssistantMessage.content
                    this.refusal = chatCompletionRequestAssistantMessage.refusal
                    this.role = chatCompletionRequestAssistantMessage.role
                    this.name = chatCompletionRequestAssistantMessage.name
                    this.toolCalls = chatCompletionRequestAssistantMessage.toolCalls
                    this.functionCall = chatCompletionRequestAssistantMessage.functionCall
                    additionalProperties(chatCompletionRequestAssistantMessage.additionalProperties)
                }

                /**
                 * The contents of the assistant message. Required unless `tool_calls` or
                 * `function_call` is specified.
                 */
                fun content(content: Content) = content(JsonField.of(content))

                /**
                 * The contents of the assistant message. Required unless `tool_calls` or
                 * `function_call` is specified.
                 */
                @JsonProperty("content")
                @ExcludeMissing
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** The refusal message by the assistant. */
                fun refusal(refusal: String) = refusal(JsonField.of(refusal))

                /** The refusal message by the assistant. */
                @JsonProperty("refusal")
                @ExcludeMissing
                fun refusal(refusal: JsonField<String>) = apply { this.refusal = refusal }

                /** The role of the messages author, in this case `assistant`. */
                fun role(role: Role) = role(JsonField.of(role))

                /** The role of the messages author, in this case `assistant`. */
                @JsonProperty("role")
                @ExcludeMissing
                fun role(role: JsonField<Role>) = apply { this.role = role }

                /**
                 * An optional name for the participant. Provides the model information to
                 * differentiate between participants of the same role.
                 */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * An optional name for the participant. Provides the model information to
                 * differentiate between participants of the same role.
                 */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The tool calls generated by the model, such as function calls. */
                fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

                /** The tool calls generated by the model, such as function calls. */
                @JsonProperty("tool_calls")
                @ExcludeMissing
                fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
                    this.toolCalls = toolCalls
                }

                /**
                 * Deprecated and replaced by `tool_calls`. The name and arguments of a function
                 * that should be called, as generated by the model.
                 */
                fun functionCall(functionCall: FunctionCall) =
                    functionCall(JsonField.of(functionCall))

                /**
                 * Deprecated and replaced by `tool_calls`. The name and arguments of a function
                 * that should be called, as generated by the model.
                 */
                @JsonProperty("function_call")
                @ExcludeMissing
                fun functionCall(functionCall: JsonField<FunctionCall>) = apply {
                    this.functionCall = functionCall
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ChatCompletionRequestAssistantMessage =
                    ChatCompletionRequestAssistantMessage(
                        content,
                        refusal,
                        role,
                        name,
                        toolCalls.map { it.toUnmodifiable() },
                        functionCall,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Role
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ASSISTANT = Role(JsonField.of("assistant"))

                    fun of(value: String) = Role(JsonField.of(value))
                }

                enum class Known {
                    ASSISTANT,
                }

                enum class Value {
                    ASSISTANT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ASSISTANT -> Value.ASSISTANT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ASSISTANT -> Known.ASSISTANT
                        else -> throw OmnistackInvalidDataException("Unknown Role: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val textContent: String? = null,
                private val arrayOfContentParts:
                    List<ChatCompletionRequestAssistantMessageContentPart>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                private var validated: Boolean = false

                /** The contents of the assistant message. */
                fun textContent(): String? = textContent
                /**
                 * An array of content parts with a defined type. Can be one or more of type `text`,
                 * or exactly one of type `refusal`.
                 */
                fun arrayOfContentParts(): List<ChatCompletionRequestAssistantMessageContentPart>? =
                    arrayOfContentParts

                fun isTextContent(): Boolean = textContent != null

                fun isArrayOfContentParts(): Boolean = arrayOfContentParts != null

                fun asTextContent(): String = textContent.getOrThrow("textContent")

                fun asArrayOfContentParts():
                    List<ChatCompletionRequestAssistantMessageContentPart> =
                    arrayOfContentParts.getOrThrow("arrayOfContentParts")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        textContent != null -> visitor.visitTextContent(textContent)
                        arrayOfContentParts != null ->
                            visitor.visitArrayOfContentParts(arrayOfContentParts)
                        else -> visitor.unknown(_json)
                    }
                }

                fun validate(): Content = apply {
                    if (!validated) {
                        if (textContent == null && arrayOfContentParts == null) {
                            throw OmnistackInvalidDataException("Unknown Content: $_json")
                        }
                        validated = true
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Content && this.textContent == other.textContent && this.arrayOfContentParts == other.arrayOfContentParts /* spotless:on */
                }

                override fun hashCode(): Int {
                    return /* spotless:off */ Objects.hash(textContent, arrayOfContentParts) /* spotless:on */
                }

                override fun toString(): String {
                    return when {
                        textContent != null -> "Content{textContent=$textContent}"
                        arrayOfContentParts != null ->
                            "Content{arrayOfContentParts=$arrayOfContentParts}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }
                }

                companion object {

                    fun ofTextContent(textContent: String) = Content(textContent = textContent)

                    fun ofArrayOfContentParts(
                        arrayOfContentParts: List<ChatCompletionRequestAssistantMessageContentPart>
                    ) = Content(arrayOfContentParts = arrayOfContentParts)
                }

                interface Visitor<out T> {

                    fun visitTextContent(textContent: String): T

                    fun visitArrayOfContentParts(
                        arrayOfContentParts: List<ChatCompletionRequestAssistantMessageContentPart>
                    ): T

                    fun unknown(json: JsonValue?): T {
                        throw OmnistackInvalidDataException("Unknown Content: $json")
                    }
                }

                class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            return Content(textContent = it, _json = json)
                        }
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    List<ChatCompletionRequestAssistantMessageContentPart>
                                >()
                            )
                            ?.let {
                                return Content(arrayOfContentParts = it, _json = json)
                            }

                        return Content(_json = json)
                    }
                }

                class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider
                    ) {
                        when {
                            value.textContent != null -> generator.writeObject(value.textContent)
                            value.arrayOfContentParts != null ->
                                generator.writeObject(value.arrayOfContentParts)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(
                    using = ChatCompletionRequestAssistantMessageContentPart.Deserializer::class
                )
                @JsonSerialize(
                    using = ChatCompletionRequestAssistantMessageContentPart.Serializer::class
                )
                class ChatCompletionRequestAssistantMessageContentPart
                private constructor(
                    private val chatCompletionRequestMessageContentPartText:
                        ChatCompletionRequestMessageContentPartText? =
                        null,
                    private val chatCompletionRequestMessageContentPartRefusal:
                        ChatCompletionRequestMessageContentPartRefusal? =
                        null,
                    private val _json: JsonValue? = null,
                ) {

                    private var validated: Boolean = false

                    fun chatCompletionRequestMessageContentPartText():
                        ChatCompletionRequestMessageContentPartText? =
                        chatCompletionRequestMessageContentPartText

                    fun chatCompletionRequestMessageContentPartRefusal():
                        ChatCompletionRequestMessageContentPartRefusal? =
                        chatCompletionRequestMessageContentPartRefusal

                    fun isChatCompletionRequestMessageContentPartText(): Boolean =
                        chatCompletionRequestMessageContentPartText != null

                    fun isChatCompletionRequestMessageContentPartRefusal(): Boolean =
                        chatCompletionRequestMessageContentPartRefusal != null

                    fun asChatCompletionRequestMessageContentPartText():
                        ChatCompletionRequestMessageContentPartText =
                        chatCompletionRequestMessageContentPartText.getOrThrow(
                            "chatCompletionRequestMessageContentPartText"
                        )

                    fun asChatCompletionRequestMessageContentPartRefusal():
                        ChatCompletionRequestMessageContentPartRefusal =
                        chatCompletionRequestMessageContentPartRefusal.getOrThrow(
                            "chatCompletionRequestMessageContentPartRefusal"
                        )

                    fun _json(): JsonValue? = _json

                    fun <T> accept(visitor: Visitor<T>): T {
                        return when {
                            chatCompletionRequestMessageContentPartText != null ->
                                visitor.visitChatCompletionRequestMessageContentPartText(
                                    chatCompletionRequestMessageContentPartText
                                )
                            chatCompletionRequestMessageContentPartRefusal != null ->
                                visitor.visitChatCompletionRequestMessageContentPartRefusal(
                                    chatCompletionRequestMessageContentPartRefusal
                                )
                            else -> visitor.unknown(_json)
                        }
                    }

                    fun validate(): ChatCompletionRequestAssistantMessageContentPart = apply {
                        if (!validated) {
                            if (
                                chatCompletionRequestMessageContentPartText == null &&
                                    chatCompletionRequestMessageContentPartRefusal == null
                            ) {
                                throw OmnistackInvalidDataException(
                                    "Unknown ChatCompletionRequestAssistantMessageContentPart: $_json"
                                )
                            }
                            chatCompletionRequestMessageContentPartText?.validate()
                            chatCompletionRequestMessageContentPartRefusal?.validate()
                            validated = true
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ChatCompletionRequestAssistantMessageContentPart && this.chatCompletionRequestMessageContentPartText == other.chatCompletionRequestMessageContentPartText && this.chatCompletionRequestMessageContentPartRefusal == other.chatCompletionRequestMessageContentPartRefusal /* spotless:on */
                    }

                    override fun hashCode(): Int {
                        return /* spotless:off */ Objects.hash(chatCompletionRequestMessageContentPartText, chatCompletionRequestMessageContentPartRefusal) /* spotless:on */
                    }

                    override fun toString(): String {
                        return when {
                            chatCompletionRequestMessageContentPartText != null ->
                                "ChatCompletionRequestAssistantMessageContentPart{chatCompletionRequestMessageContentPartText=$chatCompletionRequestMessageContentPartText}"
                            chatCompletionRequestMessageContentPartRefusal != null ->
                                "ChatCompletionRequestAssistantMessageContentPart{chatCompletionRequestMessageContentPartRefusal=$chatCompletionRequestMessageContentPartRefusal}"
                            _json != null ->
                                "ChatCompletionRequestAssistantMessageContentPart{_unknown=$_json}"
                            else ->
                                throw IllegalStateException(
                                    "Invalid ChatCompletionRequestAssistantMessageContentPart"
                                )
                        }
                    }

                    companion object {

                        fun ofChatCompletionRequestMessageContentPartText(
                            chatCompletionRequestMessageContentPartText:
                                ChatCompletionRequestMessageContentPartText
                        ) =
                            ChatCompletionRequestAssistantMessageContentPart(
                                chatCompletionRequestMessageContentPartText =
                                    chatCompletionRequestMessageContentPartText
                            )

                        fun ofChatCompletionRequestMessageContentPartRefusal(
                            chatCompletionRequestMessageContentPartRefusal:
                                ChatCompletionRequestMessageContentPartRefusal
                        ) =
                            ChatCompletionRequestAssistantMessageContentPart(
                                chatCompletionRequestMessageContentPartRefusal =
                                    chatCompletionRequestMessageContentPartRefusal
                            )
                    }

                    interface Visitor<out T> {

                        fun visitChatCompletionRequestMessageContentPartText(
                            chatCompletionRequestMessageContentPartText:
                                ChatCompletionRequestMessageContentPartText
                        ): T

                        fun visitChatCompletionRequestMessageContentPartRefusal(
                            chatCompletionRequestMessageContentPartRefusal:
                                ChatCompletionRequestMessageContentPartRefusal
                        ): T

                        fun unknown(json: JsonValue?): T {
                            throw OmnistackInvalidDataException(
                                "Unknown ChatCompletionRequestAssistantMessageContentPart: $json"
                            )
                        }
                    }

                    class Deserializer :
                        BaseDeserializer<ChatCompletionRequestAssistantMessageContentPart>(
                            ChatCompletionRequestAssistantMessageContentPart::class
                        ) {

                        override fun ObjectCodec.deserialize(
                            node: JsonNode
                        ): ChatCompletionRequestAssistantMessageContentPart {
                            val json = JsonValue.fromJsonNode(node)
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ChatCompletionRequestMessageContentPartText>()
                                ) {
                                    it.validate()
                                }
                                ?.let {
                                    return ChatCompletionRequestAssistantMessageContentPart(
                                        chatCompletionRequestMessageContentPartText = it,
                                        _json = json
                                    )
                                }
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ChatCompletionRequestMessageContentPartRefusal>()
                                ) {
                                    it.validate()
                                }
                                ?.let {
                                    return ChatCompletionRequestAssistantMessageContentPart(
                                        chatCompletionRequestMessageContentPartRefusal = it,
                                        _json = json
                                    )
                                }

                            return ChatCompletionRequestAssistantMessageContentPart(_json = json)
                        }
                    }

                    class Serializer :
                        BaseSerializer<ChatCompletionRequestAssistantMessageContentPart>(
                            ChatCompletionRequestAssistantMessageContentPart::class
                        ) {

                        override fun serialize(
                            value: ChatCompletionRequestAssistantMessageContentPart,
                            generator: JsonGenerator,
                            provider: SerializerProvider
                        ) {
                            when {
                                value.chatCompletionRequestMessageContentPartText != null ->
                                    generator.writeObject(
                                        value.chatCompletionRequestMessageContentPartText
                                    )
                                value.chatCompletionRequestMessageContentPartRefusal != null ->
                                    generator.writeObject(
                                        value.chatCompletionRequestMessageContentPartRefusal
                                    )
                                value._json != null -> generator.writeObject(value._json)
                                else ->
                                    throw IllegalStateException(
                                        "Invalid ChatCompletionRequestAssistantMessageContentPart"
                                    )
                            }
                        }
                    }

                    @JsonDeserialize(
                        builder = ChatCompletionRequestMessageContentPartText.Builder::class
                    )
                    @NoAutoDetect
                    class ChatCompletionRequestMessageContentPartText
                    private constructor(
                        private val type: JsonField<Type>,
                        private val text: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        /** The type of the content part. */
                        fun type(): Type = type.getRequired("type")

                        /** The text content. */
                        fun text(): String = text.getRequired("text")

                        /** The type of the content part. */
                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        /** The text content. */
                        @JsonProperty("text") @ExcludeMissing fun _text() = text

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): ChatCompletionRequestMessageContentPartText = apply {
                            if (!validated) {
                                type()
                                text()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var type: JsonField<Type> = JsonMissing.of()
                            private var text: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(
                                chatCompletionRequestMessageContentPartText:
                                    ChatCompletionRequestMessageContentPartText
                            ) = apply {
                                this.type = chatCompletionRequestMessageContentPartText.type
                                this.text = chatCompletionRequestMessageContentPartText.text
                                additionalProperties(
                                    chatCompletionRequestMessageContentPartText.additionalProperties
                                )
                            }

                            /** The type of the content part. */
                            fun type(type: Type) = type(JsonField.of(type))

                            /** The type of the content part. */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            /** The text content. */
                            fun text(text: String) = text(JsonField.of(text))

                            /** The text content. */
                            @JsonProperty("text")
                            @ExcludeMissing
                            fun text(text: JsonField<String>) = apply { this.text = text }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): ChatCompletionRequestMessageContentPartText =
                                ChatCompletionRequestMessageContentPartText(
                                    type,
                                    text,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Type
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val TEXT = Type(JsonField.of("text"))

                                fun of(value: String) = Type(JsonField.of(value))
                            }

                            enum class Known {
                                TEXT,
                            }

                            enum class Value {
                                TEXT,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    TEXT -> Value.TEXT
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    TEXT -> Known.TEXT
                                    else ->
                                        throw OmnistackInvalidDataException("Unknown Type: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ChatCompletionRequestMessageContentPartText && this.type == other.type && this.text == other.text && this.additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        private var hashCode: Int = 0

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = /* spotless:off */ Objects.hash(type, text, additionalProperties) /* spotless:on */
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "ChatCompletionRequestMessageContentPartText{type=$type, text=$text, additionalProperties=$additionalProperties}"
                    }

                    @JsonDeserialize(
                        builder = ChatCompletionRequestMessageContentPartRefusal.Builder::class
                    )
                    @NoAutoDetect
                    class ChatCompletionRequestMessageContentPartRefusal
                    private constructor(
                        private val type: JsonField<Type>,
                        private val refusal: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        /** The type of the content part. */
                        fun type(): Type = type.getRequired("type")

                        /** The refusal message generated by the model. */
                        fun refusal(): String = refusal.getRequired("refusal")

                        /** The type of the content part. */
                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        /** The refusal message generated by the model. */
                        @JsonProperty("refusal") @ExcludeMissing fun _refusal() = refusal

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): ChatCompletionRequestMessageContentPartRefusal = apply {
                            if (!validated) {
                                type()
                                refusal()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var type: JsonField<Type> = JsonMissing.of()
                            private var refusal: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(
                                chatCompletionRequestMessageContentPartRefusal:
                                    ChatCompletionRequestMessageContentPartRefusal
                            ) = apply {
                                this.type = chatCompletionRequestMessageContentPartRefusal.type
                                this.refusal =
                                    chatCompletionRequestMessageContentPartRefusal.refusal
                                additionalProperties(
                                    chatCompletionRequestMessageContentPartRefusal
                                        .additionalProperties
                                )
                            }

                            /** The type of the content part. */
                            fun type(type: Type) = type(JsonField.of(type))

                            /** The type of the content part. */
                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            /** The refusal message generated by the model. */
                            fun refusal(refusal: String) = refusal(JsonField.of(refusal))

                            /** The refusal message generated by the model. */
                            @JsonProperty("refusal")
                            @ExcludeMissing
                            fun refusal(refusal: JsonField<String>) = apply {
                                this.refusal = refusal
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): ChatCompletionRequestMessageContentPartRefusal =
                                ChatCompletionRequestMessageContentPartRefusal(
                                    type,
                                    refusal,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Type
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val REFUSAL = Type(JsonField.of("refusal"))

                                fun of(value: String) = Type(JsonField.of(value))
                            }

                            enum class Known {
                                REFUSAL,
                            }

                            enum class Value {
                                REFUSAL,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    REFUSAL -> Value.REFUSAL
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    REFUSAL -> Known.REFUSAL
                                    else ->
                                        throw OmnistackInvalidDataException("Unknown Type: $value")
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ChatCompletionRequestMessageContentPartRefusal && this.type == other.type && this.refusal == other.refusal && this.additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        private var hashCode: Int = 0

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = /* spotless:off */ Objects.hash(type, refusal, additionalProperties) /* spotless:on */
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "ChatCompletionRequestMessageContentPartRefusal{type=$type, refusal=$refusal, additionalProperties=$additionalProperties}"
                    }
                }
            }

            /**
             * Deprecated and replaced by `tool_calls`. The name and arguments of a function that
             * should be called, as generated by the model.
             */
            @JsonDeserialize(builder = FunctionCall.Builder::class)
            @NoAutoDetect
            class FunctionCall
            private constructor(
                private val arguments: JsonField<String>,
                private val name: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /**
                 * The arguments to call the function with, as generated by the model in JSON
                 * format. Note that the model does not always generate valid JSON, and may
                 * hallucinate parameters not defined by your function schema. Validate the
                 * arguments in your code before calling your function.
                 */
                fun arguments(): String = arguments.getRequired("arguments")

                /** The name of the function to call. */
                fun name(): String = name.getRequired("name")

                /**
                 * The arguments to call the function with, as generated by the model in JSON
                 * format. Note that the model does not always generate valid JSON, and may
                 * hallucinate parameters not defined by your function schema. Validate the
                 * arguments in your code before calling your function.
                 */
                @JsonProperty("arguments") @ExcludeMissing fun _arguments() = arguments

                /** The name of the function to call. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): FunctionCall = apply {
                    if (!validated) {
                        arguments()
                        name()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var arguments: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(functionCall: FunctionCall) = apply {
                        this.arguments = functionCall.arguments
                        this.name = functionCall.name
                        additionalProperties(functionCall.additionalProperties)
                    }

                    /**
                     * The arguments to call the function with, as generated by the model in JSON
                     * format. Note that the model does not always generate valid JSON, and may
                     * hallucinate parameters not defined by your function schema. Validate the
                     * arguments in your code before calling your function.
                     */
                    fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                    /**
                     * The arguments to call the function with, as generated by the model in JSON
                     * format. Note that the model does not always generate valid JSON, and may
                     * hallucinate parameters not defined by your function schema. Validate the
                     * arguments in your code before calling your function.
                     */
                    @JsonProperty("arguments")
                    @ExcludeMissing
                    fun arguments(arguments: JsonField<String>) = apply {
                        this.arguments = arguments
                    }

                    /** The name of the function to call. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the function to call. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): FunctionCall =
                        FunctionCall(
                            arguments,
                            name,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FunctionCall && this.arguments == other.arguments && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(arguments, name, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "FunctionCall{arguments=$arguments, name=$name, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = ToolCall.Builder::class)
            @NoAutoDetect
            class ToolCall
            private constructor(
                private val id: JsonField<String>,
                private val type: JsonField<Type>,
                private val function: JsonField<Function>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** The ID of the tool call. */
                fun id(): String = id.getRequired("id")

                /** The type of the tool. Currently, only `function` is supported. */
                fun type(): Type = type.getRequired("type")

                /** The function that the model called. */
                fun function(): Function = function.getRequired("function")

                /** The ID of the tool call. */
                @JsonProperty("id") @ExcludeMissing fun _id() = id

                /** The type of the tool. Currently, only `function` is supported. */
                @JsonProperty("type") @ExcludeMissing fun _type() = type

                /** The function that the model called. */
                @JsonProperty("function") @ExcludeMissing fun _function() = function

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): ToolCall = apply {
                    if (!validated) {
                        id()
                        type()
                        function().validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var function: JsonField<Function> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(toolCall: ToolCall) = apply {
                        this.id = toolCall.id
                        this.type = toolCall.type
                        this.function = toolCall.function
                        additionalProperties(toolCall.additionalProperties)
                    }

                    /** The ID of the tool call. */
                    fun id(id: String) = id(JsonField.of(id))

                    /** The ID of the tool call. */
                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** The type of the tool. Currently, only `function` is supported. */
                    fun type(type: Type) = type(JsonField.of(type))

                    /** The type of the tool. Currently, only `function` is supported. */
                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    /** The function that the model called. */
                    fun function(function: Function) = function(JsonField.of(function))

                    /** The function that the model called. */
                    @JsonProperty("function")
                    @ExcludeMissing
                    fun function(function: JsonField<Function>) = apply { this.function = function }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): ToolCall =
                        ToolCall(
                            id,
                            type,
                            function,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /** The function that the model called. */
                @JsonDeserialize(builder = Function.Builder::class)
                @NoAutoDetect
                class Function
                private constructor(
                    private val name: JsonField<String>,
                    private val arguments: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    /** The name of the function to call. */
                    fun name(): String = name.getRequired("name")

                    /**
                     * The arguments to call the function with, as generated by the model in JSON
                     * format. Note that the model does not always generate valid JSON, and may
                     * hallucinate parameters not defined by your function schema. Validate the
                     * arguments in your code before calling your function.
                     */
                    fun arguments(): String = arguments.getRequired("arguments")

                    /** The name of the function to call. */
                    @JsonProperty("name") @ExcludeMissing fun _name() = name

                    /**
                     * The arguments to call the function with, as generated by the model in JSON
                     * format. Note that the model does not always generate valid JSON, and may
                     * hallucinate parameters not defined by your function schema. Validate the
                     * arguments in your code before calling your function.
                     */
                    @JsonProperty("arguments") @ExcludeMissing fun _arguments() = arguments

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Function = apply {
                        if (!validated) {
                            name()
                            arguments()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var name: JsonField<String> = JsonMissing.of()
                        private var arguments: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(function: Function) = apply {
                            this.name = function.name
                            this.arguments = function.arguments
                            additionalProperties(function.additionalProperties)
                        }

                        /** The name of the function to call. */
                        fun name(name: String) = name(JsonField.of(name))

                        /** The name of the function to call. */
                        @JsonProperty("name")
                        @ExcludeMissing
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        /**
                         * The arguments to call the function with, as generated by the model in
                         * JSON format. Note that the model does not always generate valid JSON, and
                         * may hallucinate parameters not defined by your function schema. Validate
                         * the arguments in your code before calling your function.
                         */
                        fun arguments(arguments: String) = arguments(JsonField.of(arguments))

                        /**
                         * The arguments to call the function with, as generated by the model in
                         * JSON format. Note that the model does not always generate valid JSON, and
                         * may hallucinate parameters not defined by your function schema. Validate
                         * the arguments in your code before calling your function.
                         */
                        @JsonProperty("arguments")
                        @ExcludeMissing
                        fun arguments(arguments: JsonField<String>) = apply {
                            this.arguments = arguments
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Function =
                            Function(
                                name,
                                arguments,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Function && this.name == other.name && this.arguments == other.arguments && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(name, arguments, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Function{name=$name, arguments=$arguments, additionalProperties=$additionalProperties}"
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val FUNCTION = Type(JsonField.of("function"))

                        fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        FUNCTION,
                    }

                    enum class Value {
                        FUNCTION,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            FUNCTION -> Value.FUNCTION
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            FUNCTION -> Known.FUNCTION
                            else -> throw OmnistackInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ToolCall && this.id == other.id && this.type == other.type && this.function == other.function && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(id, type, function, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "ToolCall{id=$id, type=$type, function=$function, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ChatCompletionRequestAssistantMessage && this.content == other.content && this.refusal == other.refusal && this.role == other.role && this.name == other.name && this.toolCalls == other.toolCalls && this.functionCall == other.functionCall && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(content, refusal, role, name, toolCalls, functionCall, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ChatCompletionRequestAssistantMessage{content=$content, refusal=$refusal, role=$role, name=$name, toolCalls=$toolCalls, functionCall=$functionCall, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = ChatCompletionRequestToolMessage.Builder::class)
        @NoAutoDetect
        class ChatCompletionRequestToolMessage
        private constructor(
            private val role: JsonField<Role>,
            private val content: JsonField<Content>,
            private val toolCallId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The role of the messages author, in this case `tool`. */
            fun role(): Role = role.getRequired("role")

            /** The contents of the tool message. */
            fun content(): Content = content.getRequired("content")

            /** Tool call that this message is responding to. */
            fun toolCallId(): String = toolCallId.getRequired("tool_call_id")

            /** The role of the messages author, in this case `tool`. */
            @JsonProperty("role") @ExcludeMissing fun _role() = role

            /** The contents of the tool message. */
            @JsonProperty("content") @ExcludeMissing fun _content() = content

            /** Tool call that this message is responding to. */
            @JsonProperty("tool_call_id") @ExcludeMissing fun _toolCallId() = toolCallId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ChatCompletionRequestToolMessage = apply {
                if (!validated) {
                    role()
                    content()
                    toolCallId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var role: JsonField<Role> = JsonMissing.of()
                private var content: JsonField<Content> = JsonMissing.of()
                private var toolCallId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    chatCompletionRequestToolMessage: ChatCompletionRequestToolMessage
                ) = apply {
                    this.role = chatCompletionRequestToolMessage.role
                    this.content = chatCompletionRequestToolMessage.content
                    this.toolCallId = chatCompletionRequestToolMessage.toolCallId
                    additionalProperties(chatCompletionRequestToolMessage.additionalProperties)
                }

                /** The role of the messages author, in this case `tool`. */
                fun role(role: Role) = role(JsonField.of(role))

                /** The role of the messages author, in this case `tool`. */
                @JsonProperty("role")
                @ExcludeMissing
                fun role(role: JsonField<Role>) = apply { this.role = role }

                /** The contents of the tool message. */
                fun content(content: Content) = content(JsonField.of(content))

                /** The contents of the tool message. */
                @JsonProperty("content")
                @ExcludeMissing
                fun content(content: JsonField<Content>) = apply { this.content = content }

                /** Tool call that this message is responding to. */
                fun toolCallId(toolCallId: String) = toolCallId(JsonField.of(toolCallId))

                /** Tool call that this message is responding to. */
                @JsonProperty("tool_call_id")
                @ExcludeMissing
                fun toolCallId(toolCallId: JsonField<String>) = apply {
                    this.toolCallId = toolCallId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ChatCompletionRequestToolMessage =
                    ChatCompletionRequestToolMessage(
                        role,
                        content,
                        toolCallId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(using = Content.Deserializer::class)
            @JsonSerialize(using = Content.Serializer::class)
            class Content
            private constructor(
                private val textContent: String? = null,
                private val arrayOfContentParts:
                    List<ChatCompletionRequestMessageContentPartText>? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                private var validated: Boolean = false

                /** The contents of the tool message. */
                fun textContent(): String? = textContent
                /**
                 * An array of content parts with a defined type. For tool messages, only type
                 * `text` is supported.
                 */
                fun arrayOfContentParts(): List<ChatCompletionRequestMessageContentPartText>? =
                    arrayOfContentParts

                fun isTextContent(): Boolean = textContent != null

                fun isArrayOfContentParts(): Boolean = arrayOfContentParts != null

                fun asTextContent(): String = textContent.getOrThrow("textContent")

                fun asArrayOfContentParts(): List<ChatCompletionRequestMessageContentPartText> =
                    arrayOfContentParts.getOrThrow("arrayOfContentParts")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        textContent != null -> visitor.visitTextContent(textContent)
                        arrayOfContentParts != null ->
                            visitor.visitArrayOfContentParts(arrayOfContentParts)
                        else -> visitor.unknown(_json)
                    }
                }

                fun validate(): Content = apply {
                    if (!validated) {
                        if (textContent == null && arrayOfContentParts == null) {
                            throw OmnistackInvalidDataException("Unknown Content: $_json")
                        }
                        arrayOfContentParts?.forEach { it.validate() }
                        validated = true
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Content && this.textContent == other.textContent && this.arrayOfContentParts == other.arrayOfContentParts /* spotless:on */
                }

                override fun hashCode(): Int {
                    return /* spotless:off */ Objects.hash(textContent, arrayOfContentParts) /* spotless:on */
                }

                override fun toString(): String {
                    return when {
                        textContent != null -> "Content{textContent=$textContent}"
                        arrayOfContentParts != null ->
                            "Content{arrayOfContentParts=$arrayOfContentParts}"
                        _json != null -> "Content{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Content")
                    }
                }

                companion object {

                    fun ofTextContent(textContent: String) = Content(textContent = textContent)

                    fun ofArrayOfContentParts(
                        arrayOfContentParts: List<ChatCompletionRequestMessageContentPartText>
                    ) = Content(arrayOfContentParts = arrayOfContentParts)
                }

                interface Visitor<out T> {

                    fun visitTextContent(textContent: String): T

                    fun visitArrayOfContentParts(
                        arrayOfContentParts: List<ChatCompletionRequestMessageContentPartText>
                    ): T

                    fun unknown(json: JsonValue?): T {
                        throw OmnistackInvalidDataException("Unknown Content: $json")
                    }
                }

                class Deserializer : BaseDeserializer<Content>(Content::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Content {
                        val json = JsonValue.fromJsonNode(node)
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            return Content(textContent = it, _json = json)
                        }
                        tryDeserialize(
                                node,
                                jacksonTypeRef<List<ChatCompletionRequestMessageContentPartText>>()
                            ) {
                                it.forEach { it.validate() }
                            }
                            ?.let {
                                return Content(arrayOfContentParts = it, _json = json)
                            }

                        return Content(_json = json)
                    }
                }

                class Serializer : BaseSerializer<Content>(Content::class) {

                    override fun serialize(
                        value: Content,
                        generator: JsonGenerator,
                        provider: SerializerProvider
                    ) {
                        when {
                            value.textContent != null -> generator.writeObject(value.textContent)
                            value.arrayOfContentParts != null ->
                                generator.writeObject(value.arrayOfContentParts)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Content")
                        }
                    }
                }

                @JsonDeserialize(
                    builder = ChatCompletionRequestMessageContentPartText.Builder::class
                )
                @NoAutoDetect
                class ChatCompletionRequestMessageContentPartText
                private constructor(
                    private val type: JsonField<Type>,
                    private val text: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    /** The type of the content part. */
                    fun type(): Type = type.getRequired("type")

                    /** The text content. */
                    fun text(): String = text.getRequired("text")

                    /** The type of the content part. */
                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    /** The text content. */
                    @JsonProperty("text") @ExcludeMissing fun _text() = text

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): ChatCompletionRequestMessageContentPartText = apply {
                        if (!validated) {
                            type()
                            text()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var type: JsonField<Type> = JsonMissing.of()
                        private var text: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            chatCompletionRequestMessageContentPartText:
                                ChatCompletionRequestMessageContentPartText
                        ) = apply {
                            this.type = chatCompletionRequestMessageContentPartText.type
                            this.text = chatCompletionRequestMessageContentPartText.text
                            additionalProperties(
                                chatCompletionRequestMessageContentPartText.additionalProperties
                            )
                        }

                        /** The type of the content part. */
                        fun type(type: Type) = type(JsonField.of(type))

                        /** The type of the content part. */
                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        /** The text content. */
                        fun text(text: String) = text(JsonField.of(text))

                        /** The text content. */
                        @JsonProperty("text")
                        @ExcludeMissing
                        fun text(text: JsonField<String>) = apply { this.text = text }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): ChatCompletionRequestMessageContentPartText =
                            ChatCompletionRequestMessageContentPartText(
                                type,
                                text,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class Type
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val TEXT = Type(JsonField.of("text"))

                            fun of(value: String) = Type(JsonField.of(value))
                        }

                        enum class Known {
                            TEXT,
                        }

                        enum class Value {
                            TEXT,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                TEXT -> Value.TEXT
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                TEXT -> Known.TEXT
                                else -> throw OmnistackInvalidDataException("Unknown Type: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ChatCompletionRequestMessageContentPartText && this.type == other.type && this.text == other.text && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(type, text, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "ChatCompletionRequestMessageContentPartText{type=$type, text=$text, additionalProperties=$additionalProperties}"
                }
            }

            class Role
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val TOOL = Role(JsonField.of("tool"))

                    fun of(value: String) = Role(JsonField.of(value))
                }

                enum class Known {
                    TOOL,
                }

                enum class Value {
                    TOOL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TOOL -> Value.TOOL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TOOL -> Known.TOOL
                        else -> throw OmnistackInvalidDataException("Unknown Role: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ChatCompletionRequestToolMessage && this.role == other.role && this.content == other.content && this.toolCallId == other.toolCallId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(role, content, toolCallId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ChatCompletionRequestToolMessage{role=$role, content=$content, toolCallId=$toolCallId, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = ChatCompletionRequestFunctionMessage.Builder::class)
        @NoAutoDetect
        class ChatCompletionRequestFunctionMessage
        private constructor(
            private val role: JsonField<Role>,
            private val content: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The role of the messages author, in this case `function`. */
            fun role(): Role = role.getRequired("role")

            /** The contents of the function message. */
            fun content(): String? = content.getNullable("content")

            /** The name of the function to call. */
            fun name(): String = name.getRequired("name")

            /** The role of the messages author, in this case `function`. */
            @JsonProperty("role") @ExcludeMissing fun _role() = role

            /** The contents of the function message. */
            @JsonProperty("content") @ExcludeMissing fun _content() = content

            /** The name of the function to call. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ChatCompletionRequestFunctionMessage = apply {
                if (!validated) {
                    role()
                    content()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var role: JsonField<Role> = JsonMissing.of()
                private var content: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    chatCompletionRequestFunctionMessage: ChatCompletionRequestFunctionMessage
                ) = apply {
                    this.role = chatCompletionRequestFunctionMessage.role
                    this.content = chatCompletionRequestFunctionMessage.content
                    this.name = chatCompletionRequestFunctionMessage.name
                    additionalProperties(chatCompletionRequestFunctionMessage.additionalProperties)
                }

                /** The role of the messages author, in this case `function`. */
                fun role(role: Role) = role(JsonField.of(role))

                /** The role of the messages author, in this case `function`. */
                @JsonProperty("role")
                @ExcludeMissing
                fun role(role: JsonField<Role>) = apply { this.role = role }

                /** The contents of the function message. */
                fun content(content: String) = content(JsonField.of(content))

                /** The contents of the function message. */
                @JsonProperty("content")
                @ExcludeMissing
                fun content(content: JsonField<String>) = apply { this.content = content }

                /** The name of the function to call. */
                fun name(name: String) = name(JsonField.of(name))

                /** The name of the function to call. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ChatCompletionRequestFunctionMessage =
                    ChatCompletionRequestFunctionMessage(
                        role,
                        content,
                        name,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Role
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val FUNCTION = Role(JsonField.of("function"))

                    fun of(value: String) = Role(JsonField.of(value))
                }

                enum class Known {
                    FUNCTION,
                }

                enum class Value {
                    FUNCTION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        FUNCTION -> Value.FUNCTION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        FUNCTION -> Known.FUNCTION
                        else -> throw OmnistackInvalidDataException("Unknown Role: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ChatCompletionRequestFunctionMessage && this.role == other.role && this.content == other.content && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(role, content, name, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ChatCompletionRequestFunctionMessage{role=$role, content=$content, name=$name, additionalProperties=$additionalProperties}"
        }
    }

    @JsonDeserialize(using = Model.Deserializer::class)
    @JsonSerialize(using = Model.Serializer::class)
    class Model
    private constructor(
        private val string: String? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun string(): String? = string

        fun unionMember1(): UnionMember1? = unionMember1

        fun isString(): Boolean = string != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun asString(): String = string.getOrThrow("string")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Model = apply {
            if (!validated) {
                if (string == null && unionMember1 == null) {
                    throw OmnistackInvalidDataException("Unknown Model: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Model && this.string == other.string && this.unionMember1 == other.unionMember1 /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(string, unionMember1) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                string != null -> "Model{string=$string}"
                unionMember1 != null -> "Model{unionMember1=$unionMember1}"
                _json != null -> "Model{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Model")
            }
        }

        companion object {

            fun ofString(string: String) = Model(string = string)

            fun ofUnionMember1(unionMember1: UnionMember1) = Model(unionMember1 = unionMember1)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            fun unknown(json: JsonValue?): T {
                throw OmnistackInvalidDataException("Unknown Model: $json")
            }
        }

        class Deserializer : BaseDeserializer<Model>(Model::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Model {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Model(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                    return Model(unionMember1 = it, _json = json)
                }

                return Model(_json = json)
            }
        }

        class Serializer : BaseSerializer<Model>(Model::class) {

            override fun serialize(
                value: Model,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Model")
                }
            }
        }

        class UnionMember1
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnionMember1 && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val O1_PREVIEW = UnionMember1(JsonField.of("o1-preview"))

                val O1_PREVIEW_2024_09_12 = UnionMember1(JsonField.of("o1-preview-2024-09-12"))

                val O1_MINI = UnionMember1(JsonField.of("o1-mini"))

                val O1_MINI_2024_09_12 = UnionMember1(JsonField.of("o1-mini-2024-09-12"))

                val GPT_4O = UnionMember1(JsonField.of("gpt-4o"))

                val GPT_4O_2024_08_06 = UnionMember1(JsonField.of("gpt-4o-2024-08-06"))

                val GPT_4O_2024_05_13 = UnionMember1(JsonField.of("gpt-4o-2024-05-13"))

                val CHATGPT_4O_LATEST = UnionMember1(JsonField.of("chatgpt-4o-latest"))

                val GPT_4O_MINI = UnionMember1(JsonField.of("gpt-4o-mini"))

                val GPT_4O_MINI_2024_07_18 = UnionMember1(JsonField.of("gpt-4o-mini-2024-07-18"))

                val GPT_4_TURBO = UnionMember1(JsonField.of("gpt-4-turbo"))

                val GPT_4_TURBO_2024_04_09 = UnionMember1(JsonField.of("gpt-4-turbo-2024-04-09"))

                val GPT_4_0125_PREVIEW = UnionMember1(JsonField.of("gpt-4-0125-preview"))

                val GPT_4_TURBO_PREVIEW = UnionMember1(JsonField.of("gpt-4-turbo-preview"))

                val GPT_4_1106_PREVIEW = UnionMember1(JsonField.of("gpt-4-1106-preview"))

                val GPT_4_VISION_PREVIEW = UnionMember1(JsonField.of("gpt-4-vision-preview"))

                val GPT_4 = UnionMember1(JsonField.of("gpt-4"))

                val GPT_4_0314 = UnionMember1(JsonField.of("gpt-4-0314"))

                val GPT_4_0613 = UnionMember1(JsonField.of("gpt-4-0613"))

                val GPT_4_32K = UnionMember1(JsonField.of("gpt-4-32k"))

                val GPT_4_32K_0314 = UnionMember1(JsonField.of("gpt-4-32k-0314"))

                val GPT_4_32K_0613 = UnionMember1(JsonField.of("gpt-4-32k-0613"))

                val GPT_3_5_TURBO = UnionMember1(JsonField.of("gpt-3.5-turbo"))

                val GPT_3_5_TURBO_16K = UnionMember1(JsonField.of("gpt-3.5-turbo-16k"))

                val GPT_3_5_TURBO_0301 = UnionMember1(JsonField.of("gpt-3.5-turbo-0301"))

                val GPT_3_5_TURBO_0613 = UnionMember1(JsonField.of("gpt-3.5-turbo-0613"))

                val GPT_3_5_TURBO_1106 = UnionMember1(JsonField.of("gpt-3.5-turbo-1106"))

                val GPT_3_5_TURBO_0125 = UnionMember1(JsonField.of("gpt-3.5-turbo-0125"))

                val GPT_3_5_TURBO_16K_0613 = UnionMember1(JsonField.of("gpt-3.5-turbo-16k-0613"))

                fun of(value: String) = UnionMember1(JsonField.of(value))
            }

            enum class Known {
                O1_PREVIEW,
                O1_PREVIEW_2024_09_12,
                O1_MINI,
                O1_MINI_2024_09_12,
                GPT_4O,
                GPT_4O_2024_08_06,
                GPT_4O_2024_05_13,
                CHATGPT_4O_LATEST,
                GPT_4O_MINI,
                GPT_4O_MINI_2024_07_18,
                GPT_4_TURBO,
                GPT_4_TURBO_2024_04_09,
                GPT_4_0125_PREVIEW,
                GPT_4_TURBO_PREVIEW,
                GPT_4_1106_PREVIEW,
                GPT_4_VISION_PREVIEW,
                GPT_4,
                GPT_4_0314,
                GPT_4_0613,
                GPT_4_32K,
                GPT_4_32K_0314,
                GPT_4_32K_0613,
                GPT_3_5_TURBO,
                GPT_3_5_TURBO_16K,
                GPT_3_5_TURBO_0301,
                GPT_3_5_TURBO_0613,
                GPT_3_5_TURBO_1106,
                GPT_3_5_TURBO_0125,
                GPT_3_5_TURBO_16K_0613,
            }

            enum class Value {
                O1_PREVIEW,
                O1_PREVIEW_2024_09_12,
                O1_MINI,
                O1_MINI_2024_09_12,
                GPT_4O,
                GPT_4O_2024_08_06,
                GPT_4O_2024_05_13,
                CHATGPT_4O_LATEST,
                GPT_4O_MINI,
                GPT_4O_MINI_2024_07_18,
                GPT_4_TURBO,
                GPT_4_TURBO_2024_04_09,
                GPT_4_0125_PREVIEW,
                GPT_4_TURBO_PREVIEW,
                GPT_4_1106_PREVIEW,
                GPT_4_VISION_PREVIEW,
                GPT_4,
                GPT_4_0314,
                GPT_4_0613,
                GPT_4_32K,
                GPT_4_32K_0314,
                GPT_4_32K_0613,
                GPT_3_5_TURBO,
                GPT_3_5_TURBO_16K,
                GPT_3_5_TURBO_0301,
                GPT_3_5_TURBO_0613,
                GPT_3_5_TURBO_1106,
                GPT_3_5_TURBO_0125,
                GPT_3_5_TURBO_16K_0613,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    O1_PREVIEW -> Value.O1_PREVIEW
                    O1_PREVIEW_2024_09_12 -> Value.O1_PREVIEW_2024_09_12
                    O1_MINI -> Value.O1_MINI
                    O1_MINI_2024_09_12 -> Value.O1_MINI_2024_09_12
                    GPT_4O -> Value.GPT_4O
                    GPT_4O_2024_08_06 -> Value.GPT_4O_2024_08_06
                    GPT_4O_2024_05_13 -> Value.GPT_4O_2024_05_13
                    CHATGPT_4O_LATEST -> Value.CHATGPT_4O_LATEST
                    GPT_4O_MINI -> Value.GPT_4O_MINI
                    GPT_4O_MINI_2024_07_18 -> Value.GPT_4O_MINI_2024_07_18
                    GPT_4_TURBO -> Value.GPT_4_TURBO
                    GPT_4_TURBO_2024_04_09 -> Value.GPT_4_TURBO_2024_04_09
                    GPT_4_0125_PREVIEW -> Value.GPT_4_0125_PREVIEW
                    GPT_4_TURBO_PREVIEW -> Value.GPT_4_TURBO_PREVIEW
                    GPT_4_1106_PREVIEW -> Value.GPT_4_1106_PREVIEW
                    GPT_4_VISION_PREVIEW -> Value.GPT_4_VISION_PREVIEW
                    GPT_4 -> Value.GPT_4
                    GPT_4_0314 -> Value.GPT_4_0314
                    GPT_4_0613 -> Value.GPT_4_0613
                    GPT_4_32K -> Value.GPT_4_32K
                    GPT_4_32K_0314 -> Value.GPT_4_32K_0314
                    GPT_4_32K_0613 -> Value.GPT_4_32K_0613
                    GPT_3_5_TURBO -> Value.GPT_3_5_TURBO
                    GPT_3_5_TURBO_16K -> Value.GPT_3_5_TURBO_16K
                    GPT_3_5_TURBO_0301 -> Value.GPT_3_5_TURBO_0301
                    GPT_3_5_TURBO_0613 -> Value.GPT_3_5_TURBO_0613
                    GPT_3_5_TURBO_1106 -> Value.GPT_3_5_TURBO_1106
                    GPT_3_5_TURBO_0125 -> Value.GPT_3_5_TURBO_0125
                    GPT_3_5_TURBO_16K_0613 -> Value.GPT_3_5_TURBO_16K_0613
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    O1_PREVIEW -> Known.O1_PREVIEW
                    O1_PREVIEW_2024_09_12 -> Known.O1_PREVIEW_2024_09_12
                    O1_MINI -> Known.O1_MINI
                    O1_MINI_2024_09_12 -> Known.O1_MINI_2024_09_12
                    GPT_4O -> Known.GPT_4O
                    GPT_4O_2024_08_06 -> Known.GPT_4O_2024_08_06
                    GPT_4O_2024_05_13 -> Known.GPT_4O_2024_05_13
                    CHATGPT_4O_LATEST -> Known.CHATGPT_4O_LATEST
                    GPT_4O_MINI -> Known.GPT_4O_MINI
                    GPT_4O_MINI_2024_07_18 -> Known.GPT_4O_MINI_2024_07_18
                    GPT_4_TURBO -> Known.GPT_4_TURBO
                    GPT_4_TURBO_2024_04_09 -> Known.GPT_4_TURBO_2024_04_09
                    GPT_4_0125_PREVIEW -> Known.GPT_4_0125_PREVIEW
                    GPT_4_TURBO_PREVIEW -> Known.GPT_4_TURBO_PREVIEW
                    GPT_4_1106_PREVIEW -> Known.GPT_4_1106_PREVIEW
                    GPT_4_VISION_PREVIEW -> Known.GPT_4_VISION_PREVIEW
                    GPT_4 -> Known.GPT_4
                    GPT_4_0314 -> Known.GPT_4_0314
                    GPT_4_0613 -> Known.GPT_4_0613
                    GPT_4_32K -> Known.GPT_4_32K
                    GPT_4_32K_0314 -> Known.GPT_4_32K_0314
                    GPT_4_32K_0613 -> Known.GPT_4_32K_0613
                    GPT_3_5_TURBO -> Known.GPT_3_5_TURBO
                    GPT_3_5_TURBO_16K -> Known.GPT_3_5_TURBO_16K
                    GPT_3_5_TURBO_0301 -> Known.GPT_3_5_TURBO_0301
                    GPT_3_5_TURBO_0613 -> Known.GPT_3_5_TURBO_0613
                    GPT_3_5_TURBO_1106 -> Known.GPT_3_5_TURBO_1106
                    GPT_3_5_TURBO_0125 -> Known.GPT_3_5_TURBO_0125
                    GPT_3_5_TURBO_16K_0613 -> Known.GPT_3_5_TURBO_16K_0613
                    else -> throw OmnistackInvalidDataException("Unknown UnionMember1: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(using = FunctionCall.Deserializer::class)
    @JsonSerialize(using = FunctionCall.Serializer::class)
    class FunctionCall
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val chatCompletionFunctionCallOption: ChatCompletionFunctionCallOption? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        /**
         * `none` means the model will not call a function and instead generates a message. `auto`
         * means the model can pick between generating a message or calling a function.
         */
        fun unionMember0(): UnionMember0? = unionMember0
        /**
         * Specifying a particular function via `{"name": "my_function"}` forces the model to call
         * that function.
         */
        fun chatCompletionFunctionCallOption(): ChatCompletionFunctionCallOption? =
            chatCompletionFunctionCallOption

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isChatCompletionFunctionCallOption(): Boolean = chatCompletionFunctionCallOption != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asChatCompletionFunctionCallOption(): ChatCompletionFunctionCallOption =
            chatCompletionFunctionCallOption.getOrThrow("chatCompletionFunctionCallOption")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                chatCompletionFunctionCallOption != null ->
                    visitor.visitChatCompletionFunctionCallOption(chatCompletionFunctionCallOption)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): FunctionCall = apply {
            if (!validated) {
                if (unionMember0 == null && chatCompletionFunctionCallOption == null) {
                    throw OmnistackInvalidDataException("Unknown FunctionCall: $_json")
                }
                chatCompletionFunctionCallOption?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FunctionCall && this.unionMember0 == other.unionMember0 && this.chatCompletionFunctionCallOption == other.chatCompletionFunctionCallOption /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(unionMember0, chatCompletionFunctionCallOption) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                unionMember0 != null -> "FunctionCall{unionMember0=$unionMember0}"
                chatCompletionFunctionCallOption != null ->
                    "FunctionCall{chatCompletionFunctionCallOption=$chatCompletionFunctionCallOption}"
                _json != null -> "FunctionCall{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FunctionCall")
            }
        }

        companion object {

            fun ofUnionMember0(unionMember0: UnionMember0) =
                FunctionCall(unionMember0 = unionMember0)

            fun ofChatCompletionFunctionCallOption(
                chatCompletionFunctionCallOption: ChatCompletionFunctionCallOption
            ) = FunctionCall(chatCompletionFunctionCallOption = chatCompletionFunctionCallOption)
        }

        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitChatCompletionFunctionCallOption(
                chatCompletionFunctionCallOption: ChatCompletionFunctionCallOption
            ): T

            fun unknown(json: JsonValue?): T {
                throw OmnistackInvalidDataException("Unknown FunctionCall: $json")
            }
        }

        class Deserializer : BaseDeserializer<FunctionCall>(FunctionCall::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): FunctionCall {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                    return FunctionCall(unionMember0 = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<ChatCompletionFunctionCallOption>()) {
                        it.validate()
                    }
                    ?.let {
                        return FunctionCall(chatCompletionFunctionCallOption = it, _json = json)
                    }

                return FunctionCall(_json = json)
            }
        }

        class Serializer : BaseSerializer<FunctionCall>(FunctionCall::class) {

            override fun serialize(
                value: FunctionCall,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.chatCompletionFunctionCallOption != null ->
                        generator.writeObject(value.chatCompletionFunctionCallOption)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid FunctionCall")
                }
            }
        }

        class UnionMember0
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnionMember0 && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val NONE = UnionMember0(JsonField.of("none"))

                val AUTO = UnionMember0(JsonField.of("auto"))

                fun of(value: String) = UnionMember0(JsonField.of(value))
            }

            enum class Known {
                NONE,
                AUTO,
            }

            enum class Value {
                NONE,
                AUTO,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    NONE -> Value.NONE
                    AUTO -> Value.AUTO
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    NONE -> Known.NONE
                    AUTO -> Known.AUTO
                    else -> throw OmnistackInvalidDataException("Unknown UnionMember0: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * Specifying a particular function via `{"name": "my_function"}` forces the model to call
         * that function.
         */
        @JsonDeserialize(builder = ChatCompletionFunctionCallOption.Builder::class)
        @NoAutoDetect
        class ChatCompletionFunctionCallOption
        private constructor(
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The name of the function to call. */
            fun name(): String = name.getRequired("name")

            /** The name of the function to call. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ChatCompletionFunctionCallOption = apply {
                if (!validated) {
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    chatCompletionFunctionCallOption: ChatCompletionFunctionCallOption
                ) = apply {
                    this.name = chatCompletionFunctionCallOption.name
                    additionalProperties(chatCompletionFunctionCallOption.additionalProperties)
                }

                /** The name of the function to call. */
                fun name(name: String) = name(JsonField.of(name))

                /** The name of the function to call. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ChatCompletionFunctionCallOption =
                    ChatCompletionFunctionCallOption(name, additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ChatCompletionFunctionCallOption && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(name, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ChatCompletionFunctionCallOption{name=$name, additionalProperties=$additionalProperties}"
        }
    }

    @JsonDeserialize(builder = Function.Builder::class)
    @NoAutoDetect
    class Function
    private constructor(
        private val description: String?,
        private val name: String?,
        private val parameters: Parameters?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * A description of what the function does, used by the model to choose when and how to call
         * the function.
         */
        @JsonProperty("description") fun description(): String? = description

        /**
         * The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and
         * dashes, with a maximum length of 64.
         */
        @JsonProperty("name") fun name(): String? = name

        /**
         * The parameters the functions accepts, described as a JSON Schema object. See the
         * [guide](/docs/guides/function-calling) for examples, and the
         * [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for
         * documentation about the format.
         *
         * Omitting `parameters` defines a function with an empty parameter list.
         */
        @JsonProperty("parameters") fun parameters(): Parameters? = parameters

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var name: String? = null
            private var parameters: Parameters? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(function: Function) = apply {
                this.description = function.description
                this.name = function.name
                this.parameters = function.parameters
                additionalProperties(function.additionalProperties)
            }

            /**
             * A description of what the function does, used by the model to choose when and how to
             * call the function.
             */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores
             * and dashes, with a maximum length of 64.
             */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The parameters the functions accepts, described as a JSON Schema object. See the
             * [guide](/docs/guides/function-calling) for examples, and the
             * [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for
             * documentation about the format.
             *
             * Omitting `parameters` defines a function with an empty parameter list.
             */
            @JsonProperty("parameters")
            fun parameters(parameters: Parameters) = apply { this.parameters = parameters }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Function =
                Function(
                    description,
                    checkNotNull(name) { "`name` is required but was not set" },
                    parameters,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /**
         * The parameters the functions accepts, described as a JSON Schema object. See the
         * [guide](/docs/guides/function-calling) for examples, and the
         * [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for
         * documentation about the format.
         *
         * Omitting `parameters` defines a function with an empty parameter list.
         */
        @JsonDeserialize(builder = Parameters.Builder::class)
        @NoAutoDetect
        class Parameters
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(parameters: Parameters) = apply {
                    additionalProperties(parameters.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Parameters = Parameters(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Parameters && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Parameters{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Function && this.description == other.description && this.name == other.name && this.parameters == other.parameters && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(description, name, parameters, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Function{description=$description, name=$name, parameters=$parameters, additionalProperties=$additionalProperties}"
    }

    /**
     * Modify the likelihood of specified tokens appearing in the completion.
     *
     * Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an
     * associated bias value from -100 to 100. Mathematically, the bias is added to the logits
     * generated by the model prior to sampling. The exact effect will vary per model, but values
     * between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100
     * should result in a ban or exclusive selection of the relevant token.
     */
    @JsonDeserialize(builder = LogitBias.Builder::class)
    @NoAutoDetect
    class LogitBias
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(logitBias: LogitBias) = apply {
                additionalProperties(logitBias.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): LogitBias = LogitBias(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LogitBias && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "LogitBias{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = ResponseFormat.Deserializer::class)
    @JsonSerialize(using = ResponseFormat.Serializer::class)
    class ResponseFormat
    private constructor(
        private val responseFormatText: ResponseFormatText? = null,
        private val responseFormatJsonObject: ResponseFormatJsonObject? = null,
        private val responseFormatJsonSchema: ResponseFormatJsonSchema? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun responseFormatText(): ResponseFormatText? = responseFormatText

        fun responseFormatJsonObject(): ResponseFormatJsonObject? = responseFormatJsonObject

        fun responseFormatJsonSchema(): ResponseFormatJsonSchema? = responseFormatJsonSchema

        fun isResponseFormatText(): Boolean = responseFormatText != null

        fun isResponseFormatJsonObject(): Boolean = responseFormatJsonObject != null

        fun isResponseFormatJsonSchema(): Boolean = responseFormatJsonSchema != null

        fun asResponseFormatText(): ResponseFormatText =
            responseFormatText.getOrThrow("responseFormatText")

        fun asResponseFormatJsonObject(): ResponseFormatJsonObject =
            responseFormatJsonObject.getOrThrow("responseFormatJsonObject")

        fun asResponseFormatJsonSchema(): ResponseFormatJsonSchema =
            responseFormatJsonSchema.getOrThrow("responseFormatJsonSchema")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                responseFormatText != null -> visitor.visitResponseFormatText(responseFormatText)
                responseFormatJsonObject != null ->
                    visitor.visitResponseFormatJsonObject(responseFormatJsonObject)
                responseFormatJsonSchema != null ->
                    visitor.visitResponseFormatJsonSchema(responseFormatJsonSchema)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): ResponseFormat = apply {
            if (!validated) {
                if (
                    responseFormatText == null &&
                        responseFormatJsonObject == null &&
                        responseFormatJsonSchema == null
                ) {
                    throw OmnistackInvalidDataException("Unknown ResponseFormat: $_json")
                }
                responseFormatText?.validate()
                responseFormatJsonObject?.validate()
                responseFormatJsonSchema?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseFormat && this.responseFormatText == other.responseFormatText && this.responseFormatJsonObject == other.responseFormatJsonObject && this.responseFormatJsonSchema == other.responseFormatJsonSchema /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(responseFormatText, responseFormatJsonObject, responseFormatJsonSchema) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                responseFormatText != null ->
                    "ResponseFormat{responseFormatText=$responseFormatText}"
                responseFormatJsonObject != null ->
                    "ResponseFormat{responseFormatJsonObject=$responseFormatJsonObject}"
                responseFormatJsonSchema != null ->
                    "ResponseFormat{responseFormatJsonSchema=$responseFormatJsonSchema}"
                _json != null -> "ResponseFormat{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ResponseFormat")
            }
        }

        companion object {

            fun ofResponseFormatText(responseFormatText: ResponseFormatText) =
                ResponseFormat(responseFormatText = responseFormatText)

            fun ofResponseFormatJsonObject(responseFormatJsonObject: ResponseFormatJsonObject) =
                ResponseFormat(responseFormatJsonObject = responseFormatJsonObject)

            fun ofResponseFormatJsonSchema(responseFormatJsonSchema: ResponseFormatJsonSchema) =
                ResponseFormat(responseFormatJsonSchema = responseFormatJsonSchema)
        }

        interface Visitor<out T> {

            fun visitResponseFormatText(responseFormatText: ResponseFormatText): T

            fun visitResponseFormatJsonObject(responseFormatJsonObject: ResponseFormatJsonObject): T

            fun visitResponseFormatJsonSchema(responseFormatJsonSchema: ResponseFormatJsonSchema): T

            fun unknown(json: JsonValue?): T {
                throw OmnistackInvalidDataException("Unknown ResponseFormat: $json")
            }
        }

        class Deserializer : BaseDeserializer<ResponseFormat>(ResponseFormat::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ResponseFormat {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<ResponseFormatText>()) { it.validate() }
                    ?.let {
                        return ResponseFormat(responseFormatText = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ResponseFormatJsonObject>()) { it.validate() }
                    ?.let {
                        return ResponseFormat(responseFormatJsonObject = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ResponseFormatJsonSchema>()) { it.validate() }
                    ?.let {
                        return ResponseFormat(responseFormatJsonSchema = it, _json = json)
                    }

                return ResponseFormat(_json = json)
            }
        }

        class Serializer : BaseSerializer<ResponseFormat>(ResponseFormat::class) {

            override fun serialize(
                value: ResponseFormat,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.responseFormatText != null ->
                        generator.writeObject(value.responseFormatText)
                    value.responseFormatJsonObject != null ->
                        generator.writeObject(value.responseFormatJsonObject)
                    value.responseFormatJsonSchema != null ->
                        generator.writeObject(value.responseFormatJsonSchema)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ResponseFormat")
                }
            }
        }

        @JsonDeserialize(builder = ResponseFormatText.Builder::class)
        @NoAutoDetect
        class ResponseFormatText
        private constructor(
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The type of response format being defined: `text` */
            fun type(): Type = type.getRequired("type")

            /** The type of response format being defined: `text` */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ResponseFormatText = apply {
                if (!validated) {
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(responseFormatText: ResponseFormatText) = apply {
                    this.type = responseFormatText.type
                    additionalProperties(responseFormatText.additionalProperties)
                }

                /** The type of response format being defined: `text` */
                fun type(type: Type) = type(JsonField.of(type))

                /** The type of response format being defined: `text` */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ResponseFormatText =
                    ResponseFormatText(type, additionalProperties.toUnmodifiable())
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val TEXT = Type(JsonField.of("text"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    TEXT,
                }

                enum class Value {
                    TEXT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TEXT -> Value.TEXT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TEXT -> Known.TEXT
                        else -> throw OmnistackInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ResponseFormatText && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(type, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ResponseFormatText{type=$type, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = ResponseFormatJsonObject.Builder::class)
        @NoAutoDetect
        class ResponseFormatJsonObject
        private constructor(
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The type of response format being defined: `json_object` */
            fun type(): Type = type.getRequired("type")

            /** The type of response format being defined: `json_object` */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ResponseFormatJsonObject = apply {
                if (!validated) {
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(responseFormatJsonObject: ResponseFormatJsonObject) = apply {
                    this.type = responseFormatJsonObject.type
                    additionalProperties(responseFormatJsonObject.additionalProperties)
                }

                /** The type of response format being defined: `json_object` */
                fun type(type: Type) = type(JsonField.of(type))

                /** The type of response format being defined: `json_object` */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ResponseFormatJsonObject =
                    ResponseFormatJsonObject(type, additionalProperties.toUnmodifiable())
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val JSON_OBJECT = Type(JsonField.of("json_object"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    JSON_OBJECT,
                }

                enum class Value {
                    JSON_OBJECT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        JSON_OBJECT -> Value.JSON_OBJECT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        JSON_OBJECT -> Known.JSON_OBJECT
                        else -> throw OmnistackInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ResponseFormatJsonObject && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(type, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ResponseFormatJsonObject{type=$type, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = ResponseFormatJsonSchema.Builder::class)
        @NoAutoDetect
        class ResponseFormatJsonSchema
        private constructor(
            private val type: JsonField<Type>,
            private val jsonSchema: JsonField<JsonSchema>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The type of response format being defined: `json_schema` */
            fun type(): Type = type.getRequired("type")

            fun jsonSchema(): JsonSchema = jsonSchema.getRequired("json_schema")

            /** The type of response format being defined: `json_schema` */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("json_schema") @ExcludeMissing fun _jsonSchema() = jsonSchema

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ResponseFormatJsonSchema = apply {
                if (!validated) {
                    type()
                    jsonSchema().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var jsonSchema: JsonField<JsonSchema> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(responseFormatJsonSchema: ResponseFormatJsonSchema) = apply {
                    this.type = responseFormatJsonSchema.type
                    this.jsonSchema = responseFormatJsonSchema.jsonSchema
                    additionalProperties(responseFormatJsonSchema.additionalProperties)
                }

                /** The type of response format being defined: `json_schema` */
                fun type(type: Type) = type(JsonField.of(type))

                /** The type of response format being defined: `json_schema` */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun jsonSchema(jsonSchema: JsonSchema) = jsonSchema(JsonField.of(jsonSchema))

                @JsonProperty("json_schema")
                @ExcludeMissing
                fun jsonSchema(jsonSchema: JsonField<JsonSchema>) = apply {
                    this.jsonSchema = jsonSchema
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ResponseFormatJsonSchema =
                    ResponseFormatJsonSchema(
                        type,
                        jsonSchema,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = JsonSchema.Builder::class)
            @NoAutoDetect
            class JsonSchema
            private constructor(
                private val description: JsonField<String>,
                private val name: JsonField<String>,
                private val schema: JsonField<Schema>,
                private val strict: JsonField<Boolean>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /**
                 * A description of what the response format is for, used by the model to determine
                 * how to respond in the format.
                 */
                fun description(): String? = description.getNullable("description")

                /**
                 * The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores
                 * and dashes, with a maximum length of 64.
                 */
                fun name(): String = name.getRequired("name")

                /** The schema for the response format, described as a JSON Schema object. */
                fun schema(): Schema? = schema.getNullable("schema")

                /**
                 * Whether to enable strict schema adherence when generating the output. If set to
                 * true, the model will always follow the exact schema defined in the `schema`
                 * field. Only a subset of JSON Schema is supported when `strict` is `true`. To
                 * learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
                 */
                fun strict(): Boolean? = strict.getNullable("strict")

                /**
                 * A description of what the response format is for, used by the model to determine
                 * how to respond in the format.
                 */
                @JsonProperty("description") @ExcludeMissing fun _description() = description

                /**
                 * The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores
                 * and dashes, with a maximum length of 64.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                /** The schema for the response format, described as a JSON Schema object. */
                @JsonProperty("schema") @ExcludeMissing fun _schema() = schema

                /**
                 * Whether to enable strict schema adherence when generating the output. If set to
                 * true, the model will always follow the exact schema defined in the `schema`
                 * field. Only a subset of JSON Schema is supported when `strict` is `true`. To
                 * learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
                 */
                @JsonProperty("strict") @ExcludeMissing fun _strict() = strict

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): JsonSchema = apply {
                    if (!validated) {
                        description()
                        name()
                        schema()?.validate()
                        strict()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var description: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var schema: JsonField<Schema> = JsonMissing.of()
                    private var strict: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(jsonSchema: JsonSchema) = apply {
                        this.description = jsonSchema.description
                        this.name = jsonSchema.name
                        this.schema = jsonSchema.schema
                        this.strict = jsonSchema.strict
                        additionalProperties(jsonSchema.additionalProperties)
                    }

                    /**
                     * A description of what the response format is for, used by the model to
                     * determine how to respond in the format.
                     */
                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * A description of what the response format is for, used by the model to
                     * determine how to respond in the format.
                     */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * The name of the response format. Must be a-z, A-Z, 0-9, or contain
                     * underscores and dashes, with a maximum length of 64.
                     */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * The name of the response format. Must be a-z, A-Z, 0-9, or contain
                     * underscores and dashes, with a maximum length of 64.
                     */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** The schema for the response format, described as a JSON Schema object. */
                    fun schema(schema: Schema) = schema(JsonField.of(schema))

                    /** The schema for the response format, described as a JSON Schema object. */
                    @JsonProperty("schema")
                    @ExcludeMissing
                    fun schema(schema: JsonField<Schema>) = apply { this.schema = schema }

                    /**
                     * Whether to enable strict schema adherence when generating the output. If set
                     * to true, the model will always follow the exact schema defined in the
                     * `schema` field. Only a subset of JSON Schema is supported when `strict` is
                     * `true`. To learn more, read the
                     * [Structured Outputs guide](/docs/guides/structured-outputs).
                     */
                    fun strict(strict: Boolean) = strict(JsonField.of(strict))

                    /**
                     * Whether to enable strict schema adherence when generating the output. If set
                     * to true, the model will always follow the exact schema defined in the
                     * `schema` field. Only a subset of JSON Schema is supported when `strict` is
                     * `true`. To learn more, read the
                     * [Structured Outputs guide](/docs/guides/structured-outputs).
                     */
                    @JsonProperty("strict")
                    @ExcludeMissing
                    fun strict(strict: JsonField<Boolean>) = apply { this.strict = strict }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): JsonSchema =
                        JsonSchema(
                            description,
                            name,
                            schema,
                            strict,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /** The schema for the response format, described as a JSON Schema object. */
                @JsonDeserialize(builder = Schema.Builder::class)
                @NoAutoDetect
                class Schema
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Schema = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(schema: Schema) = apply {
                            additionalProperties(schema.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Schema = Schema(additionalProperties.toUnmodifiable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Schema && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() = "Schema{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is JsonSchema && this.description == other.description && this.name == other.name && this.schema == other.schema && this.strict == other.strict && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(description, name, schema, strict, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "JsonSchema{description=$description, name=$name, schema=$schema, strict=$strict, additionalProperties=$additionalProperties}"
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val JSON_SCHEMA = Type(JsonField.of("json_schema"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    JSON_SCHEMA,
                }

                enum class Value {
                    JSON_SCHEMA,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        JSON_SCHEMA -> Value.JSON_SCHEMA
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        JSON_SCHEMA -> Known.JSON_SCHEMA
                        else -> throw OmnistackInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ResponseFormatJsonSchema && this.type == other.type && this.jsonSchema == other.jsonSchema && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(type, jsonSchema, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ResponseFormatJsonSchema{type=$type, jsonSchema=$jsonSchema, additionalProperties=$additionalProperties}"
        }
    }

    class ServiceTier
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ServiceTier && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val AUTO = ServiceTier(JsonField.of("auto"))

            val DEFAULT = ServiceTier(JsonField.of("default"))

            fun of(value: String) = ServiceTier(JsonField.of(value))
        }

        enum class Known {
            AUTO,
            DEFAULT,
        }

        enum class Value {
            AUTO,
            DEFAULT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AUTO -> Value.AUTO
                DEFAULT -> Value.DEFAULT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AUTO -> Known.AUTO
                DEFAULT -> Known.DEFAULT
                else -> throw OmnistackInvalidDataException("Unknown ServiceTier: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(using = Stop.Deserializer::class)
    @JsonSerialize(using = Stop.Serializer::class)
    class Stop
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun string(): String? = string

        fun strings(): List<String>? = strings

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Stop = apply {
            if (!validated) {
                if (string == null && strings == null) {
                    throw OmnistackInvalidDataException("Unknown Stop: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Stop && this.string == other.string && this.strings == other.strings /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(string, strings) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                string != null -> "Stop{string=$string}"
                strings != null -> "Stop{strings=$strings}"
                _json != null -> "Stop{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Stop")
            }
        }

        companion object {

            fun ofString(string: String) = Stop(string = string)

            fun ofStrings(strings: List<String>) = Stop(strings = strings)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            fun unknown(json: JsonValue?): T {
                throw OmnistackInvalidDataException("Unknown Stop: $json")
            }
        }

        class Deserializer : BaseDeserializer<Stop>(Stop::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Stop {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Stop(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                    return Stop(strings = it, _json = json)
                }

                return Stop(_json = json)
            }
        }

        class Serializer : BaseSerializer<Stop>(Stop::class) {

            override fun serialize(
                value: Stop,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Stop")
                }
            }
        }
    }

    /** Options for streaming response. Only set this when you set `stream: true`. */
    @JsonDeserialize(builder = StreamOptions.Builder::class)
    @NoAutoDetect
    class StreamOptions
    private constructor(
        private val includeUsage: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * If set, an additional chunk will be streamed before the `data: [DONE]` message. The
         * `usage` field on this chunk shows the token usage statistics for the entire request, and
         * the `choices` field will always be an empty array. All other chunks will also include a
         * `usage` field, but with a null value.
         */
        @JsonProperty("include_usage") fun includeUsage(): Boolean? = includeUsage

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var includeUsage: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(streamOptions: StreamOptions) = apply {
                this.includeUsage = streamOptions.includeUsage
                additionalProperties(streamOptions.additionalProperties)
            }

            /**
             * If set, an additional chunk will be streamed before the `data: [DONE]` message. The
             * `usage` field on this chunk shows the token usage statistics for the entire request,
             * and the `choices` field will always be an empty array. All other chunks will also
             * include a `usage` field, but with a null value.
             */
            @JsonProperty("include_usage")
            fun includeUsage(includeUsage: Boolean) = apply { this.includeUsage = includeUsage }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): StreamOptions =
                StreamOptions(includeUsage, additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StreamOptions && this.includeUsage == other.includeUsage && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(includeUsage, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "StreamOptions{includeUsage=$includeUsage, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = ToolChoice.Deserializer::class)
    @JsonSerialize(using = ToolChoice.Serializer::class)
    class ToolChoice
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val chatCompletionNamedToolChoice: ChatCompletionNamedToolChoice? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        /**
         * `none` means the model will not call any tool and instead generates a message. `auto`
         * means the model can pick between generating a message or calling one or more tools.
         * `required` means the model must call one or more tools.
         */
        fun unionMember0(): UnionMember0? = unionMember0
        /**
         * Specifies a tool the model should use. Use to force the model to call a specific
         * function.
         */
        fun chatCompletionNamedToolChoice(): ChatCompletionNamedToolChoice? =
            chatCompletionNamedToolChoice

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isChatCompletionNamedToolChoice(): Boolean = chatCompletionNamedToolChoice != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asChatCompletionNamedToolChoice(): ChatCompletionNamedToolChoice =
            chatCompletionNamedToolChoice.getOrThrow("chatCompletionNamedToolChoice")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                chatCompletionNamedToolChoice != null ->
                    visitor.visitChatCompletionNamedToolChoice(chatCompletionNamedToolChoice)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): ToolChoice = apply {
            if (!validated) {
                if (unionMember0 == null && chatCompletionNamedToolChoice == null) {
                    throw OmnistackInvalidDataException("Unknown ToolChoice: $_json")
                }
                chatCompletionNamedToolChoice?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolChoice && this.unionMember0 == other.unionMember0 && this.chatCompletionNamedToolChoice == other.chatCompletionNamedToolChoice /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(unionMember0, chatCompletionNamedToolChoice) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                unionMember0 != null -> "ToolChoice{unionMember0=$unionMember0}"
                chatCompletionNamedToolChoice != null ->
                    "ToolChoice{chatCompletionNamedToolChoice=$chatCompletionNamedToolChoice}"
                _json != null -> "ToolChoice{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ToolChoice")
            }
        }

        companion object {

            fun ofUnionMember0(unionMember0: UnionMember0) = ToolChoice(unionMember0 = unionMember0)

            fun ofChatCompletionNamedToolChoice(
                chatCompletionNamedToolChoice: ChatCompletionNamedToolChoice
            ) = ToolChoice(chatCompletionNamedToolChoice = chatCompletionNamedToolChoice)
        }

        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitChatCompletionNamedToolChoice(
                chatCompletionNamedToolChoice: ChatCompletionNamedToolChoice
            ): T

            fun unknown(json: JsonValue?): T {
                throw OmnistackInvalidDataException("Unknown ToolChoice: $json")
            }
        }

        class Deserializer : BaseDeserializer<ToolChoice>(ToolChoice::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ToolChoice {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                    return ToolChoice(unionMember0 = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<ChatCompletionNamedToolChoice>()) {
                        it.validate()
                    }
                    ?.let {
                        return ToolChoice(chatCompletionNamedToolChoice = it, _json = json)
                    }

                return ToolChoice(_json = json)
            }
        }

        class Serializer : BaseSerializer<ToolChoice>(ToolChoice::class) {

            override fun serialize(
                value: ToolChoice,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.chatCompletionNamedToolChoice != null ->
                        generator.writeObject(value.chatCompletionNamedToolChoice)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ToolChoice")
                }
            }
        }

        class UnionMember0
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnionMember0 && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val NONE = UnionMember0(JsonField.of("none"))

                val AUTO = UnionMember0(JsonField.of("auto"))

                val REQUIRED = UnionMember0(JsonField.of("required"))

                fun of(value: String) = UnionMember0(JsonField.of(value))
            }

            enum class Known {
                NONE,
                AUTO,
                REQUIRED,
            }

            enum class Value {
                NONE,
                AUTO,
                REQUIRED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    NONE -> Value.NONE
                    AUTO -> Value.AUTO
                    REQUIRED -> Value.REQUIRED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    NONE -> Known.NONE
                    AUTO -> Known.AUTO
                    REQUIRED -> Known.REQUIRED
                    else -> throw OmnistackInvalidDataException("Unknown UnionMember0: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * Specifies a tool the model should use. Use to force the model to call a specific
         * function.
         */
        @JsonDeserialize(builder = ChatCompletionNamedToolChoice.Builder::class)
        @NoAutoDetect
        class ChatCompletionNamedToolChoice
        private constructor(
            private val type: JsonField<Type>,
            private val function: JsonField<Function>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The type of the tool. Currently, only `function` is supported. */
            fun type(): Type = type.getRequired("type")

            fun function(): Function = function.getRequired("function")

            /** The type of the tool. Currently, only `function` is supported. */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("function") @ExcludeMissing fun _function() = function

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ChatCompletionNamedToolChoice = apply {
                if (!validated) {
                    type()
                    function().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var function: JsonField<Function> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(chatCompletionNamedToolChoice: ChatCompletionNamedToolChoice) =
                    apply {
                        this.type = chatCompletionNamedToolChoice.type
                        this.function = chatCompletionNamedToolChoice.function
                        additionalProperties(chatCompletionNamedToolChoice.additionalProperties)
                    }

                /** The type of the tool. Currently, only `function` is supported. */
                fun type(type: Type) = type(JsonField.of(type))

                /** The type of the tool. Currently, only `function` is supported. */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun function(function: Function) = function(JsonField.of(function))

                @JsonProperty("function")
                @ExcludeMissing
                fun function(function: JsonField<Function>) = apply { this.function = function }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ChatCompletionNamedToolChoice =
                    ChatCompletionNamedToolChoice(
                        type,
                        function,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = Function.Builder::class)
            @NoAutoDetect
            class Function
            private constructor(
                private val name: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** The name of the function to call. */
                fun name(): String = name.getRequired("name")

                /** The name of the function to call. */
                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Function = apply {
                    if (!validated) {
                        name()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var name: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(function: Function) = apply {
                        this.name = function.name
                        additionalProperties(function.additionalProperties)
                    }

                    /** The name of the function to call. */
                    fun name(name: String) = name(JsonField.of(name))

                    /** The name of the function to call. */
                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Function = Function(name, additionalProperties.toUnmodifiable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Function && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(name, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Function{name=$name, additionalProperties=$additionalProperties}"
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val FUNCTION = Type(JsonField.of("function"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    FUNCTION,
                }

                enum class Value {
                    FUNCTION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        FUNCTION -> Value.FUNCTION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        FUNCTION -> Known.FUNCTION
                        else -> throw OmnistackInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ChatCompletionNamedToolChoice && this.type == other.type && this.function == other.function && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(type, function, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ChatCompletionNamedToolChoice{type=$type, function=$function, additionalProperties=$additionalProperties}"
        }
    }

    @JsonDeserialize(builder = Tool.Builder::class)
    @NoAutoDetect
    class Tool
    private constructor(
        private val type: Type?,
        private val function: Function?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The type of the tool. Currently, only `function` is supported. */
        @JsonProperty("type") fun type(): Type? = type

        @JsonProperty("function") fun function(): Function? = function

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var function: Function? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tool: Tool) = apply {
                this.type = tool.type
                this.function = tool.function
                additionalProperties(tool.additionalProperties)
            }

            /** The type of the tool. Currently, only `function` is supported. */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            @JsonProperty("function")
            fun function(function: Function) = apply { this.function = function }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Tool =
                Tool(
                    checkNotNull(type) { "`type` is required but was not set" },
                    checkNotNull(function) { "`function` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = Function.Builder::class)
        @NoAutoDetect
        class Function
        private constructor(
            private val description: String?,
            private val name: String?,
            private val parameters: Parameters?,
            private val strict: Boolean?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * A description of what the function does, used by the model to choose when and how to
             * call the function.
             */
            @JsonProperty("description") fun description(): String? = description

            /**
             * The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores
             * and dashes, with a maximum length of 64.
             */
            @JsonProperty("name") fun name(): String? = name

            /**
             * The parameters the functions accepts, described as a JSON Schema object. See the
             * [guide](/docs/guides/function-calling) for examples, and the
             * [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for
             * documentation about the format.
             *
             * Omitting `parameters` defines a function with an empty parameter list.
             */
            @JsonProperty("parameters") fun parameters(): Parameters? = parameters

            /**
             * Whether to enable strict schema adherence when generating the function call. If set
             * to true, the model will follow the exact schema defined in the `parameters` field.
             * Only a subset of JSON Schema is supported when `strict` is `true`. Learn more about
             * Structured Outputs in the [function calling guide](docs/guides/function-calling).
             */
            @JsonProperty("strict") fun strict(): Boolean? = strict

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var description: String? = null
                private var name: String? = null
                private var parameters: Parameters? = null
                private var strict: Boolean? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(function: Function) = apply {
                    this.description = function.description
                    this.name = function.name
                    this.parameters = function.parameters
                    this.strict = function.strict
                    additionalProperties(function.additionalProperties)
                }

                /**
                 * A description of what the function does, used by the model to choose when and how
                 * to call the function.
                 */
                @JsonProperty("description")
                fun description(description: String) = apply { this.description = description }

                /**
                 * The name of the function to be called. Must be a-z, A-Z, 0-9, or contain
                 * underscores and dashes, with a maximum length of 64.
                 */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                /**
                 * The parameters the functions accepts, described as a JSON Schema object. See the
                 * [guide](/docs/guides/function-calling) for examples, and the
                 * [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for
                 * documentation about the format.
                 *
                 * Omitting `parameters` defines a function with an empty parameter list.
                 */
                @JsonProperty("parameters")
                fun parameters(parameters: Parameters) = apply { this.parameters = parameters }

                /**
                 * Whether to enable strict schema adherence when generating the function call. If
                 * set to true, the model will follow the exact schema defined in the `parameters`
                 * field. Only a subset of JSON Schema is supported when `strict` is `true`. Learn
                 * more about Structured Outputs in the
                 * [function calling guide](docs/guides/function-calling).
                 */
                @JsonProperty("strict") fun strict(strict: Boolean) = apply { this.strict = strict }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Function =
                    Function(
                        description,
                        checkNotNull(name) { "`name` is required but was not set" },
                        parameters,
                        strict,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /**
             * The parameters the functions accepts, described as a JSON Schema object. See the
             * [guide](/docs/guides/function-calling) for examples, and the
             * [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for
             * documentation about the format.
             *
             * Omitting `parameters` defines a function with an empty parameter list.
             */
            @JsonDeserialize(builder = Parameters.Builder::class)
            @NoAutoDetect
            class Parameters
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(parameters: Parameters) = apply {
                        additionalProperties(parameters.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Parameters = Parameters(additionalProperties.toUnmodifiable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Parameters && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() = "Parameters{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Function && this.description == other.description && this.name == other.name && this.parameters == other.parameters && this.strict == other.strict && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(description, name, parameters, strict, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Function{description=$description, name=$name, parameters=$parameters, strict=$strict, additionalProperties=$additionalProperties}"
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val FUNCTION = Type(JsonField.of("function"))

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                FUNCTION,
            }

            enum class Value {
                FUNCTION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    FUNCTION -> Value.FUNCTION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    FUNCTION -> Known.FUNCTION
                    else -> throw OmnistackInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tool && this.type == other.type && this.function == other.function && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(type, function, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Tool{type=$type, function=$function, additionalProperties=$additionalProperties}"
    }
}
