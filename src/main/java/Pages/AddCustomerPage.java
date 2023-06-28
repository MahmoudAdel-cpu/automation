package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static Utils.TestUtil.SS;
import static Utils.TestUtil.CUSTOMERID;

public class AddCustomerPage extends TestBase {
    @FindBy(xpath = "//a[normalize-space()='New Customer']")
    WebElement addNewCUstomer;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement customerName;
    @FindBy(xpath = "//input[@value='m']")
    public WebElement gender;
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement selectDataPicker;
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement addBirthDate;
    @FindBy(xpath = "//textarea[@name='addr']")
    public WebElement addAddress;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement addCity;
    @FindBy(xpath = "//input[@name='state']")
    public WebElement addState;
    @FindBy(xpath = "//input[@name='pinno']")
    public WebElement addPINCode;
    @FindBy(xpath = "//input[@name='telephoneno']")
    public WebElement addMobileNumber;
    @FindBy(xpath = "//input[@name='emailid']")
    public WebElement addEmail;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement addPassword;
    @FindBy(xpath = "//input[@name='sub']")
    public WebElement submitForm;
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    public WebElement continueButton;


    public AddCustomerPage(){
        PageFactory.initElements(guru_driver, this);
    }


    public void addCustomer(){
        addNewCUstomer.click();
        customerName.sendKeys(prop.getProperty("customername"));
        gender.click();
        addBirthDate.sendKeys(prop.getProperty("birthdate"));
        addAddress.sendKeys(prop.getProperty("address"));
        addCity.sendKeys(prop.getProperty("city"));
        addState.sendKeys(prop.getProperty("state"));
        addPINCode.sendKeys(prop.getProperty("PIN"));
        addMobileNumber.sendKeys(prop.getProperty("phone"));
        addEmail.sendKeys(prop.getProperty("email"));
        addPassword.sendKeys(prop.getProperty("pass"));
        SS("CustomerData");
        submitForm.click();
        CUSTOMERID = guru_driver.getCurrentUrl().toString().substring(guru_driver.getCurrentUrl().toString().indexOf("?") + 5);
        System.out.println("Customer ID is: " + CUSTOMERID);
        SS("ID");
        continueButton.click();
    }
}
