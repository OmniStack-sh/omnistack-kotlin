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

/**
 * Represents a completion response from the API. Note: both the streamed and non-streamed response
 * objects share the same shape (unlike the chat endpoint).
 */
@JsonDeserialize(builder = CompletionCreateResponse.Builder::class)
@NoAutoDetect
class CompletionCreateResponse
private constructor(
    private val id: JsonField<String>,
    private val choices: JsonField<List<Choice>>,
    private val created: JsonField<Long>,
    private val model: JsonField<String>,
    private val systemFingerprint: JsonField<String>,
    private val object_: JsonField<Object>,
    private val usage: JsonField<Usage>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** A unique identifier for the completion. */
    fun id(): String = id.getRequired("id")

    /** The list of completion choices the model generated for the input prompt. */
    fun choices(): List<Choice> = choices.getRequired("choices")

    /** The Unix timestamp (in seconds) of when the completion was created. */
    fun created(): Long = created.getRequired("created")

    /** The model used for completion. */
    fun model(): String = model.getRequired("model")

    /**
     * This fingerprint represents the backend configuration that the model runs with.
     *
     * Can be used in conjunction with the `seed` request parameter to understand when backend
     * changes have been made that might impact determinism.
     */
    fun systemFingerprint(): String? = systemFingerprint.getNullable("system_fingerprint")

    /** The object type, which is always "text_completion" */
    fun object_(): Object = object_.getRequired("object")

    /** Usage statistics for the completion request. */
    fun usage(): Usage? = usage.getNullable("usage")

    /** A unique identifier for the completion. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The list of completion choices the model generated for the input prompt. */
    @JsonProperty("choices") @ExcludeMissing fun _choices() = choices

    /** The Unix timestamp (in seconds) of when the completion was created. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** The model used for completion. */
    @JsonProperty("model") @ExcludeMissing fun _model() = model

    /**
     * This fingerprint represents the backend configuration that the model runs with.
     *
     * Can be used in conjunction with the `seed` request parameter to understand when backend
     * changes have been made that might impact determinism.
     */
    @JsonProperty("system_fingerprint") @ExcludeMissing fun _systemFingerprint() = systemFingerprint

    /** The object type, which is always "text_completion" */
    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /** Usage statistics for the completion request. */
    @JsonProperty("usage") @ExcludeMissing fun _usage() = usage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CompletionCreateResponse = apply {
        if (!validated) {
            id()
            choices().forEach { it.validate() }
            created()
            model()
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
        private var systemFingerprint: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<Object> = JsonMissing.of()
        private var usage: JsonField<Usage> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(completionCreateResponse: CompletionCreateResponse) = apply {
            this.id = completionCreateResponse.id
            this.choices = completionCreateResponse.choices
            this.created = completionCreateResponse.created
            this.model = completionCreateResponse.model
            this.systemFingerprint = completionCreateResponse.systemFingerprint
            this.object_ = completionCreateResponse.object_
            this.usage = completionCreateResponse.usage
            additionalProperties(completionCreateResponse.additionalProperties)
        }

        /** A unique identifier for the completion. */
        fun id(id: String) = id(JsonField.of(id))

        /** A unique identifier for the completion. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The list of completion choices the model generated for the input prompt. */
        fun choices(choices: List<Choice>) = choices(JsonField.of(choices))

        /** The list of completion choices the model generated for the input prompt. */
        @JsonProperty("choices")
        @ExcludeMissing
        fun choices(choices: JsonField<List<Choice>>) = apply { this.choices = choices }

        /** The Unix timestamp (in seconds) of when the completion was created. */
        fun created(created: Long) = created(JsonField.of(created))

        /** The Unix timestamp (in seconds) of when the completion was created. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<Long>) = apply { this.created = created }

        /** The model used for completion. */
        fun model(model: String) = model(JsonField.of(model))

        /** The model used for completion. */
        @JsonProperty("model")
        @ExcludeMissing
        fun model(model: JsonField<String>) = apply { this.model = model }

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

        /** The object type, which is always "text_completion" */
        fun object_(object_: Object) = object_(JsonField.of(object_))

        /** The object type, which is always "text_completion" */
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

        fun build(): CompletionCreateResponse =
            CompletionCreateResponse(
                id,
                choices.map { it.toUnmodifiable() },
                created,
                model,
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
        private val logprobs: JsonField<Logprobs>,
        private val text: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * The reason the model stopped generating tokens. This will be `stop` if the model hit a
         * natural stop point or a provided stop sequence, `length` if the maximum number of tokens
         * specified in the request was reached, or `content_filter` if content was omitted due to a
         * flag from our content filters.
         */
        fun finishReason(): FinishReason = finishReason.getRequired("finish_reason")

        fun index(): Long = index.getRequired("index")

        fun logprobs(): Logprobs? = logprobs.getNullable("logprobs")

        fun text(): String = text.getRequired("text")

        /**
         * The reason the model stopped generating tokens. This will be `stop` if the model hit a
         * natural stop point or a provided stop sequence, `length` if the maximum number of tokens
         * specified in the request was reached, or `content_filter` if content was omitted due to a
         * flag from our content filters.
         */
        @JsonProperty("finish_reason") @ExcludeMissing fun _finishReason() = finishReason

        @JsonProperty("index") @ExcludeMissing fun _index() = index

        @JsonProperty("logprobs") @ExcludeMissing fun _logprobs() = logprobs

        @JsonProperty("text") @ExcludeMissing fun _text() = text

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Choice = apply {
            if (!validated) {
                finishReason()
                index()
                logprobs()?.validate()
                text()
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
            private var logprobs: JsonField<Logprobs> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(choice: Choice) = apply {
                this.finishReason = choice.finishReason
                this.index = choice.index
                this.logprobs = choice.logprobs
                this.text = choice.text
                additionalProperties(choice.additionalProperties)
            }

            /**
             * The reason the model stopped generating tokens. This will be `stop` if the model hit
             * a natural stop point or a provided stop sequence, `length` if the maximum number of
             * tokens specified in the request was reached, or `content_filter` if content was
             * omitted due to a flag from our content filters.
             */
            fun finishReason(finishReason: FinishReason) = finishReason(JsonField.of(finishReason))

            /**
             * The reason the model stopped generating tokens. This will be `stop` if the model hit
             * a natural stop point or a provided stop sequence, `length` if the maximum number of
             * tokens specified in the request was reached, or `content_filter` if content was
             * omitted due to a flag from our content filters.
             */
            @JsonProperty("finish_reason")
            @ExcludeMissing
            fun finishReason(finishReason: JsonField<FinishReason>) = apply {
                this.finishReason = finishReason
            }

            fun index(index: Long) = index(JsonField.of(index))

            @JsonProperty("index")
            @ExcludeMissing
            fun index(index: JsonField<Long>) = apply { this.index = index }

            fun logprobs(logprobs: Logprobs) = logprobs(JsonField.of(logprobs))

            @JsonProperty("logprobs")
            @ExcludeMissing
            fun logprobs(logprobs: JsonField<Logprobs>) = apply { this.logprobs = logprobs }

            fun text(text: String) = text(JsonField.of(text))

            @JsonProperty("text")
            @ExcludeMissing
            fun text(text: JsonField<String>) = apply { this.text = text }

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
                    logprobs,
                    text,
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

                val CONTENT_FILTER = FinishReason(JsonField.of("content_filter"))

                fun of(value: String) = FinishReason(JsonField.of(value))
            }

            enum class Known {
                STOP,
                LENGTH,
                CONTENT_FILTER,
            }

            enum class Value {
                STOP,
                LENGTH,
                CONTENT_FILTER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    STOP -> Value.STOP
                    LENGTH -> Value.LENGTH
                    CONTENT_FILTER -> Value.CONTENT_FILTER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    STOP -> Known.STOP
                    LENGTH -> Known.LENGTH
                    CONTENT_FILTER -> Known.CONTENT_FILTER
                    else -> throw OmnistackInvalidDataException("Unknown FinishReason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = Logprobs.Builder::class)
        @NoAutoDetect
        class Logprobs
        private constructor(
            private val textOffset: JsonField<List<Long>>,
            private val tokenLogprobs: JsonField<List<Double>>,
            private val tokens: JsonField<List<String>>,
            private val topLogprobs: JsonField<List<TopLogprob>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun textOffset(): List<Long>? = textOffset.getNullable("text_offset")

            fun tokenLogprobs(): List<Double>? = tokenLogprobs.getNullable("token_logprobs")

            fun tokens(): List<String>? = tokens.getNullable("tokens")

            fun topLogprobs(): List<TopLogprob>? = topLogprobs.getNullable("top_logprobs")

            @JsonProperty("text_offset") @ExcludeMissing fun _textOffset() = textOffset

            @JsonProperty("token_logprobs") @ExcludeMissing fun _tokenLogprobs() = tokenLogprobs

            @JsonProperty("tokens") @ExcludeMissing fun _tokens() = tokens

            @JsonProperty("top_logprobs") @ExcludeMissing fun _topLogprobs() = topLogprobs

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Logprobs = apply {
                if (!validated) {
                    textOffset()
                    tokenLogprobs()
                    tokens()
                    topLogprobs()?.forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var textOffset: JsonField<List<Long>> = JsonMissing.of()
                private var tokenLogprobs: JsonField<List<Double>> = JsonMissing.of()
                private var tokens: JsonField<List<String>> = JsonMissing.of()
                private var topLogprobs: JsonField<List<TopLogprob>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(logprobs: Logprobs) = apply {
                    this.textOffset = logprobs.textOffset
                    this.tokenLogprobs = logprobs.tokenLogprobs
                    this.tokens = logprobs.tokens
                    this.topLogprobs = logprobs.topLogprobs
                    additionalProperties(logprobs.additionalProperties)
                }

                fun textOffset(textOffset: List<Long>) = textOffset(JsonField.of(textOffset))

                @JsonProperty("text_offset")
                @ExcludeMissing
                fun textOffset(textOffset: JsonField<List<Long>>) = apply {
                    this.textOffset = textOffset
                }

                fun tokenLogprobs(tokenLogprobs: List<Double>) =
                    tokenLogprobs(JsonField.of(tokenLogprobs))

                @JsonProperty("token_logprobs")
                @ExcludeMissing
                fun tokenLogprobs(tokenLogprobs: JsonField<List<Double>>) = apply {
                    this.tokenLogprobs = tokenLogprobs
                }

                fun tokens(tokens: List<String>) = tokens(JsonField.of(tokens))

                @JsonProperty("tokens")
                @ExcludeMissing
                fun tokens(tokens: JsonField<List<String>>) = apply { this.tokens = tokens }

                fun topLogprobs(topLogprobs: List<TopLogprob>) =
                    topLogprobs(JsonField.of(topLogprobs))

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

                fun build(): Logprobs =
                    Logprobs(
                        textOffset.map { it.toUnmodifiable() },
                        tokenLogprobs.map { it.toUnmodifiable() },
                        tokens.map { it.toUnmodifiable() },
                        topLogprobs.map { it.toUnmodifiable() },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = TopLogprob.Builder::class)
            @NoAutoDetect
            class TopLogprob
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): TopLogprob = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(topLogprob: TopLogprob) = apply {
                        additionalProperties(topLogprob.additionalProperties)
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

                    fun build(): TopLogprob = TopLogprob(additionalProperties.toUnmodifiable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TopLogprob && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() = "TopLogprob{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Logprobs && this.textOffset == other.textOffset && this.tokenLogprobs == other.tokenLogprobs && this.tokens == other.tokens && this.topLogprobs == other.topLogprobs && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(textOffset, tokenLogprobs, tokens, topLogprobs, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Logprobs{textOffset=$textOffset, tokenLogprobs=$tokenLogprobs, tokens=$tokens, topLogprobs=$topLogprobs, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Choice && this.finishReason == other.finishReason && this.index == other.index && this.logprobs == other.logprobs && this.text == other.text && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(finishReason, index, logprobs, text, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Choice{finishReason=$finishReason, index=$index, logprobs=$logprobs, text=$text, additionalProperties=$additionalProperties}"
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

            val TEXT_COMPLETION = Object(JsonField.of("text_completion"))

            fun of(value: String) = Object(JsonField.of(value))
        }

        enum class Known {
            TEXT_COMPLETION,
        }

        enum class Value {
            TEXT_COMPLETION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                TEXT_COMPLETION -> Value.TEXT_COMPLETION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                TEXT_COMPLETION -> Known.TEXT_COMPLETION
                else -> throw OmnistackInvalidDataException("Unknown Object: $value")
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

        return /* spotless:off */ other is CompletionCreateResponse && this.id == other.id && this.choices == other.choices && this.created == other.created && this.model == other.model && this.systemFingerprint == other.systemFingerprint && this.object_ == other.object_ && this.usage == other.usage && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, choices, created, model, systemFingerprint, object_, usage, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "CompletionCreateResponse{id=$id, choices=$choices, created=$created, model=$model, systemFingerprint=$systemFingerprint, object_=$object_, usage=$usage, additionalProperties=$additionalProperties}"
}
