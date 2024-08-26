package com.limalime.plexapi.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Media(
    @JacksonXmlProperty(localName = "id", isAttribute = true) val id: String? = null,
    @JacksonXmlProperty(localName = "duration", isAttribute = true) val duration: Long? = null,
    @JacksonXmlProperty(localName = "bitrate", isAttribute = true) val bitrate: Int? = null,
    @JacksonXmlProperty(localName = "width", isAttribute = true) val width: Int? = null,
    @JacksonXmlProperty(localName = "height", isAttribute = true) val height: Int? = null,
    @JacksonXmlProperty(localName = "aspectRatio", isAttribute = true) val aspectRatio: Double? = null,
    @JacksonXmlProperty(localName = "audioChannels", isAttribute = true) val audioChannels: Int? = null,
    @JacksonXmlProperty(localName = "audioCodec", isAttribute = true) val audioCodec: String? = null,
    @JacksonXmlProperty(localName = "videoCodec", isAttribute = true) val videoCodec: String? = null,
    @JacksonXmlProperty(localName = "videoResolution", isAttribute = true) val videoResolution: String? = null,
    @JacksonXmlProperty(localName = "container", isAttribute = true) val container: String? = null,
    @JacksonXmlProperty(localName = "videoFrameRate", isAttribute = true) val videoFrameRate: String? = null,
    @JacksonXmlProperty(localName = "audioProfile", isAttribute = true) val audioProfile: String? = null,
    @JacksonXmlProperty(localName = "videoProfile", isAttribute = true) val videoProfile: String? = null,
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Part") val parts: List<Part>? = emptyList()
)