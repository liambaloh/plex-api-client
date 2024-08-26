import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Collection(
    @JacksonXmlProperty(localName = "tag", isAttribute = true) val tag: String? = null
)