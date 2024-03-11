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

"Step 1: Navigate to https://bsp-nusuk.haj.gov.sa/UmrahOperators/Home/SubmittedGroups"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/UmrahOperators/Home/SubmittedGroups')

"Step 2: Click on td"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_SubmittedGroups/td_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/SubmittedGroups?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_SubmittedGroups/td_object'))

"Step 3: Click on link 'qa-actions'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_SubmittedGroups/hyperlink_qa_actions_2'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/SubmittedGroups?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_SubmittedGroups/hyperlink_qa_actions_2'))

"Step 4: Click on link 'qa-create-package' -> Navigate to page 'UmrahOperators/Home/CreatePackage/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_SubmittedGroups/hyperlink_qa_create_package'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/SubmittedGroups?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_SubmittedGroups/hyperlink_qa_create_package'))

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC26-Verify Create Package on Umrah Operators Home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
