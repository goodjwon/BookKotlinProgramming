plugins {
    kotlin("jvm") version "1.9.24" // Kotlin version to use
}

group = "com.programming.kotlin"
version = "1.0-SNAPSHOT" // Version to assign to the built artifact

repositories { // Sources of dependencies. See 1️⃣
    mavenCentral() // Maven Central Repository. See 2️⃣
}

dependencies { // All the libraries you want to use. See 3️⃣
    // Copy dependencies' names after you find them in a repository
    testImplementation(kotlin("test")) // The Kotlin test library
}

tasks.test { // See 4️⃣
    useJUnitPlatform() // JUnitPlatform for tests. See 5️⃣
}