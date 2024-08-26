package com.limalime.plexapi.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class DirectoryForLibraryAlbums(
    @JacksonXmlProperty(localName = "ratingKey", isAttribute = true) val ratingKey: String? = null,
    @JacksonXmlProperty(localName = "key", isAttribute = true) val key: String? = null,
    @JacksonXmlProperty(localName = "guid", isAttribute = true) val guid: String? = null,
    @JacksonXmlProperty(localName = "type", isAttribute = true) val type: String? = null,
    @JacksonXmlProperty(localName = "title", isAttribute = true) val title: String? = null,
    @JacksonXmlProperty(localName = "summary", isAttribute = true) val summary: String? = null,
    @JacksonXmlProperty(localName = "index", isAttribute = true) val index: Int? = null,
    @JacksonXmlProperty(localName = "addedAt", isAttribute = true) val addedAt: Long? = null,
    @JacksonXmlProperty(localName = "updatedAt", isAttribute = true) val updatedAt: Long? = null,
    @JacksonXmlProperty(localName = "viewCount", isAttribute = true) val viewCount: Int? = null,
    @JacksonXmlProperty(localName = "lastViewedAt", isAttribute = true) val lastViewedAt: Long? = null,
    @JacksonXmlProperty(localName = "thumb", isAttribute = true) val thumb: String? = null,
    @JacksonXmlProperty(localName = "art", isAttribute = true) val art: String? = null,
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Genre") val genres: List<Genre>? = emptyList(),
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Country") val countries: List<Country>? = emptyList()
)