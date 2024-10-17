// File generated from our OpenAPI spec by Stainless.

package com.omnistack.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProjectUserTest {

    @Test
    fun createProjectUser() {
        val projectUser =
            ProjectUser.builder()
                .id("id")
                .addedAt(123L)
                .email("email")
                .name("name")
                .object_(ProjectUser.Object.ORGANIZATION_PROJECT_USER)
                .role(ProjectUser.Role.OWNER)
                .build()
        assertThat(projectUser).isNotNull
        assertThat(projectUser.id()).isEqualTo("id")
        assertThat(projectUser.addedAt()).isEqualTo(123L)
        assertThat(projectUser.email()).isEqualTo("email")
        assertThat(projectUser.name()).isEqualTo("name")
        assertThat(projectUser.object_()).isEqualTo(ProjectUser.Object.ORGANIZATION_PROJECT_USER)
        assertThat(projectUser.role()).isEqualTo(ProjectUser.Role.OWNER)
    }
}
