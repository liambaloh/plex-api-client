package com.limalime.plexapi.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Track(
    @JacksonXmlProperty(localName = "ratingKey", isAttribute = true) val ratingKey: Int? = null,
    @JacksonXmlProperty(localName = "key", isAttribute = true) val key: String? = null,
    @JacksonXmlProperty(localName = "parentRatingKey", isAttribute = true) val parentRatingKey: Int? = null,
    @JacksonXmlProperty(localName = "grandparentRatingKey", isAttribute = true) val grandparentRatingKey: Int? = null,
    @JacksonXmlProperty(localName = "guid", isAttribute = true) val guid: String? = null,
    @JacksonXmlProperty(localName = "parentGuid", isAttribute = true) val parentGuid: String? = null,
    @JacksonXmlProperty(localName = "grandparentGuid", isAttribute = true) val grandparentGuid: String? = null,
    @JacksonXmlProperty(localName = "parentStudio", isAttribute = true) val parentStudio: String? = null,
    @JacksonXmlProperty(localName = "type", isAttribute = true) val type: String? = null,
    @JacksonXmlProperty(localName = "title", isAttribute = true) val title: String? = null,
    @JacksonXmlProperty(localName = "grandparentKey", isAttribute = true) val grandparentKey: String? = null,
    @JacksonXmlProperty(localName = "parentKey", isAttribute = true) val parentKey: String? = null,
    @JacksonXmlProperty(localName = "grandparentTitle", isAttribute = true) val grandparentTitle: String? = null,
    @JacksonXmlProperty(localName = "parentTitle", isAttribute = true) val parentTitle: String? = null,
    @JacksonXmlProperty(localName = "summary", isAttribute = true) val summary: String? = null,
    @JacksonXmlProperty(localName = "index", isAttribute = true) val index: Int? = null,
    @JacksonXmlProperty(localName = "parentIndex", isAttribute = true) val parentIndex: Int? = null,
    @JacksonXmlProperty(localName = "ratingCount", isAttribute = true) val ratingCount: Int? = null,
    @JacksonXmlProperty(localName = "parentYear", isAttribute = true) val parentYear: Int? = null,
    @JacksonXmlProperty(localName = "thumb", isAttribute = true) val thumb: String? = null,
    @JacksonXmlProperty(localName = "art", isAttribute = true) val art: String? = null,
    @JacksonXmlProperty(localName = "parentThumb", isAttribute = true) val parentThumb: String? = null,
    @JacksonXmlProperty(localName = "grandparentThumb", isAttribute = true) val grandparentThumb: String? = null,
    @JacksonXmlProperty(localName = "grandparentArt", isAttribute = true) val grandparentArt: String? = null,
    @JacksonXmlProperty(localName = "duration", isAttribute = true) val duration: Int? = null,
    @JacksonXmlProperty(localName = "addedAt", isAttribute = true) val addedAt: Long? = null,
    @JacksonXmlProperty(localName = "updatedAt", isAttribute = true) val updatedAt: Long? = null,
    @JacksonXmlProperty(localName = "musicAnalysisVersion", isAttribute = true) val musicAnalysisVersion: Int? = null,
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Media") val media: List<Media>? = null
)
