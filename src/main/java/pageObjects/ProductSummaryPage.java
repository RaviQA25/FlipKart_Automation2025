package pageObjects;

import actoinDriver.Action;
import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSummaryPage extends BaseClass {
    Action action = new Action();

    @FindBy(xpath = "//div[contains(text(),'Total Payable')]")
    private WebElement verifyAmount;
    @FindBy(xpath = "//button[contains(text(),'CONTINUE')]")
    private WebElement continueButton;

    public ProductSummaryPage(){
        PageFactory.initElements(driver,this);
    }
public void verifyAmount(){
        action.isDisplayed(driver,verifyAmount);
}
public void clickContinueButton(){
        action.click(driver,continueButton);
}
}
