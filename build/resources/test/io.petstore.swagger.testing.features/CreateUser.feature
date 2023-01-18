#language:en
Feature: Create User

  Scenario: Create User successfully
    Given I want create user to service "https://petstore.swagger.io/v2/user"
      | id | userName | firstName    | lastName | email                       | password   | phone      | userStatus |
      | 16 | Dach99   | Diego Andres | Carvajal | diegoandres9914@hotmail.com | Dach1999.. | 3105019058 | 080        |
    Then I validate the status code 200
