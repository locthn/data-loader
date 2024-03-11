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

"Step 1: Navigate to https://bsp-nusuk.haj.gov.sa/UmrahOperators/Tafweej/AddNonGdsTafweejRequest"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/UmrahOperators/Tafweej/AddNonGdsTafweejRequest')

"Step 2: Enter input value in input field"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Tafweej_AddNonGdsTafweejRequest/input_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Tafweej/AddNonGdsTafweejRequest?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_UmrahOperators_Tafweej_AddNonGdsTafweejRequest/input_object'), input_object)

"Step 3: Click on span 'select2-DriverId-container'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Tafweej_AddNonGdsTafweejRequest/span_select2_driverid_container'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Tafweej/AddNonGdsTafweejRequest?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Tafweej_AddNonGdsTafweejRequest/span_select2_driverid_container'))

"Step 4: Click on input field"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Tafweej_AddNonGdsTafweejRequest/input_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Tafweej/AddNonGdsTafweejRequest?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Tafweej_AddNonGdsTafweejRequest/input_object'))

"Step 5: Enter input value in input field"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Tafweej_AddNonGdsTafweejRequest/input_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Tafweej/AddNonGdsTafweejRequest?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_UmrahOperators_Tafweej_AddNonGdsTafweejRequest/input_object'), input_object_1)

"Step 6: Click on span 'select2-DriverId-container' -> Navigate to page 'UmrahOperators/Reports/UoMutamersReport'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_UmrahOperators_Tafweej_AddNonGdsTafweejRequest/span_select2_driverid_container'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/UmrahOperators/Tafweej/AddNonGdsTafweejRequest?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_UmrahOperators_Tafweej_AddNonGdsTafweejRequest/span_select2_driverid_container'))

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Verify Uomutamers Report from Tafweej Addnongdstafweejrequest Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
