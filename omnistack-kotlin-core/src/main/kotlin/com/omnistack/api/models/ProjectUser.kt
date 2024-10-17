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

/** Represents an individual user in a project. */
@JsonDeserialize(builder = ProjectUser.Builder::class)
@NoAutoDetect
class ProjectUser
private constructor(
    private val object_: JsonField<Object>,
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val email: JsonField<String>,
    private val role: JsonField<Role>,
    private val addedAt: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The object type, which is always `organization.project.user` */
    fun object_(): Object = object_.getRequired("object")

    /** The identifier, which can be referenced in API endpoints */
    fun id(): String = id.getRequired("id")

    /** The name of the user */
    fun name(): String = name.getRequired("name")

    /** The email address of the user */
    fun email(): String = email.getRequired("email")

    /** `owner` or `member` */
    fun role(): Role = role.getRequired("role")

    /** The Unix timestamp (in seconds) of when the project was added. */
    fun addedAt(): Long = addedAt.getRequired("added_at")

    /** The object type, which is always `organization.project.user` */
    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /** The identifier, which can be referenced in API endpoints */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The name of the user */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** The email address of the user */
    @JsonProperty("email") @ExcludeMissing fun _email() = email

    /** `owner` or `member` */
    @JsonProperty("role") @ExcludeMissing fun _role() = role

    /** The Unix timestamp (in seconds) of when the project was added. */
    @JsonProperty("added_at") @ExcludeMissing fun _addedAt() = addedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProjectUser = apply {
        if (!validated) {
            object_()
            id()
            name()
            email()
            role()
            addedAt()
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
        private var email: JsonField<String> = JsonMissing.of()
        private var role: JsonField<Role> = JsonMissing.of()
        private var addedAt: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(projectUser: ProjectUser) = apply {
            this.object_ = projectUser.object_
            this.id = projectUser.id
            this.name = projectUser.name
            this.email = projectUser.email
            this.role = projectUser.role
            this.addedAt = projectUser.addedAt
            additionalProperties(projectUser.additionalProperties)
        }

        /** The object type, which is always `organization.project.user` */
        fun object_(object_: Object) = object_(JsonField.of(object_))

        /** The object type, which is always `organization.project.user` */
        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<Object>) = apply { this.object_ = object_ }

        /** The identifier, which can be referenced in API endpoints */
        fun id(id: String) = id(JsonField.of(id))

        /** The identifier, which can be referenced in API endpoints */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The name of the user */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the user */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The email address of the user */
        fun email(email: String) = email(JsonField.of(email))

        /** The email address of the user */
        @JsonProperty("email")
        @ExcludeMissing
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** `owner` or `member` */
        fun role(role: Role) = role(JsonField.of(role))

        /** `owner` or `member` */
        @JsonProperty("role")
        @ExcludeMissing
        fun role(role: JsonField<Role>) = apply { this.role = role }

        /** The Unix timestamp (in seconds) of when the project was added. */
        fun addedAt(addedAt: Long) = addedAt(JsonField.of(addedAt))

        /** The Unix timestamp (in seconds) of when the project was added. */
        @JsonProperty("added_at")
        @ExcludeMissing
        fun addedAt(addedAt: JsonField<Long>) = apply { this.addedAt = addedAt }

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

        fun build(): ProjectUser =
            ProjectUser(
                object_,
                id,
                name,
                email,
                role,
                addedAt,
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

            val ORGANIZATION_PROJECT_USER = Object(JsonField.of("organization.project.user"))

            fun of(value: String) = Object(JsonField.of(value))
        }

        enum class Known {
            ORGANIZATION_PROJECT_USER,
        }

        enum class Value {
            ORGANIZATION_PROJECT_USER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ORGANIZATION_PROJECT_USER -> Value.ORGANIZATION_PROJECT_USER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ORGANIZATION_PROJECT_USER -> Known.ORGANIZATION_PROJECT_USER
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

        return /* spotless:off */ other is ProjectUser && this.object_ == other.object_ && this.id == other.id && this.name == other.name && this.email == other.email && this.role == other.role && this.addedAt == other.addedAt && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(object_, id, name, email, role, addedAt, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ProjectUser{object_=$object_, id=$id, name=$name, email=$email, role=$role, addedAt=$addedAt, additionalProperties=$additionalProperties}"
}
