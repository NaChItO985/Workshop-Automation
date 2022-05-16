Feature: Modify the quantity of the product to buy of the amazon cart

    This Feature was designed to validate the cart module changing the quantity of items in it

    Background: Search hats for men category
        Given I am in the Amazon home page
        When I search for the category "Hats for men" in the search field
        When I select the first hat appeared and I am redirected to the product page
        And I add the item to the cart with "2" items quantity
        And I open the cart
        Then I should can see the item added with its quantity and total price correctly
        
    Scenario: Reduce the quantity in Cart
        Given I open the Cart
        When I reduce the quantity to "1" in the item added before
        Then I should can see the quantity and total price changed correctly