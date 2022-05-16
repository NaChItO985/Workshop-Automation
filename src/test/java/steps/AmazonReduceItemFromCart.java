package steps;

import org.junit.Assert;


import io.cucumber.java.en.*;
import pages.AmazonCartPage;
import pages.AmazonCartPageWD;
import pages.AmazonHomePage;
import pages.BasePage;

public class AmazonReduceItemFromCart extends BasePage{

    AmazonHomePage amazonHomePage = new AmazonHomePage();
    AmazonCartPage amazonCartPage = new AmazonCartPage();
    AmazonCartPageWD amazonCartPageWD = new AmazonCartPageWD();

    String category = "Hats for men";
    String quantity;
    
    
    @Given("I open the Cart")    
    public void i_open_the_cart(){
        amazonCartPage.openCart();
        Assert.assertEquals(amazonCartPage.cartURL, BasePage.getUrl());
    }
    
    @When("I reduce the quantity to {string} in the item added before")
    public void i_reduce_the_quantity_from_to_in_the_item_added_before(String quantity){
        quantity = "1";
        amazonCartPage.reduceQuantity(quantity);
        Assert.assertEquals(getInnerText(amazonCartPage.hatQuantity), "1");
    }
    
    @Then("I should can see the quantity and total price changed correctly")
    public void i_should_see_the_quantity_and_total_price_changed_correctly(){
        
        Assert.assertEquals(getInnerText(amazonCartPage.hatQuantity), "1");
        
        //amazonCartPage.calculatePrice();
        //Assert.assertTrue(amazonCartPage.calculatePrice());
        
        amazonCartPageWD.calculatePrice();
        Assert.assertTrue(amazonCartPageWD.calculatePrice());
    }
}
