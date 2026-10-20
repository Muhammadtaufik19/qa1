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

WebUI.openBrowser("https://www.saucedemo.com/?utm_source")

String passwordInfo = WebUI.getText(findTestObject("Object Repository/Login/Get password"))

String password = passwordInfo.replace('Password for all users:', '').trim()

println(password)

WebUI.setText(findTestObject("Object Repository/Login/Username"), GlobalVariable.Username)

WebUI.delay(1)

WebUI.setText(findTestObject("Object Repository/Login/Password"), GlobalVariable.Password)

WebUI.click(findTestObject("Object Repository/Login/Button login"))

WebUI.verifyElementPresent(findTestObject("Object Repository/Dashboard/Title"), 5)

WebUI.verifyElementText(findTestObject("Object Repository/Dashboard/Title"), "Products")


