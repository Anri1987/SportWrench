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

// Open the browser
WebUI.openBrowser('')

// Navigate to the URL
WebUI.navigateToUrl('https://sales-hub.swstage.com/point-of-sales/01JQPBZGAEAF5XT8G3JZC22S5Z/purchase-tickets')

// Interact with the webpage
WebUI.click(findTestObject('Object Repository/Page_Ticket Purchase/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Ticket Purchase/span_I agree to the Refund and Dispute Policy'))

WebUI.click(findTestObject('Object Repository/Page_Ticket Purchase/button_Continue_1'))

// Fill in the required form fields
WebUI.setText(findTestObject('Object Repository/Page_Ticket Purchase/input_First name_firstName'), 'Tara')

WebUI.setText(findTestObject('Object Repository/Page_Ticket Purchase/input_Last name_lastName'), 'Charles')

WebUI.setText(findTestObject('Object Repository/Page_Ticket Purchase/input_Email_email'), 'DDDAAASSS@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Ticket Purchase/input__r3'), '855 555 5555')

WebUI.setText(findTestObject('Object Repository/Page_Ticket Purchase/input_Zip Code_zip'), '55555')

WebUI.click(findTestObject('Object Repository/Page_Ticket Purchase/button_Continue_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Ticket Purchase/img_Last name_CounterDropdown__Arrow-sc-z8f_f70c95'))

WebUI.click(findTestObject('Object Repository/Page_Ticket Purchase/img'))

WebUI.click(findTestObject('Object Repository/Page_Ticket Purchase/div_10.00_Overlay__Wrapper-sc-5xw29p-0 jtGRYD'))

WebUI.click(findTestObject('Object Repository/Page_Ticket Purchase/button_Continue_1_2'))

WebUI.setText(findTestObject('Object Repository/Page_Ticket Purchase/input_Card number_number'), '4242 4242 4242 4242')

WebUI.setText(findTestObject('Object Repository/Page_Ticket Purchase/input_MM  YY_expiry'), '12 / 26')

WebUI.setText(findTestObject('Object Repository/Page_Ticket Purchase/input_Security code_cvc'), '265')

WebUI.click(findTestObject('Object Repository/Page_Ticket Purchase/button_Pay 10.00'))

WebUI.delay(10)

WebUI.verifyTextPresent('Payment of $10.00 was successful.', false)

WebUI.closeBrowser()

