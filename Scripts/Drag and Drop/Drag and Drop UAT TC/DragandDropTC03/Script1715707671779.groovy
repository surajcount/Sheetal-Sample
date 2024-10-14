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

//WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/DocumentRepositoryIconClick'))
//calling TC 03
WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/All Clients link click'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Sort All Clients'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Click_PDF'))

WebUI.doubleClick(findTestObject('DragandDrop/Page_UAT (Countable)/New engagement acceptance just click'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/All client pdf doc click'))

WebUI.switchToWindowUrl('https://uat.adinovis.com/file-preview/pdf/false/18e6dbea-98d8-404b-af5f-266b4a2b81f5/view/true')

WebUI.delay(5)

WebUI.closeWindowUrl('https://uat.adinovis.com/file-preview/pdf/false/18e6dbea-98d8-404b-af5f-266b4a2b81f5/view/true')

WebUI.delay(2)

WebUI.switchToDefaultContent()

