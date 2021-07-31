@ProductAdd
Feature: Product Feature
  Description: This feature will be used to add products to the cart

  Background: 
    Given User has launched the SwagLabs Application
    When User enters "standard_user" and "secret_sauce"
    And User click on the login button
    Then User should be able to see homepage

  Scenario Outline: Verify that user is able to add single product in the cart
    Given User is on the home page
    When User select the "<Product>"
    And Click on Add to cart button
    Then Product added successfully to the cart

    Examples: 
      | Product             |
      | Sauce Labs Backpack |

  @DataTable
  Scenario: Verify that user can add muliple products in cart
    Given User is on the home page
    And User select products and add to the cart
      | Sauce Labs Backpack      |
      | Sauce Labs Bolt T-Shirt  |
      | Sauce Labs Fleece Jacket |
    Then User should be able to see products in the cart