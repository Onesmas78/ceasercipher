plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.12")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
}

tasks.test {
    useJUnitPlatform()
}