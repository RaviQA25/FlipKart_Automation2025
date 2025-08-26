package StepDefinitions.Flipkart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import base.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import pageObjects.ProductDetailsPage;
import pageObjects.SearchResultPage;

public class HomePageSteps extends BaseClass{
//    LogInPage logInPage1 = new LogInPage();

    HomePage homePage = new HomePage();
//    SearchResultPage searchResultPage = new SearchResultPage();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();

//    @Given("User navigates to Flipkart homepage")
//    public void userNavigatesToFlipkartHomepage() throws InterruptedException {
//        Thread.sleep(3000);
//        System.out.println(driver.getTitle());
//
//    }
//    @Given("User clicks on the sign-in button")
//    public void userClicksOnTheLogInButton() throws InterruptedException {
//        logInPage1.clickOnSignIn();
//    }
//
//    @Then("User enters {string}")
//    public void userEnters(String mobileNumber) throws InterruptedException {
//        logInPage1.enterMobileNumber(mobileNumber);
//        Thread.sleep(3000);
//    }
//
//    @And("User clicks on requestOTP button")
//    public void userClicksOnContinueButton() {
//        logInPage1.clickOnContinueButton();
//
//    }
//
//    @Then("User clicks on verify button")
//    public void userClicksOnVerifyButton() throws InterruptedException {
//        logInPage1.clickOnVerifyButton();
//    }

    @And("User searches for product {string}")
    public void userSearchesFor(String ProductName) throws InterruptedException {
        homePage.SearchProduct(ProductName);
        Thread.sleep(3000);
        homePage.clickSearchButton();
    }


//    @And("User selects the customer rating {string}")
//    public void userSelectsTheCustomerRating(String ProductRating) throws InterruptedException {
//        searchResultPage.selectCustomerRating(ProductRating);
//        Thread.sleep(3000);
//    }
//
//    @And("User selects the product with name {string}")
//    public void userSelectsTheProductWithName(String ProductName) throws InterruptedException {
//        searchResultPage.selectProductWithName(ProductName);
//    }

//    @And("User adds the product to the cart")
//    public void userAddsTheProductToTheCart() throws InterruptedException {
//        productDetailsPage.clickAddToCartButton();
//    }
}
