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