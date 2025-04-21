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

int counter = ((Math.random() * 100000 // Случайное число для уникальности
    ) as int)

// Генерируем email
String email = counter + 'Test_email_for_club@gmail.com'

// Открываем браузер и заполняем форму
WebUI.openBrowser('http://USAV:demo@dev.swstage.com/')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://USAV:demo@my.dev.swstage.com/#/')

WebUI.click(findTestObject('Object Repository/Create account/Page_SportWrench - The Home of Sporting Events/a_SIGN UP'))

WebUI.setText(findTestObject('Object Repository/Create account/Page_SportWrench - The Home of Sporting Events/input_Registration_first'), 
    'Tara')

WebUI.setText(findTestObject('Object Repository/Create account/Page_SportWrench - The Home of Sporting Events/input_false_last'), 
    'Charles')

// Используем сгенерированный email
WebUI.setText(findTestObject('Object Repository/Create account/Page_SportWrench - The Home of Sporting Events/input_false_email'), 
    email)

WebUI.setEncryptedText(findTestObject('Object Repository/Create account/Page_SportWrench - The Home of Sporting Events/input_false_password'), 
    'SFTQUhjBfIY=')

WebUI.setEncryptedText(findTestObject('Object Repository/Create account/Page_SportWrench - The Home of Sporting Events/input_false_password_confirmation'), 
    'SFTQUhjBfIY=')

WebUI.setText(findTestObject('Object Repository/Create account/Page_SportWrench - The Home of Sporting Events/input_1_phone_mob'), 
    '(855) 555-5555')

WebUI.setText(findTestObject('Object Repository/Create account/Page_SportWrench - The Home of Sporting Events/input_Will only be used to resolve account _8e33be'), 
    '12345')

WebUI.click(findTestObject('Object Repository/Create account/Page_SportWrench - The Home of Sporting Events/input_Spectator_clubDirector'))

WebUI.delay(1)

WebUI.click(findTestObject('Create account/Page_SportWrench - The Home of Sporting Events/button_Sign Up'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Create account/Page_SportWrench - The Home of Sporting Events/h2_Successfully registered'), 
    0)

WebUI.newTab('')

WebUI.navigateToUrl('https://dev.swstage.com/mail')

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Create account/Page_/a_962190'))

WebUI.doubleClick(findTestObject('Object Repository/Create account/Page_SportWrench/a_Activate Account'))

WebUI.delay(2)

WebUI.closeBrowser()

WebUI.openBrowser('http://USAV:demo@dev.swstage.com/')

WebUI.navigateToUrl('http://USAV:demo@my.dev.swstage.com/#/')

// Используем сгенерированный email при логине
WebUI.setText(findTestObject('Object Repository/Create account/Page_SportWrench - The Home of Sporting Events/input_false_email'), 
    email)

WebUI.setEncryptedText(findTestObject('Object Repository/Create account/Page_SportWrench - The Home of Sporting Events/input_false_password'), 
    'SFTQUhjBfIY=')

WebUI.click(findTestObject('Object Repository/Create account/Page_SportWrench - The Home of Sporting Events/button_Log In'))

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

WebUI.setText(findTestObject('Spy Web/Page_SportWrench - The Home of Sporting Events/input_Invoices_searchbox'), '[AUTOTESTS] JVA Event (do not touch!)')

WebUI.delay(2)

WebUI.click(findTestObject('Spy Web/Page_SportWrench - The Home of Sporting Events/span_AUTOTESTS JVA Event (do not touch)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/button_Enter Event and Manage Teams'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create team/Page_SportWrench - The Home of Sporting Events/select_18 Club 18 Club Not entered'), 
    'number:16792011', true)

WebUI.click(findTestObject('Object Repository/Team payment 22/Page_SportWrench - The Home of Sporting Events/button_Pay'))

WebUI.enhancedClick(findTestObject('Object Repository/Team payment 22/Page_SportWrench - The Home of Sporting Events/div_Proceed to payment'))

WebUI.setText(findTestObject('Object Repository/Team payment 22/Page_SportWrench - The Home of Sporting Events/input_Card number_number'), 
    '4242 4242 4242 4242')

WebUI.setText(findTestObject('Object Repository/Team payment 22/Page_SportWrench - The Home of Sporting Events/input_MM  YY_expiry'), 
    '12 / 27')

WebUI.setText(findTestObject('Object Repository/Team payment 22/Page_SportWrench - The Home of Sporting Events/input_Security code_cvc'), 
    '321')

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Object Repository/Team payment 22/Page_SportWrench - The Home of Sporting Events/button_Pay 1,000.00'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Team payment 22/Page_SportWrench - The Home of Sporting Events/span_Your Payment of 1,000.00 succeeded'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

