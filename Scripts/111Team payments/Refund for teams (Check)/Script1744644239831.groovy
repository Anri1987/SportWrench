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

WebUI.navigateToUrl('http://USAV:demo@my.dev.swstage.com/#/')

WebUI.setText(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/input_Log In_email'), 
    'dcgfcgchfhgvhv@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/input_false_password'), 
    'ugkk24xDMrWrlVpEbACuNZEQlZ6qfcdw')

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/button_Log In'))

WebUI.setText(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/input_Other Events_searchbox'), 
    'ULTIMATE TEAMS REFUND')

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/a_ULTIMATE TEAMS REFUND'))

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/a_Accounting'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/div_0.00'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/div_0.00_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/div_0.00_1_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/div_0.00_1_2_3'), 
    0)

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/a_Teams'))

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/a_Teams List'))

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/span_Trinity 9 16'))

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/a_Payments'))

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/span_CHECK (pending)'))

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/input_Received_is_received'))

WebUI.setText(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/input__check_num'), 
    '1234567')

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/button_Save'))

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/button_'))

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/a_Accounting'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/div_3,000.00'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/div_3,000.00_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/div_30.00'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/div_2,970.00'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/div_-30.00'), 
    0)

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/a_Teams'))

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/a_Teams List'))

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/span_Trinity 9 16'))

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/a_Payments'))

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/span_CHECK (paid)'))

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/button_Void Invoice_1'))

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/button_Yes'))

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/button_'))

WebUI.click(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/a_Accounting'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/div_0.00_1_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Refund for teams (CHECK)/Page_SportWrench - The Home of Sporting Events/div_0.00_1_2_3'), 
    0)

WebUI.closeBrowser()

