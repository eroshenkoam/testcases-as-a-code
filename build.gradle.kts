plugins {
    java
    id("io.qameta.allure") version "2.9.6"
}

group = "io.github.eroshenkoam.taac"
version = "1.0-SNAPSHOT"

allure {
    version.set("2.17.2")
    adapter {
        frameworks {
            junit5 {
                adapterVersion.set("2.17.2")
            }
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.qameta.allure:allure-java-commons:2.17.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.test {
    useJUnitPlatform()
}
