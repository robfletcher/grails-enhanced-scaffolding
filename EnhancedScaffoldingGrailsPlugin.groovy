class EnhancedScaffoldingGrailsPlugin {

    def version = "1.0"
    def grailsVersion = "1.4 > *"
    def dependsOn = [jquery: "1.6.1.1 > * ", modernizr: "1.7.2 > *"]
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
