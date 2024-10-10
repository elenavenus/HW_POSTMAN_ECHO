plugins {
    id("java")
}

group = "ru.netologia"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

dependencies {
    testImplementation ("io.rest-assured:rest-assured:5.3.1")
    testImplementation ("org.junit.jupiter:junit-jupiter:5.6.1")
    testImplementation ("io.rest-assured:json-schema-validator:4.3.1")
}

tasks.test {
    useJUnitPlatform()
}