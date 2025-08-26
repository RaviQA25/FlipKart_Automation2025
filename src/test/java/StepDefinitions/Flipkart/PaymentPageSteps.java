package StepDefinitions.Flipkart;

import actoinDriver.Action;
import base.BaseClass;
import io.cucumber.java.en.And;
import pageObjects.PaymentPage;

public class PaymentPageSteps extends BaseClass {
    PaymentPage paymentPage = new PaymentPage();
    @And("User selects the mode off payment")
    public void userSelectsTheModeOffPayment(){
        paymentPage.clickOnCashOnDeliveryButton();
    }


    @And("User Clicks On confirm Order Button")
    public void userClicksOnConfirmOrderButton() throws InterruptedException {
        paymentPage.clickOnConfirmOrderButton();

    }
}
