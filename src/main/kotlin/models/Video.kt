import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Video(
    @JacksonXmlProperty(localName = "ratingKey", isAttribute = true) val ratingKey: String? = null,
    @JacksonXmlProperty(localName = "key", isAttribute = true) val key: String? = null,
    @JacksonXmlProperty(localName = "guid", isAttribute = true) val guid: String? = null,
    @JacksonXmlProperty(localName = "studio", isAttribute = true) val studio: String? = null,
    @JacksonXmlProperty(localName = "type", isAttribute = true) val type: String? = null,
    @JacksonXmlProperty(localName = "title", isAttribute = true) val title: String? = null,
    @JacksonXmlProperty(localName = "originalTitle", isAttribute = true) val originalTitle: String? = null,
    @JacksonXmlProperty(localName = "contentRating", isAttribute = true) val contentRating: String? = null,
    @JacksonXmlProperty(localName = "summary", isAttribute = true) val summary: String? = null,
    @JacksonXmlProperty(localName = "rating", isAttribute = true) val rating: Double? = null,
    @JacksonXmlProperty(localName = "audienceRating", isAttribute = true) val audienceRating: Double? = null,
    @JacksonXmlProperty(localName = "year", isAttribute = true) val year: Int? = null,
    @JacksonXmlProperty(localName = "tagline", isAttribute = true) val tagline: String? = null,
    @JacksonXmlProperty(localName = "thumb", isAttribute = true) val thumb: String? = null,
    @JacksonXmlProperty(localName = "art", isAttribute = true) val art: String? = null,
    @JacksonXmlProperty(localName = "duration", isAttribute = true) val duration: Long? = null,
    @JacksonXmlProperty(localName = "originallyAvailableAt", isAttribute = true) val originallyAvailableAt: String? = null,
    @JacksonXmlProperty(localName = "addedAt", isAttribute = true) val addedAt: Long? = null,
    @JacksonXmlProperty(localName = "updatedAt", isAttribute = true) val updatedAt: Long? = null,
    @JacksonXmlProperty(localName = "audienceRatingImage", isAttribute = true) val audienceRatingImage: String? = null,
    @JacksonXmlProperty(localName = "chapterSource", isAttribute = true) val chapterSource: String? = null,
    @JacksonXmlProperty(localName = "primaryExtraKey", isAttribute = true) val primaryExtraKey: String? = null,
    @JacksonXmlProperty(localName = "viewCount", isAttribute = true) val viewCount: Int? = null,
    @JacksonXmlProperty(localName = "lastViewedAt", isAttribute = true) val lastViewedAt: Long? = null,
    @JacksonXmlProperty(localName = "ratingImage", isAttribute = true) val ratingImage: String? = null,
    @JacksonXmlProperty(localName = "parentRatingKey", isAttribute = true) val parentRatingKey: Int? = null,
    @JacksonXmlProperty(localName = "grandparentRatingKey", isAttribute = true) val grandparentRatingKey: Int? = null,
    @JacksonXmlProperty(localName = "parentGuid", isAttribute = true) val parentGuid: String? = null,
    @JacksonXmlProperty(localName = "grandparentGuid", isAttribute = true) val grandparentGuid: String? = null,
    @JacksonXmlProperty(localName = "titleSort", isAttribute = true) val titleSort: String? = null,
    @JacksonXmlProperty(localName = "grandparentKey", isAttribute = true) val grandparentKey: String? = null,
    @JacksonXmlProperty(localName = "parentKey", isAttribute = true) val parentKey: String? = null,
    @JacksonXmlProperty(localName = "grandparentTitle", isAttribute = true) val grandparentTitle: String? = null,
    @JacksonXmlProperty(localName = "parentTitle", isAttribute = true) val parentTitle: String? = null,
    @JacksonXmlProperty(localName = "index", isAttribute = true) val index: Int? = null,
    @JacksonXmlProperty(localName = "parentIndex", isAttribute = true) val parentIndex: Int? = null,
    @JacksonXmlProperty(localName = "parentThumb", isAttribute = true) val parentThumb: String? = null,
    @JacksonXmlProperty(localName = "grandparentThumb", isAttribute = true) val grandparentThumb: String? = null,
    @JacksonXmlProperty(localName = "grandparentArt", isAttribute = true) val grandparentArt: String? = null,
    @JacksonXmlProperty(localName = "grandparentTheme", isAttribute = true) val grandparentTheme: String? = null,
    @JacksonXmlElementWrapper(useWrapping = true)
    @JacksonXmlProperty(localName = "Genre") val genres: List<Genre>? = emptyList(),
    @JacksonXmlElementWrapper(useWrapping = true)
    @JacksonXmlProperty(localName = "Country") val countries: List<Country>? = emptyList(),
    @JacksonXmlElementWrapper(useWrapping = true)
    @JacksonXmlProperty(localName = "Collection") val collections: List<Collection>? = emptyList(),
    @JacksonXmlElementWrapper(useWrapping = true)
    @JacksonXmlProperty(localName = "Director") val directors: List<Director>? = emptyList(),
    @JacksonXmlElementWrapper(useWrapping = true)
    @JacksonXmlProperty(localName = "Writer") val writers: List<Writer>? = emptyList(),
    @JacksonXmlElementWrapper(useWrapping = true)
    @JacksonXmlProperty(localName = "Role") val roles: List<Role>? = emptyList(),
    @JacksonXmlElementWrapper(useWrapping = true)
    @JacksonXmlProperty(localName = "Media") val media: List<Media>? = emptyList(),
    @JacksonXmlElementWrapper(useWrapping = true)
    @JacksonXmlProperty(localName = "Guid") val guids: List<Guid>? = emptyList(),
    @JacksonXmlElementWrapper(useWrapping = true)
    @JacksonXmlProperty(localName = "Rating") val ratings: List<Rating>? = emptyList(),
    @JacksonXmlElementWrapper(useWrapping = true)
    @JacksonXmlProperty(localName = "Producer") val producers: List<Producer>? = emptyList(),
)