import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class DirectoryForLibrarySeries(
    @JacksonXmlProperty(localName = "ratingKey", isAttribute = true) val ratingKey: String? = null,
    @JacksonXmlProperty(localName = "key", isAttribute = true) val key: String? = null,
    @JacksonXmlProperty(localName = "guid", isAttribute = true) val guid: String? = null,
    @JacksonXmlProperty(localName = "studio", isAttribute = true) val studio: String? = null,
    @JacksonXmlProperty(localName = "type", isAttribute = true) val type: String? = null,
    @JacksonXmlProperty(localName = "title", isAttribute = true) val title: String? = null,
    @JacksonXmlProperty(localName = "originalTitle", isAttribute = true) val originalTitle: String? = null,
    @JacksonXmlProperty(localName = "contentRating", isAttribute = true) val contentRating: String? = null,
    @JacksonXmlProperty(localName = "summary", isAttribute = true) val summary: String? = null,
    @JacksonXmlProperty(localName = "index", isAttribute = true) val index: Int? = null,
    @JacksonXmlProperty(localName = "audienceRating", isAttribute = true) val audienceRating: Double? = null,
    @JacksonXmlProperty(localName = "year", isAttribute = true) val year: Int? = null,
    @JacksonXmlProperty(localName = "thumb", isAttribute = true) val thumb: String? = null,
    @JacksonXmlProperty(localName = "art", isAttribute = true) val art: String? = null,
    @JacksonXmlProperty(localName = "theme", isAttribute = true) val theme: String? = null,
    @JacksonXmlProperty(localName = "duration", isAttribute = true) val duration: Long? = null,
    @JacksonXmlProperty(localName = "originallyAvailableAt", isAttribute = true) val originallyAvailableAt: String? = null,
    @JacksonXmlProperty(localName = "leafCount", isAttribute = true) val leafCount: Int? = null,
    @JacksonXmlProperty(localName = "viewedLeafCount", isAttribute = true) val viewedLeafCount: Int? = null,
    @JacksonXmlProperty(localName = "childCount", isAttribute = true) val childCount: Int? = null,
    @JacksonXmlProperty(localName = "addedAt", isAttribute = true) val addedAt: Long? = null,
    @JacksonXmlProperty(localName = "updatedAt", isAttribute = true) val updatedAt: Long? = null,
    @JacksonXmlProperty(localName = "audienceRatingImage", isAttribute = true) val audienceRatingImage: String? = null,
    @JacksonXmlProperty(localName = "primaryExtraKey", isAttribute = true) val primaryExtraKey: String? = null,
    @JacksonXmlProperty(localName = "viewCount", isAttribute = true) val viewCount: Int? = null,
    @JacksonXmlProperty(localName = "lastViewedAt", isAttribute = true) val lastViewedAt: Long? = null,
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Genre") val genres: List<Genre>? = emptyList(),
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Country") val countries: List<Country>? = emptyList(),
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Collection") val collections: List<Collection>? = emptyList(),
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Role") val roles: List<Role>? = emptyList()
)