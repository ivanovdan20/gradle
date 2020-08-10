plugins {
    java
}

version = "1.0.2"
group = "org.gradle.sample"

repositories {
    jcenter()
}

tasks.test.configure {
    useJUnitPlatform()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}
