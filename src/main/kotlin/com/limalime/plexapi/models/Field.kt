package com.limalime.plexapi.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Field(
    @JacksonXmlProperty(localName = "locked", isAttribute = true) val locked: Int? = null,
    @JacksonXmlProperty(localName = "name", isAttribute = true) val name: String? = null
)