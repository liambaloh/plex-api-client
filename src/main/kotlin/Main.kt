package com.productmadness

import MediaContainer
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import java.io.FileInputStream
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.util.*

fun main() {
    try {
        // Load configuration
        val properties = Properties()
        properties.load(FileInputStream("config.properties"))
        val url = properties.getProperty("url")
        val token = properties.getProperty("token")

        val client = HttpClient.newBuilder().build()
        val request = HttpRequest.newBuilder()
            .uri(URI.create("$url/library/sections"))
            .header("X-Plex-Token", token)
            .GET()
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        val xml = response.body()

        val xmlMapper = XmlMapper()
        val mediaContainer = xmlMapper.readValue(xml, MediaContainer::class.java)

        mediaContainer.directory.forEach { directory ->
            println(directory.title)
        }

    } catch (e: Exception) {
        // handle exception
        throw e
    }
}