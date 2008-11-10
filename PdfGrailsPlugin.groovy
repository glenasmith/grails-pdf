
class PdfGrailsPlugin {
	def version = 0.1
	def dependsOn = [:]
	
 	def author = "Glen Smith"
    def authorEmail = "glen@bytecode.com.au"
    def title = "Provides a simple way to generate PDFs from web pages"
    def description = '''
Pdf plugin allows your Grails application to generate PDFs and send them
to the browser by converting existing pages in your application to PDF
on the fly. The underlying system uses the xhtmlrenderer component from java.net
to do the rendering.
'''
    def documentation = "http://grails.org/Pdf+plugin"	
	
	def doWithSpring = {
		// TODO Implement runtime spring config (optional)
	}   
	def doWithApplicationContext = { applicationContext ->
		// TODO Implement post initialization spring config (optional)		
	}
	def doWithWebDescriptor = { xml ->
		// TODO Implement additions to web.xml (optional)
	}	                                      
	def doWithDynamicMethods = { ctx ->
		// TODO Implement additions to web.xml (optional)
	}	
	def onChange = { event ->
		// TODO Implement code that is executed when this class plugin class is changed  
		// the event contains: event.application and event.applicationContext objects
	}                                                                                  
	def onApplicationChange = { event ->
		// TODO Implement code that is executed when any class in a GrailsApplication changes
		// the event contain: event.source, event.application and event.applicationContext objects
	}
}
