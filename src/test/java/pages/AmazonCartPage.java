package pages;

import java.util.regex.Pattern;

public class AmazonCartPage extends BasePage {

    public static String quantityContainer = "//*[@class='a-dropdown-container']";
    public static String quantitySelect = "//select[@id='quantity']";
    public static String cartQuantity = "//span[@id='nav-cart-count']";
    public static String cartURL = "https://www.amazon.com/gp/cart/view.html?ref_=nav_cart";
    public static String hatValue = "//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']";
    public static String hatQuantity = "//span[@class='a-dropdown-prompt']";
    public static String subTotal = "//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']";

    public void openCart() {
        click(cartQuantity);
    }

    
    public Boolean calculatePrice(){

        Integer itemQuantity = Integer.parseInt(getInnerText(hatQuantity));

        String getNumber = Pattern.quote("$");
        String[] unitPrice = getInnerText(hatValue).split(getNumber);
        String[] totalPrice = getInnerText(subTotal).split(getNumber);

        Double itemPrice = Double.parseDouble(unitPrice[1]);
        Double totalItemPrice = Double.parseDouble(totalPrice[1]);
        
        
        if(itemPrice * itemQuantity == totalItemPrice) {
            return true;
        }
        else{
            return false;
        }
    }

    public void reduceQuantity(String quantity) {
        click(quantityContainer);
        int sQuantity = Integer.parseInt(quantity);
        selectByIndex(quantitySelect, sQuantity);
    }

}
