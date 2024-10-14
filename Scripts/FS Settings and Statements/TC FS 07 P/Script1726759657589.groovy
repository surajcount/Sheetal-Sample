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

//Approve by the board
WebUI.click(findTestObject('FS statements and settings/FS settings click'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('FS statements and settings/FS settings close'))

WebUI.delay(2)

WebUI.click(findTestObject('FS statements and settings/Balance Sheet Preview'))

WebUI.delay(10)

WebUI.click(findTestObject('FS statements and settings/FS settings click'))

WebUI.delay(5)

WebUI.click(findTestObject('FS statements and settings/Approve by board'))

WebUI.delay(5)

WebUI.setText(findTestObject('FS statements and settings/Approve by 1 FN'), 'Sheetal')

WebUI.delay(5)

WebUI.setText(findTestObject('FS statements and settings/Approve by 1 Title'), 'QA')

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('FS statements and settings/Add board member button'), 10)

WebUI.click(findTestObject('FS statements and settings/Add board member button'))

WebUI.delay(10)

WebUI.setText(findTestObject('FS statements and settings/Approve by 2 FN'), 'Sheetal')

WebUI.delay(5)

WebUI.setText(findTestObject('FS statements and settings/Approve by 2 Title'), 'QA')

WebUI.delay(2)

WebUI.click(findTestObject('FS statements and settings/Add board member button'))

WebUI.delay(10)

WebUI.setText(findTestObject('FS statements and settings/Approval Text Edit'), 'Tester')

WebUI.delay(2)

WebUI.click(findTestObject('FS statements and settings/Update Text click'))

WebUI.delay(10)

WebUI.doubleClick(findTestObject('FS statements and settings/FS settings close'))

WebUI.delay(2)

