

class PdfController {

    PdfService pdfService

    def index = {
        redirect(action: show)
    }

    

    def show = {

        def baseUri = request.scheme + "://" + request.serverName + ":" + request.serverPort +
                    grailsAttributes.getApplicationUri(request)
        log.debug "BaseUri is $baseUri"

        def url = baseUri + params.url
        println "Fetching url $url"

        byte[] b = pdfService.buildPdf(url)

        response.setContentType("application/pdf")
        response.setHeader("Content-disposition", "attachment; filename=" + (params.filename ?: "document.pdf"))
        response.setContentLength(b.length)
        response.getOutputStream().write(b)

    }
}

