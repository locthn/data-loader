import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://bsp-nusuk.haj.gov.sa"

WebUI.navigateToUrl(GlobalVariable.application_domain + '')

"Step 2: Click on button ' \u0627\u0644\u0633\u0627\u0628\u0642' -> Navigate to page 'UmrahOperators/Home/CreatePackage/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_PassportImage/button_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/PassportImage/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_PassportImage/button_1'))

"Step 3: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC18-Verify Umrah Package Creation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
