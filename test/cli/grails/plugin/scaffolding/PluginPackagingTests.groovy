package grails.plugin.scaffolding

import grails.test.*
import java.util.zip.*
import org.junit.*
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*

class PluginPackagingTests extends AbstractCliTestCase {

	@Test void testArtefactsAreNotBundledWithPlugin() {
		assertThat "Plugin zip contents", zipContents, not(hasItem(endsWith(".gsp")))
	}
	
	@Test void unwantedConfigFilesAreNotBundledWithPlugin() {
		def files = zipContents
		println files
		assertThat "Plugin zip contents", files, hasItem(endsWith("EnhancedScaffoldingResources.groovy"))
		assertThat "Plugin zip contents", files, not(hasItem(endsWith("BuildConfig.groovy")))
		assertThat "Plugin zip contents", files, not(hasItem(endsWith("Config.groovy")))
		assertThat "Plugin zip contents", files, not(hasItem(endsWith("DataSource.groovy")))
		assertThat "Plugin zip contents", files, not(hasItem(endsWith("UrlMappings.groovy")))
	}
	
	private ZipFile zipFile

	@Before void packagePlugin() {
		execute(["package-plugin"])
		assert waitForProcess() == 0
//		verifyHeader()

		def packagedPlugin = new File("grails-enhanced-scaffolding-${pluginVersion}.zip")
		assert packagedPlugin.isFile()
		
		zipFile = new ZipFile(packagedPlugin)
	}
	
	@After void closeZipFile() {
		zipFile.close()
	}
	
	private Collection<String> getZipContents() {
		zipFile.entries()*.name
	}

	private String getPluginVersion() {
		getClass().classLoader.loadClass("EnhancedScaffoldingGrailsPlugin").newInstance().version
	}
	
}
