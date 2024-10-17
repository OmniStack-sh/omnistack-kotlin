// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectServiceAccountTest {

    @Test
    fun createProjectServiceAccount() {
        val projectServiceAccount =
            ProjectServiceAccount.builder()
                .id("id")
                .createdAt(123L)
                .name("name")
                .object_(ProjectServiceAccount.Object.ORGANIZATION_PROJECT_SERVICE_ACCOUNT)
                .role(ProjectServiceAccount.Role.OWNER)
                .build()
        assertThat(projectServiceAccount).isNotNull
        assertThat(projectServiceAccount.id()).isEqualTo("id")
        assertThat(projectServiceAccount.createdAt()).isEqualTo(123L)
        assertThat(projectServiceAccount.name()).isEqualTo("name")
        assertThat(projectServiceAccount.object_())
            .isEqualTo(ProjectServiceAccount.Object.ORGANIZATION_PROJECT_SERVICE_ACCOUNT)
        assertThat(projectServiceAccount.role()).isEqualTo(ProjectServiceAccount.Role.OWNER)
    }
}
