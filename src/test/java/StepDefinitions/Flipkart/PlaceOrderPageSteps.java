package StepDefinitions.Flipkart;

import base.BaseClass;
import io.cucumber.java.en.And;
import pageObjects.PlaceOrderPage;

public class PlaceOrderPageSteps extends BaseClass {
    PlaceOrderPage placeOrderPage = new PlaceOrderPage();

    @And("User clicks on placeOrder button")
    public void userClicksPlaceOrderButton() throws InterruptedException {
        placeOrderPage.clickPlaceOrderButton();


    }
}
