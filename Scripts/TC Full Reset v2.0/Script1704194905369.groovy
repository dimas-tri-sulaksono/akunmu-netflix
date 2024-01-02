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

WebUI.click(findTestObject('Profile/GagalHapus/simpan profile'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/GagalHapus/batal'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile yang ingin dihapus 3'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile delete'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile delete confirm'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/GagalHapus/simpan profile'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/GagalHapus/batal'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile yang ingin dihapus 4'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile delete'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile delete confirm'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/GagalHapus/simpan profile'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/GagalHapus/batal'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile yang ingin dihapus 5'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile delete'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile delete confirm'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/GagalHapus/simpan profile'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/GagalHapus/batal'), FailureHandling.OPTIONAL)

// end delete profile
// navigate to profiles manage
WebUI.navigateToUrl('https://www.netflix.com/profiles/manage', FailureHandling.OPTIONAL)

// edit profile 1
WebUI.click(findTestObject('Profile/profile edit name 1'), FailureHandling.OPTIONAL)

WebUI.clearText(findTestObject('Profile/profile edit name text'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Profile/profile edit name text'), 'PROFILE 1', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/language change'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/language indonesia'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile edit name save'), FailureHandling.OPTIONAL)

// edit profile 2
WebUI.click(findTestObject('Profile/profile edit name 2'), FailureHandling.OPTIONAL)

WebUI.clearText(findTestObject('Profile/profile edit name text'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Profile/profile edit name text'), 'x2', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/language change'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/language indonesia'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile edit name save'), FailureHandling.OPTIONAL)

// edit profile 3
WebUI.click(findTestObject('Profile/profile edit name 3'), FailureHandling.OPTIONAL)

WebUI.clearText(findTestObject('Profile/profile edit name text'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Profile/profile edit name text'), 'x3', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/language change'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/language indonesia'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile edit name save'), FailureHandling.OPTIONAL)

// edit profile 4
WebUI.click(findTestObject('Profile/profile edit name 4'), FailureHandling.OPTIONAL)

WebUI.clearText(findTestObject('Profile/profile edit name text'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Profile/profile edit name text'), 'x4', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/language change'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/language indonesia'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile edit name save'), FailureHandling.OPTIONAL)

// edit profile 5
WebUI.click(findTestObject('Profile/profile edit name 5'), FailureHandling.OPTIONAL)

WebUI.clearText(findTestObject('Profile/profile edit name text'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Profile/profile edit name text'), 'x5', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/language change'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/language indonesia'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile edit name save'), FailureHandling.OPTIONAL)

// add profile
WebUI.click(findTestObject('Profile/profile add 2'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Profile/profile input name'), 'PROFILE 2', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile input name continue'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile add 3'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Profile/profile input name'), 'PROFILE 3', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile input name continue'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile add 4'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Profile/profile input name'), 'PROFILE 4', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile input name continue'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile add 5'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Profile/profile input name'), 'PROFILE 5', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile input name continue'), FailureHandling.OPTIONAL)

// end add profile
// edit profile 2
WebUI.click(findTestObject('Profile/profile edit name 2'), FailureHandling.OPTIONAL)

WebUI.clearText(findTestObject('Profile/profile edit name text'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Profile/profile edit name text'), 'PROFILE 2', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile edit name save'), FailureHandling.OPTIONAL)

// edit profile 3
WebUI.click(findTestObject('Profile/profile edit name 3'), FailureHandling.OPTIONAL)

WebUI.clearText(findTestObject('Profile/profile edit name text'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Profile/profile edit name text'), 'PROFILE 3', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile edit name save'), FailureHandling.OPTIONAL)

// edit profile 4
WebUI.click(findTestObject('Profile/profile edit name 4'), FailureHandling.OPTIONAL)

WebUI.clearText(findTestObject('Profile/profile edit name text'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Profile/profile edit name text'), 'PROFILE 4', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile edit name save'), FailureHandling.OPTIONAL)

// edit profile 5
WebUI.click(findTestObject('Profile/profile edit name 5'), FailureHandling.OPTIONAL)

WebUI.clearText(findTestObject('Profile/profile edit name text'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Profile/profile edit name text'), 'PROFILE 5', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile edit name save'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Profile/profile done'), FailureHandling.OPTIONAL)

// navigate to your account
WebUI.navigateToUrl('https://www.netflix.com/YourAccount')

// set pin
WebUI.waitForElementPresent(findTestObject('Pin/pin expand button 1'), 5)

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

    WebUI.click(findTestObject('Pin/pin input save 1' // remove pin
            // add pin
            ))
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
// set pin - profile 2
WebUI.click(findTestObject('Pin/pin expand button 2'))

WebUI.click(findTestObject('Pin/pin change 2'))

WebUI.setText(findTestObject('Pin/pin input password'), password)

WebUI.click(findTestObject('Pin/pin input password continue'))

// condition for profile 2
if (WebUI.verifyElementNotPresent(findTestObject('Pin/pin input A'), 2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Pin/pin checkbox'))

    WebUI.setText(findTestObject('Pin/pin input A'), '1')

    WebUI.setText(findTestObject('Pin/pin input B'), '1')

    WebUI.setText(findTestObject('Pin/pin input C'), '1')

    WebUI.setText(findTestObject('Pin/pin input D'), '2')

    WebUI.click(findTestObject('Pin/pin input save 2' // remove pin
            // add pin
            ))
} else {
    WebUI.click(findTestObject('Pin/pin checkbox'))

    WebUI.click(findTestObject('Pin/pin input save 1a'))

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
}

// end condition for profile 2
// set pin - profile 3
WebUI.click(findTestObject('Pin/pin expand button 3'))

WebUI.click(findTestObject('Pin/pin change 3'))

WebUI.setText(findTestObject('Pin/pin input password'), password)

WebUI.click(findTestObject('Pin/pin input password continue'))

// condition for profile 3
if (WebUI.verifyElementNotPresent(findTestObject('Pin/pin input A'), 2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Pin/pin checkbox'))

    WebUI.setText(findTestObject('Pin/pin input A'), '1')

    WebUI.setText(findTestObject('Pin/pin input B'), '1')

    WebUI.setText(findTestObject('Pin/pin input C'), '1')

    WebUI.setText(findTestObject('Pin/pin input D'), '3')

    WebUI.click(findTestObject('Pin/pin input save 3' // remove pin
            // add pin
            ))
} else {
    WebUI.click(findTestObject('Pin/pin checkbox'))

    WebUI.click(findTestObject('Pin/pin input save 1a'))

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
}

// end condition for profile 3
// set pin - profile 4
WebUI.click(findTestObject('Pin/pin expand button 4'))

WebUI.click(findTestObject('Pin/pin change 4'))

WebUI.setText(findTestObject('Pin/pin input password'), password)

WebUI.click(findTestObject('Pin/pin input password continue'))

// condition for profile 4
if (WebUI.verifyElementNotPresent(findTestObject('Pin/pin input A'), 2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Pin/pin checkbox'))

    WebUI.setText(findTestObject('Pin/pin input A'), '1')

    WebUI.setText(findTestObject('Pin/pin input B'), '1')

    WebUI.setText(findTestObject('Pin/pin input C'), '1')

    WebUI.setText(findTestObject('Pin/pin input D'), '4')

    WebUI.click(findTestObject('Pin/pin input save 4' // remove pin
            // add pin
            ))
} else {
    WebUI.click(findTestObject('Pin/pin checkbox'))

    WebUI.click(findTestObject('Pin/pin input save 1a'))

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
}

// end condition for profile 4
// set pin - profile 5
WebUI.click(findTestObject('Pin/pin expand button 5'))

WebUI.click(findTestObject('Pin/pin change 5'))

WebUI.setText(findTestObject('Pin/pin input password'), password)

WebUI.click(findTestObject('Pin/pin input password continue'))

// condition for profile 5
if (WebUI.verifyElementNotPresent(findTestObject('Pin/pin input A'), 2, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Pin/pin checkbox'))

    WebUI.setText(findTestObject('Pin/pin input A'), '1')

    WebUI.setText(findTestObject('Pin/pin input B'), '1')

    WebUI.setText(findTestObject('Pin/pin input C'), '1')

    WebUI.setText(findTestObject('Pin/pin input D'), '5')

    WebUI.click(findTestObject('Pin/pin input save 5' // remove pin
            // add pin
            ))
} else {
    WebUI.click(findTestObject('Pin/pin checkbox'))

    WebUI.click(findTestObject('Pin/pin input save 1a'))

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
}

// end condition for profile 5
// end set pin
WebUI.delay(2)

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
// log out
WebUI.navigateToUrl('https://www.netflix.com/id/logout')

WebUI.click(findTestObject('sign out'))

// end logout
WebUI.delay(2)

