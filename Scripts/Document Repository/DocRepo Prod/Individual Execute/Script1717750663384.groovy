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

WebUI.delay(3)

WebUI.click(findTestObject('Document Repository/Page_Countable/Clients Redirection LHS Icon'))

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/Page_Countable/link client Sheetal New Prod redirect'))

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/New Engagement click'))

WebUI.delay(2)

WebUI.click(findTestObject('Document Repository/Doc Repo Inside Eng ICon'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/All Clients link click'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Searc All Clients prod'))

WebUI.delay(2)

WebUI.setText(findTestObject('Doc Repo Inside Eng/Search Send Text'), 'Trial')

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Preview pdf all client'))

WebUI.switchToWindowUrl('https://platform.countable.co/file-preview/pdf/false/null/view/true')

WebUI.delay(5)

WebUI.closeWindowUrl('https://platform.countable.co/file-preview/pdf/false/null/view/true')

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Preview excel all client'))

WebUI.switchToWindowUrl('https://platform.countable.co/file-preview/ms/false/e25c4efe-6640-4c51-9433-4e4c6aba525a/view/true')

WebUI.delay(5)

WebUI.closeWindowUrl('https://platform.countable.co/file-preview/ms/false/e25c4efe-6640-4c51-9433-4e4c6aba525a/view/true')

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/close search prod'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Sort click prod'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/pdf list click prod'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Doc Repo Inside Eng/just click prod'))

WebUI.delay(3)

WebUI.click(findTestObject('Doc Repo Inside Eng/Sort click prod'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Excel click list prod'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Doc Repo Inside Eng/just click prod'))

WebUI.delay(3)

WebUI.click(findTestObject('Doc Repo Inside Eng/Sort click prod'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Word click list prod'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Doc Repo Inside Eng/just click prod'))

WebUI.delay(4)

WebUI.click(findTestObject('Doc Repo Inside Eng/This client prod'))

WebUI.delay(6)

WebUI.click(findTestObject('Doc Repo Inside Eng/search this client prod'))

WebUI.delay(2)

WebUI.setText(findTestObject('Doc Repo Inside Eng/search send text this client'), 'grou')

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/This client excel click'))

WebUI.switchToWindowUrl('https://platform.countable.co/file-preview/ms/false/16d90842-09df-4a04-af9e-bc2249ed3c25/view/false')

WebUI.delay(5)

WebUI.closeWindowUrl('https://platform.countable.co/file-preview/ms/false/16d90842-09df-4a04-af9e-bc2249ed3c25/view/false')

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Prod pdf click this cient'))

WebUI.switchToWindowUrl('https://platform.countable.co/file-preview/pdf/false/58f88419-22cb-40c3-915e-7c3595022be1/view')

WebUI.delay(5)

WebUI.closeWindowUrl('https://platform.countable.co/file-preview/pdf/false/58f88419-22cb-40c3-915e-7c3595022be1/view')

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/search close this client'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Sort click prod this client'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/pdf list click prod'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Doc Repo Inside Eng/just click prod'))

WebUI.delay(3)

WebUI.click(findTestObject('Doc Repo Inside Eng/Sort click prod this client'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Excel click list prod'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Doc Repo Inside Eng/just click prod'))

WebUI.delay(3)

WebUI.click(findTestObject('Doc Repo Inside Eng/Sort click prod this client'))

WebUI.delay(2)

WebUI.click(findTestObject('Doc Repo Inside Eng/Word click list prod'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('Doc Repo Inside Eng/just click prod'))

WebUI.delay(3)

