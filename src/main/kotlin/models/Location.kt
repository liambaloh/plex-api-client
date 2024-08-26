import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Location(
    @JacksonXmlProperty(localName = "id", isAttribute = true) val id: Int? = null,
    @JacksonXmlProperty(localName = "path", isAttribute = true) val path: String? = null
)