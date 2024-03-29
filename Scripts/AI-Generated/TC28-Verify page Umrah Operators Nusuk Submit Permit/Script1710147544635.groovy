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

"Step 1: Navigate to https://bsp-nusuk.haj.gov.sa/UmrahOperators/Nusuk"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/UmrahOperators/Nusuk')

"Step 2: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Nusuk/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Nusuk?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Nusuk/div_object'))

"Step 3: Click on span 'select2-nusukPermitType f-container' -> Navigate to page 'UmrahOperators/Nusuk/SubmitPermit'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Nusuk/span_select2_nusukpermittype_f_container'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Nusuk?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Nusuk/span_select2_nusukpermittype_f_container'))

"Step 4: Enter input value in input field"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Nusuk_SubmitPermit/input_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Nusuk/SubmitPermit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_UmrahOperators_Nusuk_SubmitPermit/input_object'), input_object)

"Step 5: Click on button 'NEXT STEP'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Nusuk_SubmitPermit/button_next_step'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Nusuk/SubmitPermit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Nusuk_SubmitPermit/button_next_step'))

"Step 6: Click on input field"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Nusuk_SubmitPermit/input_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Nusuk/SubmitPermit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Nusuk_SubmitPermit/input_object_1'))

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC28-Verify page Umrah Operators Nusuk Submit Permit_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
