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

/** Represents an individual API key in a project. */
@JsonDeserialize(builder = ProjectApiKey.Builder::class)
@NoAutoDetect
class ProjectApiKey
private constructor(
    private val object_: JsonField<Object>,
    private val redactedValue: JsonField<String>,
    private val name: JsonField<String>,
    private val createdAt: JsonField<Long>,
    private val id: JsonField<String>,
    private val owner: JsonField<Owner>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The object type, which is always `organization.project.api_key` */
    fun object_(): Object = object_.getRequired("object")

    /** The redacted value of the API key */
    fun redactedValue(): String = redactedValue.getRequired("redacted_value")

    /** The name of the API key */
    fun name(): String = name.getRequired("name")

    /** The Unix timestamp (in seconds) of when the API key was created */
    fun createdAt(): Long = createdAt.getRequired("created_at")

    /** The identifier, which can be referenced in API endpoints */
    fun id(): String = id.getRequired("id")

    fun owner(): Owner = owner.getRequired("owner")

    /** The object type, which is always `organization.project.api_key` */
    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /** The redacted value of the API key */
    @JsonProperty("redacted_value") @ExcludeMissing fun _redactedValue() = redactedValue

    /** The name of the API key */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** The Unix timestamp (in seconds) of when the API key was created */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The identifier, which can be referenced in API endpoints */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("owner") @ExcludeMissing fun _owner() = owner

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProjectApiKey = apply {
        if (!validated) {
            object_()
            redactedValue()
            name()
            createdAt()
            id()
            owner().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var object_: JsonField<Object> = JsonMissing.of()
        private var redactedValue: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<Long> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var owner: JsonField<Owner> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(projectApiKey: ProjectApiKey) = apply {
            this.object_ = projectApiKey.object_
            this.redactedValue = projectApiKey.redactedValue
            this.name = projectApiKey.name
            this.createdAt = projectApiKey.createdAt
            this.id = projectApiKey.id
            this.owner = projectApiKey.owner
            additionalProperties(projectApiKey.additionalProperties)
        }

        /** The object type, which is always `organization.project.api_key` */
        fun object_(object_: Object) = object_(JsonField.of(object_))

        /** The object type, which is always `organization.project.api_key` */
        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<Object>) = apply { this.object_ = object_ }

        /** The redacted value of the API key */
        fun redactedValue(redactedValue: String) = redactedValue(JsonField.of(redactedValue))

        /** The redacted value of the API key */
        @JsonProperty("redacted_value")
        @ExcludeMissing
        fun redactedValue(redactedValue: JsonField<String>) = apply {
            this.redactedValue = redactedValue
        }

        /** The name of the API key */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the API key */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The Unix timestamp (in seconds) of when the API key was created */
        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /** The Unix timestamp (in seconds) of when the API key was created */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        /** The identifier, which can be referenced in API endpoints */
        fun id(id: String) = id(JsonField.of(id))

        /** The identifier, which can be referenced in API endpoints */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun owner(owner: Owner) = owner(JsonField.of(owner))

        @JsonProperty("owner")
        @ExcludeMissing
        fun owner(owner: JsonField<Owner>) = apply { this.owner = owner }

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

        fun build(): ProjectApiKey =
            ProjectApiKey(
                object_,
                redactedValue,
                name,
                createdAt,
                id,
                owner,
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

            val ORGANIZATION_PROJECT_API_KEY = Object(JsonField.of("organization.project.api_key"))

            fun of(value: String) = Object(JsonField.of(value))
        }

        enum class Known {
            ORGANIZATION_PROJECT_API_KEY,
        }

        enum class Value {
            ORGANIZATION_PROJECT_API_KEY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ORGANIZATION_PROJECT_API_KEY -> Value.ORGANIZATION_PROJECT_API_KEY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ORGANIZATION_PROJECT_API_KEY -> Known.ORGANIZATION_PROJECT_API_KEY
                else -> throw OmnistackInvalidDataException("Unknown Object: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = Owner.Builder::class)
    @NoAutoDetect
    class Owner
    private constructor(
        private val type: JsonField<Type>,
        private val user: JsonField<ProjectUser>,
        private val serviceAccount: JsonField<ProjectServiceAccount>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** `user` or `service_account` */
        fun type(): Type? = type.getNullable("type")

        /** Represents an individual user in a project. */
        fun user(): ProjectUser? = user.getNullable("user")

        /** Represents an individual service account in a project. */
        fun serviceAccount(): ProjectServiceAccount? = serviceAccount.getNullable("service_account")

        /** `user` or `service_account` */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        /** Represents an individual user in a project. */
        @JsonProperty("user") @ExcludeMissing fun _user() = user

        /** Represents an individual service account in a project. */
        @JsonProperty("service_account") @ExcludeMissing fun _serviceAccount() = serviceAccount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Owner = apply {
            if (!validated) {
                type()
                user()?.validate()
                serviceAccount()?.validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<Type> = JsonMissing.of()
            private var user: JsonField<ProjectUser> = JsonMissing.of()
            private var serviceAccount: JsonField<ProjectServiceAccount> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(owner: Owner) = apply {
                this.type = owner.type
                this.user = owner.user
                this.serviceAccount = owner.serviceAccount
                additionalProperties(owner.additionalProperties)
            }

            /** `user` or `service_account` */
            fun type(type: Type) = type(JsonField.of(type))

            /** `user` or `service_account` */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** Represents an individual user in a project. */
            fun user(user: ProjectUser) = user(JsonField.of(user))

            /** Represents an individual user in a project. */
            @JsonProperty("user")
            @ExcludeMissing
            fun user(user: JsonField<ProjectUser>) = apply { this.user = user }

            /** Represents an individual service account in a project. */
            fun serviceAccount(serviceAccount: ProjectServiceAccount) =
                serviceAccount(JsonField.of(serviceAccount))

            /** Represents an individual service account in a project. */
            @JsonProperty("service_account")
            @ExcludeMissing
            fun serviceAccount(serviceAccount: JsonField<ProjectServiceAccount>) = apply {
                this.serviceAccount = serviceAccount
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

            fun build(): Owner =
                Owner(
                    type,
                    user,
                    serviceAccount,
                    additionalProperties.toUnmodifiable(),
                )
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

                val USER = Type(JsonField.of("user"))

                val SERVICE_ACCOUNT = Type(JsonField.of("service_account"))

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                USER,
                SERVICE_ACCOUNT,
            }

            enum class Value {
                USER,
                SERVICE_ACCOUNT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    USER -> Value.USER
                    SERVICE_ACCOUNT -> Value.SERVICE_ACCOUNT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    USER -> Known.USER
                    SERVICE_ACCOUNT -> Known.SERVICE_ACCOUNT
                    else -> throw OmnistackInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Owner && this.type == other.type && this.user == other.user && this.serviceAccount == other.serviceAccount && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(type, user, serviceAccount, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Owner{type=$type, user=$user, serviceAccount=$serviceAccount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProjectApiKey && this.object_ == other.object_ && this.redactedValue == other.redactedValue && this.name == other.name && this.createdAt == other.createdAt && this.id == other.id && this.owner == other.owner && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(object_, redactedValue, name, createdAt, id, owner, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ProjectApiKey{object_=$object_, redactedValue=$redactedValue, name=$name, createdAt=$createdAt, id=$id, owner=$owner, additionalProperties=$additionalProperties}"
}
