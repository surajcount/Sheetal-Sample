import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/*In this TC:
1.User will sort the documents from This client
2.Documents will be previewed from This client
3.Document will be edited from This client
*/
WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/DocumentRepositoryIconClick'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/sort click'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Click_PDF'))

WebUI.doubleClick(findTestObject('DragandDrop/Page_UAT (Countable)/New engagement acceptance just click'))

/*WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/SourceFile'))

WebUI.switchToWindowUrl('https://uat.adinovis.com/file-preview/pdf/false/9ea4b9f4-9509-4fbc-9200-03c215a0d0b3/view')

WebUI.delay(4)

WebUI.closeWindowUrl('https://uat.adinovis.com/file-preview/pdf/false/9ea4b9f4-9509-4fbc-9200-03c215a0d0b3/view')

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.delay(1)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/sort click'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Word Click'))

WebUI.doubleClick(findTestObject('DragandDrop/Page_UAT (Countable)/New engagement acceptance just click'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Word File click this client'))

WebUI.switchToWindowUrl('https://uat.adinovis.com/file-preview/ms/false/94f93f64-1500-453b-ab40-4d7bc2e1a903/view/false')

WebUI.delay(9)

WebUI.closeWindowUrl('https://uat.adinovis.com/file-preview/ms/false/94f93f64-1500-453b-ab40-4d7bc2e1a903/view/false')

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.delay(1)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/sort click'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Sort-Excel'))

WebUI.doubleClick(findTestObject('DragandDrop/Page_UAT (Countable)/New engagement acceptance just click'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Excel Click This client'))

WebUI.switchToWindowUrl('https://uat.adinovis.com/file-preview/ms/false/bc3dd5ca-6767-4b47-ac22-0accbb2b018b/view/false')

WebUI.delay(9)

WebUI.closeWindowUrl('https://uat.adinovis.com/file-preview/ms/false/bc3dd5ca-6767-4b47-ac22-0accbb2b018b/view/false')

WebUI.delay(1)

WebUI.switchToDefaultContent()

WebUI.delay(1)
*/
