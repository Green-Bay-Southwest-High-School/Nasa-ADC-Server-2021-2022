plugins {
    kotlin("jvm") version "1.5.31"
    java
}

group = "org.southwest.nasa.adc.server"
version = File("$buildDir/resources/main/VERSION").readLines()

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    // Base Kotlin Implmentation
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.31")
    // Event handler (Global Bus)
    implementation("com.github.Kosert.FlowBus:FlowBus:1.1")
    // Server Lib
    implementation("io.javalin:javalin:4.1.1")
    // JSON Creation and Read
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.12.5")
    // Logger Lib
    implementation("ch.qos.logback:logback-classic:1.2.5")
    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2-native-mt")
    // CSV Handler
    implementation("com.github.doyaaaaaken:kotlin-csv-jvm:1.1.0")
}
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "16"
}
//fun <Task> createProperties(dependsOn: ProcessResources) {
//    File("$buildDir/resources/main/version.properties") w ->
//        Properties p = new Properties()
//        p['version'] = project.version.toString()
//        p.store w, null
//}
