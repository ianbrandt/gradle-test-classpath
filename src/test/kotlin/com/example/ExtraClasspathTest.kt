package com.example

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExtraClasspathTest {

    @Test
    fun `test extra classpath`() {

        val inputStream =
            object {}.javaClass.getResourceAsStream("/testing.txt")

        assertThat(inputStream).isNotNull

        val lines =
            inputStream!!.bufferedReader().readLines().joinToString("\n")

        assertThat(lines).containsIgnoringCase("Testing")
    }
}
