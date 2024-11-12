plugins {
    id("omnistack.kotlin")
    id("omnistack.publish")
}

dependencies {
    api(project(":omnistack-kotlin-core"))

    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.25.3")
}
