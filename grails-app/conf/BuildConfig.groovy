grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {
    inherits "global"
    log "warn"
    repositories {
        grailsCentral()
        mavenCentral()
        mavenLocal()
    }
    dependencies {
		test("org.hamcrest:hamcrest-all:1.1") {
			excludes "junit", "easymock", "jmock"
			exported = false
		}
    }
    plugins {
        build(":tomcat:$grailsVersion", ":release:1.0.0.M2") {
            export = false
        }
		compile(":jquery:1.6.1.1", ":modernizr:1.7.2") {
			export = false
		}
		runtime(":resources:1.0") {
			export = false
		}
    }
}
