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

//Data presented 1 year & then 2 year and verify all the applicable pages 
WebUI.click(findTestObject('FS statements and settings/FS settings click'))

WebUI.delay(7)

WebUI.doubleClick(findTestObject('FS statements and settings/FS settings close'))

WebUI.delay(7)

WebUI.click(findTestObject('FS statements and settings/Balance Sheet Preview'))

WebUI.delay(5)

WebUI.click(findTestObject('FS statements and settings/Preview Statement of loss and deficit'))

WebUI.delay(5)

WebUI.click(findTestObject('FS statements and settings/Preview Cash Flows'))

WebUI.delay(5)

WebUI.click(findTestObject('FS statements and settings/FS settings click'))

WebUI.delay(7)

WebUI.click(findTestObject('FS statements and settings/1 Year Click'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('FS statements and settings/2 Year'))

WebUI.delay(3)

WebUI.click(findTestObject('FS statements and settings/2 Year'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('FS statements and settings/FS settings close'))

WebUI.delay(3)

WebUI.click(findTestObject('FS statements and settings/Balance Sheet Preview'))

WebUI.delay(5)

WebUI.click(findTestObject('FS statements and settings/Preview Statement of loss and deficit'))

WebUI.delay(5)

WebUI.click(findTestObject('FS statements and settings/Preview Cash Flows'))

WebUI.delay(5)

