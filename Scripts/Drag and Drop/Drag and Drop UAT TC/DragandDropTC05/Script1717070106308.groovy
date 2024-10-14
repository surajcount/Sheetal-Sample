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

/*WebUI.delay(3)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/LHSExpand-Collapse'))*/
WebUI.delay(1)

WebUI.mouseOver(findTestObject('DragandDrop/Page_UAT (Countable)/mouse hover 01'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/mouse hove doc 1 kebab click'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Kebab Option Rename'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/rename doc 1 enter new name'), Keys.chord(
        Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, 
        Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, 
        Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, 
        Keys.BACK_SPACE, Keys.BACK_SPACE))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/just click rename popup to verify yes disabled'))

WebUI.delay(3)

WebUI.setText(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/rename doc 1 enter new name'), 'Rename Via Automation ')

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/just click rename popup to verify yes disabled'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Popup click yes'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Page_UAT (Countable)/Rename Via Automation'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/img'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/doc kebab menu move click'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/move choose_Completion  Signoffs'))

WebUI.delay(3)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/move click_Procedures'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/move click_Assets'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/move_Current assets'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/radio click move AR'))

WebUI.delay(1)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Move click popup'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/LHSExpand-Collapse'))

WebUI.delay(1)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/LHSExpand-Collapse'))

WebUI.scrollToElement(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/scroll till post doc move'), 
    0)

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_UP))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_UP))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_UP))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_UP))

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_UP))

WebUI.mouseOver(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/moved file mouse hover2'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/moved file kebab'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/kebab_Download'))

WebUI.mouseOver(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/moved file mouse hover2'))

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/moved file kebab'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/kebab option Delete'))

WebUI.delay(2)

WebUI.click(findTestObject('DragandDrop/Page_UAT (Countable)/Page_UAT (Countable)/Button Delete click'))

WebUI.delay(2)

WebUI.sendKeys(null, Keys.chord(Keys.ARROW_UP))

