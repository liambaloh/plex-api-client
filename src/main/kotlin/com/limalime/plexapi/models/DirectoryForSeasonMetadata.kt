package com.limalime.plexapi.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class DirectoryForSeasonMetadata(
    @JacksonXmlProperty(localName = "ratingKey", isAttribute = true) val ratingKey: Int? = null,
    @JacksonXmlProperty(localName = "key", isAttribute = true) val key: String? = null,
    @JacksonXmlProperty(localName = "parentRatingKey", isAttribute = true) val parentRatingKey: Int? = null,
    @JacksonXmlProperty(localName = "guid", isAttribute = true) val guid: String? = null,
    @JacksonXmlProperty(localName = "parentGuid", isAttribute = true) val parentGuid: String? = null,
    @JacksonXmlProperty(localName = "parentStudio", isAttribute = true) val parentStudio: String? = null,
    @JacksonXmlProperty(localName = "type", isAttribute = true) val type: String? = null,
    @JacksonXmlProperty(localName = "title", isAttribute = true) val title: String? = null,
    @JacksonXmlProperty(localName = "titleSort", isAttribute = true) val titleSort: String? = null,
    @JacksonXmlProperty(localName = "parentKey", isAttribute = true) val parentKey: String? = null,
    @JacksonXmlProperty(localName = "librarySectionTitle", isAttribute = true) val librarySectionTitle: String? = null,
    @JacksonXmlProperty(localName = "librarySectionID", isAttribute = true) val librarySectionID: Int? = null,
    @JacksonXmlProperty(localName = "librarySectionKey", isAttribute = true) val librarySectionKey: String? = null,
    @JacksonXmlProperty(localName = "parentTitle", isAttribute = true) val parentTitle: String? = null,
    @JacksonXmlProperty(localName = "summary", isAttribute = true) val summary: String? = null,
    @JacksonXmlProperty(localName = "index", isAttribute = true) val index: Int? = null,
    @JacksonXmlProperty(localName = "parentIndex", isAttribute = true) val parentIndex: Int? = null,
    @JacksonXmlProperty(localName = "viewCount", isAttribute = true) val viewCount: Int? = null,
    @JacksonXmlProperty(localName = "skipCount", isAttribute = true) val skipCount: Int? = null,
    @JacksonXmlProperty(localName = "lastViewedAt", isAttribute = true) val lastViewedAt: Long? = null,
    @JacksonXmlProperty(localName = "year", isAttribute = true) val year: Int? = null,
    @JacksonXmlProperty(localName = "thumb", isAttribute = true) val thumb: String? = null,
    @JacksonXmlProperty(localName = "art", isAttribute = true) val art: String? = null,
    @JacksonXmlProperty(localName = "parentThumb", isAttribute = true) val parentThumb: String? = null,
    @JacksonXmlProperty(localName = "parentTheme", isAttribute = true) val parentTheme: String? = null,
    @JacksonXmlProperty(localName = "leafCount", isAttribute = true) val leafCount: Int? = null,
    @JacksonXmlProperty(localName = "viewedLeafCount", isAttribute = true) val viewedLeafCount: Int? = null,
    @JacksonXmlProperty(localName = "addedAt", isAttribute = true) val addedAt: Long? = null,
    @JacksonXmlProperty(localName = "updatedAt", isAttribute = true) val updatedAt: Long? = null,
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Guid") val guids: List<Guid>? = null
)