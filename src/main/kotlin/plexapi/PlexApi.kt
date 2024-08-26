package com.productmadness.plexapi

import MediaContainerForLibraries
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class PlexApi(private val url: String, private val token: String) {
    val client = HttpClient
        .newBuilder()
        .build()

    fun getLibraries(): MediaContainerForLibraries {
        val request = HttpRequest.newBuilder()
            .uri(URI.create("$url/library/sections"))
            .header("X-Plex-Token", token)
            .GET()
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        val xml = response.body()

        val xmlMapper = XmlMapper()
        return xmlMapper.readValue(xml, MediaContainerForLibraries::class.java)
    }

}