// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectApiKeyTest {

    @Test
    fun createProjectApiKey() {
        val projectApiKey =
            ProjectApiKey.builder()
                .id("id")
                .createdAt(123L)
                .name("name")
                .object_(ProjectApiKey.Object.ORGANIZATION_PROJECT_API_KEY)
                .owner(
                    ProjectApiKey.Owner.builder()
                        .serviceAccount(
                            ProjectServiceAccount.builder()
                                .id("id")
                                .createdAt(123L)
                                .name("name")
                                .object_(
                                    ProjectServiceAccount.Object
                                        .ORGANIZATION_PROJECT_SERVICE_ACCOUNT
                                )
                                .role(ProjectServiceAccount.Role.OWNER)
                                .build()
                        )
                        .type(ProjectApiKey.Owner.Type.USER)
                        .user(
                            ProjectUser.builder()
                                .id("id")
                                .addedAt(123L)
                                .email("email")
                                .name("name")
                                .object_(ProjectUser.Object.ORGANIZATION_PROJECT_USER)
                                .role(ProjectUser.Role.OWNER)
                                .build()
                        )
                        .build()
                )
                .redactedValue("redacted_value")
                .build()
        assertThat(projectApiKey).isNotNull
        assertThat(projectApiKey.id()).isEqualTo("id")
        assertThat(projectApiKey.createdAt()).isEqualTo(123L)
        assertThat(projectApiKey.name()).isEqualTo("name")
        assertThat(projectApiKey.object_())
            .isEqualTo(ProjectApiKey.Object.ORGANIZATION_PROJECT_API_KEY)
        assertThat(projectApiKey.owner())
            .isEqualTo(
                ProjectApiKey.Owner.builder()
                    .serviceAccount(
                        ProjectServiceAccount.builder()
                            .id("id")
                            .createdAt(123L)
                            .name("name")
                            .object_(
                                ProjectServiceAccount.Object.ORGANIZATION_PROJECT_SERVICE_ACCOUNT
                            )
                            .role(ProjectServiceAccount.Role.OWNER)
                            .build()
                    )
                    .type(ProjectApiKey.Owner.Type.USER)
                    .user(
                        ProjectUser.builder()
                            .id("id")
                            .addedAt(123L)
                            .email("email")
                            .name("name")
                            .object_(ProjectUser.Object.ORGANIZATION_PROJECT_USER)
                            .role(ProjectUser.Role.OWNER)
                            .build()
                    )
                    .build()
            )
        assertThat(projectApiKey.redactedValue()).isEqualTo("redacted_value")
    }
}
