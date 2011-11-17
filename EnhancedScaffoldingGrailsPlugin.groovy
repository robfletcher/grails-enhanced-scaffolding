class EnhancedScaffoldingGrailsPlugin {

	def version = "1.0.RC2"
    def grailsVersion = "2.0 > *"
    def pluginExcludes = [
            "grails-app/views/**/*",
            "web-app/qunit/**/*"
    ]

    def title = "Enhanced Scaffolding"
    def author = "Rob Fletcher"
    def authorEmail = "rob@energizedwork.com"
    def description = "A collection of Javascript enhancements to Grails' standard scaffolding."

    def documentation = "http://grails.org/plugin/enhanced-scaffolding"

	def license = "APACHE"
//	def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]
	def scm = [ url: "http://github.com/robfletcher/grails-enhanced-scaffolding" ]
	
}
