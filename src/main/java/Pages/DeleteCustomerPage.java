package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static Utils.TestUtil.CUSTOMERID;
import static Utils.TestUtil.SS;
public class DeleteCustomerPage extends TestBase {

    @FindBy(xpath = "//a[normalize-space()='Delete Customer']")
    WebElement deleteCustomer;
    @FindBy(xpath = "//input[@name='cusid']")
    WebElement customerID;
    @FindBy(xpath = "//input[@name='AccSubmit']")
    WebElement submitCustomerID;
    public DeleteCustomerPage(){
        PageFactory.initElements(guru_driver, this);
    }
    public void DeleteCustomerID(){
        deleteCustomer.click();
        customerID.sendKeys(CUSTOMERID);
        SS("DeleteCustomerID");
        submitCustomerID.click();
    }
}
