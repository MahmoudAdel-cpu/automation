package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.TestUtil.CUSTOMERID;
import static Utils.TestUtil.SS;

public class NewAccountPage extends TestBase {

    @FindBy(xpath = "//a[normalize-space()='New Account']")
    WebElement newAccount;
    @FindBy(name = "cusid")
    WebElement custID;
    @FindBy(xpath = "//select[@name= 'selaccount']")
    WebElement selectAccount;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select/option[1]")
    WebElement accountType;
    @FindBy(name = "inideposit")
    WebElement deposite;
    @FindBy(name = "button2")
    WebElement submitBTN;
    public NewAccountPage(){
        PageFactory.initElements(guru_driver, this);
    }
    public void addingNewAccount(){
        newAccount.click();
        custID.sendKeys(CUSTOMERID);
        selectAccount.click();
        accountType.click();
        deposite.sendKeys(prop.getProperty("deposit"));
        SS("Deposit value");
        submitBTN.click();

    }
}
