plugins {
    // The `test` task succeeds if "jvm-test-suite" is
    // applied before "extra-classpath-convention".
    id("extra-classpath-convention")
    id("jvm-test-suite")
    kotlin("jvm") version "1.9.23"
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.2"))

    testImplementation("org.assertj:assertj-core:3.25.3")
    testImplementation("org.junit.jupiter:junit-jupiter")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks {
    named<Test>("test") {
        useJUnitPlatform()
    }
}
