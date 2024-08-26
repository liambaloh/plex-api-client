package com.limalime.plexapi.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "MediaContainer")
data class MediaContainerForSeriesMetadata(
    @JacksonXmlProperty(localName = "size", isAttribute = true) val size: Int? = null,
    @JacksonXmlProperty(localName = "allowSync", isAttribute = true) val allowSync: Int? = null,
    @JacksonXmlProperty(localName = "identifier", isAttribute = true) val identifier: String? = null,
    @JacksonXmlProperty(localName = "librarySectionID", isAttribute = true) val librarySectionID: Int? = null,
    @JacksonXmlProperty(localName = "librarySectionTitle", isAttribute = true) val librarySectionTitle: String? = null,
    @JacksonXmlProperty(localName = "librarySectionUUID", isAttribute = true) val librarySectionUUID: String? = null,
    @JacksonXmlProperty(localName = "mediaTagPrefix", isAttribute = true) val mediaTagPrefix: String? = null,
    @JacksonXmlProperty(localName = "mediaTagVersion", isAttribute = true) val mediaTagVersion: Long? = null,
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Directory") val directories: List<DirectoryForSeriesMetadata>? = null
)