package StepDefinitions.Flipkart;

import io.cucumber.java.en.Then;
import pageObjects.DeliveryAddressPage;

public class DeliveryAddressPageSteps {
    DeliveryAddressPage deliveryAddressPage =new DeliveryAddressPage();
@Then("User selects delivery address")
    public void userEntersORSelectsDeliveryAddress() throws InterruptedException {
    deliveryAddressPage.selectRaviAddress();

}

    @Then("User clicks on delivery here button")
    public void userClicksOnDeliveryHereButton() {
        deliveryAddressPage.clickDeliveryHereButton();
    }
}
