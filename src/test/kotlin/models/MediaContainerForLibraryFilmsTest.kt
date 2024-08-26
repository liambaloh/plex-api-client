package models

import MediaContainerForLibraryFilms
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import org.junit.jupiter.api.Assertions.*
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.test.Test

class MediaContainerForLibraryFilmsTest{

    @Test
    fun testMediaContainerForLibraryFilmsParsing() {
        val sampleXml = """
            <MediaContainer size="1" allowSync="1" art="/:/resources/movie-fanart.jpg" identifier="com.plexapp.plugins.library" librarySectionID="2" librarySectionTitle="Anime" librarySectionUUID="12345678-1234-5678-1234-123456789abc" mediaTagPrefix="/system/bundle/media/flags/" mediaTagVersion="9876543210" thumb="/:/resources/movie.png" title1="Anime" title2="All Anime" viewGroup="movie" viewMode="12345">
                <Video ratingKey="1122" key="/library/metadata/1122" guid="plex://movie/1234567890abcdef01234567" studio="Example Studio" type="movie" title="Example Title" originalTitle="Example Original Title" contentRating="PG" summary="Example Description" rating="5.2" audienceRating="7.3" year="2021" tagline="Example Tagline" thumb="/library/metadata/1122/thumb/1234567890" art="/library/metadata/1122/art/1234567890" duration="7281823" originallyAvailableAt="2021-06-16" addedAt="1663195002" updatedAt="1724644193" audienceRatingImage="rottentomatoes://image.rating.upright" chapterSource="media" primaryExtraKey="/library/metadata/1122" ratingImage="rottentomatoes://image.rating.ripe">
                    <Genre tag="Adventure" />
                    <Genre tag="Drama" />
                    <Country tag="France" />
                    <Country tag="Japan" />
                    <Collection tag="DVD Library" />
                    <Director tag="Example Director" />
                    <Writer tag="Example Writer 1" />
                    <Writer tag="Example Writer 2" />
                    <Role tag="Example Role 1" />
                    <Role tag="Example Role 2" />
                    <Role tag="Example Role 3" />
                </Video>
            </MediaContainer>
        """.trimIndent()

        val xmlMapper = XmlMapper()
        val mediaContainer = xmlMapper.readValue(sampleXml, MediaContainerForLibraryFilms::class.java)

        assertNotNull(mediaContainer)
        assertEquals(1, mediaContainer.size)
        assertEquals("Anime", mediaContainer.librarySectionTitle)
        assertEquals(1, mediaContainer.videos.size)
        assertEquals("Example Title", mediaContainer.videos[0].title)
        assertEquals("Example Studio", mediaContainer.videos[0].studio)
    }

    @Test
    fun testMediaContainerForLibraryFilmsParsingOfEmptyList() {
        val sampleXml = """
            <?xml version="1.0" encoding="UTF-8"?>
            <MediaContainer size="0" allowSync="1" art="/:/resources/movie-fanart.jpg" identifier="com.plexapp.plugins.library" librarySectionID="11" librarySectionTitle="Homemade Films" librarySectionUUID="12345678-1234-5678-1234-123456789abc" mediaTagPrefix="/system/bundle/media/flags/" mediaTagVersion="9876543210" thumb="/:/resources/movie.png" title1="Homemade Films" title2="All Homemade Films" viewGroup="movie" viewMode="12345">
            
            </MediaContainer>
        """.trimIndent()

        val xmlMapper = XmlMapper()
        val mediaContainer = xmlMapper.readValue(sampleXml, MediaContainerForLibraryFilms::class.java)

        assertNotNull(mediaContainer)
        assertEquals(0, mediaContainer.size)
        assertEquals("Homemade Films", mediaContainer.librarySectionTitle)
        assertEquals(0, mediaContainer.videos.size)
    }

    @Test
    fun testMediaContainerForLibraryFilmsParsingForLargeFile() {
        val xmlPath = javaClass.getResource("/sample.xml")?.toURI()
        val sampleXml = Files.readString(Paths.get(xmlPath))

        val xmlMapper = XmlMapper()
        val mediaContainer = xmlMapper.readValue(sampleXml, MediaContainerForLibraryFilms::class.java)

        assertNotNull(mediaContainer)
    }
}