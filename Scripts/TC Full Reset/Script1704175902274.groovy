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



// navigate to profiles manage
WebUI.navigateToUrl('https://www.netflix.com/profiles/manage')



// delete profile

WebUI.click(findTestObject('Profile/profile yang ingin dihapus 2'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Profile/profile delete'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Profile/profile delete confirm'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile yang ingin dihapus 2'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Profile/profile delete'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Profile/profile delete confirm'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile yang ingin dihapus 2'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Profile/profile delete'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Profile/profile delete confirm'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile yang ingin dihapus 2'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Profile/profile delete'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Profile/profile delete confirm'), FailureHandling.OPTIONAL)

// end delete profile



// navigate to profiles manage
WebUI.navigateToUrl('https://www.netflix.com/profiles/manage', FailureHandling.OPTIONAL)


// edit profile 1
WebUI.click(findTestObject('Profile/profile edit name 1'))
WebUI.clearText(findTestObject('Profile/profile edit name text'))
WebUI.setText(findTestObject('Profile/profile edit name text'), 'PROFILE 1')
WebUI.click(findTestObject('Profile/language change'))
WebUI.click(findTestObject('Profile/language indonesia'))
WebUI.click(findTestObject('Profile/profile edit name save'))


// add profile
WebUI.click(findTestObject('Profile/profile add 2'))
WebUI.setText(findTestObject('Profile/profile input name'), 'PROFILE 2')
WebUI.click(findTestObject('Profile/profile input name continue'))

WebUI.click(findTestObject('Profile/profile add 3'))
WebUI.setText(findTestObject('Profile/profile input name'), 'PROFILE 3')
WebUI.click(findTestObject('Profile/profile input name continue'))

WebUI.click(findTestObject('Profile/profile add 4'))
WebUI.setText(findTestObject('Profile/profile input name'), 'PROFILE 4')
WebUI.click(findTestObject('Profile/profile input name continue'))

WebUI.click(findTestObject('Profile/profile add 5'))
WebUI.setText(findTestObject('Profile/profile input name'), 'PROFILE 5')
WebUI.click(findTestObject('Profile/profile input name continue'))

WebUI.click(findTestObject('Profile/profile done'))

// end add profile



// navigate to your account
WebUI.navigateToUrl('https://www.netflix.com/YourAccount')

// set pin - profile 1
WebUI.click(findTestObject('Pin/pin expand button 1'))
WebUI.click(findTestObject('Pin/pin change 1'))
WebUI.setText(findTestObject('Pin/pin input password'), password)
WebUI.click(findTestObject('Pin/pin input password continue'))

// condition for profile 1
if (WebUI.verifyElementNotPresent(findTestObject('Pin/pin input A'), 2, FailureHandling.OPTIONAL)) {

	WebUI.click(findTestObject('Pin/pin checkbox'))	
	
	WebUI.setText(findTestObject('Pin/pin input A'), '1')
	WebUI.setText(findTestObject('Pin/pin input B'), '1')
	WebUI.setText(findTestObject('Pin/pin input C'), '1')	
	WebUI.setText(findTestObject('Pin/pin input D'), '1')
	
	WebUI.click(findTestObject('Pin/pin input save 1'))
		
} else {
    
	WebUI.click(findTestObject('Pin/pin checkbox'))
	WebUI.click(findTestObject('Pin/pin input save 1a'))
	
	WebUI.click(findTestObject('Pin/pin expand button 1'))
	WebUI.click(findTestObject('Pin/pin change 1'))
	WebUI.setText(findTestObject('Pin/pin input password'), password)
	WebUI.click(findTestObject('Pin/pin input password continue'))
	
	WebUI.click(findTestObject('Pin/pin checkbox'))
	
	WebUI.setText(findTestObject('Pin/pin input A'), '1')
	WebUI.setText(findTestObject('Pin/pin input B'), '1')
	WebUI.setText(findTestObject('Pin/pin input C'), '1')
	WebUI.setText(findTestObject('Pin/pin input D'), '1')
	
	WebUI.click(findTestObject('Pin/pin input save 1'))
}
// end condition for profile 1
// end set pin - profile 1

// set pin - profile 2
WebUI.click(findTestObject('Pin/pin expand button 2'))
WebUI.click(findTestObject('Pin/pin change 2'))
WebUI.setText(findTestObject('Pin/pin input password'), password)
WebUI.click(findTestObject('Pin/pin input password continue'))

WebUI.click(findTestObject('Pin/pin checkbox'))

WebUI.setText(findTestObject('Pin/pin input A'), '1')
WebUI.setText(findTestObject('Pin/pin input B'), '1')
WebUI.setText(findTestObject('Pin/pin input C'), '1')
WebUI.setText(findTestObject('Pin/pin input D'), '2')

WebUI.click(findTestObject('Pin/pin input save 2'))
// end set pin - profile 2



// set pin - profile 3
WebUI.click(findTestObject('Pin/pin expand button 3'))
WebUI.click(findTestObject('Pin/pin change 3'))
WebUI.setText(findTestObject('Pin/pin input password'), password)
WebUI.click(findTestObject('Pin/pin input password continue'))

WebUI.click(findTestObject('Pin/pin checkbox'))

WebUI.setText(findTestObject('Pin/pin input A'), '1')
WebUI.setText(findTestObject('Pin/pin input B'), '1')
WebUI.setText(findTestObject('Pin/pin input C'), '1')
WebUI.setText(findTestObject('Pin/pin input D'), '3')

WebUI.click(findTestObject('Pin/pin input save 3'))
// end set pin - profile 3



// set pin - profile 4
WebUI.click(findTestObject('Pin/pin expand button 4'))
WebUI.click(findTestObject('Pin/pin change 4'))
WebUI.setText(findTestObject('Pin/pin input password'), password)
WebUI.click(findTestObject('Pin/pin input password continue'))

WebUI.click(findTestObject('Pin/pin checkbox'))

WebUI.setText(findTestObject('Pin/pin input A'), '1')
WebUI.setText(findTestObject('Pin/pin input B'), '1')
WebUI.setText(findTestObject('Pin/pin input C'), '1')
WebUI.setText(findTestObject('Pin/pin input D'), '4')

WebUI.click(findTestObject('Pin/pin input save 4'))
// end set pin - profile 4



// set pin - profile 5
WebUI.click(findTestObject('Pin/pin expand button 5'))
WebUI.click(findTestObject('Pin/pin change 5'))
WebUI.setText(findTestObject('Pin/pin input password'), password)
WebUI.click(findTestObject('Pin/pin input password continue'))

WebUI.click(findTestObject('Pin/pin checkbox'))
WebUI.setText(findTestObject('Pin/pin input A'), '1')
WebUI.setText(findTestObject('Pin/pin input B'), '1')
WebUI.setText(findTestObject('Pin/pin input C'), '1')
WebUI.setText(findTestObject('Pin/pin input D'), '5')

WebUI.click(findTestObject('Pin/pin input save 5'))
// end set pin - profile 5

WebUI.delay(2)

// log out
WebUI.navigateToUrl('https://www.netflix.com/id/logout')
WebUI.click(findTestObject('sign out'))
// end logout

WebUI.delay(2)