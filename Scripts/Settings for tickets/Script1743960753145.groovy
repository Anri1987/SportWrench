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

WebUI.setText(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/input_Log In_email'), 
    'dcgfcgchfhgvhv@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/input_false_password'), 
    'ugkk24xDMrWrlVpEbACuNZEQlZ6qfcdw')

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Log In'))

WebUI.setText(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/input_Other Events_searchbox'), 
    '123Test Event')

WebUI.click(findTestObject('Create settings for tickets/Page_SportWrench - The Home of Sporting Events/a_123Test Event'))

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/span_Tickets_caret'))

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/a_Settings'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/select_Choose a Payment Account .Lev (lev.k_36ed0f'), 
    'number:16777251', true)

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Save'))

WebUI.setText(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/input_Statement Descriptor_stripe_statement'), 
    'fgfdrfdfggfddf')

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Add Daily  WeekEnd'))

WebUI.setText(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/input_edit_form-control input-sm ng-pristin_1ea9ba'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/input_edit_form-control input-sm ng-pristin_1ea9ba_1'), 
    '20')

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/i_edit_fa fa-floppy-o'))

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/i_edit_fa fa-floppy-o_1'))

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/input_From_white-ro form-control pointer ng_bc7ee6'))

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/button_From_btn btn-default btn-sm pull-lef_14807d'))

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/button_19'))

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Date'))

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Close'))

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/input_To_white-ro form-control pointer ng-p_bf3a2b'))

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/button_April 2025_btn btn-default btn-sm pu_492a81'))

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/button_22'))

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Date'))

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Close'))

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Save_1_2'))

WebUI.click(findTestObject('Object Repository/Settings for tickets/Page_SportWrench - The Home of Sporting Events/input_Published_ng-pristine ng-untouched ng_393040'))

WebUI.closeBrowser()

