package pages;

public class AmazonHomePage extends BasePage{
    public static String cards = "//div[@data-component-type='s-search-result']";
    public static String searchTextField = "//*[@id='twotabsearchtextbox']";
    public static String searchButton = "//input[@id='nav-search-submit-button']";
    public static String leftDrawer = "//div[@id='s-refinements']";


    public static String signInLink = "//*[@id='nav-link-accountList-nav-line-1']";
    public static String foundValue = "//div[@class='a-section a-spacing-small a-spacing-top-small']";


    public void navigateToAmazon() {
        navigateTo("https://www.amazon.com/-/es/?language=en_US&currency=USD");
    }

    public void searchCategory(String value) {
        click(searchTextField);
        fill(searchTextField, value);
        click(searchButton);
    }

}
