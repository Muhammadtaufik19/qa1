import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.model.FailureHandling.CONTINUE_ON_FAILURE
import static com.kms.katalon.core.model.FailureHandling.STOP_ON_FAILURE
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
import org.apache.logging.log4j.core.appender.DefaultErrorHandler as DefaultErrorHandler
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.url2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Demoqa/Element'))

WebUI.click(findTestObject('Object Repository/Demoqa/Button Text box'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Demoqa/Header Tex box'), 5)

WebUI.setText(findTestObject("Object Repository/Demoqa/Full name"), "user1")

WebUI.setText(findTestObject("Object Repository/Demoqa/Email"), "user1@gmail.com")

WebUI.setText(findTestObject("Object Repository/Demoqa/Address"), "jl1 wkwkwk")

WebUI.setText(findTestObject("Object Repository/Demoqa/Permanent address"), "jl2 hjkhj")

WebUI.click(findTestObject("Object Repository/Demoqa/Button submit"))


//WebUI.callTestCase(findTestCase('Test Cases/demoqa1'), [:], FailureHandling.STOP_ON_FAILURE)


