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

WebUI.openBrowser('http://USAV:demo@tickets-dev.swstage.com/')

WebUI.navigateToUrl('http://USAV:demo@dev.swstage.com/')

WebUI.setText(findTestObject('Object Repository/Old Ticket Payment/Page_SportWrench - The Home of Sporting Events/input_LOG IN_form-control'), 
    '123 Ticket test event')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Old Ticket Payment/Page_SportWrench - The Home of Sporting Events/span_Admission'))

WebUI.navigateToUrl('https://tickets-dev.swstage.com/buy/?event=516434627')

WebUI.click(findTestObject('Object Repository/Ticket payment 1111111111111/Page_Tickets/div_None'))

WebUI.click(findTestObject('Object Repository/Ticket payment 1111111111111/Page_Tickets/div_1'))

WebUI.click(findTestObject('Object Repository/Ticket payment 1111111111111/Page_Tickets/div_Purchaser Info_1'))

WebUI.click(findTestObject('Object Repository/Ticket payment 1111111111111/Page_Tickets/div_I Agree'))

WebUI.setText(findTestObject('Object Repository/Ticket payment 1111111111111/Page_Tickets/input__purchaserFirst'), 'Tara')

WebUI.setText(findTestObject('Object Repository/Ticket payment 1111111111111/Page_Tickets/input__purchaserLast'), 'Charles')

WebUI.setText(findTestObject('Object Repository/Ticket payment 1111111111111/Page_Tickets/input__purchaserEmail'), 'aaaa@gmail.com')

WebUI.executeJavaScript('document.getElementById(\'purchaserPhone\').focus(); document.execCommand(\'insertText\', false, \'(111) 111-1111\');', 
    null)

WebUI.setText(findTestObject('Object Repository/Ticket payment 1111111111111/Page_Tickets/input__purchaserZipCode'), '11111')

WebUI.click(findTestObject('Object Repository/Ticket payment 1111111111111/Page_Tickets/div_Daily Passes'))

WebUI.click(findTestObject('Object Repository/Ticket payment 1111111111111/Page_Tickets/div_I Agree'))

WebUI.click(findTestObject('Object Repository/Ticket payment 1111111111111/Page_Tickets/div_Summary'))

WebUI.click(findTestObject('Object Repository/Ticket payment 1111111111111/Page_Tickets/div_Payment'))

WebUI.click(findTestObject('Object Repository/Ticket payment 1111111111111/Page_Tickets/div_Card information'))

WebUI.setText(findTestObject('Object Repository/Ticket payment 1111111111111/Page_Tickets/input_Number_cardnumber'), '4242424242424242')

WebUI.setText(findTestObject('Object Repository/Ticket payment 1111111111111/Page_Tickets/input_Number_exp-date'), '12 / 25')

WebUI.setText(findTestObject('Object Repository/Ticket payment 1111111111111/Page_Tickets/input_Number_cvc'), '454')

WebUI.click(findTestObject('Object Repository/Ticket payment 1111111111111/Page_Tickets/div_omplete Purchase'))

WebUI.click(findTestObject('Page_Tickets/div_Buy Anyway'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Tickets/div_Confirm Duplicate Purchase'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('was successful', false)

WebUI.closeBrowser()

