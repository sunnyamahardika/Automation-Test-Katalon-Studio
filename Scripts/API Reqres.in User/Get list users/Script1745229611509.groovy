// Import
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static org.assertj.core.api.Assertions.*

// Kirim request
def response = WS.sendRequest(findTestObject('GET_List_Users'))

// Verifikasi status code
WS.verifyResponseStatusCode(response, 200)

// Verifikasi isi body
def json = new groovy.json.JsonSlurper().parseText(response.getResponseText())
assertThat(json.page).isEqualTo(2)
assertThat(json.data).isNotEmpty()
