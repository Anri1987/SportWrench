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

WebUI.setText(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/input_Log In_email'), 
    '13818test_email_for_club@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/input_false_password'), 
    'SFTQUhjBfIY=')

WebUI.click(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/button_Log In'))

WebUI.click(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/a_Teams'))

WebUI.click(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/a_New Team'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/select_Select.8  Under9  Under10  Under11  _479ecf'), 
    'number:18', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/select_Select.12345678910111213141516171819_9fa821'), 
    'string:10', true)

WebUI.click(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/input_Female_gender'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/select_Select.IndoorDoubles'), 
    'number:1', true)

WebUI.click(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/button_Submit'))

WebUI.click(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/a_Enter Events'))

WebUI.click(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/button_InfoEnter'))

WebUI.click(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/button_Enter Event and Manage Teams'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/select_18 Club 18 Club Not entered'), 
    'number:16792011', true)

WebUI.click(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/a_Athletes'))

WebUI.click(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/a_XLSX Import'))

WebUI.closeBrowser()

