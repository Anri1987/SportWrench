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

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Log In_email'), 
    'dcgfcgchfhgvhv@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_false_password'), 
    'ugkk24xDMrWrlVpEbACuNZEQlZ6qfcdw')

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_Log In'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/a_New Event'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/span_Event Details'))

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Event Name_long_name'), 
    '123Test Event')

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Short Name_name'), 
    'TE')

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Teams_allow_teams_registration'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Ticket Sales_allow_ticket_sales'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/select_Choose a Timezone .AmericaNew_YorkAm_0bdf4d'), 
    'America/New_York', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/select_Choose Sport .VolleyballBasketballSo_1c54a4'), 
    '2', true)

WebUI.enhancedClick(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/select_Choose Sport Variation .IndoorDoubles'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/select_Choose Sport Variation .IndoorDoubles'), 
    'number:1', true)

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Date Start_date_start'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_April 2025_btn btn-default btn-sm pu_492a81'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_April 2025_btn btn-default btn-sm pu_492a81'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_18'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_Date'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_Close'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Date End_date_end'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_April 2025_btn btn-default btn-sm pu_492a81'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_April 2025_btn btn-default btn-sm pu_492a81'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_20'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_Date'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_Close'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Make Event Live to Public_ng-pristine_2d3249'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/span_Host Organization Information'))

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Organization Name_org_name'), 
    '101 North Atlantic Avenue')

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Address_host_address'), 
    '101 North Atlantic Avenue')

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_City_host_city'), 
    'Daytona Beach')

WebUI.selectOptionByValue(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/select_Select.AlabamaAlaskaAlbertaArizonaAr_24cd39'), 
    'string:AL', true)

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_ZIP_host_zip'), 
    '32218')

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Phone_org_phone'), 
    '(111) 111-1111')

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Website URL_website'), 
    'http://111fapl.ru')

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Log In_email'), 
    'dhntyjrtjrujtst@gmail.com')

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/span_Teams Registration Details'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/label_Use Registration'))

WebUI.doubleClick(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/label_Use Registration'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Activate Teams Registration_live_reg'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Open Date_reg_open'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_31'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_Date'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_Close'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Close Date_reg_close'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_April 2025_btn btn-default btn-sm pu_492a81'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_22'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_Date'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_Close'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Female_female_gender'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Male_male_gender'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Coed_coed_gender'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/select_Choose Sanctioning Body .USAVAAUJVA9_9b6f50'), 
    'number:3', true)

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Require USAV Number_usav_req'))

WebUI.selectOptionByValue(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/select_Choose USAV Region .AlaskaAlohaArizo_c03c28'), 
    'string:AK', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/select_Choose Event Type .RegionalNationalQ_75cf81'), 
    'string:regional', true)

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Registration Fee_reg_fee'), 
    '1000')

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Hide Seeds_hide_seeds'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Roster Deadline_deadline'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_April 2025_btn btn-default btn-sm pu_492a81_1'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_23'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_Date_1'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_Close_1'))

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/span_Payment Information'))

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Address_address'), 
    'Ut consequatur aliq')

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_City_city'), 
    'Eiusmod quo doloribu')

WebUI.selectOptionByValue(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/select_Choose a State .AlabamaAlaskaAlberta_e68b6b'), 
    'string:AL', true)

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Zip_zip (1)'), 
    '11949')

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/label_Checks Payable to'))

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Checks Payable to_payment_name'), 
    '6565233')

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Tournament Uses Card Payments_allow_c_cda1e1'))

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Statement Descriptor_stripe_statement'), 
    'gffcggfccgc')

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Credit Surcharge_surcharge'), 
    '0')

WebUI.selectOptionByValue(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/select_Choose a Stripe Account .Lev (lev.ku_173092'), 
    'number:16777251', true)

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/span_Main Location'))

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Location name_name'), 
    'Daytona Beach Ocean Center')

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Short name_short_name'), 
    'Molly')

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_Address_address_1'), 
    '101 North Atlantic Avenue')

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_City_city_1'), 
    'Daytona Beach')

WebUI.selectOptionByValue(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/select_Choose State .AlabamaAlaskaAlbertaAr_76df04'), 
    'string:AL', true)

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_ZIP_zip'))

WebUI.setText(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/input_ZIP_zip'), 
    '32218')

WebUI.click(findTestObject('Object Repository/EVENT FOR TEAMS/Page_SportWrench - The Home of Sporting Events/button_Save'))

WebUI.delay(3)

WebUI.closeBrowser()

