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

WebUI.setText(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_Log In_email'), 
    'dcgfcgchfhgvhv@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_false_password'), 
    'ugkk24xDMrWrlVpEbACuNZEQlZ6qfcdw')

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Log In'))

WebUI.setText(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_Other Events_searchbox'), 
    'ULTIMATE TEAMS REFUND')

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/a_ULTIMATE TEAMS REFUND'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/a_Teams'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/a_Payments'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/td_5'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/a_B09TRNTY4FL'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/span_CARD (paid)'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/span_Refund_caret'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/a_Total'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Yes'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Close'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/td_4'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/a_B09TRNTY7FL'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/span_ACH (paid)'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/span_Refund_caret_1'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/a_Total_1'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Yes'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Close'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/td_3'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/a_B09TRNTY16FL'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/span_CHECK (pending)'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input_Received_is_received'))

WebUI.setText(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/input__check_num'), 
    '1234567')

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Save'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Void Invoice'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Yes'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/button_Close'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/a_Accounting'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/div_0.00'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/div_0.00_1'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/div_0.00_1_2'))

WebUI.click(findTestObject('Object Repository/Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/div_0.00_1_2_3'))

WebUI.verifyElementPresent(findTestObject('Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/div_0.00'), 
    0)

WebUI.verifyElementPresent(findTestObject('Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/div_0.00_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/div_0.00_1_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Refunds for teams (CARD, ACH, CHECK)/Page_SportWrench - The Home of Sporting Events/div_0.00_1_2_3'), 
    0)

WebUI.closeBrowser()

