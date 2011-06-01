package grails.plugin.scaffolding

import grails.test.*
import java.util.zip.*
import org.junit.*
import static org.hamcrest.Matchers.*
import static org.junit.Assert.*

class PluginPackagingTests extends AbstractCliTestCase {

	@Test
	void testExcludedItemsAreNotBundledWithPlugin() {
		def entryNames = zipFile.entries()*.name
		assertThat "Plugin zip contents", entryNames, not(hasItem(endsWith(".gsp")))
	}
	
	def getPluginVersion() {
		getClass().classLoader.loadClass("EnhancedScaffoldingGrailsPlugin").newInstance().version
	}
	
	private ZipFile zipFile

	@Before void packagePlugin() {
		execute(["package-plugin"])
		assert waitForProcess() == 0
		verifyHeader()

		def packagedPlugin = new File("grails-enhanced-scaffolding-${pluginVersion}.zip")
		assert packagedPlugin.isFile()
		
		zipFile = new ZipFile(packagedPlugin)
	}
	
	@After void closeZipFile() {
		zipFile.close()
	}
}