// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.omnistack.api.core.Enum
import com.omnistack.api.core.ExcludeMissing
import com.omnistack.api.core.JsonField
import com.omnistack.api.core.JsonMissing
import com.omnistack.api.core.JsonValue
import com.omnistack.api.core.NoAutoDetect
import com.omnistack.api.core.toUnmodifiable
import com.omnistack.api.errors.OmnistackInvalidDataException
import java.util.Objects

/** Represents a chat completion response returned by model, based on the provided input. */
@JsonDeserialize(builder = ChatCompletionCreateResponse.Builder::class)
@NoAutoDetect
class ChatCompletionCreateResponse
private constructor(
    private val id: JsonField<String>,
    private val choices: JsonField<List<Choice>>,
    private val created: JsonField<Long>,
    private val model: JsonField<String>,
    private val serviceTier: JsonField<ServiceTier>,
    private val systemFingerprint: JsonField<String>,
    private val object_: JsonField<Object>,
    private val usage: JsonField<Usage>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** A unique identifier for the chat completion. */
    fun id(): String = id.getRequired("id")

    /** A list of chat completion choices. Can be more than one if `n` is greater than 1. */
    fun choices(): List<Choice> = choices.getRequired("choices")

    /** The Unix timestamp (in seconds) of when the chat completion was created. */
    fun created(): Long = created.getRequired("created")

    /** The model used for the chat completion. */
    fun model(): String = model.getRequired("model")

    /**
     * The service tier used for processing the request. This field is only included if the
     * `service_tier` parameter is specified in the request.
     */
    fun serviceTier(): ServiceTier? = serviceTier.getNullable("service_tier")

    /**
     * This fingerprint represents the backend configuration that the model runs with.
     *
     * Can be used in conjunction with the `seed` request parameter to understand when backend
     * changes have been made that might impact determinism.
     */
    fun systemFingerprint(): String? = systemFingerprint.getNullable("system_fingerprint")

    /** The object type, which is always `chat.completion`. */
    fun object_(): Object = object_.getRequired("object")

    /** Usage statistics for the completion request. */
    fun usage(): Usage? = usage.getNullable("usage")

    /** A unique identifier for the chat completion. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** A list of chat completion choices. Can be more than one if `n` is greater than 1. */
    @JsonProperty("choices") @ExcludeMissing fun _choices() = choices

    /** The Unix timestamp (in seconds) of when the chat completion was created. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** The model used for the chat completion. */
    @JsonProperty("model") @ExcludeMissing fun _model() = model

    /**
     * The service tier used for processing the request. This field is only included if the
     * `service_tier` parameter is specified in the request.
     */
    @JsonProperty("service_tier") @ExcludeMissing fun _serviceTier() = serviceTier

    /**
     * This fingerprint represents the backend configuration that the model runs with.
     *
     * Can be used in conjunction with the `seed` request parameter to understand when backend
     * changes have been made that might impact determinism.
     */
    @JsonProperty("system_fingerprint") @ExcludeMissing fun _systemFingerprint() = systemFingerprint

    /** The object type, which is always `chat.completion`. */
    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /** Usage statistics for the completion request. */
    @JsonProperty("usage") @ExcludeMissing fun _usage() = usage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ChatCompletionCreateResponse = apply {
        if (!validated) {
            id()
            choices().forEach { it.validate() }
            created()
            model()
            serviceTier()
            systemFingerprint()
            object_()
            usage()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var choices: JsonField<List<Choice>> = JsonMissing.of()
        private var created: JsonField<Long> = JsonMissing.of()
        private var model: JsonField<String> = JsonMissing.of()
        private var serviceTier: JsonField<ServiceTier> = JsonMissing.of()
        private var systemFingerprint: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<Object> = JsonMissing.of()
        private var usage: JsonField<Usage> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chatCompletionCreateResponse: ChatCompletionCreateResponse) = apply {
            this.id = chatCompletionCreateResponse.id
            this.choices = chatCompletionCreateResponse.choices
            this.created = chatCompletionCreateResponse.created
            this.model = chatCompletionCreateResponse.model
            this.serviceTier = chatCompletionCreateResponse.serviceTier
            this.systemFingerprint = chatCompletionCreateResponse.systemFingerprint
            this.object_ = chatCompletionCreateResponse.object_
            this.usage = chatCompletionCreateResponse.usage
            additionalProperties(chatCompletionCreateResponse.additionalProperties)
        }

        /** A unique identifier for the chat completion. */
        fun id(id: String) = id(JsonField.of(id))

        /** A unique identifier for the chat completion. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** A list of chat completion choices. Can be more than one if `n` is greater than 1. */
        fun choices(choices: List<Choice>) = choices(JsonField.of(choices))

        /** A list of chat completion choices. Can be more than one if `n` is greater than 1. */
        @JsonProperty("choices")
        @ExcludeMissing
        fun choices(choices: JsonField<List<Choice>>) = apply { this.choices = choices }

        /** The Unix timestamp (in seconds) of when the chat completion was created. */
        fun created(created: Long) = created(JsonField.of(created))

        /** The Unix timestamp (in seconds) of when the chat completion was created. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<Long>) = apply { this.created = created }

        /** The model used for the chat completion. */
        fun model(model: String) = model(JsonField.of(model))

        /** The model used for the chat completion. */
        @JsonProperty("model")
        @ExcludeMissing
        fun model(model: JsonField<String>) = apply { this.model = model }

        /**
         * The service tier used for processing the request. This field is only included if the
         * `service_tier` parameter is specified in the request.
         */
        fun serviceTier(serviceTier: ServiceTier) = serviceTier(JsonField.of(serviceTier))

        /**
         * The service tier used for processing the request. This field is only included if the
         * `service_tier` parameter is specified in the request.
         */
        @JsonProperty("service_tier")
        @ExcludeMissing
        fun serviceTier(serviceTier: JsonField<ServiceTier>) = apply {
            this.serviceTier = serviceTier
        }

        /**
         * This fingerprint represents the backend configuration that the model runs with.
         *
         * Can be used in conjunction with the `seed` request parameter to understand when backend
         * changes have been made that might impact determinism.
         */
        fun systemFingerprint(systemFingerprint: String) =
            systemFingerprint(JsonField.of(systemFingerprint))

        /**
         * This fingerprint represents the backend configuration that the model runs with.
         *
         * Can be used in conjunction with the `seed` request parameter to understand when backend
         * changes have been made that might impact determinism.
         */
        @JsonProperty("system_fingerprint")
        @ExcludeMissing
        fun systemFingerprint(systemFingerprint: JsonField<String>) = apply {
            this.systemFingerprint = systemFingerprint
        }

        /** The object type, which is always `chat.completion`. */
        fun object_(object_: Object) = object_(JsonField.of(object_))

        /** The object type, which is always `chat.completion`. */
        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<Object>) = apply { this.object_ = object_ }

        /** Usage statistics for the completion request. */
        fun usage(usage: Usage) = usage(JsonField.of(usage))

        /** Usage statistics for the completion request. */
        @JsonProperty("usage")
        @ExcludeMissing
        fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

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

        fun build(): ChatCompletionCreateResponse =
            ChatCompletionCreateResponse(
                id,
                choices.map { it.toUnmodifiable() },
                created,
                model,
                serviceTier,
                systemFingerprint,
                object_,
                usage,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Choice.Builder::class)
    @NoAutoDetect
    class Choice
    private constructor(
        private val finishReason: JsonField<FinishReason>,
        private val index: JsonField<Long>,
        private val message: JsonField<Message>,
        private val logprobs: JsonField<Logprobs>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * The reason the model stopped generating tokens. This will be `stop` if the model hit a
         * natural stop point or a provided stop sequence, `length` if the maximum number of tokens
         * specified in the request was reached, `content_filter` if content was omitted due to a
         * flag from our content filters, `tool_calls` if the model called a tool, or
         * `function_call` (deprecated) if the model called a function.
         */
        fun finishReason(): FinishReason = finishReason.getRequired("finish_reason")

        /** The index of the choice in the list of choices. */
        fun index(): Long = index.getRequired("index")

        /** A chat completion message generated by the model. */
        fun message(): Message = message.getRequired("message")

        /** Log probability information for the choice. */
        fun logprobs(): Logprobs? = logprobs.getNullable("logprobs")

        /**
         * The reason the model stopped generating tokens. This will be `stop` if the model hit a
         * natural stop point or a provided stop sequence, `length` if the maximum number of tokens
         * specified in the request was reached, `content_filter` if content was omitted due to a
         * flag from our content filters, `tool_calls` if the model called a tool, or
         * `function_call` (deprecated) if the model called a function.
         */
        @JsonProperty("finish_reason") @ExcludeMissing fun _finishReason() = finishReason

        /** The index of the choice in the list of choices. */
        @JsonProperty("index") @ExcludeMissing fun _index() = index

        /** A chat completion message generated by the model. */
        @JsonProperty("message") @ExcludeMissing fun _message() = message

        /** Log probability information for the choice. */
        @JsonProperty("logprobs") @ExcludeMissing fun _logprobs() = logprobs

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Choice = apply {
            if (!validated) {
                finishReason()
                index()
                message().validate()
                logprobs()?.validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var finishReason: JsonField<FinishReason> = JsonMissing.of()
            private var index: JsonField<Long> = JsonMissing.of()
            private var message: JsonField<Message> = JsonMissing.of()
            private var logprobs: JsonField<Logprobs> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(choice: Choice) = apply {
                this.finishReason = choice.finishReason
                this.index = choice.index
                this.message = choice.message
                this.logprobs = choice.logprobs
                additionalProperties(choice.additionalProperties)
            }

            /**
             * The reason the model stopped generating tokens. This will be `stop` if the model hit
             * a natural stop point or a provided stop sequence, `length` if the maximum number of
             * tokens specified in the request was reached, `content_filter` if content was omitted
             * due to a flag from our content filters, `tool_calls` if the model called a tool, or
             * `function_call` (deprecated) if the model called a function.
             */
            fun finishReason(finishReason: FinishReason) = finishReason(JsonField.of(finishReason))

            /**
             * The reason the model stopped generating tokens. This will be `stop` if the model hit
             * a natural stop point or a provided stop sequence, `length` if the maximum number of
             * tokens specified in the request was reached, `content_filter` if content was omitted
             * due to a flag from our content filters, `tool_calls` if the model called a tool, or
             * `function_call` (deprecated) if the model called a function.
             */
            @JsonProperty("finish_reason")
            @ExcludeMissing
            fun finishReason(finishReason: JsonField<FinishReason>) = apply {
                this.finishReason = finishReason
            }

            /** The index of the choice in the list of choices. */
            fun index(index: Long) = index(JsonField.of(index))

            /** The index of the choice in the list of choices. */
            @JsonProperty("index")
            @ExcludeMissing
            fun index(index: JsonField<Long>) = apply { this.index = index }

            /** A chat completion message generated by the model. */
            fun message(message: Message) = message(JsonField.of(message))

            /** A chat completion message generated by the model. */
            @JsonProperty("message")
            @ExcludeMissing
            fun message(message: JsonField<Message>) = apply { this.message = message }

            /** Log probability information for the choice. */
            fun logprobs(logprobs: Logprobs) = logprobs(JsonField.of(logprobs))

            /** Log probability information for the choice. */
            @JsonProperty("logprobs")
            @ExcludeMissing
            fun logprobs(logprobs: JsonField<Logprobs>) = apply { this.logprobs = logprobs }

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

            fun build(): Choice =
                Choice(
                    finishReason,
                    index,
                    message,
                    logprobs,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class FinishReason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FinishReason && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val STOP = FinishReason(JsonField.of("stop"))

                val LENGTH = FinishReason(JsonField.of("length"))

                val TOOL_CALLS = FinishReason(JsonField.of("tool_calls"))

                val CONTENT_FILTER = FinishReason(JsonField.of("content_filter"))

                val FUNCTION_CALL = FinishReason(JsonField.of("function_call"))

                fun of(value: String) = FinishReason(JsonField.of(value))
            }

            enum class Known {
                STOP,
                LENGTH,
                TOOL_CALLS,
                CONTENT_FILTER,
                FUNCTION_CALL,
            }

            enum class Value {
                STOP,
                LENGTH,
                TOOL_CALLS,
                CONTENT_FILTER,
                FUNCTION_CALL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    STOP -> Value.STOP
                    LENGTH -> Value.LENGTH
                    TOOL_CALLS -> Value.TOOL_CALLS
                    CONTENT_FILTER -> Value.CONTENT_FILTER
                    FUNCTION_CALL -> Value.FUNCTION_CALL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    STOP -> Known.STOP
                    LENGTH -> Known.LENGTH
                    TOOL_CALLS -> Known.TOOL_CALLS
                    CONTENT_FILTER -> Known.CONTENT_FILTER
                    FUNCTION_CALL -> Known.FUNCTION_CALL
                    else -> throw OmnistackInvalidDataException("Unknown FinishReason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /** Log probability information for the choice. */
        @JsonDeserialize(builder = Logprobs.Builder::class)
        @NoAutoDetect
        class Logprobs
        private constructor(
            private val content: JsonField<List<Content>>,
            private val refusal: JsonField<List<Refusal>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** A list of message content tokens with log probability information. */
            fun content(): List<Content>? = content.getNullable("content")

            /** A list of message refusal tokens with log probability information. */
            fun refusal(): List<Refusal>? = refusal.getNullable("refusal")

            /** A list of message content tokens with log probability information. */
            @JsonProperty("content") @ExcludeMissing fun _content() = content

            /** A list of message refusal tokens with log probability information. */
            @JsonProperty("refusal") @ExcludeMissing fun _refusal() = refusal

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Logprobs = apply {
                if (!validated) {
                    content()?.forEach { it.validate() }
                    refusal()?.forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var content: JsonField<List<Content>> = JsonMissing.of()
                private var refusal: JsonField<List<Refusal>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(logprobs: Logprobs) = apply {
                    this.content = logprobs.content
                    this.refusal = logprobs.refusal
                    additionalProperties(logprobs.additionalProperties)
                }

                /** A list of message content tokens with log probability information. */
                fun content(content: List<Content>) = content(JsonField.of(content))

                /** A list of message content tokens with log probability information. */
                @JsonProperty("content")
                @ExcludeMissing
                fun content(content: JsonField<List<Content>>) = apply { this.content = content }

                /** A list of message refusal tokens with log probability information. */
                fun refusal(refusal: List<Refusal>) = refusal(JsonField.of(refusal))

                /** A list of message refusal tokens with log probability information. */
                @JsonProperty("refusal")
                @ExcludeMissing
                fun refusal(refusal: JsonField<List<Refusal>>) = apply { this.refusal = refusal }

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

                fun build(): Logprobs =
                    Logprobs(
                        content.map { it.toUnmodifiable() },
                        refusal.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = Content.Builder::class)
            @NoAutoDetect
            class Content
            private constructor(
                private val token: JsonField<String>,
                private val logprob: JsonField<Double>,
                private val bytes: JsonField<List<Long>>,
                private val topLogprobs: JsonField<List<TopLogprob>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** The token. */
                fun token(): String = token.getRequired("token")

                /**
                 * The log probability of this token, if it is within the top 20 most likely tokens.
                 * Otherwise, the value `-9999.0` is used to signify that the token is very
                 * unlikely.
                 */
                fun logprob(): Double = logprob.getRequired("logprob")

                /**
                 * A list of integers representing the UTF-8 bytes representation of the token.
                 * Useful in instances where characters are represented by multiple tokens and their
                 * byte representations must be combined to generate the correct text
                 * representation. Can be `null` if there is no bytes representation for the token.
                 */
                fun bytes(): List<Long>? = bytes.getNullable("bytes")

                /**
                 * List of the most likely tokens and their log probability, at this token position.
                 * In rare cases, there may be fewer than the number of requested `top_logprobs`
                 * returned.
                 */
                fun topLogprobs(): List<TopLogprob> = topLogprobs.getRequired("top_logprobs")

                /** The token. */
                @JsonProperty("token") @ExcludeMissing fun _token() = token

                /**
                 * The log probability of this token, if it is within the top 20 most likely tokens.
                 * Otherwise, the value `-9999.0` is used to signify that the token is very
                 * unlikely.
                 */
                @JsonProperty("logprob") @ExcludeMissing fun _logprob() = logprob

                /**
                 * A list of integers representing the UTF-8 bytes representation of the token.
                 * Useful in instances where characters are represented by multiple tokens and their
                 * byte representations must be combined to generate the correct text
                 * representation. Can be `null` if there is no bytes representation for the token.
                 */
                @JsonProperty("bytes") @ExcludeMissing fun _bytes() = bytes

                /**
                 * List of the most likely tokens and their log probability, at this token position.
                 * In rare cases, there may be fewer than the number of requested `top_logprobs`
                 * returned.
                 */
                @JsonProperty("top_logprobs") @ExcludeMissing fun _topLogprobs() = topLogprobs

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Content = apply {
                    if (!validated) {
                        token()
                        logprob()
                        bytes()
                        topLogprobs().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var token: JsonField<String> = JsonMissing.of()
                    private var logprob: JsonField<Double> = JsonMissing.of()
                    private var bytes: JsonField<List<Long>> = JsonMissing.of()
                    private var topLogprobs: JsonField<List<TopLogprob>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(content: Content) = apply {
                        this.token = content.token
                        this.logprob = content.logprob
                        this.bytes = content.bytes
                        this.topLogprobs = content.topLogprobs
                        additionalProperties(content.additionalProperties)
                    }

                    /** The token. */
                    fun token(token: String) = token(JsonField.of(token))

                    /** The token. */
                    @JsonProperty("token")
                    @ExcludeMissing
                    fun token(token: JsonField<String>) = apply { this.token = token }

                    /**
                     * The log probability of this token, if it is within the top 20 most likely
                     * tokens. Otherwise, the value `-9999.0` is used to signify that the token is
                     * very unlikely.
                     */
                    fun logprob(logprob: Double) = logprob(JsonField.of(logprob))

                    /**
                     * The log probability of this token, if it is within the top 20 most likely
                     * tokens. Otherwise, the value `-9999.0` is used to signify that the token is
                     * very unlikely.
                     */
                    @JsonProperty("logprob")
                    @ExcludeMissing
                    fun logprob(logprob: JsonField<Double>) = apply { this.logprob = logprob }

                    /**
                     * A list of integers representing the UTF-8 bytes representation of the token.
                     * Useful in instances where characters are represented by multiple tokens and
                     * their byte representations must be combined to generate the correct text
                     * representation. Can be `null` if there is no bytes representation for the
                     * token.
                     */
                    fun bytes(bytes: List<Long>) = bytes(JsonField.of(bytes))

                    /**
                     * A list of integers representing the UTF-8 bytes representation of the token.
                     * Useful in instances where characters are represented by multiple tokens and
                     * their byte representations must be combined to generate the correct text
                     * representation. Can be `null` if there is no bytes representation for the
                     * token.
                     */
                    @JsonProperty("bytes")
                    @ExcludeMissing
                    fun bytes(bytes: JsonField<List<Long>>) = apply { this.bytes = bytes }

                    /**
                     * List of the most likely tokens and their log probability, at this token
                     * position. In rare cases, there may be fewer than the number of requested
                     * `top_logprobs` returned.
                     */
                    fun topLogprobs(topLogprobs: List<TopLogprob>) =
                        topLogprobs(JsonField.of(topLogprobs))

                    /**
                     * List of the most likely tokens and their log probability, at this token
                     * position. In rare cases, there may be fewer than the number of requested
                     * `top_logprobs` returned.
                     */
                    @JsonProperty("top_logprobs")
                    @ExcludeMissing
                    fun topLogprobs(topLogprobs: JsonField<List<TopLogprob>>) = apply {
                        this.topLogprobs = topLogprobs
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

                    fun build(): Content =
                        Content(
                            token,
                            logprob,
                            bytes.map { it.toUnmodifiable() },
                            topLogprobs.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(builder = TopLogprob.Builder::class)
                @NoAutoDetect
                class TopLogprob
                private constructor(
                    private val token: JsonField<String>,
                    private val logprob: JsonField<Double>,
                    private val bytes: JsonField<List<Long>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    /** The token. */
                    fun token(): String = token.getRequired("token")

                    /**
                     * The log probability of this token, if it is within the top 20 most likely
                     * tokens. Otherwise, the value `-9999.0` is used to signify that the token is
                     * very unlikely.
                     */
                    fun logprob(): Double = logprob.getRequired("logprob")

                    /**
                     * A list of integers representing the UTF-8 bytes representation of the token.
                     * Useful in instances where characters are represented by multiple tokens and
                     * their byte representations must be combined to generate the correct text
                     * representation. Can be `null` if there is no bytes representation for the
                     * token.
                     */
                    fun bytes(): List<Long>? = bytes.getNullable("bytes")

                    /** The token. */
                    @JsonProperty("token") @ExcludeMissing fun _token() = token

                    /**
                     * The log probability of this token, if it is within the top 20 most likely
                     * tokens. Otherwise, the value `-9999.0` is used to signify that the token is
                     * very unlikely.
                     */
                    @JsonProperty("logprob") @ExcludeMissing fun _logprob() = logprob

                    /**
                     * A list of integers representing the UTF-8 bytes representation of the token.
                     * Useful in instances where characters are represented by multiple tokens and
                     * their byte representations must be combined to generate the correct text
                     * representation. Can be `null` if there is no bytes representation for the
                     * token.
                     */
                    @JsonProperty("bytes") @ExcludeMissing fun _bytes() = bytes

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): TopLogprob = apply {
                        if (!validated) {
                            token()
                            logprob()
                            bytes()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var token: JsonField<String> = JsonMissing.of()
                        private var logprob: JsonField<Double> = JsonMissing.of()
                        private var bytes: JsonField<List<Long>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(topLogprob: TopLogprob) = apply {
                            this.token = topLogprob.token
                            this.logprob = topLogprob.logprob
                            this.bytes = topLogprob.bytes
                            additionalProperties(topLogprob.additionalProperties)
                        }

                        /** The token. */
                        fun token(token: String) = token(JsonField.of(token))

                        /** The token. */
                        @JsonProperty("token")
                        @ExcludeMissing
                        fun token(token: JsonField<String>) = apply { this.token = token }

                        /**
                         * The log probability of this token, if it is within the top 20 most likely
                         * tokens. Otherwise, the value `-9999.0` is used to signify that the token
                         * is very unlikely.
                         */
                        fun logprob(logprob: Double) = logprob(JsonField.of(logprob))

                        /**
                         * The log probability of this token, if it is within the top 20 most likely
                         * tokens. Otherwise, the value `-9999.0` is used to signify that the token
                         * is very unlikely.
                         */
                        @JsonProperty("logprob")
                        @ExcludeMissing
                        fun logprob(logprob: JsonField<Double>) = apply { this.logprob = logprob }

                        /**
                         * A list of integers representing the UTF-8 bytes representation of the
                         * token. Useful in instances where characters are represented by multiple
                         * tokens and their byte representations must be combined to generate the
                         * correct text representation. Can be `null` if there is no bytes
                         * representation for the token.
                         */
                        fun bytes(bytes: List<Long>) = bytes(JsonField.of(bytes))

                        /**
                         * A list of integers representing the UTF-8 bytes representation of the
                         * token. Useful in instances where characters are represented by multiple
                         * tokens and their byte representations must be combined to generate the
                         * correct text representation. Can be `null` if there is no bytes
                         * representation for the token.
                         */
                        @JsonProperty("bytes")
                        @ExcludeMissing
                        fun bytes(bytes: JsonField<List<Long>>) = apply { this.bytes = bytes }

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

                        fun build(): TopLogprob =
                            TopLogprob(
                                token,
                                logprob,
                                bytes.map { it.toUnmodifiable() },
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is TopLogprob && this.token == other.token && this.logprob == other.logprob && this.bytes == other.bytes && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(token, logprob, bytes, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "TopLogprob{token=$token, logprob=$logprob, bytes=$bytes, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Content && this.token == other.token && this.logprob == other.logprob && this.bytes == other.bytes && this.topLogprobs == other.topLogprobs && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(token, logprob, bytes, topLogprobs, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Content{token=$token, logprob=$logprob, bytes=$bytes, topLogprobs=$topLogprobs, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = Refusal.Builder::class)
            @NoAutoDetect
            class Refusal
            private constructor(
                private val token: JsonField<String>,
                private val logprob: JsonField<Double>,
                private val bytes: JsonField<List<Long>>,
                private val topLogprobs: JsonField<List<TopLogprob>>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** The token. */
                fun token(): String = token.getRequired("token")

                /**
                 * The log probability of this token, if it is within the top 20 most likely tokens.
                 * Otherwise, the value `-9999.0` is used to signify that the token is very
                 * unlikely.
                 */
                fun logprob(): Double = logprob.getRequired("logprob")

                /**
                 * A list of integers representing the UTF-8 bytes representation of the token.
                 * Useful in instances where characters are represented by multiple tokens and their
                 * byte representations must be combined to generate the correct text
                 * representation. Can be `null` if there is no bytes representation for the token.
                 */
                fun bytes(): List<Long>? = bytes.getNullable("bytes")

                /**
                 * List of the most likely tokens and their log probability, at this token position.
                 * In rare cases, there may be fewer than the number of requested `top_logprobs`
                 * returned.
                 */
                fun topLogprobs(): List<TopLogprob> = topLogprobs.getRequired("top_logprobs")

                /** The token. */
                @JsonProperty("token") @ExcludeMissing fun _token() = token

                /**
                 * The log probability of this token, if it is within the top 20 most likely tokens.
                 * Otherwise, the value `-9999.0` is used to signify that the token is very
                 * unlikely.
                 */
                @JsonProperty("logprob") @ExcludeMissing fun _logprob() = logprob

                /**
                 * A list of integers representing the UTF-8 bytes representation of the token.
                 * Useful in instances where characters are represented by multiple tokens and their
                 * byte representations must be combined to generate the correct text
                 * representation. Can be `null` if there is no bytes representation for the token.
                 */
                @JsonProperty("bytes") @ExcludeMissing fun _bytes() = bytes

                /**
                 * List of the most likely tokens and their log probability, at this token position.
                 * In rare cases, there may be fewer than the number of requested `top_logprobs`
                 * returned.
                 */
                @JsonProperty("top_logprobs") @ExcludeMissing fun _topLogprobs() = topLogprobs

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Refusal = apply {
                    if (!validated) {
                        token()
                        logprob()
                        bytes()
                        topLogprobs().forEach { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var token: JsonField<String> = JsonMissing.of()
                    private var logprob: JsonField<Double> = JsonMissing.of()
                    private var bytes: JsonField<List<Long>> = JsonMissing.of()
                    private var topLogprobs: JsonField<List<TopLogprob>> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(refusal: Refusal) = apply {
                        this.token = refusal.token
                        this.logprob = refusal.logprob
                        this.bytes = refusal.bytes
                        this.topLogprobs = refusal.topLogprobs
                        additionalProperties(refusal.additionalProperties)
                    }

                    /** The token. */
                    fun token(token: String) = token(JsonField.of(token))

                    /** The token. */
                    @JsonProperty("token")
                    @ExcludeMissing
                    fun token(token: JsonField<String>) = apply { this.token = token }

                    /**
                     * The log probability of this token, if it is within the top 20 most likely
                     * tokens. Otherwise, the value `-9999.0` is used to signify that the token is
                     * very unlikely.
                     */
                    fun logprob(logprob: Double) = logprob(JsonField.of(logprob))

                    /**
                     * The log probability of this token, if it is within the top 20 most likely
                     * tokens. Otherwise, the value `-9999.0` is used to signify that the token is
                     * very unlikely.
                     */
                    @JsonProperty("logprob")
                    @ExcludeMissing
                    fun logprob(logprob: JsonField<Double>) = apply { this.logprob = logprob }

                    /**
                     * A list of integers representing the UTF-8 bytes representation of the token.
                     * Useful in instances where characters are represented by multiple tokens and
                     * their byte representations must be combined to generate the correct text
                     * representation. Can be `null` if there is no bytes representation for the
                     * token.
                     */
                    fun bytes(bytes: List<Long>) = bytes(JsonField.of(bytes))

                    /**
                     * A list of integers representing the UTF-8 bytes representation of the token.
                     * Useful in instances where characters are represented by multiple tokens and
                     * their byte representations must be combined to generate the correct text
                     * representation. Can be `null` if there is no bytes representation for the
                     * token.
                     */
                    @JsonProperty("bytes")
                    @ExcludeMissing
                    fun bytes(bytes: JsonField<List<Long>>) = apply { this.bytes = bytes }

                    /**
                     * List of the most likely tokens and their log probability, at this token
                     * position. In rare cases, there may be fewer than the number of requested
                     * `top_logprobs` returned.
                     */
                    fun topLogprobs(topLogprobs: List<TopLogprob>) =
                        topLogprobs(JsonField.of(topLogprobs))

                    /**
                     * List of the most likely tokens and their log probability, at this token
                     * position. In rare cases, there may be fewer than the number of requested
                     * `top_logprobs` returned.
                     */
                    @JsonProperty("top_logprobs")
                    @ExcludeMissing
                    fun topLogprobs(topLogprobs: JsonField<List<TopLogprob>>) = apply {
                        this.topLogprobs = topLogprobs
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

                    fun build(): Refusal =
                        Refusal(
                            token,
                            logprob,
                            bytes.map { it.toUnmodifiable() },
                            topLogprobs.map { it.toUnmodifiable() },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(builder = TopLogprob.Builder::class)
                @NoAutoDetect
                class TopLogprob
                private constructor(
                    private val token: JsonField<String>,
                    private val logprob: JsonField<Double>,
                    private val bytes: JsonField<List<Long>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    /** The token. */
                    fun token(): String = token.getRequired("token")

                    /**
                     * The log probability of this token, if it is within the top 20 most likely
                     * tokens. Otherwise, the value `-9999.0` is used to signify that the token is
                     * very unlikely.
                     */
                    fun logprob(): Double = logprob.getRequired("logprob")

                    /**
                     * A list of integers representing the UTF-8 bytes representation of the token.
                     * Useful in instances where characters are represented by multiple tokens and
                     * their byte representations must be combined to generate the correct text
                     * representation. Can be `null` if there is no bytes representation for the
                     * token.
                     */
                    fun bytes(): List<Long>? = bytes.getNullable("bytes")

                    /** The token. */
                    @JsonProperty("token") @ExcludeMissing fun _token() = token

                    /**
                     * The log probability of this token, if it is within the top 20 most likely
                     * tokens. Otherwise, the value `-9999.0` is used to signify that the token is
                     * very unlikely.
                     */
                    @JsonProperty("logprob") @ExcludeMissing fun _logprob() = logprob

                    /**
                     * A list of integers representing the UTF-8 bytes representation of the token.
                     * Useful in instances where characters are represented by multiple tokens and
                     * their byte representations must be combined to generate the correct text
                     * representation. Can be `null` if there is no bytes representation for the
                     * token.
                     */
                    @JsonProperty("bytes") @ExcludeMissing fun _bytes() = bytes

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): TopLogprob = apply {
                        if (!validated) {
                            token()
                            logprob()
                            bytes()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var token: JsonField<String> = JsonMissing.of()
                        private var logprob: JsonField<Double> = JsonMissing.of()
                        private var bytes: JsonField<List<Long>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(topLogprob: TopLogprob) = apply {
                            this.token = topLogprob.token
                            this.logprob = topLogprob.logprob
                            this.bytes = topLogprob.bytes
                            additionalProperties(topLogprob.additionalProperties)
                        }

                        /** The token. */
                        fun token(token: String) = token(JsonField.of(token))

                        /** The token. */
                        @JsonProperty("token")
                        @ExcludeMissing
                        fun token(token: JsonField<String>) = apply { this.token = token }

                        /**
                         * The log probability of this token, if it is within the top 20 most likely
                         * tokens. Otherwise, the value `-9999.0` is used to signify that the token
                         * is very unlikely.
                         */
                        fun logprob(logprob: Double) = logprob(JsonField.of(logprob))

                        /**
                         * The log probability of this token, if it is within the top 20 most likely
                         * tokens. Otherwise, the value `-9999.0` is used to signify that the token
                         * is very unlikely.
                         */
                        @JsonProperty("logprob")
                        @ExcludeMissing
                        fun logprob(logprob: JsonField<Double>) = apply { this.logprob = logprob }

                        /**
                         * A list of integers representing the UTF-8 bytes representation of the
                         * token. Useful in instances where characters are represented by multiple
                         * tokens and their byte representations must be combined to generate the
                         * correct text representation. Can be `null` if there is no bytes
                         * representation for the token.
                         */
                        fun bytes(bytes: List<Long>) = bytes(JsonField.of(bytes))

                        /**
                         * A list of integers representing the UTF-8 bytes representation of the
                         * token. Useful in instances where characters are represented by multiple
                         * tokens and their byte representations must be combined to generate the
                         * correct text representation. Can be `null` if there is no bytes
                         * representation for the token.
                         */
                        @JsonProperty("bytes")
                        @ExcludeMissing
                        fun bytes(bytes: JsonField<List<Long>>) = apply { this.bytes = bytes }

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

                        fun build(): TopLogprob =
                            TopLogprob(
                                token,
                                logprob,
                                bytes.map { it.toUnmodifiable() },
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is TopLogprob && this.token == other.token && this.logprob == other.logprob && this.bytes == other.bytes && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(token, logprob, bytes, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "TopLogprob{token=$token, logprob=$logprob, bytes=$bytes, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Refusal && this.token == other.token && this.logprob == other.logprob && this.bytes == other.bytes && this.topLogprobs == other.topLogprobs && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(token, logprob, bytes, topLogprobs, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Refusal{token=$token, logprob=$logprob, bytes=$bytes, topLogprobs=$topLogprobs, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Logprobs && this.content == other.content && this.refusal == other.refusal && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(content, refusal, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Logprobs{content=$content, refusal=$refusal, additionalProperties=$additionalProperties}"
        }

        /** A chat completion message generated by the model. */
        @JsonDeserialize(builder = Message.Builder::class)
        @NoAutoDetect
        class Message
        private constructor(
            private val content: JsonField<String>,
            private val refusal: JsonField<String>,
            private val toolCalls: JsonField<List<ToolCall>>,
            private val role: JsonField<Role>,
            private val functionCall: JsonField<FunctionCall>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The contents of the message. */
            fun content(): String? = content.getNullable("content")

            /** The refusal message generated by the model. */
            fun refusal(): String? = refusal.getNullable("refusal")

            /** The tool calls generated by the model, such as function calls. */
            fun toolCalls(): List<ToolCall>? = toolCalls.getNullable("tool_calls")

            /** The role of the author of this message. */
            fun role(): Role = role.getRequired("role")

            /**
             * Deprecated and replaced by `tool_calls`. The name and arguments of a function that
             * should be called, as generated by the model.
             */
            fun functionCall(): FunctionCall? = functionCall.getNullable("function_call")

            /** The contents of the message. */
            @JsonProperty("content") @ExcludeMissing fun _content() = content

            /** The refusal message generated by the model. */
            @JsonProperty("refusal") @ExcludeMissing fun _refusal() = refusal

            /** The tool calls generated by the model, such as function calls. */
            @JsonProperty("tool_calls") @ExcludeMissing fun _toolCalls() = toolCalls

            /** The role of the author of this message. */
            @JsonProperty("role") @ExcludeMissing fun _role() = role

            /**
             * Deprecated and replaced by `tool_calls`. The name and arguments of a function that
             * should be called, as generated by the model.
             */
            @JsonProperty("function_call") @ExcludeMissing fun _functionCall() = functionCall

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Message = apply {
                if (!validated) {
                    content()
                    refusal()
                    toolCalls()?.forEach { it.validate() }
                    role()
                    functionCall()?.validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var content: JsonField<String> = JsonMissing.of()
                private var refusal: JsonField<String> = JsonMissing.of()
                private var toolCalls: JsonField<List<ToolCall>> = JsonMissing.of()
                private var role: JsonField<Role> = JsonMissing.of()
                private var functionCall: JsonField<FunctionCall> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(message: Message) = apply {
                    this.content = message.content
                    this.refusal = message.refusal
                    this.toolCalls = message.toolCalls
                    this.role = message.role
                    this.functionCall = message.functionCall
                    additionalProperties(message.additionalProperties)
                }

                /** The contents of the message. */
                fun content(content: String) = content(JsonField.of(content))

                /** The contents of the message. */
                @JsonProperty("content")
                @ExcludeMissing
                fun content(content: JsonField<String>) = apply { this.content = content }

                /** The refusal message generated by the model. */
                fun refusal(refusal: String) = refusal(JsonField.of(refusal))

                /** The refusal message generated by the model. */
                @JsonProperty("refusal")
                @ExcludeMissing
                fun refusal(refusal: JsonField<String>) = apply { this.refusal = refusal }

                /** The tool calls generated by the model, such as function calls. */
                fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

                /** The tool calls generated by the model, such as function calls. */
                @JsonProperty("tool_calls")
                @ExcludeMissing
                fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
                    this.toolCalls = toolCalls
                }

                /** The role of the author of this message. */
                fun role(role: Role) = role(JsonField.of(role))

                /** The role of the author of this message. */
                @JsonProperty("role")
                @ExcludeMissing
                fun role(role: JsonField<Role>) = apply { this.role = role }

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

                fun build(): Message =
                    Message(
                        content,
                        refusal,
                        toolCalls.map { it.toUnmodifiable() },
                        role,
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

                return /* spotless:off */ other is Message && this.content == other.content && this.refusal == other.refusal && this.toolCalls == other.toolCalls && this.role == other.role && this.functionCall == other.functionCall && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(content, refusal, toolCalls, role, functionCall, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Message{content=$content, refusal=$refusal, toolCalls=$toolCalls, role=$role, functionCall=$functionCall, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Choice && this.finishReason == other.finishReason && this.index == other.index && this.message == other.message && this.logprobs == other.logprobs && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(finishReason, index, message, logprobs, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Choice{finishReason=$finishReason, index=$index, message=$message, logprobs=$logprobs, additionalProperties=$additionalProperties}"
    }

    class Object
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Object && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CHAT_COMPLETION = Object(JsonField.of("chat.completion"))

            fun of(value: String) = Object(JsonField.of(value))
        }

        enum class Known {
            CHAT_COMPLETION,
        }

        enum class Value {
            CHAT_COMPLETION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CHAT_COMPLETION -> Value.CHAT_COMPLETION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CHAT_COMPLETION -> Known.CHAT_COMPLETION
                else -> throw OmnistackInvalidDataException("Unknown Object: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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

            val SCALE = ServiceTier(JsonField.of("scale"))

            val DEFAULT = ServiceTier(JsonField.of("default"))

            fun of(value: String) = ServiceTier(JsonField.of(value))
        }

        enum class Known {
            SCALE,
            DEFAULT,
        }

        enum class Value {
            SCALE,
            DEFAULT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SCALE -> Value.SCALE
                DEFAULT -> Value.DEFAULT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SCALE -> Known.SCALE
                DEFAULT -> Known.DEFAULT
                else -> throw OmnistackInvalidDataException("Unknown ServiceTier: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** Usage statistics for the completion request. */
    @JsonDeserialize(builder = Usage.Builder::class)
    @NoAutoDetect
    class Usage
    private constructor(
        private val completionTokens: JsonField<Long>,
        private val promptTokens: JsonField<Long>,
        private val totalTokens: JsonField<Long>,
        private val completionTokensDetails: JsonField<CompletionTokensDetails>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Number of tokens in the generated completion. */
        fun completionTokens(): Long = completionTokens.getRequired("completion_tokens")

        /** Number of tokens in the prompt. */
        fun promptTokens(): Long = promptTokens.getRequired("prompt_tokens")

        /** Total number of tokens used in the request (prompt + completion). */
        fun totalTokens(): Long = totalTokens.getRequired("total_tokens")

        /** Breakdown of tokens used in a completion. */
        fun completionTokensDetails(): CompletionTokensDetails? =
            completionTokensDetails.getNullable("completion_tokens_details")

        /** Number of tokens in the generated completion. */
        @JsonProperty("completion_tokens")
        @ExcludeMissing
        fun _completionTokens() = completionTokens

        /** Number of tokens in the prompt. */
        @JsonProperty("prompt_tokens") @ExcludeMissing fun _promptTokens() = promptTokens

        /** Total number of tokens used in the request (prompt + completion). */
        @JsonProperty("total_tokens") @ExcludeMissing fun _totalTokens() = totalTokens

        /** Breakdown of tokens used in a completion. */
        @JsonProperty("completion_tokens_details")
        @ExcludeMissing
        fun _completionTokensDetails() = completionTokensDetails

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Usage = apply {
            if (!validated) {
                completionTokens()
                promptTokens()
                totalTokens()
                completionTokensDetails()?.validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var completionTokens: JsonField<Long> = JsonMissing.of()
            private var promptTokens: JsonField<Long> = JsonMissing.of()
            private var totalTokens: JsonField<Long> = JsonMissing.of()
            private var completionTokensDetails: JsonField<CompletionTokensDetails> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(usage: Usage) = apply {
                this.completionTokens = usage.completionTokens
                this.promptTokens = usage.promptTokens
                this.totalTokens = usage.totalTokens
                this.completionTokensDetails = usage.completionTokensDetails
                additionalProperties(usage.additionalProperties)
            }

            /** Number of tokens in the generated completion. */
            fun completionTokens(completionTokens: Long) =
                completionTokens(JsonField.of(completionTokens))

            /** Number of tokens in the generated completion. */
            @JsonProperty("completion_tokens")
            @ExcludeMissing
            fun completionTokens(completionTokens: JsonField<Long>) = apply {
                this.completionTokens = completionTokens
            }

            /** Number of tokens in the prompt. */
            fun promptTokens(promptTokens: Long) = promptTokens(JsonField.of(promptTokens))

            /** Number of tokens in the prompt. */
            @JsonProperty("prompt_tokens")
            @ExcludeMissing
            fun promptTokens(promptTokens: JsonField<Long>) = apply {
                this.promptTokens = promptTokens
            }

            /** Total number of tokens used in the request (prompt + completion). */
            fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

            /** Total number of tokens used in the request (prompt + completion). */
            @JsonProperty("total_tokens")
            @ExcludeMissing
            fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

            /** Breakdown of tokens used in a completion. */
            fun completionTokensDetails(completionTokensDetails: CompletionTokensDetails) =
                completionTokensDetails(JsonField.of(completionTokensDetails))

            /** Breakdown of tokens used in a completion. */
            @JsonProperty("completion_tokens_details")
            @ExcludeMissing
            fun completionTokensDetails(
                completionTokensDetails: JsonField<CompletionTokensDetails>
            ) = apply { this.completionTokensDetails = completionTokensDetails }

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

            fun build(): Usage =
                Usage(
                    completionTokens,
                    promptTokens,
                    totalTokens,
                    completionTokensDetails,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** Breakdown of tokens used in a completion. */
        @JsonDeserialize(builder = CompletionTokensDetails.Builder::class)
        @NoAutoDetect
        class CompletionTokensDetails
        private constructor(
            private val reasoningTokens: JsonField<Long>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** Tokens generated by the model for reasoning. */
            fun reasoningTokens(): Long? = reasoningTokens.getNullable("reasoning_tokens")

            /** Tokens generated by the model for reasoning. */
            @JsonProperty("reasoning_tokens")
            @ExcludeMissing
            fun _reasoningTokens() = reasoningTokens

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CompletionTokensDetails = apply {
                if (!validated) {
                    reasoningTokens()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var reasoningTokens: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(completionTokensDetails: CompletionTokensDetails) = apply {
                    this.reasoningTokens = completionTokensDetails.reasoningTokens
                    additionalProperties(completionTokensDetails.additionalProperties)
                }

                /** Tokens generated by the model for reasoning. */
                fun reasoningTokens(reasoningTokens: Long) =
                    reasoningTokens(JsonField.of(reasoningTokens))

                /** Tokens generated by the model for reasoning. */
                @JsonProperty("reasoning_tokens")
                @ExcludeMissing
                fun reasoningTokens(reasoningTokens: JsonField<Long>) = apply {
                    this.reasoningTokens = reasoningTokens
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

                fun build(): CompletionTokensDetails =
                    CompletionTokensDetails(reasoningTokens, additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CompletionTokensDetails && this.reasoningTokens == other.reasoningTokens && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(reasoningTokens, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "CompletionTokensDetails{reasoningTokens=$reasoningTokens, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Usage && this.completionTokens == other.completionTokens && this.promptTokens == other.promptTokens && this.totalTokens == other.totalTokens && this.completionTokensDetails == other.completionTokensDetails && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(completionTokens, promptTokens, totalTokens, completionTokensDetails, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Usage{completionTokens=$completionTokens, promptTokens=$promptTokens, totalTokens=$totalTokens, completionTokensDetails=$completionTokensDetails, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChatCompletionCreateResponse && this.id == other.id && this.choices == other.choices && this.created == other.created && this.model == other.model && this.serviceTier == other.serviceTier && this.systemFingerprint == other.systemFingerprint && this.object_ == other.object_ && this.usage == other.usage && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, choices, created, model, serviceTier, systemFingerprint, object_, usage, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ChatCompletionCreateResponse{id=$id, choices=$choices, created=$created, model=$model, serviceTier=$serviceTier, systemFingerprint=$systemFingerprint, object_=$object_, usage=$usage, additionalProperties=$additionalProperties}"
}
