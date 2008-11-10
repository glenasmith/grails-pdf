import net.sf.ehcache.*
import net.sf.ehcache.store.*
import org.apache.commons.logging.LogFactory

import org.codehaus.groovy.grails.commons.ConfigurationHolder


import org.xhtmlrenderer.pdf.ITextRenderer

/**

A Simple fetcher to turn a specific URL into a PDF. 

*/

class PdfService {

    boolean transactional = false

	byte[] buildPdf(url) {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocument(url);
        renderer.layout();
        renderer.createPDF(baos);
        byte[] b = baos.toByteArray();
        return b

    }
}

