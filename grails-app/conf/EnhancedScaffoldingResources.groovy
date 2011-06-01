modules = {
	
	// an AJAX loading indicator
	"grails.ajaxloader" {
		defaultBundle "scaffolding"
		dependsOn "modernizr", "jquery"
		resource url: [plugin: "enhanced-scaffolding", dir: "js", file: "grails.ajaxloader.js"]
		resource url: [plugin: "enhanced-scaffolding", dir: "js", file: "grails.ajaxloader.loader.js"]
		resource url: [plugin: "enhanced-scaffolding", dir: "css", file: "grails.ajaxloader.css"]
	}
	
	// an autocomplete control to replace multiple-select inputs for one-to-many and many-to-many relationships
	"grails.autocomplete" {
		defaultBundle "scaffolding"
		dependsOn "modernizr", "jquery"
		resource url: [plugin: "enhanced-scaffolding", dir: "js", file: "grails.autocomplete.js"]
		resource url: [plugin: "enhanced-scaffolding", dir: "js", file: "grails.autocomplete.loader.js"]
		resource url: [plugin: "enhanced-scaffolding", dir: "css", file: "grails.autocomplete.css"]
	}
	
	// AJAX-enables scaffolded list pages
	"grails.list" {
		defaultBundle "scaffolding"
		dependsOn "modernizr", "jquery"
		resource url: [plugin: "enhanced-scaffolding", dir: "js", file: "grails.list.js"]
		resource url: [plugin: "enhanced-scaffolding", dir: "js", file: "grails.list.loader.js"]
	}
	
	// uses native range inputs instead of selects in browsers that support them
	"grails.range" {
		defaultBundle "scaffolding"
		dependsOn "modernizr", "jquery"
		resource url: [plugin: "enhanced-scaffolding", dir: "js", file: "grails.range.js"]
		resource url: [plugin: "enhanced-scaffolding", dir: "js", file: "grails.range.loader.js"]
		resource url: [plugin: "enhanced-scaffolding", dir: "css", file: "grails.range.css"]
	}
	
	// replaces standard error messages with tooltips attached to each individual field
	"grails.errors" {
		defaultBundle "scaffolding"
		dependsOn "modernizr", "jquery"
		resource url: [plugin: "enhanced-scaffolding", dir: "js", file: "grails.errors.js"]
		resource url: [plugin: "enhanced-scaffolding", dir: "js", file: "grails.errors.loader.js"]
		resource url: [plugin: "enhanced-scaffolding", dir: "css", file: "grails.errors.css"]
	}
	
	// replaces flash and error messages with a fade-out message
	"grails.alerts" {
		defaultBundle "scaffolding"
		dependsOn "modernizr", "jquery"
		resource url: [plugin: "enhanced-scaffolding", dir: "js", file: "grails.alerts.js"]
		resource url: [plugin: "enhanced-scaffolding", dir: "js", file: "grails.alerts.loader.js"]
		resource url: [plugin: "enhanced-scaffolding", dir: "css", file: "grails.alerts.css"]
	}
	
	// some basic form enhancements
	"grails.forms" {
		defaultBundle "scaffolding"
		dependsOn "modernizr", "jquery"
		resource url: [plugin: "enhanced-scaffolding", dir: "js", file: "grails.forms.js"]
	}
	
	// prevents FOUC by fading body in after document load is complete
	"grails.fouc" {
		defaultBundle "scaffolding"
		dependsOn "modernizr", "jquery"
		resource url: [plugin: "enhanced-scaffolding", dir: "js", file: "grails.fouc.js"]
		resource url: [plugin: "enhanced-scaffolding", dir: "css", file: "grails.fouc.css"]
	}
	
	// top-level module that pulls in everything else
    "scaffolding" {
		defaultBundle "scaffolding"
		dependsOn "grails.ajaxloader", "grails.autocomplete", "grails.list", "grails.range", "grails.errors", "grails.alerts", "grails.forms", "grails.fouc"
	}
	
}