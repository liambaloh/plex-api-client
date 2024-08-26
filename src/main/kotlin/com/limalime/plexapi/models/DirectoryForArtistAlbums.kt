package com.limalime.plexapi.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class DirectoryForArtistAlbums(
    @JacksonXmlProperty(localName = "ratingKey", isAttribute = true) val ratingKey: Int? = null,
    @JacksonXmlProperty(localName = "key", isAttribute = true) val key: String? = null,
    @JacksonXmlProperty(localName = "parentRatingKey", isAttribute = true) val parentRatingKey: Int? = null,
    @JacksonXmlProperty(localName = "guid", isAttribute = true) val guid: String? = null,
    @JacksonXmlProperty(localName = "parentGuid", isAttribute = true) val parentGuid: String? = null,
    @JacksonXmlProperty(localName = "studio", isAttribute = true) val studio: String? = null,
    @JacksonXmlProperty(localName = "type", isAttribute = true) val type: String? = null,
    @JacksonXmlProperty(localName = "title", isAttribute = true) val title: String? = null,
    @JacksonXmlProperty(localName = "parentKey", isAttribute = true) val parentKey: String? = null,
    @JacksonXmlProperty(localName = "parentTitle", isAttribute = true) val parentTitle: String? = null,
    @JacksonXmlProperty(localName = "summary", isAttribute = true) val summary: String? = null,
    @JacksonXmlProperty(localName = "index", isAttribute = true) val index: Int? = null,
    @JacksonXmlProperty(localName = "rating", isAttribute = true) val rating: Double? = null,
    @JacksonXmlProperty(localName = "year", isAttribute = true) val year: Int? = null,
    @JacksonXmlProperty(localName = "thumb", isAttribute = true) val thumb: String? = null,
    @JacksonXmlProperty(localName = "art", isAttribute = true) val art: String? = null,
    @JacksonXmlProperty(localName = "parentThumb", isAttribute = true) val parentThumb: String? = null,
    @JacksonXmlProperty(localName = "originallyAvailableAt", isAttribute = true) val originallyAvailableAt: String? = null,
    @JacksonXmlProperty(localName = "addedAt", isAttribute = true) val addedAt: Long? = null,
    @JacksonXmlProperty(localName = "updatedAt", isAttribute = true) val updatedAt: Long? = null,
    @JacksonXmlProperty(localName = "loudnessAnalysisVersion", isAttribute = true) val loudnessAnalysisVersion: Int? = null,
    @JacksonXmlProperty(localName = "musicAnalysisVersion", isAttribute = true) val musicAnalysisVersion: Int? = null,
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Genre") val genres: List<Genre>? = null,
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Collection") val collections: List<Collection>? = null
)
