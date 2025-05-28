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

WebUI.setText(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/input_Log In_email'), 
    'dcgfcgchfhgvhv@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/input_false_password'), 
    'ugkk24xDMrWrlVpEbACuNZEQlZ6qfcdw')

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/button_Log In'))

WebUI.setText(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/input_Other Events_searchbox'), 
    '123Test Event')

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/a_Test Event'))

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/a_Divisions'))

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/a_Divisions Wizard'))

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/input_Sort Order_ng-pristine ng-untouched n_10a49a'))

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/input_female_ng-pristine ng-untouched ng-va_af5c10'))

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/input_male_ng-pristine ng-untouched ng-vali_863c78'))

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/input_coed_input-inline ng-pristine ng-unto_3df5b0'))

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/input_coed_input-inline ng-pristine ng-unto_3df5b0_1'))

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/input_coed_input-inline ng-pristine ng-unto_3df5b0_1_2'))

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/input_coed_input-inline ng-pristine ng-unto_3df5b0_1_2_3'))

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/input_coed_input-inline ng-pristine ng-unto_3df5b0_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/input_coed_input-inline ng-pristine ng-unto_3df5b0_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/input_coed_input-inline ng-pristine ng-unto_3df5b0_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/input_coed_input-inline ng-pristine ng-unto_3df5b0_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/input_coed_input-inline ng-pristine ng-unto_3df5b0_1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/input_coed_input-inline ng-pristine ng-unto_3df5b0_1_2_3_4_5_6_7_8_9'))

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/input_Adult_ng-pristine ng-untouched ng-val_ec79f8'))

WebUI.click(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/button_Create'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Create Division/Page_SportWrench - The Home of Sporting Events/a_Divisions Wizard'), 
    0)

WebUI.closeBrowser()

