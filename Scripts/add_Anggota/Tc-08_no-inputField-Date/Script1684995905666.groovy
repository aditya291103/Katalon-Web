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

WebUI.comment('open browser')
WebUI.openBrowser('')

WebUI.comment("Maximize windows")
WebUI.maximizeWindow()

WebUI.comment("Url")
WebUI.navigateToUrl('https://qatest.rimbahouse.com/login.php')

WebUI.comment("Validate text Selamat Datang Admin")
WebUI.verifyElementPresent(findTestObject('Object Repository/Tc-08/Text-SelamatDatangAdmin'), 0)

WebUI.comment("Input Username")
WebUI.setText(findTestObject('Object Repository/Tc-08/Field_Username'), 'admin3')

WebUI.comment('Input Password')
WebUI.setText(findTestObject('Object Repository/Tc-08/Field_Password'), 'admin')

WebUI.comment('Click Btn Login')
WebUI.click(findTestObject('Object Repository/Tc-08/button_Login'))

WebUI.comment("Validate text Dashboard Page Dashboard")
WebUI.verifyElementPresent(findTestObject('Object Repository/Tc-08/Text-Dashboard'), 0)

WebUI.comment('Click Manajemen Anggota Navbar')
WebUI.click(findTestObject('Object Repository/Tc-08/ManajemenAnggota_navbar'))

WebUI.comment('Click Sub Menu Tambah Anggota')
WebUI.click(findTestObject('Object Repository/Tc-08/SubMenu-TambahAnggota'))

WebUI.comment('Input Field Nama')
WebUI.setText(findTestObject('Object Repository/Tc-08/FieldNama'), 'Aditya Nur Fahmi')

WebUI.comment('Input Field Alamat')
WebUI.setText(findTestObject('Object Repository/Tc-08/FieldAlamat'), 'Yogyakarta')

WebUI.comment('click btn kirim')
WebUI.click(findTestObject('Object Repository/Tc-08/button_kirim'))

WebUI.comment('muncul Pop Up "Harap isi bidang ini"')




