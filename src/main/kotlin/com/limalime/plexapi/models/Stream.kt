package com.limalime.plexapi.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Stream(
    @JacksonXmlProperty(localName = "id", isAttribute = true) val id: String? = null,
    @JacksonXmlProperty(localName = "streamType", isAttribute = true) val streamType: String? = null,
    @JacksonXmlProperty(localName = "codec", isAttribute = true) val codec: String? = null,
    @JacksonXmlProperty(localName = "index", isAttribute = true) val index: String? = null,
    @JacksonXmlProperty(localName = "bitrate", isAttribute = true) val bitrate: String? = null,
    @JacksonXmlProperty(localName = "language", isAttribute = true) val language: String? = null,
    @JacksonXmlProperty(localName = "languageTag", isAttribute = true) val languageTag: String? = null,
    @JacksonXmlProperty(localName = "languageCode", isAttribute = true) val languageCode: String? = null,
    @JacksonXmlProperty(localName = "bitDepth", isAttribute = true) val bitDepth: String? = null,
    @JacksonXmlProperty(localName = "chromaLocation", isAttribute = true) val chromaLocation: String? = null,
    @JacksonXmlProperty(localName = "chromaSubsampling", isAttribute = true) val chromaSubsampling: String? = null,
    @JacksonXmlProperty(localName = "codedHeight", isAttribute = true) val codedHeight: String? = null,
    @JacksonXmlProperty(localName = "codedWidth", isAttribute = true) val codedWidth: String? = null,
    @JacksonXmlProperty(localName = "colorPrimaries", isAttribute = true) val colorPrimaries: String? = null,
    @JacksonXmlProperty(localName = "colorRange", isAttribute = true) val colorRange: String? = null,
    @JacksonXmlProperty(localName = "colorSpace", isAttribute = true) val colorSpace: String? = null,
    @JacksonXmlProperty(localName = "colorTrc", isAttribute = true) val colorTrc: String? = null,
    @JacksonXmlProperty(localName = "frameRate", isAttribute = true) val frameRate: String? = null,
    @JacksonXmlProperty(localName = "hasScalingMatrix", isAttribute = true) val hasScalingMatrix: String? = null,
    @JacksonXmlProperty(localName = "height", isAttribute = true) val height: String? = null,
    @JacksonXmlProperty(localName = "level", isAttribute = true) val level: String? = null,
    @JacksonXmlProperty(localName = "profile", isAttribute = true) val profile: String? = null,
    @JacksonXmlProperty(localName = "refFrames", isAttribute = true) val refFrames: String? = null,
    @JacksonXmlProperty(localName = "scanType", isAttribute = true) val scanType: String? = null,
    @JacksonXmlProperty(localName = "width", isAttribute = true) val width: String? = null,
    @JacksonXmlProperty(localName = "displayTitle", isAttribute = true) val displayTitle: String? = null,
    @JacksonXmlProperty(localName = "extendedDisplayTitle", isAttribute = true) val extendedDisplayTitle: String? = null,
    @JacksonXmlProperty(localName = "selected", isAttribute = true) val selected: Int? = null,
    @JacksonXmlProperty(localName = "default", isAttribute = true) val default: Int? = null,
    @JacksonXmlProperty(localName = "channels", isAttribute = true) val channels: Int? = null,
    @JacksonXmlProperty(localName = "samplingRate", isAttribute = true) val samplingRate: Int? = null,
    @JacksonXmlProperty(localName = "title", isAttribute = true) val title: String? = null
)