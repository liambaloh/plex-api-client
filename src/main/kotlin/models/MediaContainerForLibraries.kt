import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

@JacksonXmlRootElement(localName = "MediaContainer")
data class MediaContainerForLibraries(
    @JacksonXmlProperty(localName = "size", isAttribute = true) val size: Int? = null,
    @JacksonXmlProperty(localName = "allowSync", isAttribute = true) val allowSync: Int? = null,
    @JacksonXmlProperty(localName = "title1", isAttribute = true) val title1: String? = null,
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Directory") val directory: List<DirectoryForLibraries> = emptyList()
)