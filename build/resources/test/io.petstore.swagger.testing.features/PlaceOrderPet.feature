#language:en
Feature: Place an order for a pet

  Scenario: Place an order for a pet successfully
    Given I want place an order for a pet to service "https://petstore.swagger.io/v2/store/order"
      | id | petId | quantity | shipDate                 | status   | complete |
      | 17 |  0897 |        3 | 2023-01-12T20:09:22.005Z | approved | true     |
    Then I validate that the status code is 200
