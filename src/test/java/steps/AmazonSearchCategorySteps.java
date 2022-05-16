package steps;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.AmazonHomePage;
import pages.BasePage;

public class AmazonSearchCategorySteps {

    AmazonHomePage amazonHomePage = new AmazonHomePage();
    String category = "Hats for men";

    @Given("I am in the Amazon home page")
    public void i_am_in_the_Amazon_home_page(){
        amazonHomePage.navigateToAmazon();
        Assert.assertTrue(BasePage.toBeVisible(amazonHomePage.signInLink));        
    }
    @When("I search for the category {string} in the search field")
    public void i_search_for_the_category_in_the_search_field(String value){
        value = category;
        amazonHomePage.searchCategory(value);
        Assert.assertTrue(BasePage.getElementSize(amazonHomePage.cards) > 0);
    }
    @Then("I should be redirected to the result page of the category {string}")
    public void i_should_be_redirect_to_the_result_page_of_the_category(String value) {
        Assert.assertTrue(BasePage.toContainText(amazonHomePage.foundValue, value));
    }
}
