import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static org.assertj.core.api.Assertions.*

// Kirim PUT request
def response = WS.sendRequest(findTestObject('PUT_Update_User'))

// Verifikasi status code (biasanya 200 OK)
WS.verifyResponseStatusCode(response, 200)

// Ambil response JSON
def json = new groovy.json.JsonSlurper().parseText(response.getResponseText())

// Verifikasi field
assertThat(json.name).isEqualTo("neo")
assertThat(json.job).isEqualTo("zion defender")
assertThat(json.updatedAt).isNotNull()
