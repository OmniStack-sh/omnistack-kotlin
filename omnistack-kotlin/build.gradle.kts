plugins {
    id("omnistack.kotlin")
    id("omnistack.publish")
}

dependencies {
    api(project(":omnistack-kotlin-client-okhttp"))
}
