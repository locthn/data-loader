import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://bsp-nusuk.haj.gov.sa/ExternalAgencies/Groups/Index"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/ExternalAgencies/Groups/Index')

"Step 2: Click on link 'qa-actions'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_ExternalAgencies_Groups_Index/hyperlink_qa_actions'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ExternalAgencies/Groups/Index?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ExternalAgencies_Groups_Index/hyperlink_qa_actions'))

"Step 3: Click on link 'qa-view-package' -> Navigate to page 'ExternalAgencies/Groups/ViewPackage/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_ExternalAgencies_Groups_Index/hyperlink_qa_view_package'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ExternalAgencies/Groups/Index?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_ExternalAgencies_Groups_Index/hyperlink_qa_view_package'))

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Verify View Package from External Agencies Groups Index Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
