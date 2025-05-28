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

WebUI.setText(findTestObject('Object Repository/Refund for teams (ACH)/Page_SportWrench - The Home of Sporting Events/input_Log In_email'), 
    'dcgfcgchfhgvhv@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Refund for teams (ACH)/Page_SportWrench - The Home of Sporting Events/input_false_password'), 
    'ugkk24xDMrWrlVpEbACuNZEQlZ6qfcdw')

WebUI.click(findTestObject('Object Repository/Refund for teams (ACH)/Page_SportWrench - The Home of Sporting Events/button_Log In'))

WebUI.setText(findTestObject('Object Repository/Refund for teams (ACH)/Page_SportWrench - The Home of Sporting Events/input_Other Events_searchbox'), 
    'ULTIMATE TEAMS REFUND')

WebUI.click(findTestObject('Object Repository/Refund for teams (ACH)/Page_SportWrench - The Home of Sporting Events/a_ULTIMATE TEAMS REFUND'))

WebUI.click(findTestObject('Object Repository/Refund for teams (ACH)/Page_SportWrench - The Home of Sporting Events/a_Accounting'))

WebUI.verifyElementPresent(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/div_5,000.00'), 
    0)

WebUI.verifyElementPresent(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/div_145.30'), 
    0)

WebUI.verifyElementPresent(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/div_8,704.70'), 
    0)

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/a_Teams'))

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/a_Teams List'))

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/span_Trinity 8 1'))

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/a_Payments'))

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/span_CARD (paid)'))

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/button_Refund'))

WebUI.typeOnImage(findTestObject('Spy Web/Page_SportWrench - The Home of Sporting Events/a_Partial'), 'Partial')

WebUI.delay(2)

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/input_Team name_ng-pristine ng-untouched ng_75950e'))

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/input_Trinity 9 11_ng-pristine ng-untouched_6875e5'))

WebUI.setText(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/input__form-control form-control-4digits ng_fc52e6'), 
    '500')

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/button_Refund 2,500.00'))

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/button_'))

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/a_Accounting'))

WebUI.verifyElementPresent(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/div_2,500.00'), 
    0)

WebUI.verifyElementPresent(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/div_72.80'), 
    0)

WebUI.verifyElementPresent(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/div_6,297.20'), 
    0)

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/a_Teams'))

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/a_Teams List'))

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/span_Trinity 8 1'))

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/a_Payments'))

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/span_CARD (paid)_1'))

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/button_Refund'))

WebUI.clickImage(findTestObject('Spy Web/Page_SportWrench - The Home of Sporting Events/a_Total'))

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/button_Yes'))

WebUI.click(findTestObject('Refund for teams (CARD)/Page_SportWrench - The Home of Sporting Events/button_'))

WebUI.closeBrowser()

