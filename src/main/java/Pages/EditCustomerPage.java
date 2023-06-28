package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.TestUtil.CUSTOMERID;
import static Utils.TestUtil.SS;

public class EditCustomerPage extends TestBase {
    @FindBy(xpath = "//a[normalize-space()='Edit Customer']")
    WebElement editCustomer;

    @FindBy(xpath = "//input[@name='cusid']")
    WebElement customerID;

    @FindBy(xpath = "//input[@name='AccSubmit']")
    WebElement submitCustomerID;

    @FindBy(xpath = "//input[@name='emailid']")
    WebElement updateCustomerEmail;

    @FindBy(xpath = "//input[@name='sub']")
    WebElement submitUpdatedData;

    @FindBy(xpath = "//a[normalize-space()='Home']")
    WebElement returnToHomePage;
    public EditCustomerPage(){
        PageFactory.initElements(guru_driver, this);
    }
    public void editCustomer(){
        editCustomer.click();
        customerID.sendKeys(CUSTOMERID);
        submitCustomerID.click();
        updateCustomerEmail.clear();
        updateCustomerEmail.sendKeys("TRSWS@gmail.com");
        SS("updateCustomerEmail");
        submitUpdatedData.click();
        SS("Successfully edited");
        returnToHomePage.click();
    }
}
