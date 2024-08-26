package com.limalime.plexapi.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class DirectoryForLibraries(
    @JacksonXmlProperty(localName = "allowSync", isAttribute = true) val allowSync: Int? = null,
    @JacksonXmlProperty(localName = "art", isAttribute = true) val art: String? = null,
    @JacksonXmlProperty(localName = "composite", isAttribute = true) val composite: String? = null,
    @JacksonXmlProperty(localName = "filters", isAttribute = true) val filters: Int? = null,
    @JacksonXmlProperty(localName = "refreshing", isAttribute = true) val refreshing: Int? = null,
    @JacksonXmlProperty(localName = "thumb", isAttribute = true) val thumb: String? = null,
    @JacksonXmlProperty(localName = "key", isAttribute = true) val key: Int? = null,
    @JacksonXmlProperty(localName = "type", isAttribute = true) val type: String? = null,
    @JacksonXmlProperty(localName = "title", isAttribute = true) val title: String? = null,
    @JacksonXmlProperty(localName = "agent", isAttribute = true) val agent: String? = null,
    @JacksonXmlProperty(localName = "scanner", isAttribute = true) val scanner: String? = null,
    @JacksonXmlProperty(localName = "language", isAttribute = true) val language: String? = null,
    @JacksonXmlProperty(localName = "uuid", isAttribute = true) val uuid: String? = null,
    @JacksonXmlProperty(localName = "updatedAt", isAttribute = true) val updatedAt: Long? = null,
    @JacksonXmlProperty(localName = "createdAt", isAttribute = true) val createdAt: Long? = null,
    @JacksonXmlProperty(localName = "scannedAt", isAttribute = true) val scannedAt: Long? = null,
    @JacksonXmlProperty(localName = "content", isAttribute = true) val content: Int? = null,
    @JacksonXmlProperty(localName = "directory", isAttribute = true) val directory: Int? = null,
    @JacksonXmlProperty(localName = "contentChangedAt", isAttribute = true) val contentChangedAt: Long? = null,
    @JacksonXmlProperty(localName = "hidden", isAttribute = true) val hidden: Int? = null,
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Location") val locations: List<Location>? = emptyList()
)