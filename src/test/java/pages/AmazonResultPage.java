package pages;

public class AmazonResultPage extends BasePage {

    public static String quantityContainer = "//*[@class='a-dropdown-container']";
    //public static String quantitySelect = "//*[@class='a-dropdown-container']";
    public static String quantitySelect = "//select[@id='quantity']";
    public static String cards = "//div[@data-component-type='s-search-result']";
    public static String imgCards = "//img[@class='s-image']";
    public static String firstHat = "//div[@data-cel-widget='search_result_2']";
    public static String addToCart = "//input[@id='add-to-cart-button']";
    public static String cartQuantity = "//span[@id='nav-cart-count']";

    // Method to search all hats of the page and get their text

     public void selectFirstHat() {
     click(firstHat);
     }

    public void selectQuantity(String quantity) {
        click(quantityContainer);
        int sQuantity = Integer.parseInt(quantity) - 1;
        selectByIndex(quantitySelect, sQuantity);
        click(addToCart);
    }
}
