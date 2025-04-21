// Import
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static org.assertj.core.api.Assertions.*

// Kirim request
def response = WS.sendRequest(findTestObject('GET_Single_User'))

// Verifikasi status code
WS.verifyResponseStatusCode(response, 200)

// Verifikasi isi body
def json = new groovy.json.JsonSlurper().parseText(response.getResponseText())
assertThat(json.page).isEqualTo()
assertThat(json.data).isNotEmpty()
