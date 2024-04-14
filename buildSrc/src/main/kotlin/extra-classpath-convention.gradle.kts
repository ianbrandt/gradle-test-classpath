afterEvaluate {

    tasks.withType<Test>().configureEach {

        val projectDirectory = layout.projectDirectory

        val extraDirectory = projectDirectory.dir("src/main/extra")

        // Append the extra source directory to the classpath.
        classpath += files(extraDirectory)
    }
}
