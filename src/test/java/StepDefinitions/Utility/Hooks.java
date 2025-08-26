
package StepDefinitions.Utility;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

    @Before
    public void setUp() throws InterruptedException {
        loadConfig(); // Load the configuration file
        launchWebDriver(); // Launch the WebDriver
    }

    @After
    public void tearDown() {
//        if (driver != null) {
//            driver.quit(); // Quit the WebDriver after tests
//        }
    }
}