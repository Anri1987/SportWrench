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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/input_Log In_email'), 
    'wendy@mvvclub.com')

WebUI.setEncryptedText(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/input_false_password'), 
    'ugkk24xDMrWrlVpEbACuNZEQlZ6qfcdw')

WebUI.click(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/button_Log In'))

WebUI.click(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/a_Athletes'))

WebUI.click(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/a_Import from SportEngine'))

WebUI.click(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/button_Start Import'))

WebUI.verifyElementPresent(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/div_Import started'), 
    0)

WebUI.refresh()

WebUI.verifyElementPresent(findTestObject('Page_SportWrench - The Home of Sporting Events/div_Import is still in progress, please wait'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Page_SportWrench - The Home of Sporting Events/div_Import is still in progress, please wait'), 
    30)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/a_Import from SportEngine'))

WebUI.click(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/input_Import New AthleteStaff and Update Cu_a5a4d5'))

WebUI.click(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/button_Start Import'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/div_Import started'), 
    0)

WebUI.refresh()

WebUI.verifyElementPresent(findTestObject('Page_SportWrench - The Home of Sporting Events/div_Import is still in progress, please wait'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Page_SportWrench - The Home of Sporting Events/div_Import is still in progress, please wait'), 
    30)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/a_Import from AAU'))

WebUI.click(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/button_Start Import'))

WebUI.verifyElementPresent(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/div_Import started'), 
    0)

WebUI.refresh()

WebUI.verifyElementPresent(findTestObject('Page_SportWrench - The Home of Sporting Events/div_Import is still in progress, please wait'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Page_SportWrench - The Home of Sporting Events/div_Import is still in progress, please wait'), 
    30)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/a_Import from AAU'))

WebUI.click(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/input_Import New AthleteStaff and Update Cu_a5a4d5'))

WebUI.click(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/button_Start Import'))

WebUI.verifyElementPresent(findTestObject('Object Repository/USAV and AAU import/Page_SportWrench - The Home of Sporting Events/div_Import started'), 
    0)

WebUI.refresh()

WebUI.verifyElementPresent(findTestObject('Page_SportWrench - The Home of Sporting Events/div_Import is still in progress, please wait'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Page_SportWrench - The Home of Sporting Events/div_Import is still in progress, please wait'), 
    30)

WebUI.closeBrowser()

