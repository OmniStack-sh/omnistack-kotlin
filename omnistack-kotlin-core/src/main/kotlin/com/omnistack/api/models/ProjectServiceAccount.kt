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

/** Represents an individual service account in a project. */
@JsonDeserialize(builder = ProjectServiceAccount.Builder::class)
@NoAutoDetect
class ProjectServiceAccount
private constructor(
    private val object_: JsonField<Object>,
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val role: JsonField<Role>,
    private val createdAt: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The object type, which is always `organization.project.service_account` */
    fun object_(): Object = object_.getRequired("object")

    /** The identifier, which can be referenced in API endpoints */
    fun id(): String = id.getRequired("id")

    /** The name of the service account */
    fun name(): String = name.getRequired("name")

    /** `owner` or `member` */
    fun role(): Role = role.getRequired("role")

    /** The Unix timestamp (in seconds) of when the service account was created */
    fun createdAt(): Long = createdAt.getRequired("created_at")

    /** The object type, which is always `organization.project.service_account` */
    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /** The identifier, which can be referenced in API endpoints */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The name of the service account */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** `owner` or `member` */
    @JsonProperty("role") @ExcludeMissing fun _role() = role

    /** The Unix timestamp (in seconds) of when the service account was created */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProjectServiceAccount = apply {
        if (!validated) {
            object_()
            id()
            name()
            role()
            createdAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var object_: JsonField<Object> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var role: JsonField<Role> = JsonMissing.of()
        private var createdAt: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(projectServiceAccount: ProjectServiceAccount) = apply {
            this.object_ = projectServiceAccount.object_
            this.id = projectServiceAccount.id
            this.name = projectServiceAccount.name
            this.role = projectServiceAccount.role
            this.createdAt = projectServiceAccount.createdAt
            additionalProperties(projectServiceAccount.additionalProperties)
        }

        /** The object type, which is always `organization.project.service_account` */
        fun object_(object_: Object) = object_(JsonField.of(object_))

        /** The object type, which is always `organization.project.service_account` */
        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<Object>) = apply { this.object_ = object_ }

        /** The identifier, which can be referenced in API endpoints */
        fun id(id: String) = id(JsonField.of(id))

        /** The identifier, which can be referenced in API endpoints */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The name of the service account */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the service account */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** `owner` or `member` */
        fun role(role: Role) = role(JsonField.of(role))

        /** `owner` or `member` */
        @JsonProperty("role")
        @ExcludeMissing
        fun role(role: JsonField<Role>) = apply { this.role = role }

        /** The Unix timestamp (in seconds) of when the service account was created */
        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /** The Unix timestamp (in seconds) of when the service account was created */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

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

        fun build(): ProjectServiceAccount =
            ProjectServiceAccount(
                object_,
                id,
                name,
                role,
                createdAt,
                additionalProperties.toUnmodifiable(),
            )
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

            val ORGANIZATION_PROJECT_SERVICE_ACCOUNT =
                Object(JsonField.of("organization.project.service_account"))

            fun of(value: String) = Object(JsonField.of(value))
        }

        enum class Known {
            ORGANIZATION_PROJECT_SERVICE_ACCOUNT,
        }

        enum class Value {
            ORGANIZATION_PROJECT_SERVICE_ACCOUNT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ORGANIZATION_PROJECT_SERVICE_ACCOUNT -> Value.ORGANIZATION_PROJECT_SERVICE_ACCOUNT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ORGANIZATION_PROJECT_SERVICE_ACCOUNT -> Known.ORGANIZATION_PROJECT_SERVICE_ACCOUNT
                else -> throw OmnistackInvalidDataException("Unknown Object: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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

            val OWNER = Role(JsonField.of("owner"))

            val MEMBER = Role(JsonField.of("member"))

            fun of(value: String) = Role(JsonField.of(value))
        }

        enum class Known {
            OWNER,
            MEMBER,
        }

        enum class Value {
            OWNER,
            MEMBER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OWNER -> Value.OWNER
                MEMBER -> Value.MEMBER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OWNER -> Known.OWNER
                MEMBER -> Known.MEMBER
                else -> throw OmnistackInvalidDataException("Unknown Role: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectServiceAccount && this.object_ == other.object_ && this.id == other.id && this.name == other.name && this.role == other.role && this.createdAt == other.createdAt && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(object_, id, name, role, createdAt, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ProjectServiceAccount{object_=$object_, id=$id, name=$name, role=$role, createdAt=$createdAt, additionalProperties=$additionalProperties}"
}
