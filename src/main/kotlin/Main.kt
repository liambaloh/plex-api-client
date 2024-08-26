package com.productmadness

import com.productmadness.plexapi.PlexApi
import java.io.FileInputStream
import java.util.*

fun main() {
    try {
        // Load configuration
        val properties = Properties()
        properties.load(FileInputStream("config.properties"))
        val url = properties.getProperty("url")
        val token = properties.getProperty("token")

        val plexApi = PlexApi(url, token)
        val libraries = plexApi.getLibraries()

        println("Libraries")
        libraries.directory.forEach { directory ->
            println(directory.title)
        }
    } catch (e: Exception) {
        // handle exception
        throw e
    }
}