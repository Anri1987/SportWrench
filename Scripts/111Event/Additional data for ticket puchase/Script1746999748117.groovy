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

WebUI.click(findTestObject('Object Repository/Additional data for ticket puchase/Page_Tickets/div_Successful Payment'))

WebUI.click(findTestObject('Object Repository/Additional data for ticket puchase/Page_Tickets/div_1 Daily Passes to 123Test Event'))

WebUI.click(findTestObject('Object Repository/Additional data for ticket puchase/Page_Tickets/div_Payment of 10.00 was successful. A link_c703ef'))

WebUI.click(findTestObject('Object Repository/Additional data for ticket puchase/Page_Tickets/div_Show barcode for Tara Charles'))

WebUI.click(findTestObject('Object Repository/Additional data for ticket puchase/Page_123Test Event/span_123Test Event'))

WebUI.click(findTestObject('Object Repository/Additional data for ticket puchase/Page_123Test Event/div_Tara Charles'))

WebUI.click(findTestObject('Object Repository/Additional data for ticket puchase/Page_123Test Event/div_All Days'))

WebUI.click(findTestObject('Object Repository/Additional data for ticket puchase/Page_123Test Event/div_aaaagmail.com'))

WebUI.click(findTestObject('Object Repository/Additional data for ticket puchase/Page_123Test Event/div_(111) 111-11111'))

WebUI.click(findTestObject('Object Repository/Additional data for ticket puchase/Page_123Test Event/div_11111'))

WebUI.click(findTestObject('Object Repository/Additional data for ticket puchase/Page_123Test Event/div_10.00'))

