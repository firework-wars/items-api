plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.paper)
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(kotlin("stdlib"))
    paperweight.paperDevBundle("26.3.build.+")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

version = providers.exec {
    commandLine("git", "describe", "--tags", "--always", "--dirty")
    workingDir = projectDir
    isIgnoreExitValue = true
}.standardOutput.asText.get().trim()