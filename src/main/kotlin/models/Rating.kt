import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Rating(
    @JacksonXmlProperty(localName = "image", isAttribute = true) val image: String? = null,
    @JacksonXmlProperty(localName = "value", isAttribute = true) val value: String? = null,
    @JacksonXmlProperty(localName = "type", isAttribute = true) val type: String? = null
)