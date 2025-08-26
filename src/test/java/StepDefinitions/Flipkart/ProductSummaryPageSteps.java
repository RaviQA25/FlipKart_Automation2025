package StepDefinitions.Flipkart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.ProductSummaryPage;

public class ProductSummaryPageSteps {
    ProductSummaryPage productSummaryPage = new ProductSummaryPage();
    @Then("User verifies the product list")
    public void userVerifiesTheProductList() {
    productSummaryPage.verifyAmount();
    }

    @And("User clicks on continue button")
    public void userClicksOnContinueButton() {
        productSummaryPage.clickContinueButton();

    }
}
