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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/input_Log In_email'), 
    'dcgfcgchfhgvhv@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/input_false_password'), 
    'ugkk24xDMrWrlVpEbACuNZEQlZ6qfcdw')

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/button_Log In'))

WebUI.setText(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/input_Other Events_searchbox'), 
    '[AUTOTESTS] Tickets refunds (do not touch!)')

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/a_AUTOTESTS Tickets refunds (do not touch)'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/a_Tickets'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/a_Payments List'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/td_11949'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/button_Refund'))

WebUI.enhancedClick(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/a_Partial Refund'))

WebUI.setText(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/input_Discount_form-control form-control-in_cd2c09'), 
    '10')

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/button_Save'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/button_Close'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/a_Accounting'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/div_10.00'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/div_10.00_1'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/div_0.59'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/div_1.10'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/div_8.31'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/a_Tickets'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/a_Payments List'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/td_11949'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/button_Refund'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/a_Make A Full Refund'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/button_Yes'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/button_Close'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/a_Accounting'))

WebUI.click(findTestObject('Object Repository/Partial Ticket Refund/Page_SportWrench - The Home of Sporting Events/div_0.00'))

WebUI.closeBrowser()

