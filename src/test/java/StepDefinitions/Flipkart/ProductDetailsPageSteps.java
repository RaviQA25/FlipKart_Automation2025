package StepDefinitions.Flipkart;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProductDetailsPage;

public class ProductDetailsPageSteps extends BaseClass {
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    @And("User adds the product to the cart")
    public void userAddsTheProductToTheCart() throws InterruptedException {
        productDetailsPage.clickAddToCartButton();
    }

    @And("User gets the product price")
    public void userGetsTheProductPrice() throws InterruptedException {
        productDetailsPage.getProductPrice();

    }


    @And("User verifies the product specifications")
    public void userVerifiesTheProductSpecifications() throws InterruptedException {
        productDetailsPage.productSpecifications();
    }




    @Then("User checks the SimType as {string} from specifications section")
    public void userChecksTheSimTypeAsFromSpecificationsSection(String simTypeInDevice) {
        productDetailsPage.verifiesTheSimType(simTypeInDevice);

    }

    @When("User clicks on mobile {string} in specifications Section and verify ram size in title of the product")
    public void userClicksOnMobileInSpecificationsSectionAndVerifyRamSizeInTitleOfTheProduct(String deviceRam) throws InterruptedException {
        productDetailsPage.selectsRamSizeAndVerifyRamInTheTitle(deviceRam);

    }



    @And("user clicks on backcover radio button")
    public void userClicksOnBackcoverRadioButton() {
        productDetailsPage.clickOnBackCoverRadioBtn();

    }

    @And("user clicks on additems to cart button")
    public void userClicksOnAdditemsToCartButton() {
        productDetailsPage.clickOnCartItemsBtn();
    }

//    @When("User clicks on enter pincode button")
//    public void userClicksOnEnterPincodeButton() throws InterruptedException {
//        productDetailsPage.clickOnEnterPincode();
//    }

    @And("User clicks on required ram{string}in specifications section and verifies the ram size using Switch")
    public void userClicksOnRequiredRamInSpecificationsSectionAndVerifiesTheRamSizeUsingSwitch(String descriptionRam) {
        productDetailsPage.selectRamSizeAndVerifyUsingSwitch(descriptionRam);
    }

    @And("User enters deliverypincode in specifications section")
    public void userEntersDeliverypincodeInSpecificationsSection() {
        productDetailsPage.enterDeliveryPincode();
    }

    @And("User selects the particular {string}")
    public void userSelectsTheParticular(String productname) {

    }
}
