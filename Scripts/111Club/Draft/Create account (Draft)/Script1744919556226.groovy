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

// Создаем счетчик без хранения в файле
int counter = ((Math.random() * 100000 // Случайное число для уникальности
    ) as int)

// Генерируем email
String email = counter + 'Test_email_for_club@gmail.com'

// Открываем браузер и заполняем форму
WebUI.openBrowser('http://USAV:demo@dev.swstage.com/')

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

WebUI.enhancedClick(findTestObject('Object Repository/Create account/Page_SportWrench - The Home of Sporting Events/button_Sign Up'))

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

