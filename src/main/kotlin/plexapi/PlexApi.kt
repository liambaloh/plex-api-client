package com.productmadness.plexapi

import MediaContainerForLibraries
import MediaContainerForLibraryAlbums
import MediaContainerForLibraryArtists
import MediaContainerForLibraryFilms
import MediaContainerForLibrarySeries
import MediaContainerForMetadata
import MediaContainerForSeriesSeasons
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

    fun getAlbums(libraryId: Int): MediaContainerForLibraryAlbums {
        val request = HttpRequest.newBuilder()
            .uri(URI.create("$url/library/sections/$libraryId/search?type=9"))
            .header("X-Plex-Token", token)
            .GET()
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        val xml = response.body()

        val xmlMapper = XmlMapper()
        return xmlMapper.readValue(xml, MediaContainerForLibraryAlbums::class.java)
    }

    fun getArtists(libraryId: Int): MediaContainerForLibraryArtists {
        val request = HttpRequest.newBuilder()
            .uri(URI.create("$url/library/sections/$libraryId/all"))
            .header("X-Plex-Token", token)
            .GET()
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        val xml = response.body()

        val xmlMapper = XmlMapper()
        return xmlMapper.readValue(xml, MediaContainerForLibraryArtists::class.java)
    }

    fun getSeries(libraryId: Int): MediaContainerForLibrarySeries {
        val request = HttpRequest.newBuilder()
            .uri(URI.create("$url/library/sections/$libraryId/all"))
            .header("X-Plex-Token", token)
            .GET()
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        val xml = response.body()

        val xmlMapper = XmlMapper()
        return xmlMapper.readValue(xml, MediaContainerForLibrarySeries::class.java)
    }

    fun getFilms(libraryId: Int): MediaContainerForLibraryFilms {
        val request = HttpRequest.newBuilder()
            .uri(URI.create("$url/library/sections/$libraryId/all"))
            .header("X-Plex-Token", token)
            .GET()
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        val xml = response.body()

        val xmlMapper = XmlMapper()
        return xmlMapper.readValue(xml, MediaContainerForLibraryFilms::class.java)
    }

    fun getMetadata(ratingKey: Int): MediaContainerForMetadata {
        val request = HttpRequest.newBuilder()
            .uri(URI.create("$url/library/metadata/$ratingKey"))
            .header("X-Plex-Token", token)
            .GET()
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        val xml = response.body()

        val xmlMapper = XmlMapper()
        return xmlMapper.readValue(xml, MediaContainerForMetadata::class.java)
    }

    fun getSeriesSeasons(ratingKey: Int): MediaContainerForSeriesSeasons {
        val request = HttpRequest.newBuilder()
            .uri(URI.create("$url/library/metadata/$ratingKey/children"))
            .header("X-Plex-Token", token)
            .GET()
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        val xml = response.body()

        val xmlMapper = XmlMapper()
        return xmlMapper.readValue(xml, MediaContainerForSeriesSeasons::class.java)
    }

}