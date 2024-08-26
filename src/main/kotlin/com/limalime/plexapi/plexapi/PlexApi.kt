package com.limalime.plexapi.plexapi

import com.fasterxml.jackson.dataformat.xml.XmlMapper
import com.limalime.plexapi.models.*
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

    fun getSeasonEpisodes(ratingKey: Int): MediaContainerForSeasonEpisodes {
        val request = HttpRequest.newBuilder()
            .uri(URI.create("$url/library/metadata/$ratingKey/children"))
            .header("X-Plex-Token", token)
            .GET()
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        val xml = response.body()

        val xmlMapper = XmlMapper()
        return xmlMapper.readValue(xml, MediaContainerForSeasonEpisodes::class.java)
    }

    fun getArtistAlbums(libraryId: Int, ratingKey: Int): MediaContainerForArtistAlbums {
        val request = HttpRequest.newBuilder()
            .uri(URI.create("$url/library/sections/$libraryId/all?artist.id=$ratingKey&type=9"))
            .header("X-Plex-Token", token)
            .GET()
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        val xml = response.body()

        val xmlMapper = XmlMapper()
        return xmlMapper.readValue(xml, MediaContainerForArtistAlbums::class.java)
    }

    fun getFilmMetadata(ratingKey: Int): MediaContainerForFilmMetadata {
        val request = HttpRequest.newBuilder()
            .uri(URI.create("$url/library/metadata/$ratingKey"))
            .header("X-Plex-Token", token)
            .GET()
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        val xml = response.body()

        val xmlMapper = XmlMapper()
        return xmlMapper.readValue(xml, MediaContainerForFilmMetadata::class.java)
    }

    fun getSeriesMetadata(ratingKey: Int): MediaContainerForSeriesMetadata {
        val request = HttpRequest.newBuilder()
            .uri(URI.create("$url/library/metadata/$ratingKey"))
            .header("X-Plex-Token", token)
            .GET()
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        val xml = response.body()

        val xmlMapper = XmlMapper()
        return xmlMapper.readValue(xml, MediaContainerForSeriesMetadata::class.java)
    }

    fun getSeasonMetadata(ratingKey: Int): MediaContainerForSeasonMetadata {
        val request = HttpRequest.newBuilder()
            .uri(URI.create("$url/library/metadata/$ratingKey"))
            .header("X-Plex-Token", token)
            .GET()
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        val xml = response.body()

        val xmlMapper = XmlMapper()
        return xmlMapper.readValue(xml, MediaContainerForSeasonMetadata::class.java)
    }

    fun getEpisodeMetadata(ratingKey: Int): MediaContainerForEpisodeMetadata {
        val request = HttpRequest.newBuilder()
            .uri(URI.create("$url/library/metadata/$ratingKey"))
            .header("X-Plex-Token", token)
            .GET()
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        val xml = response.body()

        val xmlMapper = XmlMapper()
        return xmlMapper.readValue(xml, MediaContainerForEpisodeMetadata::class.java)
    }

}