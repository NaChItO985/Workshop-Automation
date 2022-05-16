package steps;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.AmazonCartPage;
import pages.AmazonCartPageWD;
import pages.AmazonHomePage;
import pages.BasePage;
import pages.AmazonResultPage;


public class AmazonAddItemToCart {

    AmazonHomePage amazonHomePage = new AmazonHomePage();
    AmazonResultPage resultPage = new AmazonResultPage();
    AmazonCartPage cartPage = new AmazonCartPage();
    AmazonCartPageWD cartPageWD = new AmazonCartPageWD();
    String category = "Hats for men";

    
    @Given("I am in the results of the search")
    public void i_am_in_the_results_of_the_search() {
        Assert.assertTrue(BasePage.toContainText(amazonHomePage.foundValue, category));
    }
    
    @When("I select the first hat appeared and I am redirected to the product page")
    public void i_select_the_first_hat_appeared_and_i_am_redirected_to_the_product_page() {
        resultPage.selectFirstHat();
    }

    @When("I add the item to the cart with {string} items quantity")
    public void i_add_the_item_to_the_cart_with_items_quantity(String quantity) {
        quantity = "2";
        resultPage.selectQuantity(quantity);
        Assert.assertEquals(BasePage.getInnerText(resultPage.cartQuantity), "2");
    }

    @When("I open the cart")
    public void i_open_the_cart() {
        cartPage.openCart();
        Assert.assertEquals(cartPage.cartURL, BasePage.getUrl());
    }

    @Then("I should can see the item added with its quantity and total price correctly")
    public void i_should_can_see_the_item_added_with_its_quantity_and_total_price_correctly() {
        //cartPage.calculatePrice();
        //Assert.assertTrue(cartPage.calculatePrÿice());
        
        cartPageWD.calculatePrice();
        Assert.assertTrue(cartPageWD.calculatePrice());

    }

}
