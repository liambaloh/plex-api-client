package com.limalime.plexapi.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Director(
    @JacksonXmlProperty(localName = "id", isAttribute = true) val id: Int? = null,
    @JacksonXmlProperty(localName = "filter", isAttribute = true) val filter: String? = null,
    @JacksonXmlProperty(localName = "tag", isAttribute = true) val tag: String? = null,
    @JacksonXmlProperty(localName = "tagKey", isAttribute = true) val tagKey: String? = null,
    @JacksonXmlProperty(localName = "thumb", isAttribute = true) val thumb: String? = null
)