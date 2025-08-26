package StepDefinitions.Flipkart;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.LogInPage;

public class LogInPageSteps extends BaseClass {
    LogInPage logInPage = new LogInPage();
    @Given("User navigates to Flipkart homepage")
    public void userNavigatesToFlipkartHomepage() throws InterruptedException {
        logInPage.navigateToFlipkartHome();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());

    }
    @Given("User clicks on the sign-in button")
    public void userClicksOnTheLogInButton() throws InterruptedException {
        logInPage.clickOnSignIn();
    }

    @Then("User enters {string}")
    public void userEnters(String mobileNumber) throws InterruptedException {
        logInPage.enterMobileNumber(mobileNumber);
        Thread.sleep(3000);
    }

    @And("User clicks on requestOTP button")
    public void userClicksOnContinueButton() throws InterruptedException {
        logInPage.clickOnContinueButton();

    }

    @Then("User clicks on verify button")
    public void userClicksOnVerifyButton() throws InterruptedException {
        logInPage.clickOnVerifyButton();
    }
}
