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

// DOne Redirect to the client and check the engagements list
WebUI.callTestCase(findTestCase('Document Repository/DocRepo Prod/TC 01 Doc Repo P'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Document Repository/Page_Countable/Clients Redirection LHS Icon'))

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/Page_Countable/link client Sheetal New Prod redirect'))

WebUI.delay(2)

WebUI.getText(findTestObject('Document Repository/Page_Countable/gettext'))

WebUI.scrollToElement(findTestObject('Document Repository/Page_Countable/object client engagement list redirection'), 3)

WebUI.delay(2)

//Done folder elaborate
WebUI.click(findTestObject('Document Repository/Page_Countable/Prod Document Repo icon client via'))

WebUI.delay(2)

//Adding TC where user verify enable/disable kebab menu
//collpase and go folder by folder
WebUI.click(findTestObject('Document Repository/Page_Countable/Year click'))

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/Page_Countable/Compilation folder click'))

WebUI.delay(3)

WebUI.click(findTestObject('Document Repository/Page_Countable/COM-SHE-Dec312023'))

WebUI.delay(3)

WebUI.click(findTestObject('Document Repository/hover to active file 01'))

WebUI.delay(1)

WebUI.click(findTestObject('Document Repository/active file 01 kebab click'))

WebUI.delay(3)

WebUI.click(findTestObject('Document Repository/prod download kebab option'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Document Repository/Page_Countable/just click Engagement Info'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Document Repository/Page_Countable/Review folder click'), 2)

WebUI.click(findTestObject('Document Repository/Page_Countable/Deleted click COM-SHE-Aug182023'))

WebUI.scrollToElement(findTestObject('Document Repository/Page_Countable/Review folder click'), 2)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Document Repository/hover to inactive file 01'))

WebUI.delay(2)

WebUI.click(findTestObject('inactive file 01 kebab click'))

WebUI.delay(3)

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

WebUI.click(findTestObject('Document Repository/Page_Countable/Collapse'))

WebUI.delay(1)

WebUI.click(findTestObject('Document Repository/Page_Countable/Expand'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Document Repository/Page_Countable/scroll till 4'), 3)

WebUI.delay(3)

WebUI.click(findTestObject('Document Repository/Page_Countable/Review folder click'))

WebUI.delay(3)

WebUI.click(findTestObject('Document Repository/Page_Countable/REV-SHE-Sep142023'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Document Repository/Page_Countable/scroll till 6'), 3)

WebUI.delay(3)

//Create Folder
//WebUI.click(findTestObject('Document Repository/Page_Countable/Expand'))
WebUI.click(findTestObject('Document Repository/Page_Countable/Add Folder icon client Repo'))

WebUI.setText(findTestObject('Document Repository/Page_Countable/Enter folder name in client repo'), 'drag and drop via automation')

WebUI.click(findTestObject('Document Repository/Page_Countable/Create button'))

//Create Duplicate folder
WebUI.click(findTestObject('Document Repository/Page_Countable/Add Folder icon client Repo'))

WebUI.setText(findTestObject('Document Repository/Page_Countable/Enter folder name in client repo'), 'drag and drop via automation')

WebUI.click(findTestObject('Document Repository/Page_Countable/Create button'))

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/Page_Countable/click drag and drop folder created new folder'))

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

//Expand

WebUI.click(findTestObject('Document Repository/Page_Countable/Expand'))

WebUI.scrollToElement(findTestObject('Document Repository/Page_Countable/scroll till 1'), 3)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Document Repository/Page_Countable/scroll till 2'), 3)

WebUI.scrollToElement(findTestObject('Document Repository/Page_Countable/scroll till 3'), 3)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Document Repository/Page_Countable/scroll till 4'), 3)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Document Repository/Page_Countable/scroll till 5'), 3)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Document Repository/Page_Countable/scroll till 6'), 3)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Document Repository/Page_Countable/scroll till 7'), 3)

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/Page_Countable/Collapse'))

//search
WebUI.click(findTestObject('Document Repository/Page_Countable/search icon click'))

WebUI.setText(findTestObject('Document Repository/Page_Countable/Enter text in search box'), 'Trial')

WebUI.delay(3)

WebUI.click(findTestObject('Document Repository/Page_Countable/Preview Excel'))

WebUI.switchToWindowUrl('https://platform.countable.co/file-preview/ms/false/3aee2255-bc2e-497e-9083-04123e1e14b6/view/false')

WebUI.delay(5)

WebUI.closeWindowUrl('https://platform.countable.co/file-preview/ms/false/3aee2255-bc2e-497e-9083-04123e1e14b6/view/false')

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/Page_Countable/Preview PDF'))

WebUI.switchToWindowUrl('https://platform.countable.co/file-preview/pdf/false/e7baa120-d04d-43cd-8d48-e44504b5cdb2/view')

WebUI.delay(5)

WebUI.closeWindowUrl('https://platform.countable.co/file-preview/pdf/false/e7baa120-d04d-43cd-8d48-e44504b5cdb2/view')

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/Page_Countable/close search bar'))

WebUI.delay(2)

//Sort
WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/sort click'))

WebUI.click(findTestObject('Document Repository/Page_Countable/PDF click'))

WebUI.doubleClick(findTestObject('Document Repository/Page_Countable/just click Engagement Info'))

WebUI.click(findTestObject('Document Repository/Page_Countable/pdf click preview'))

WebUI.switchToWindowUrl('https://platform.countable.co/file-preview/pdf/false/9f668c2b-0307-49f9-a0df-6e64ce49c025/view')

WebUI.delay(5)

WebUI.closeWindowUrl('https://platform.countable.co/file-preview/pdf/false/9f668c2b-0307-49f9-a0df-6e64ce49c025/view')

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/sort click'))

WebUI.click(findTestObject('Document Repository/Page_Countable/Excel click'))

WebUI.doubleClick(findTestObject('Document Repository/Page_Countable/just click Engagement Info'))

WebUI.click(findTestObject('Document Repository/Page_Countable/excel click preview'))

WebUI.switchToWindowUrl('https://platform.countable.co/file-preview/ms/false/69dd9cb6-180b-448c-a62f-4d7fe1029756/view/false')

WebUI.delay(7)

WebUI.closeWindowUrl('https://platform.countable.co/file-preview/ms/false/69dd9cb6-180b-448c-a62f-4d7fe1029756/view/false')

WebUI.delay(5)

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/Page_Countable/Expand'))

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/Page_Countable/Collapse'))

