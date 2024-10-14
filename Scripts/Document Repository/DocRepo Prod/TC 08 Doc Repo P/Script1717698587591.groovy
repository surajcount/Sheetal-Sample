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

//Adding TC where user verify enable/disable kebab menu
//collpase and go folder by folder
/*WebUI.callTestCase(findTestCase('Document Repository/DocRepo Prod/TC 01 Doc Repo P'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Document Repository/DocRepo Prod/TC 02 Doc Repo P'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Document Repository/Page_Countable/Prod Document Repo icon client via'))*/
WebUI.delay(2)

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

WebUI.scrollToElement(findTestObject('Document Repository/Page_Countable/Deleted click COM-SHE-Aug182023'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/Page_Countable/Deleted click COM-SHE-Aug182023'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Document Repository/Page_Countable/Review folder click'), 2)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Document Repository/hover to inactive file 01'))

WebUI.delay(1)

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

WebUI.click(findTestObject('Document Repository/Page_Countable/Collapse'))

WebUI.delay(1)

