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

WebUI.setText(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_Log In_email'), 
    'dcgfcgchfhgvhv@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_false_password'), 
    'ugkk24xDMrWrlVpEbACuNZEQlZ6qfcdw')

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/button_Log In'))

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/a_New Event'))

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/span_Event Details'))

WebUI.setText(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_Event Name_long_name'), 
    '123 Ticket test event')

WebUI.setText(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_Short Name_name'), 
    'tte')

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_Ticket Sales_allow_ticket_sales'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/select_Choose a Timezone .AmericaNew_YorkAm_0bdf4d'), 
    'America/New_York', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/select_Choose Sport .VolleyballBasketballSo_1c54a4'), 
    '2', true)

WebUI.enhancedClick(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/select_Choose Sport Variation .IndoorDoubles'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/select_Choose Sport Variation .IndoorDoubles'), 
    'number:1', true)

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_Date Start_date_start'))

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/button_April 2025_btn btn-default btn-sm pu_492a81'))

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/button_April 2025_btn btn-default btn-sm pu_492a81'))

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/button_30'))

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/button_Date'))

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/button_Close'))

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_Date End_date_end'))

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/button_April 2025_btn btn-default btn-sm pu_492a81'))

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/button_April 2025_btn btn-default btn-sm pu_492a81'))

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/button_30'))

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/button_Date'))

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/button_Close'))

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_Make Event Live to Public_ng-pristine_2d3249'))

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/span_Host Organization Information'))

WebUI.setText(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_Organization Name_org_name'), 
    '101 North Atlantic Avenue')

WebUI.setText(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_Address_host_address'), 
    '101 North Atlantic Avenue')

WebUI.setText(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_City_host_city'), 
    'Daytona Beach')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/select_Select.AlabamaAlaskaAlbertaArizonaAr_24cd39'), 
    'string:FL', true)

WebUI.setText(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_ZIP_host_zip'), 
    '32218')

WebUI.setText(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_Phone_org_phone'), 
    '(111) 111-1111')

WebUI.setText(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_Website URL_website'), 
    'http://111fapl.ru')

WebUI.setText(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_Log In_email'), 
    'dhbrhnrghnrhnrst@gmail.com')

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/span_Main Location'))

WebUI.setText(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_Location name_name'), 
    'Daytona Beach Ocean Center')

WebUI.setText(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_Short name_short_name'), 
    'Molly')

WebUI.setText(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_Address_address'), 
    '101 North Atlantic Avenue')

WebUI.setText(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_City_city'), 
    'Daytona Beach')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/select_Choose State .AlabamaAlaskaAlbertaAr_76df04'), 
    'string:FL', true)

WebUI.setText(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/input_ZIP_zip'), 
    '32218')

WebUI.click(findTestObject('Object Repository/Create an event for tikets/Page_SportWrench - The Home of Sporting Events/button_Save'))

WebUI.delay(3)

WebUI.closeBrowser()

