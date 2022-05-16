Feature: Amazon category feature

    This feature contains the test cases designed to test the Amazon page

    Scenario: Search hats for men category
        Given I am in the Amazon home page
        When I search for the category "Hats for men" in the search field
        Then I should be redirected to the result page of the category "Hats for men"