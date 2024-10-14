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

//tc03 File upload
WebUI.sendKeys(findTestObject('Document Repository/Page_Countable/file upload path'), 'C:/Users/Admin/Desktop/AutomationUpload/AUPDDC.pdf')

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/Page_Countable/click drag and drop folder created new folder'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Document Repository/Page_Countable/file upload path'), 'C:/Users/Admin/Desktop/AutomationUpload/AUEXDC.csv')

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/Page_Countable/click drag and drop folder created new folder'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Document Repository/Page_Countable/file upload path'), 'C:/Users/Admin/Desktop/5576.txt')

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/Page_Countable/click drag and drop folder created new folder'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Document Repository/Page_Countable/file upload path'), 'C:/Users/Admin/Desktop/AutomationUpload/AUWODC.docx')

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/Page_Countable/click drag and drop folder created new folder'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Document Repository/Page_Countable/file upload path'), 'C:/Users/Admin/Desktop/AutomationUpload/AUWODC.docx')

WebUI.delay(4)

WebUI.mouseOver(findTestObject('Document Repository/Page_Countable/Hover 1st word file name for rename'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Page_Countable/kebab click'))

WebUI.click(findTestObject('Document Repository/prod download kebab option'))

WebUI.delay(3)

WebUI.click(findTestObject('Document Repository/Page_Countable/Rename kebab option click'))

WebUI.sendKeys(findTestObject('Document Repository/Page_Countable/Enter text input field post rename'), Keys.chord(Keys.BACK_SPACE,
		Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,
		Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE))

WebUI.click(findTestObject('Document Repository/Page_Countable/correct green tick click'))

WebUI.delay(4)

WebUI.setText(findTestObject('Document Repository/Page_Countable/Enter text input field post rename'), 'rename by automation')

WebUI.click(findTestObject('Document Repository/Page_Countable/correct green tick click'))

WebUI.delay(6)
