import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType

// Fungsi bikin test object dari ID
def findById(String id) {
	TestObject to = new TestObject()
	to.addProperty("id", ConditionType.EQUALS, id)
	return to
}

// Fungsi bikin test object dari name (buat tombol login)
def findByName(String name) {
	TestObject to = new TestObject()
	to.addProperty("name", ConditionType.EQUALS, name)
	return to
}

// Mulai eksekusi
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.facebook.com/')
WebUI.maximizeWindow()

// Isi email dan password
WebUI.setText(findById('email'), 'mahardikad51@yahoo.com')
WebUI.setText(findById('pass'), 'Sunnya1789')

// Klik tombol login
WebUI.click(findByName('login'))

WebUI.delay(5)
WebUI.closeBrowser()
