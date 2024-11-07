// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.errors

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.omnistack.api.core.JsonValue
import com.omnistack.api.core.NoAutoDetect
import com.omnistack.api.core.toImmutable
import java.util.Objects

@JsonDeserialize(builder = OmnistackError.Builder::class)
@NoAutoDetect
class OmnistackError
private constructor(
    @JsonAnyGetter val additionalProperties: Map<String, JsonValue>,
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OmnistackError && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
    }

    override fun toString() = "OmnistackError{additionalProperties=$additionalProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(omnistackError: OmnistackError) = apply {
            additionalProperties = omnistackError.additionalProperties.toMutableMap()
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): OmnistackError = OmnistackError(additionalProperties.toImmutable())
    }
}
