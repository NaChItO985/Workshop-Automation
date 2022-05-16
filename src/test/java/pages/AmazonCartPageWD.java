package pages;

import java.util.regex.Pattern;

public class AmazonCartPageWD extends BasePage {
    
    public static String quantityContainer = "//*[@class='a-dropdown-container']";
    public static String quantitySelect = "//select[@id='quantity']";
    public static String hatValue = "//*[@class='a-price sc-product-price']";
    public static String subTotal = "//*[@class='a-price']";
    public static String hatQuantity = "//span[@class='a-dropdown-prompt']";

    public Boolean calculatePrice() {

        Integer itemQuantity = Integer.parseInt(getInnerText(hatQuantity));
        
        String getNumber = Pattern.quote("$");
        String[] unitPrice = getInnerText(hatValue).split(getNumber);
        String[] totalPrice = getInnerText(subTotal).split(getNumber);


        Double itemPrice = Double.parseDouble(unitPrice[1]);
        Double totalItemPrice = Double.parseDouble(totalPrice[1]);
        System.out.println("totalItemPrice: " + totalItemPrice);


        if (itemPrice * itemQuantity == totalItemPrice) {
            return true;
        } else {
            return false;
        }
    }
        
    public void reduceQuantity(String quantity) {
        click(quantityContainer);
        int sQuantity = Integer.parseInt(quantity);
        selectByIndex(quantitySelect, sQuantity);
    }

}
