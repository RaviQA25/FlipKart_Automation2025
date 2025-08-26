package StepDefinitions.Flipkart;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObjects.SearchResultPage;

public class SearchResultPageSteps  {

   SearchResultPage searchResultPage = new SearchResultPage();

    @And("User selects the customer rating {string}")
    public void userSelectsTheCustomerRating(String ProductRating) throws InterruptedException {
        searchResultPage.selectCustomerRating(ProductRating);
        Thread.sleep(3000);
    }

    @And("User selects the product with name {string}")
    public void userSelectsTheProductWithName(String ProductName) throws InterruptedException {
        searchResultPage.selectProductWithName(ProductName);
    }
    @When("User selects the mobile price range in filter {string}")
    public void userSelectsTheMobilePriceRangeInFilter(String ProductPrice) throws InterruptedException {
        searchResultPage.selectProductWithPrice(ProductPrice);
    }

    @And("User verifies the product price")
    public void userVerifiesTheProductPrice() {

        searchResultPage.verifyProductPrice();
    }

    @And("User selects the particular product")
    public void userSelectsTheParticularProduct() {
        searchResultPage.selectParticularProduct();
    }

}
