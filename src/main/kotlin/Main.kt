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
        libraries.directory.forEachIndexed { index, directory ->
            println("$index -> ${directory.title} (Key: ${directory.key}, type: ${directory.type})")
        }


        libraries.directory.forEachIndexed { libraryIndex, libraryDirectory ->
            println("# ${libraryDirectory.title}")
            when (libraryDirectory.type) {
                "movie" -> {
                    println("## Films")
                    val series = plexApi.getFilms(libraryDirectory.key!!.toInt())
                    series.videos.forEachIndexed { videoIndex, videoDirectory ->
                        println(" * Film $videoIndex -> ${videoDirectory.title}")
                    }
                }

                "show" -> {
                    println("## Series")
                    val series = plexApi.getSeries(libraryDirectory.key!!.toInt())
                    series.directory.forEachIndexed { seriesIndex, seriesDirectory ->
                        println(" * Series $seriesIndex -> ${seriesDirectory.title}")
                    }
                }

                "artist" -> {
                    println("## Artists")
                    val artists = plexApi.getArtists(libraryDirectory.key!!.toInt())
                    artists.directory.forEachIndexed { albumIndex, albumDirectory ->
                        println(" * Artist $albumIndex -> ${albumDirectory.title}")
                    }

                    println("## Albums")
                    val albums = plexApi.getAlbums(libraryDirectory.key.toInt())
                    albums.directory.forEachIndexed { albumIndex, albumDirectory ->
                        println(" * Album $albumIndex -> ${albumDirectory.title}")
                    }
                }
            }
        }

    } catch (e: Exception) {
        // handle exception
        throw e
    }
}