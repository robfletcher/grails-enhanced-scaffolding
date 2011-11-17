grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.dependency.resolution = {
    inherits "global"
    log "warn"
    repositories {
        mavenLocal()
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
    }
    dependencies {
		test "org.seleniumhq.selenium:selenium-firefox-driver:latest.release"
		test("org.seleniumhq.selenium:selenium-htmlunit-driver:latest.release") {
			exclude "xml-apis"
		}
		test "org.codehaus.geb:geb-spock:0.6.1"
    }
	plugins {
		compile ":cache-headers:1.1.5"
		compile ":cached-resources:1.0"
//		compile ":enhanced-scaffolding:1.0.RC2"
		compile ":fixtures:1.0.7"
		compile ":hibernate:$grailsVersion"
		compile ":jquery:1.6.1.1"
		compile ":jquery-ui:1.8.10.1"
		compile ":modernizr:1.7.2"
		compile ":resources:1.0.2"
		build ":cloud-support:latest.release"
		build ":cloud-foundry:latest.release"
		build ":tomcat:$grailsVersion"
		test ":spock:0.6-SNAPSHOT"
		test ":geb:0.6.1"
	}
}

grails.plugin.location."enhanced-scaffolding" = "../../.."