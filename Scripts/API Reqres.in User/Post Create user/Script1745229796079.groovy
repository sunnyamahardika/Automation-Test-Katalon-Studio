import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static org.assertj.core.api.Assertions.*

// Kirim POST request
def response = WS.sendRequest(findTestObject('POST_Create_User'))

// Verifikasi status code 201 (Created) 
WS.verifyResponseStatusCode(response, 201)


// Ambil dan cek isi response
def json = new groovy.json.JsonSlurper().parseText(response.getResponseText())
assertThat(json.name).isEqualTo("morpheus")
assertThat(json.job).isEqualTo("leader")
assertThat(json.id).isNotNull()
assertThat(json.createdAt).isNotNull()
