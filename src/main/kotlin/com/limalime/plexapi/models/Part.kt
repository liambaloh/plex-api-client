package com.limalime.plexapi.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Part(
    @JacksonXmlProperty(localName = "id", isAttribute = true) val id: String? = null,
    @JacksonXmlProperty(localName = "key", isAttribute = true) val key: String? = null,
    @JacksonXmlProperty(localName = "duration", isAttribute = true) val duration: Long? = null,
    @JacksonXmlProperty(localName = "file", isAttribute = true) val file: String? = null,
    @JacksonXmlProperty(localName = "size", isAttribute = true) val size: Long? = null,
    @JacksonXmlProperty(localName = "audioProfile", isAttribute = true) val audioProfile: String? = null,
    @JacksonXmlProperty(localName = "container", isAttribute = true) val container: String? = null,
    @JacksonXmlProperty(localName = "videoProfile", isAttribute = true) val videoProfile: String? = null,
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Stream") val streams: List<Stream>? = null
)