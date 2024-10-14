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

WebUI.callTestCase(findTestCase('Document Repository/DocRepo Prod/TC 01 Doc Repo P'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Document Repository/DocRepo Prod/TC 02 Doc Repo P'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Document Repository/DocRepo Prod/TC 03 Doc Repo P'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Document Repository/DocRepo Prod/TC 04 Doc Repo P'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Document Repository/DocRepo Prod/TC 05 Doc Repo P'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Document Repository/DocRepo Prod/TC 06 Doc Repo P'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Document Repository/DocRepo Prod/TC 07 Doc Repo P'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Document Repository/DocRepo Prod/TC 08 Doc Repo P'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Document Repository/DocRepo Prod/TC 10 Doc Repo P Doc Repo Create Engagement Via Client'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Document Repository/DocRepo Prod/TC 11 Doc Repo P'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Document Repository/DocRepo Prod/TC 12 Doc Repo P'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Document Repository/DocRepo Prod/TC 13 Doc Repo P'), [:], FailureHandling.STOP_ON_FAILURE)

