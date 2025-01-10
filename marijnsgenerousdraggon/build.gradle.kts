plugins {
    java
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "com.marijn.generousdraggon1"
version = "1.0.2-MC1.21.4"
description = "A plugin that makes the Ender Dragon drop an Elytra."


java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.4-R0.1-SNAPSHOT")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}
