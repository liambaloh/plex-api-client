package com.limalime.plexapi.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "MediaContainer")
data class MediaContainerForSeasonEpisodes(
    @JacksonXmlProperty(localName = "size", isAttribute = true) val size: Int? = null,
    @JacksonXmlProperty(localName = "allowSync", isAttribute = true) val allowSync: Int? = null,
    @JacksonXmlProperty(localName = "art", isAttribute = true) val art: String? = null,
    @JacksonXmlProperty(localName = "grandparentContentRating", isAttribute = true) val grandparentContentRating: String? = null,
    @JacksonXmlProperty(localName = "grandparentRatingKey", isAttribute = true) val grandparentRatingKey: Int? = null,
    @JacksonXmlProperty(localName = "grandparentStudio", isAttribute = true) val grandparentStudio: String? = null,
    @JacksonXmlProperty(localName = "grandparentTheme", isAttribute = true) val grandparentTheme: String? = null,
    @JacksonXmlProperty(localName = "grandparentThumb", isAttribute = true) val grandparentThumb: String? = null,
    @JacksonXmlProperty(localName = "grandparentTitle", isAttribute = true) val grandparentTitle: String? = null,
    @JacksonXmlProperty(localName = "identifier", isAttribute = true) val identifier: String? = null,
    @JacksonXmlProperty(localName = "key", isAttribute = true) val key: String? = null,
    @JacksonXmlProperty(localName = "librarySectionID", isAttribute = true) val librarySectionID: Int? = null,
    @JacksonXmlProperty(localName = "librarySectionTitle", isAttribute = true) val librarySectionTitle: String? = null,
    @JacksonXmlProperty(localName = "librarySectionUUID", isAttribute = true) val librarySectionUUID: String? = null,
    @JacksonXmlProperty(localName = "mediaTagPrefix", isAttribute = true) val mediaTagPrefix: String? = null,
    @JacksonXmlProperty(localName = "mediaTagVersion", isAttribute = true) val mediaTagVersion: Long? = null,
    @JacksonXmlProperty(localName = "nocache", isAttribute = true) val nocache: Int? = null,
    @JacksonXmlProperty(localName = "parentIndex", isAttribute = true) val parentIndex: Int? = null,
    @JacksonXmlProperty(localName = "parentTitle", isAttribute = true) val parentTitle: String? = null,
    @JacksonXmlProperty(localName = "parentYear", isAttribute = true) val parentYear: Int? = null,
    @JacksonXmlProperty(localName = "summary", isAttribute = true) val summary: String? = null,
    @JacksonXmlProperty(localName = "theme", isAttribute = true) val theme: String? = null,
    @JacksonXmlProperty(localName = "thumb", isAttribute = true) val thumb: String? = null,
    @JacksonXmlProperty(localName = "title1", isAttribute = true) val title1: String? = null,
    @JacksonXmlProperty(localName = "title2", isAttribute = true) val title2: String? = null,
    @JacksonXmlProperty(localName = "viewGroup", isAttribute = true) val viewGroup: String? = null,
    @JacksonXmlProperty(localName = "viewMode", isAttribute = true) val viewMode: Int? = null,
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Video") val videos: List<Video>? = null
)