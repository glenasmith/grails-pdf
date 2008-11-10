import org.codehaus.groovy.grails.plugins.web.taglib.ApplicationTagLib

/**
 * A simple taglib for producing links to the PDF creation for a page.
 *
 * @author Glen Smith
 */
class PdfTagLib {



    /**
     * Creates a PDF creation link for the supplied URL.
     *
     * eg. <g:pdf url="/test.gsp" filename="sample.pdf" icon="true"/>
     *
     */
    def pdf = { attrs, body ->

        out << "<a href='"
 
        out << new ApplicationTagLib().createLink(url: [controller: 'pdf', action:'show',
                params: [url: attrs.url, filename: attrs.filename ?: 'document.pdf'] ] )
        out << "'>"

        if (attrs.icon) {
            out << "<img src='"
            out << createLinkTo(dir:'images', file:'pdf_button.png')
            out << "' alt='PDF Version'/>"

        }

        out << body()

        out << "</a>"
           

    }

}
