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

WebUI.setText(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/input_Log In_email'), 
    '13818test_email_for_club@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/input_false_password'), 
    'SFTQUhjBfIY=')

WebUI.click(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/button_Log In'))

WebUI.click(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/a_Enter Club Info'))

WebUI.setText(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/input_Club Name_club_name'), 
    'New Test Club for autotests')

WebUI.setText(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/input_Short Club Name_team_prefix'), 
    'cfa')

WebUI.click(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/input_Indoor_sport_variations'))

WebUI.click(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/input_Doubles_sport_variations'))

WebUI.click(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/input_Female_team_genders'))

WebUI.click(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/input_Male_team_genders'))

WebUI.click(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/input_Coed_team_genders'))

WebUI.click(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/input_JVA_sanctioned_by'))

WebUI.setText(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/input_Address_address'), 
    '101 North Atlantic Avenue')

WebUI.setText(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/input_City_city'), 
    'Daytona Beach')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/select_Select.AlabamaAlaskaArizonaArkansasC_7e0971'), 
    'string:FL', true)

WebUI.setText(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/input_ZIP_zip'), 
    '32218')

WebUI.setText(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/input_Administrative Email_administrative_email'), 
    'fdredv@gmail.com')

WebUI.click(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/input_Female_director_gender'))

WebUI.click(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/span_Birthdate_glyphicon glyphicon-calendar'))

WebUI.click(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/button_Birthdate_btn btn-default btn-sm pul_bd3ef5'))

WebUI.click(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/button_2001'))

WebUI.click(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/button_January'))

WebUI.click(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/button_15'))

WebUI.click(findTestObject('Object Repository/Create Club/Page_SportWrench - The Home of Sporting Events/input_Birthdate_btn btn-primary pull-right'))

