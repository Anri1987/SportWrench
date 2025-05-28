import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://USAV:demo@dev.swstage.com/ ')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://USAV:demo@my.dev.swstage.com/#/')

WebUI.setText(findTestObject('Object Repository/Page_SportWrench - The Home of Sporting Events/input_Log In_email'), 'wendy@mvvclub.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SportWrench - The Home of Sporting Events/input_false_password'), 
    'ugkk24xDMrWrlVpEbACuNZEQlZ6qfcdw')

WebUI.click(findTestObject('Object Repository/Page_SportWrench - The Home of Sporting Events/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_SportWrench - The Home of Sporting Events/a_Enter Events'))

WebUI.setText(findTestObject('Spy Web/Page_SportWrench - The Home of Sporting Events/input_Invoices_searchbox'), '123Test Event')

WebUI.delay(2)

WebUI.click(findTestObject('Spy Web/Page_SportWrench - The Home of Sporting Events/span_123Test Event'))

WebUI.click(findTestObject('Object Repository/Page_SportWrench - The Home of Sporting Events/button_Enter Event and Manage Teams'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_SportWrench - The Home of Sporting Events/select_18 Club 18 Club Not entered'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_SportWrench - The Home of Sporting Events/select_18 Club 18 Club Not entered'), 
    '♂♀ 18 Club', false)

WebUI.click(findTestObject('Object Repository/Page_SportWrench - The Home of Sporting Events/button_Pay'))

WebUI.click(findTestObject('Object Repository/Page_SportWrench - The Home of Sporting Events/div_Proceed to payment_1'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_SportWrench - The Home of Sporting Events/input_Card number_number (3)'), 
    '4242 4242 4242 4242')

WebUI.setText(findTestObject('Object Repository/Page_SportWrench - The Home of Sporting Events/input_MM  YY_expiry (3)'), 
    '12 / 26')

WebUI.setText(findTestObject('Object Repository/Page_SportWrench - The Home of Sporting Events/input_Security code_cvc (2)'), 
    '654')

WebUI.click(findTestObject('Object Repository/Page_SportWrench - The Home of Sporting Events/button_Pay 1,000.00'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SportWrench - The Home of Sporting Events/span_Your Payment of 1,000.00 succeeded'), 
    0)

WebUI.closeBrowser()

