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

WebUI.delay(4)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/TC05  Accounts Receivable click'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/TC05 notepad file prwview'))

WebUI.delay(4)

WebUI.dragAndDropToObject(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/TC05 drop word file 01'), 
    findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Middle ref drop'))

WebUI.delay(1)

WebUI.dragAndDropToObject(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/TC05 drop Excel file 01'), 
    findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/TC05 middle ref drop 02 for snd time'))

WebUI.mouseOver(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/TC05- hover 01 file'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/TC05 01 File kebab for download then delete'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/kebab_Download'))

WebUI.mouseOver(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/TC05- hover 01 file'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/TC05 01 File kebab for download then delete'))

WebUI.mouseOver(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/TC05- hover 01 file'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/kebab option Delete'))

WebUI.delay(3)

WebUI.click(findTestObject('DragandDrop/UATDeletekebab'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/TC05 notepad file prwview'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/TC05 02 File kebab for delete txt'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/kebab option Delete'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/UATDeletekebab'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/TC05 drop Excel file 01'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/file 03 kebab hover'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/kebab option Delete'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/UATDeletekebab'))

WebUI.delay(2)

