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

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/LHSExpand-Collapse'))

WebUI.delay(2)

//WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/LHSExpand-Collapse'))
WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/LHSExpand-Collapse'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Document Upload kebab 01'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Add document kebab select 02'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('DragandDrop/Page_UAT (Countable)/TC 05 Send upload file path 03'), 'C:/Users/Admin/Desktop/AutomationUpload/AIM.mp4')

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Button_Cancel'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Document Upload kebab 01'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Add document kebab select 02'))

WebUI.sendKeys(findTestObject('DragandDrop/Page_UAT (Countable)/TC 05 Send upload file path 03'), 'C:/Users/Admin/Desktop/AutomationUpload/AUPDDC.pdf')

WebUI.sendKeys(findTestObject('DragandDrop/Page_UAT (Countable)/TC 05 Send upload file path 03'), 'C:/Users/Admin/Desktop/AutomationUpload/AUEXDC.csv')

WebUI.sendKeys(findTestObject('DragandDrop/Page_UAT (Countable)/TC 05 Send upload file path 03'), 'C:/Users/Admin/Desktop/5576.txt')

WebUI.sendKeys(findTestObject('DragandDrop/Page_UAT (Countable)/TC 05 Send upload file path 03'), 'C:/Users/Admin/Desktop/AutomationUpload/AUWODC.docx')

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Button_Add'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/LHSExpand-Collapse'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/LHSExpand-Collapse'))

WebUI.delay(4)

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

//duplicate file validation 
WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Document Upload kebab 01'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Add document kebab select 02'))

WebUI.sendKeys(findTestObject('DragandDrop/Page_UAT (Countable)/TC 05 Send upload file path 03'), 'C:/Users/Admin/Desktop/AutomationUpload/AUEXDC.csv')

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Button_Cancel'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 kebab menu click upload'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Kebab Option Rename'))

WebUI.delay(2)

WebUI.clearText(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/rename doc 1 enter new name'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/just click rename popup to verify yes disabled'))

WebUI.setText(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/rename doc 1 enter new name'), '02 Rename Via Automation ')

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/just click rename popup to verify yes disabled'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Popup click yes'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Document Upload kebab 01'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Add document kebab select 02'))

//same name file adding post renaming
WebUI.sendKeys(findTestObject('DragandDrop/Page_UAT (Countable)/TC 05 Send upload file path 03'), 'C:/Users/Admin/Desktop/AutomationUpload/AUEXDC.csv')

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Button_Add'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/LHSExpand-Collapse'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/LHSExpand-Collapse'))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/TC 05 Middle Ref click procedure'))

WebUI.delay(10)

WebUI.dragAndDropToObject(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Middle Ref drag'), findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Middle ref drop'))

WebUI.delay(4)

WebUI.dragAndDropToObject(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Middle Ref drag'), findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Middle ref drop'))

WebUI.delay(5)

WebUI.dragAndDropToObject(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Middle Ref drag'), findTestObject('Document Repository/TC05 Middle Ref drop 02'))

WebUI.delay(2)

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

/*WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Ref preview click'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Ref preview open'))

WebUI.switchToWindowUrl('https://uat.adinovis.com/file-preview/pdf/false/614eda65-4aaf-4c24-b323-45ee21c43ecc/view')

WebUI.delay(3)

WebUI.closeWindowUrl('https://uat.adinovis.com/file-preview/pdf/false/614eda65-4aaf-4c24-b323-45ee21c43ecc/view')

WebUI.delay(2)

WebUI.switchToDefaultContent()
*/
WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Delete icon mid ref'))

WebUI.delay(3)

WebUI.click(findTestObject('DragandDrop/Delete middle dropped file'))

WebUI.delay(3)

WebUI.dragAndDropToObject(findTestObject('DragandDrop/Page_UAT (Countable)/TC05 Middle Ref drag'), findTestObject('DragandDrop/Page_UAT (Countable)/TC 05 Middle Ref click procedure'))

WebUI.delay(2)

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_DOWN))

