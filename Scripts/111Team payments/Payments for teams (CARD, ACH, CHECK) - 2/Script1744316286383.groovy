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

WebUI.openBrowser('http://USAV:demo@dev.swstage.com/')

WebUI.navigateToUrl('http://USAV:demo@my.dev.swstage.com/#/')

WebUI.setText(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_Log In_email'), 
    'coachjon@trinityvolleyball.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_false_password'), 
    'ugkk24xDMrWrlVpEbACuNZEQlZ6qfcdw')

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Log In'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/a_Enter Events'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Manage Teams'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Pay'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_Payment history_ng-pristine ng-untouc_97ddf2'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_To Pay_ng-pristine ng-untouched ng-va_e7e142'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_1,000.00_ng-pristine ng-untouched ng-_714ebc'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_1,000.00_ng-pristine ng-untouched ng-_714ebc_1'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_1,000.00_ng-pristine ng-untouched ng-_714ebc_1_2'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_1,000.00_ng-pristine ng-untouched ng-_714ebc_1_2_3'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/div_Proceed to payment'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_Card number_number'), 
    '4242 4242 4242 4242')

WebUI.setText(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_MM  YY_expiry'), 
    '12 / 26')

WebUI.setText(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_Security code_cvc'), 
    '345')

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Pay 5,000.00'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/span_Your Payment of 5,000.00 succeeded'), 
    1)

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Close'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Pay'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_Payment history_ng-pristine ng-untouc_97ddf2'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_To Pay_ng-pristine ng-untouched ng-va_e7e142'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_1,000.00_ng-pristine ng-untouched ng-_714ebc'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_1,000.00_ng-pristine ng-untouched ng-_714ebc_1'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/div_Proceed to payment_1'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/a_Check'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Confirm 3,000.00'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/span_Your Payment of 3,000.00 is pending re_a194a2'), 
    0)

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Close'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Pay'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/div_Proceed to payment_1_2'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_US bank account'))

WebUI.setText(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_Email_email'), 
    'ddfdfgf@gmail.com')

WebUI.setText(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_Full name_name'), 
    'ddfddf fgffgfg')

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/p_Test Institution'))

WebUI.enhancedClick(findTestObject('Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Agree and continue'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/span_Connect account'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/span_Back to SportWrench Inc'))

WebUI.click(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Pay 4,000.00'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Payment for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/span_Your Payment of 4,000.00 is pending ba_433985'), 
    0)

WebUI.closeBrowser()

