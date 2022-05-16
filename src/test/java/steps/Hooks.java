package steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.BasePage;
import io.cucumber.java.After;


public class Hooks {
 
    @Before
    public static void startNavigation(Scenario scenario) {
        BasePage.openBrowser();
    }

    @After
    public static void closeNavigation(Scenario scenario) {
        if (scenario.isFailed()) {
            BasePage.takeScreenshot(scenario);
        }
        BasePage.closeBrower();
    }

}
