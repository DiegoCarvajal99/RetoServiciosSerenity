package io.petstore.swagger.testing.stepdefinitions;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.petstore.swagger.testing.models.PlaceOrderPet;
import net.serenitybdd.rest.SerenityRest;

public class PlaceOrderPetStepDefinition {
	
	@Given("^I want place an order for a pet to service \"([^\"]*)\"$")
	public void iWantPlaceAnOrderForAPetToService(String url, List<PlaceOrderPet> listOrder) {
		
		//Construcci�n del body con los datos necesarios para crear una orden de pedido de una mascota
        String body ="{\r\n" + 
        		"  \"id\": \""+listOrder.get(0).getId()+"\",\r\n" + 
        		"  \"petId\": \""+listOrder.get(0).getPetId()+"\",\r\n" + 
        		"  \"quantity\": \""+listOrder.get(0).getQuantity()+"\",\r\n" + 
        		"  \"shipDate\": \""+listOrder.get(0).getShipDate()+"\",\r\n" + 
        		"  \"status\": \""+listOrder.get(0).getStatus()+"\",\r\n" + 
        		"  \"complete\": \""+listOrder.get(0).getComplete()+"\"\r\n" + 
        		"}";
        
        System.out.println(body);
        
      //Se hace un POST a la URL con un Request que tiene un Header(Content Type , application/json) y envia el body
        SerenityRest.given().baseUri(url).body(body).header("Content-Type","application/json").post();
        
        
        System.out.println(SerenityRest.given().baseUri(url).body(body).header("Content-Type","application/json").post().getStatusCode());
	}

	@Then("^I validate that the status code is (\\d+)$")
	public void iValidateThatTheStatusCodeIs(int status) {
		
		//Se valida que la respuesta tiene un codigo status 200
		SerenityRest.lastResponse().then().statusCode(status);
	}


}
