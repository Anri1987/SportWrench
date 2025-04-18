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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://my.dev.swstage.com/#/')

WebUI.setText(findTestObject('Object Repository/Team payment 22/Page_SportWrench - The Home of Sporting Events/input_Log In_email'), 
    '87151test_email_for_club@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Team payment 22/Page_SportWrench - The Home of Sporting Events/input_false_password'), 
    'SFTQUhjBfIY=')

WebUI.click(findTestObject('Object Repository/Team payment 22/Page_SportWrench - The Home of Sporting Events/button_Log In'))

WebUI.click(findTestObject('Object Repository/Team payment 22/Page_SportWrench - The Home of Sporting Events/button_Pay'))

WebUI.rightClick(findTestObject('Object Repository/Team payment 22/Page_SportWrench - The Home of Sporting Events/div_Proceed to payment'))

WebUI.setText(findTestObject('Object Repository/Team payment 22/Page_SportWrench - The Home of Sporting Events/input_Card number_number'), 
    '4242 4242 4242 4242')

WebUI.setText(findTestObject('Object Repository/Team payment 22/Page_SportWrench - The Home of Sporting Events/input_MM  YY_expiry'), 
    '12 / 27')

WebUI.setText(findTestObject('Object Repository/Team payment 22/Page_SportWrench - The Home of Sporting Events/input_Security code_cvc'), 
    '321')

WebUI.click(findTestObject('Object Repository/Team payment 22/Page_SportWrench - The Home of Sporting Events/button_Pay 1,000.00'))

WebUI.rightClick(findTestObject('Object Repository/Team payment 22/Page_SportWrench - The Home of Sporting Events/span_Your Payment of 1,000.00 succeeded'))

WebUI.closeBrowser()

