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

"Step 1: Navigate to https://bsp-nusuk.haj.gov.sa"

WebUI.navigateToUrl(GlobalVariable.application_domain + '')

"Step 2: Click on button '\u0645\u0648\u0627\u0641\u0642' -> Navigate to page 'UmrahOperators/Home/CreatePackage/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_PassportImage/button'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/PassportImage/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_PassportImage/button'))

"Step 3: Click on input field 'Search ArrivalFlightDate'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/input_search_arrivalflightdate'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/CreatePackage/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/input_search_arrivalflightdate'))

"Step 4: Click on th"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/th_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/CreatePackage/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/th_object'))

"Step 5: Click on td"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/td_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/CreatePackage/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/td_object'))

"Step 6: Click on input field 'select-arrival-flight'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/input_select_arrival_flight'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/CreatePackage/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/input_select_arrival_flight'))

"Step 7: Click on button '\u0627\u0644\u062e\u0637\u0648\u0629 \u0627\u0644\u062a\u0627\u0644\u064a\u0629'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/button'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/CreatePackage/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/button'))

"Step 8: Click on input field 'Search DepartureFlightDate'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/input_search_departureflightdate'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/CreatePackage/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/input_search_departureflightdate'))

"Step 9: Click on th"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/th_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/CreatePackage/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/th_object_1'))

"Step 10: Click on td  -> Navigate to page 'UmrahOperators/Home/SubmittedGroups'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/td_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/CreatePackage/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/td_object_1'))

"Step 11: Click on button 'OK'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_SubmittedGroups/button_ok'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/SubmittedGroups?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_SubmittedGroups/button_ok'))

"Step 12: Click on link 'qa-actions'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_SubmittedGroups/hyperlink_qa_actions'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/SubmittedGroups?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_SubmittedGroups/hyperlink_qa_actions'))

"Step 13: Click on link 'qa-submit-umrah'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_SubmittedGroups/hyperlink_qa_submit_umrah'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/SubmittedGroups?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_SubmittedGroups/hyperlink_qa_submit_umrah'))

"Step 14: Click on button 'OK'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_SubmittedGroups/button_ok'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/SubmittedGroups?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_SubmittedGroups/button_ok'))

"Step 15: Click on button 'OK' -> Navigate to page 'UmrahOperators/Home/CreatePackage/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_SubmittedGroups/button_ok'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/SubmittedGroups?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_SubmittedGroups/button_ok'))

"Step 16: Click on span"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/span_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/CreatePackage/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/span_object'))

"Step 17: Click on button '\u0627\u0644\u062e\u0637\u0648\u0629 \u0627\u0644\u062a\u0627\u0644\u064a\u0629'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/button'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/CreatePackage/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/button'))

"Step 18: Click on button '\u0645\u0648\u0627\u0641\u0642' -> Navigate to page 'UmrahOperators/Home/SubmittedGroups'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/button_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Home/CreatePackage/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Home_CreatePackage/button_1'))

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Creation of Umrah Package from Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
