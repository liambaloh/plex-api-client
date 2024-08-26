package com.limalime.plexapi

import com.limalime.plexapi.plexapi.PlexApi
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
                        println(" | Film $videoIndex -> ${videoDirectory.title} (Key: ${videoDirectory.ratingKey})")
                        val metadata = plexApi.getFilmMetadata(videoDirectory.ratingKey!!.toInt())
                        println(" | |-> ${metadata.videos?.firstOrNull()?.summary}")
                    }
                }

                "show" -> {
                    println("## Series")
                    val series = plexApi.getSeries(libraryDirectory.key!!.toInt())
                    series.directory.forEachIndexed { seriesIndex, seriesDirectory ->
                        println(" | Series $seriesIndex -> ${seriesDirectory.title} (Key: ${seriesDirectory.ratingKey})")
                        val seriesMetadata = plexApi.getSeriesMetadata(seriesDirectory.ratingKey!!.toInt())
                        println(" | * ${seriesMetadata.directories?.firstOrNull()?.summary}")
                        val seasonsMetadata = plexApi.getSeriesSeasons(seriesDirectory.ratingKey!!.toInt())
                        seasonsMetadata.directories?.forEachIndexed{ seasonIndex, seasonDirectory ->
                            println(" | |-> ${seasonDirectory.title} (Key: ${seasonDirectory.ratingKey})")
                            if(seasonDirectory.ratingKey != null){
                                val seasonMetadata = plexApi.getSeasonMetadata(seasonDirectory.ratingKey!!.toInt())
                                println(" | | * ${seasonMetadata.directories?.firstOrNull()?.summary}")
                                val episodesMetadata = plexApi.getSeasonEpisodes(seasonDirectory.ratingKey!!.toInt())
                                episodesMetadata.videos?.forEachIndexed{ episodeIndex, episodeDirectory ->
                                    println(" | | |-> ${episodeDirectory.title} (Key: ${episodeDirectory.ratingKey})")
                                }
                            }
                        }
                    }
                }

                "artist" -> {
                    println("## Artists")
                    val artists = plexApi.getArtists(libraryDirectory.key!!.toInt())
                    artists.directory.forEachIndexed { albumIndex, albumDirectory ->
                        println(" * Artist $albumIndex -> ${albumDirectory.title} (Key: ${albumDirectory.ratingKey})")
                    }

                    println("## Albums")
                    val albums = plexApi.getAlbums(libraryDirectory.key.toInt())
                    albums.directory.forEachIndexed { albumIndex, albumDirectory ->
                        println(" * Album $albumIndex -> ${albumDirectory.title} (Key: ${albumDirectory.ratingKey})")
                    }
                }
            }
        }

    } catch (e: Exception) {
        // handle exception
        throw e
    }
}