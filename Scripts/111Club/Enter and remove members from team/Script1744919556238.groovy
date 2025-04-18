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

WebUI.setText(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_Log In_email'), 
    'hghh@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_false_password'), 
    'ugkk24xDMrWrlVpEbACuNZEQlZ6qfcdw')

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/button_Log In'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/a_My lub'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/a_Athletes'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_Webpoint_ng-pristine ng-untouched ng-_67f57a'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_USAV_ng-pristine ng-untouched ng-vali_2bf2f0'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_USAV_ng-pristine ng-untouched ng-vali_2bf2f0_1'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_USAV_ng-pristine ng-untouched ng-vali_2bf2f0_1_2'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_USAV_ng-pristine ng-untouched ng-vali_2bf2f0_1_2_3'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_Add to Team_caret'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/div_G18LAVAW10SC'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_The Athletes Zoey Yu, Ariana Zapata, C_1ab2e4'), 
    0)

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/a_Staff'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_Sanctioned body_ng-pristine ng-untouc_34dc9e'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_USAV_ng-pristine ng-untouched ng-vali_2bf2f0_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_USAV_ng-pristine ng-untouched ng-vali_2bf2f0_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_USAV_ng-pristine ng-untouched ng-vali_2bf2f0_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_USAV_ng-pristine ng-untouched ng-vali_2bf2f0_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/button_Add to Team'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/div_G18LAVAW10SC'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/div_Successful Operation'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_G18LAVAW10SC'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_G18LAVAW10SC_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_G18LAVAW10SC_1_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_G18LAVAW10SC_1_2_3'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_G18LAVAW10SC_1_2_3_4'), 
    0)

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/a_Athletes'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/td_LAVA West 18 10'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/td_LAVA West 18 10_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/td_LAVA West 18 10_1_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/td_LAVA West 18 10_1_2_3'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/td_LAVA West 18 10_1_2_3_4'), 
    0)

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/a_Teams'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_LAVA West 18 10'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/a_Athletes'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_USAV'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_USAV_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_USAV_1_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_USAV_1_2_3'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_USAV_1_2_3_4'), 
    0)

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/a_Staff'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_USAV_1_2_3_4_5'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_USAV_1_2_3_4_5_6'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_USAV_1_2_3_4_5_6_7'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_USAV_1_2_3_4_5_6_7_8'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_USAV_1_2_3_4_5_6_7_8_9'), 
    0)

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/button_Close'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/a_Athletes'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_Webpoint_ng-pristine ng-untouched ng-_67f57a'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_USAV_ng-pristine ng-untouched ng-vali_2bf2f0'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_USAV_ng-pristine ng-untouched ng-vali_2bf2f0_1'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_USAV_ng-pristine ng-untouched ng-vali_2bf2f0_1_2'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_USAV_ng-pristine ng-untouched ng-vali_2bf2f0_1_2_3'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/button_Remove from teams'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/span_The Athletes Zoey Yu, Ariana Zapata, C_82d841'), 
    0)

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/a_Staff'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_Sanctioned body_ng-pristine ng-untouc_34dc9e'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_USAV_ng-pristine ng-untouched ng-vali_2bf2f0_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_USAV_ng-pristine ng-untouched ng-vali_2bf2f0_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_USAV_ng-pristine ng-untouched ng-vali_2bf2f0_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/input_USAV_ng-pristine ng-untouched ng-vali_2bf2f0_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/button_Remove from teams_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Enter and delete members from team/Page_SportWrench - The Home of Sporting Events/div_Successful Operation'), 
    0)

WebUI.closeBrowser()

