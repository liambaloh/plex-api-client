package com.limalime.plexapi.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "MediaContainer")
data class MediaContainerForLibraryFilms(
    @JacksonXmlProperty(localName = "size", isAttribute = true) val size: Int? = null,
    @JacksonXmlProperty(localName = "allowSync", isAttribute = true) val allowSync: Int? = null,
    @JacksonXmlProperty(localName = "art", isAttribute = true) val art: String? = null,
    @JacksonXmlProperty(localName = "identifier", isAttribute = true) val identifier: String? = null,
    @JacksonXmlProperty(localName = "librarySectionID", isAttribute = true) val librarySectionID: String? = null,
    @JacksonXmlProperty(localName = "librarySectionTitle", isAttribute = true) val librarySectionTitle: String? = null,
    @JacksonXmlProperty(localName = "librarySectionUUID", isAttribute = true) val librarySectionUUID: String? = null,
    @JacksonXmlProperty(localName = "mediaTagPrefix", isAttribute = true) val mediaTagPrefix: String? = null,
    @JacksonXmlProperty(localName = "mediaTagVersion", isAttribute = true) val mediaTagVersion: Long? = null,
    @JacksonXmlProperty(localName = "thumb", isAttribute = true) val thumb: String? = null,
    @JacksonXmlProperty(localName = "title1", isAttribute = true) val title1: String? = null,
    @JacksonXmlProperty(localName = "title2", isAttribute = true) val title2: String? = null,
    @JacksonXmlProperty(localName = "viewGroup", isAttribute = true) val viewGroup: String? = null,
    @JacksonXmlProperty(localName = "viewMode", isAttribute = true) val viewMode: Int? = null,
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Video") private val _videos: List<Video>? = null
) {
    val videos: List<Video>
        get() = _videos ?: emptyList()
}