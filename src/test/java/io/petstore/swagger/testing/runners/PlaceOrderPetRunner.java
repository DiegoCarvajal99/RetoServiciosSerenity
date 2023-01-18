package io.petstore.swagger.testing.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //Ubicaci�n del feature
        features = "src/test/resources/io.petstore.swagger.testing.features/PlaceOrderPet.feature",

        //Ruta de paquetes
        glue = "io.petstore.swagger.testing.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class PlaceOrderPetRunner {

}
