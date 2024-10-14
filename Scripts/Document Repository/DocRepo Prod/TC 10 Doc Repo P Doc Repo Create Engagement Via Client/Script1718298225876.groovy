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

WebUI.click(findTestObject('Document Repository/Create Engagement OR/span_Create Engagement'))

WebUI.click(findTestObject('Document Repository/Create Engagement OR/Select Engagement Type'))

WebUI.click(findTestObject('Document Repository/Create Engagement OR/Eng Type COM selection'))

WebUI.click(findTestObject('Document Repository/Create Engagement OR/Proceed click button'))

WebUI.click(findTestObject('Document Repository/Create Engagement OR/button_PeriodYear End Date'))

WebUI.click(findTestObject('Document Repository/Month'))

WebUI.click(findTestObject('Document Repository/Create Engagement OR/Year 2023'))

WebUI.click(findTestObject('Document Repository/Create Engagement OR/December 2023'))

WebUI.click(findTestObject('Document Repository/Create Engagement OR/31st december 2023'))

WebUI.click(findTestObject('Document Repository/Create Engagement OR/ApplyStep1'))

WebUI.setText(findTestObject('Document Repository/Create Engagement OR/input_Budget()_mat-input-12'), '10')

WebUI.click(findTestObject('Document Repository/Create Engagement OR/input_text'))

WebUI.click(findTestObject('Document Repository/Create Engagement OR/span_Statement of Cash Flows and Notes to FI'))

WebUI.delay(3)

WebUI.click(findTestObject('Document Repository/Create Engagement OR/span_Team member'))

WebUI.click(findTestObject('Document Repository/Create Engagement OR/step2Team member'))

WebUI.click(findTestObject('Document Repository/Create Engagement OR/span_Canada December-CSV'))

WebUI.setText(findTestObject('Document Repository/Create Engagement OR/input_Time Allocation()_mat-input-16'), '10')

WebUI.click(findTestObject('Document Repository/Create Engagement OR/img_Budgeted hours (H)_ng-star-inserted'))

WebUI.click(findTestObject('Document Repository/Create Engagement OR/span_Create Engagement_1'))

