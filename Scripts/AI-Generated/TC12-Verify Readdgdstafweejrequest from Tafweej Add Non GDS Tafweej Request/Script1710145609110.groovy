import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://bsp-nusuk.haj.gov.sa/UmrahOperators/Tafweej/AddNonGdsTafweejRequest"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/UmrahOperators/Tafweej/AddNonGdsTafweejRequest')

"Step 2: Click on span"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Tafweej_AddNonGdsTafweejRequest/span_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Tafweej/AddNonGdsTafweejRequest?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Tafweej_AddNonGdsTafweejRequest/span_object'))

"Step 3: Click on input field  -> Navigate to page 'UmrahOperators/Tafweej/ReAddGdsTafweejRequest/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Tafweej_AddNonGdsTafweejRequest/input_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Tafweej/AddNonGdsTafweejRequest?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Tafweej_AddNonGdsTafweejRequest/input_object_1'))

"Step 4: Click on link ' \u0627\u0644\u0633\u0627\u0628\u0642' -> Navigate to page 'UmrahOperators/Tafweej'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Tafweej_ReAddGdsTafweejRequest/hyperlink'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Tafweej/ReAddGdsTafweejRequest/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Tafweej_ReAddGdsTafweejRequest/hyperlink'))

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Verify Readdgdstafweejrequest from Tafweej Add Non GDS Tafweej Request_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
