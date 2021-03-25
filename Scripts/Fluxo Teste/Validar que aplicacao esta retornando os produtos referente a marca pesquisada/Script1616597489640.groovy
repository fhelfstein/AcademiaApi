import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.junit.After
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import groovy.json.JsonSlurper


def MarcaDoProduto = 'colourpop'

def RetornoEndPoint= WS.sendRequest(findTestObject('Postman/Pesquisa Produto', [('Marca') : MarcaDoProduto]))

WS.verifyResponseStatusCode(RetornoEndPoint, 200)

JsonSlurper slurper = new JsonSlurper()
println(RetornoEndPoint.getResponseBodyContent());
//Map parsedJson = slurper.parseText(RetornoEndPoint.getResponseBodyContent())
/*
def ListaDeMarcasRetornadas = parsedJson.brand
println(ListaDeMarcasRetornadas)



for (def marca : ListaDeMarcasRetornadas) {
	 println(marca)
	 
WS.verifyEqual (marca,MarcaDoProduto) 
		 
	
}

List<String> TiposDosProdutos = parsedJson.product_type

println(TiposDosProdutos)

WS.verifyEqual(TiposDosProdutos.contains('bronzer'), true)


def CodigoDaCor = parsedJson.product_colors.hex_value
def  NomeDacor = parsedJson.product_colors.colour_name

println(CodigoDaCor)
println(NomeDacor)

WS.verifyNotEqual(CodigoDaCor, null)
WS.verifyNotEqual(NomeDacor, null)*/
