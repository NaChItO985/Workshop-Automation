Feature: Adding a product to buy to the amazon cart

    This Feature was designed to validate the cart module adding items from it

    Background: Search hats for men category
        Given I am in the Amazon home page
        When I search for the category "Hats for men" in the search field
        Then I should be redirected to the result page of the category "Hats for men"

    @Adding
    Scenario: Add the first hat item to the Cart
        Given I am in the results of the search
        When I select the first hat appeared and I am redirected to the product page
        And I add the item to the cart with "2" items quantity
        And I open the cart
        Then I should can see the item added with its quantity and total price correctly
