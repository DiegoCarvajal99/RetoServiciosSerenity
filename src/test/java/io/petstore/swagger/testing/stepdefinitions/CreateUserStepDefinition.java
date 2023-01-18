package io.petstore.swagger.testing.stepdefinitions;

import java.util.List;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.petstore.swagger.testing.models.User;
import net.serenitybdd.rest.SerenityRest;

public class CreateUserStepDefinition {
	
	@Given("^I want create user to service \"([^\"]*)\"$")
	public void iWantCreateUserToService(String url, List<User> listUser) {
		
		//Construcción del body con los datos necesarios para crear el usuario
        String body ="{\r\n" + 
        		"  \"id\": \""+listUser.get(0).getId()+"\",\r\n" + 
        		"  \"username\": \""+listUser.get(0).getUserName()+"\",\r\n" + 
        		"  \"firstName\": \""+listUser.get(0).getFirstName()+"\",\r\n" + 
        		"  \"lastName\": \""+listUser.get(0).getLastName()+"\",\r\n" + 
        		"  \"email\": \""+listUser.get(0).getEmail()+"\",\r\n" + 
        		"  \"password\": \""+listUser.get(0).getPassword()+"\",\r\n" + 
        		"  \"phone\": \""+listUser.get(0).getPhone()+"\",\r\n" + 
        		"  \"userStatus\": \""+listUser.get(0).getUserStatus()+"\"\r\n" + 
        		"}";
        
        System.out.println(body);
        
      //Se hace un POST a la URL con un Request que tiene un Header(Content Type , application/json) y envia el body
        SerenityRest.given().baseUri(url).body(body).header("Content-Type","application/json").post();
        
        
        System.out.println(SerenityRest.given().body(body).baseUri(url).header("Content-Type","application/json").post().getStatusCode());

	}

	@Then("^I validate the status code (\\d+)$")
	public void iValidateTheStatusCode(int status) {
		
		//Se valida que la respuesta tiene un codigo status 200
		SerenityRest.lastResponse().then().statusCode(status);
	}
	

}
