plugins {
    id("java")
    id("war")
}

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("jakarta.servlet:jakarta.servlet-api:6.0.0")
    compileOnly("org.slf4j:slf4j-log4j12:2.0.5")
}

tasks.test {
    useJUnitPlatform()
}