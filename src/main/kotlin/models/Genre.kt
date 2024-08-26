import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Genre(
    @JacksonXmlProperty(localName = "id", isAttribute = true) val id: Int? = null,
    @JacksonXmlProperty(localName = "filter", isAttribute = true) val filter: String? = null,
    @JacksonXmlProperty(localName = "tag", isAttribute = true) val tag: String? = null
)