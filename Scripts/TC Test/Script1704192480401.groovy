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

WebUI.openBrowser('')

// login
WebUI.navigateToUrl('https://www.netflix.com/id/login')

WebUI.click(findTestObject('Object Repository/Login/1 email'))

WebUI.setText(findTestObject('Object Repository/Login/2 user id'), email)

WebUI.setText(findTestObject('Object Repository/Login/3 password'), password)

WebUI.click(findTestObject('Object Repository/Login/4 sign in'))

//end login
WebUI.delay(2)

// end edit profile name
// navigate to your account
WebUI.navigateToUrl('https://www.netflix.com/YourAccount')

// clear watch list - profil 1
WebUI.click(findTestObject('Pin/pin expand button 1'))

WebUI.click(findTestObject('StreamActivity/lihat 1'))

WebUI.click(findTestObject('StreamActivity/sembunyikan'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('StreamActivity/sembunyikan ya'), FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://www.netflix.com/YourAccount')
// end clear watch list - profil 1


// clear watch list - profil 2
WebUI.click(findTestObject('Pin/pin expand button 2'))

WebUI.click(findTestObject('StreamActivity/lihat 2'))

WebUI.click(findTestObject('StreamActivity/sembunyikan'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('StreamActivity/sembunyikan ya'), FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://www.netflix.com/YourAccount')
// end clear watch list - profil 2


// clear watch list - profil 3
WebUI.click(findTestObject('Pin/pin expand button 3'))

WebUI.click(findTestObject('StreamActivity/lihat 3'))

WebUI.click(findTestObject('StreamActivity/sembunyikan'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('StreamActivity/sembunyikan ya'), FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://www.netflix.com/YourAccount')
// end clear watch list - profil 3


// clear watch list - profil 4
WebUI.click(findTestObject('Pin/pin expand button 4'))

WebUI.click(findTestObject('StreamActivity/lihat 4'))

WebUI.click(findTestObject('StreamActivity/sembunyikan'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('StreamActivity/sembunyikan ya'), FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://www.netflix.com/YourAccount')
// end clear watch list - profil 4


// clear watch list - profil 5
WebUI.click(findTestObject('Pin/pin expand button 5'))

WebUI.click(findTestObject('StreamActivity/lihat 5'))

WebUI.click(findTestObject('StreamActivity/sembunyikan'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('StreamActivity/sembunyikan ya'), FailureHandling.OPTIONAL)

WebUI.navigateToUrl('https://www.netflix.com/YourAccount')
// end clear watch list - profil 5

WebUI.delay(2)

// log out
WebUI.navigateToUrl('https://www.netflix.com/id/logout')

WebUI.click(findTestObject('sign out'))

// end logout
WebUI.delay(2)

