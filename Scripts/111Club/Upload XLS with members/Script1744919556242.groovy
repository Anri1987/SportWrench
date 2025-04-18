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

WebUI.setText(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/input_Log In_email (1)'), 
    '71856test_email_for_club@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/input_false_password (1)'), 
    'SFTQUhjBfIY=')

WebUI.click(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/button_Log In (1)'))

WebUI.click(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/a_Athletes (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/input_No current season teams found_pull-le_c33dfe (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/button_Remove from teams'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/a_Staff (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/input_No current season teams found_ng-pris_4ffcfd'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/button_Remove from teams_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/a_Athletes (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/a_XLSX Import (1)'))

WebUI.uploadFile(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/input_here_roster-list (1)'), 
    file)

WebUI.click(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/button_Import (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/td_cfa 18 10'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/td_cfa 18 10_1_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/td_cfa 18 10_1'), 
    0)

WebUI.click(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/a_Staff (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/span_G185007710XX_1_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/span_G185007710XX_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/xls/Page_SportWrench - The Home of Sporting Events/span_G185007710XX'), 
    0)

WebUI.closeBrowser()

