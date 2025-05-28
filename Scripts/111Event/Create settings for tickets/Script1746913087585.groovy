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

WebUI.setText(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/input_Log In_email (1)'), 
    'dcgfcgchfhgvhv@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/input_false_password (1)'), 
    'ugkk24xDMrWrlVpEbACuNZEQlZ6qfcdw')

WebUI.click(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Log In (1)'))

WebUI.setText(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/input_Other Events_searchbox (1)'), 
    '123Test Event')

WebUI.click(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/a_123Test Event (1)'))

WebUI.click(findTestObject('Spy Web/Page_SportWrench - The Home of Sporting Events/a_Tickets'))

WebUI.click(findTestObject('Spy Web/Page_SportWrench - The Home of Sporting Events/a_Settings'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/select_Choose a Payment Account .Lev (lev.k_36ed0f (1)'), 
    'number:16777251', true)

WebUI.click(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Save (1)'))

WebUI.setText(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/input_Statement Descriptor_stripe_statement (1)'), 
    'gbhdgdgbgb')

WebUI.click(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Save_1 (1)'))

WebUI.click(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Add Daily  WeekEnd (1)'))

WebUI.setText(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/input_edit_form-control input-sm ng-pristin_1ea9ba (1)'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/input_edit_form-control input-sm ng-pristin_1ea9ba_1 (1)'), 
    '20')

WebUI.click(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/i_edit_fa fa-floppy-o (1)'))

WebUI.click(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/i_edit_fa fa-floppy-o_1 (1)'))

WebUI.click(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/input_From_white-ro form-control pointer ng_bc7ee6 (1)'))

WebUI.click(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/button_01 (1)'))

WebUI.click(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Date (1)'))

WebUI.click(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Close (1)'))

WebUI.click(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/input_To_white-ro form-control pointer ng-p_bf3a2b (1)'))

WebUI.click(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/button_30 (1)'))

WebUI.click(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Date (1)'))

WebUI.click(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Close (1)'))

WebUI.click(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/button_Save_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/Create settings for tickets/Page_SportWrench - The Home of Sporting Events/input_Published_ng-pristine ng-untouched ng_393040 (1)'))

WebUI.closeBrowser()

