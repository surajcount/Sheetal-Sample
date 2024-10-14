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

//Expand
WebUI.click(findTestObject('Document Repository/Page_Countable/Expand'))

WebUI.scrollToElement(findTestObject('Document Repository/Page_Countable/scroll till 1'), 3)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Document Repository/Page_Countable/scroll till 2'), 3)

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

