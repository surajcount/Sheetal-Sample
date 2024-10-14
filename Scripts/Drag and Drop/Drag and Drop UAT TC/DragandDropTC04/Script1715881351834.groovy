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

//WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/This Client'))[add if executing multiple TCs]
WebUI.delay(1)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/This Client'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/sort click'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Click_PDF'))

WebUI.doubleClick(findTestObject('DragandDrop/Page_UAT (Countable)/New engagement acceptance just click'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/LHSExpand-Collapse'))

WebUI.delay(2)

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.dragAndDropToObject(findTestObject('DragandDrop/Page_UAT (Countable)/SourceFile'), findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/Drag and drop to Completion  Signoffs'))

WebUI.delay(5)

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_UP))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_UP))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_UP))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_UP))

WebUI.dragAndDropToObject(findTestObject('DragandDrop/Page_UAT (Countable)/SourceFile'), findTestObject('DragandDrop/Page_UAT (Countable)/Destination'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/sort click'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Word Click'))

WebUI.doubleClick(findTestObject('DragandDrop/Page_UAT (Countable)/New engagement acceptance just click'))

WebUI.dragAndDropToObject(findTestObject('DragandDrop/Page_UAT (Countable)/Word File click this client'), findTestObject(
        'DragandDrop/Page_UAT (Countable)/Destination'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/sort click'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Sort-Excel'))

WebUI.doubleClick(findTestObject('DragandDrop/Page_UAT (Countable)/New engagement acceptance just click'))

WebUI.dragAndDropToObject(findTestObject('DragandDrop/Page_UAT (Countable)/Excel Click This client'), findTestObject('DragandDrop/Page_UAT (Countable)/Destination'))

WebUI.delay(1)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/sort click'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Word Click'))

WebUI.doubleClick(findTestObject('DragandDrop/Page_UAT (Countable)/New engagement acceptance just click'))

WebUI.dragAndDropToObject(findTestObject('DragandDrop/Page_UAT (Countable)/Word File click this client'), findTestObject(
        'DragandDrop/Page_UAT (Countable)/Destination'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Popup click yes'))

WebUI.delay(2)

