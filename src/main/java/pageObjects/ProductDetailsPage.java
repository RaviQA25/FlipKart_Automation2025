
package pageObjects;

import actoinDriver.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.ArrayList;

import static base.BaseClass.driver;

public class ProductDetailsPage {

    Action action = new Action();


    @FindAll({
            @FindBy(xpath = "//div[@class='aRL84z']//a"),
            @FindBy(xpath = "//button[@class='QqFHMw cNEU5Q J9Kkbj _7Pd1Fp']")
    })
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='EjOX7q']")
    private WebElement newTabButton;

    @FindBy(xpath = "//div[@class='Nx9bqj CxhGGd']")
    private WebElement productPrice;

    @FindBy(xpath = "//div[@class='xFVion']//ul")
    private WebElement productSpecifications;

    @FindBy(xpath = "//td[text()='SIM Type']//..//li")
    private WebElement simType;

//    @FindBy(xpath = "//a[contains(text(),'8 GB')]")
//    private WebElement ramSize;

    @FindBy(xpath = "//span[@class='VU-ZEz']")
    private WebElement titleRamSize;

    @FindBy(xpath = "//a[text()='4 GB']")
    private WebElement ram4GB;
    @FindBy(xpath = "//a[text()='6 GB']")
    private WebElement ram6GB;
    @FindBy(xpath = "//a[text()='8 GB']")
    private WebElement ram8GB;

    @FindBy(xpath = "//input[@placeholder='Enter Delivery Pincode']")
    private WebElement pincodeBtn;


    @FindBy(xpath = "(//div[@class='_05ubb2'])[1]")
    private WebElement backCoverBtn;

    @FindBy(xpath = "//span[text()='Add 2 Items to Cart']")
    private WebElement cartBtn;

//    @FindBy(xpath = "//button[text()='Enter Delivery Pincode']")
//    private WebElement pinCodeBtn;

    /**
     * Constructor - initializes web elements using PageFactory.
     */
    public ProductDetailsPage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Clicks the Add to Cart button in a new tab.
     */
    public void clickAddToCartButton() throws InterruptedException {

        // Switch to the new tab
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        if (tabs.size() > 1) {
            driver.switchTo().window(tabs.get(1));
        } else {
            System.out.println("New tab not found.");
            return;
        }

        // Wait and then try to click the Add to Cart button

        if (action.isDisplayed(driver, addToCartButton)) {
            action.click(driver, addToCartButton);
            System.out.println("Add to Cart button is displayed and clicked.");
        } else {
            System.out.println("Add to Cart button is not displayed.");
        }
    }

    public void getProductPrice() throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        if (tabs.size() > 1) {
            driver.switchTo().window(tabs.get(1));
        } else {
            System.out.println("New tab not found.");
            return;
        }
        Thread.sleep(5000);
        String amount = productPrice.getText();
        System.out.println(amount);


    }

    public void productSpecifications() throws InterruptedException {
        Thread.sleep(10000);
        String specifications = productSpecifications.getText();
        System.out.println(specifications);


    }

    public void verifiesTheSimType(String simTypeofDevice) {
        String exp = simTypeofDevice;
        String actual = simType.getText();
        Assert.assertEquals(actual, exp, "simtype is not equal to dualsim");

    }

    public void selectsRamSizeAndVerifyRamInTheTitle(String deviceRam) throws InterruptedException {
//        try {
            String ramXpath = "(//a[text()='" + deviceRam + "']//..)[1]";
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ramXpath)));
            element.click();
            WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOf(titleRamSize));
            String productTitle = productTitleElement.getText();
            System.out.println("Product Title: " + productTitle);
            Assert.assertTrue(productTitle.contains(deviceRam));
            System.out.println("print from title");
//            System.out.println("Ram Size is found in the product Titl that is:" + element);
//        } catch (Exception e) {
//            System.out.println("Failed to verify Ram in Product Title:" + e.getMessage());
//        }


    }


    public void clickOnBackCoverRadioBtn() {

        backCoverBtn.click();
    }

    ;

    public void clickOnCartItemsBtn() {
        cartBtn.click();
    }

//    public void clickOnEnterPincode() throws InterruptedException {
//        Thread.sleep(4000);
//        pinCodeBtn.click();
//    }

    public void selectRamSizeAndVerifyUsingSwitch(String descriptionRam) {

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(10000));
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOf(titleRamSize));
        WebElement ram = null;
//        WebElement element = wait.until(ExpectedConditions.visibilityOf(titleRamSize));
        switch (descriptionRam) {
            case "4 GB":
                ram = ram4GB;
//                action.click(driver, ram4GB);
//                productTitle4GB = wait.until(ExpectedConditions.visibilityOf(titleRamSize));
//                String productTitle = productTitle4GB.getText();
//                Assert.assertTrue(productTitle.contains(descriptionRam),"4GB Ram Verification failed in Switch case");
//                System.out.println("4GB Ram verification completed in switch case");
                break;
            case "6 GB":
                ram = ram6GB;
//                action.click(driver, ram6GB);
//                productTitle4GB = wait.until(ExpectedConditions.visibilityOf(titleRamSize));
//                String productTitles = productTitle6GB.getText();
//                Assert.assertTrue(productTitles.contains(descriptionRam),"6GB Ram verification failed in switch case");
//                System.out.println("6GB Ram verification completed in switch case");

                break;
            case "8 GB":
                ram = ram8GB;
//                action.click(driver, ram8GB);
//                productTitle4GB = wait.until(ExpectedConditions.visibilityOf(titleRamSize));
//                String productTitle1 = productTitle8GB.getText();
//                Assert.assertTrue(productTitle1.contains(descriptionRam),"8GB Ram Verification Failed In Switch Case");
//                System.out.println("8GB Ram verification completed in switch case");
                break;
            default:
                System.out.println(" No ram Options found");
        }
                 action.click(driver, ram);
                String productTitle = productTitleElement.getText();
                Assert.assertTrue(productTitle.contains(descriptionRam),""+descriptionRam+" Ram Verification failed in Switch case");
                System.out.println(""+descriptionRam+" Ram verification completed in switch case");

    }
    public void enterDeliveryPincode(){
        pincodeBtn.sendKeys("517424");
    }


}
