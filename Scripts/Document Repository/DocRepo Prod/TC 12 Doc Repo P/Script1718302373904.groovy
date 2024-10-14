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

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/Doc Repo Inside Eng ICon'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/New folder expand'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Year click 01'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Year click 02'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/eng com click 01'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/eng com click 02'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/LHSExpand-Collapse'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/upload hover and click'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Add document kebab select 02'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('DragandDrop/Page_UAT (Countable)/TC 05 Send upload file path 03'), 'C:/Users/Admin/Desktop/5576.txt')

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Button_Add'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/upload file 02 in eng'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Add document kebab select 02'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('DragandDrop/Page_UAT (Countable)/TC 05 Send upload file path 03'), 'C:/Users/Admin/Desktop/AutomationUpload/AUEXDC.csv')

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Button_Add'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Year click 02'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/click eng renamed file'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/click rev folder'))

WebUI.delay(2)

WebUI.dragAndDropToObject(findTestObject('Doc Repo Inside Eng/Drag src 01'), findTestObject('Doc Repo Inside Eng/Dest 01'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Rename file 01'))

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/Page_Countable/Rename kebab option click'))

WebUI.setText(findTestObject('Doc Repo Inside Eng/Send rename text'), 'renamed')

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Popup click yes'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Delete 01'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Delete kebab click'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Delete button click'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Delete File 02'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Delete kebab click'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Delete button click'))

WebUI.delay(2)

