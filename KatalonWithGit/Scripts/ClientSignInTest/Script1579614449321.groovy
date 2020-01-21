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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.microsoftonline.com/te/gecopvautaadb2cqvca001.onmicrosoft.com/b2c_1_standbymd-qa3-signin/oauth2/v2.0/authorize?client_id=03782a87-a607-4bc1-aefb-6aa9f8ca0e94&redirect_uri=https%3A%2F%2Fstandbymd-qa3.globalexcel.com%2Fsignin-oidc&response_type=code%20id_token&scope=openid%20profile%20offline_access%20https%3A%2F%2Ffabrikamb2c.onmicrosoft.com%2Fdemoapi%2Fdemo.read&response_mode=form_post&nonce=637152113309839311.MGQ4ODBmODgtNTQ1NS00OWIwLWFkMTItNTdjYWY2ZmIwZmUzODE2NWMzMTAtZDg1Zi00NmU1LTgyMDctYjk2NmJhNWJlZjhi&state=CfDJ8DwxkJVK1UZGjf_Vi0EYHKDZe5Cy4wHObjSIH_PYoO7O_AXGPjqlH66SZ0QgfPVa38XRRxGeJxWK9om1oDN5QKn356L8eVAsWIEQPx7mrTZOgkPlzXsRc5i-0fwxsLVGxxaUnjpEMBdlB1Xfi2HpaMmd-Uu69Sm79npJrjsTLC5KGWa58uO4z7af6Ikmow5nKAG658IIqoRAPJk9TYdIrrq7KFckSctD8SBdRmLP0iuFJKoDjrou7YfDenc2411u3Be4OpKaQcoW-V1BY7mmXOq8AXY5rPuC80Zlz2gJNcQiETXNcUbNVyK5vhwGsdMX0m07LLtEmebtygChXkZSq3smiR2YlaiZCBUXm5Kpg50m&x-client-SKU=ID_NETSTANDARD1_4&x-client-ver=5.2.0.0')

WebUI.click(findTestObject('Object Repository/Page_Choose your account/button_Client Sign-in'))

WebUI.closeBrowser()

