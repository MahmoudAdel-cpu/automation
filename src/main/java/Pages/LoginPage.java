package Pages;
import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@name='uid']")
    WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password;

    @FindBy(xpath = "//input[@name='btnLogin']")
    WebElement loginbtn;
    public LoginPage(){
        PageFactory.initElements(guru_driver, this);
    }

    public AddCustomerPage ValidloginData(String un, String pw) {
        userName.sendKeys(un);
        password.sendKeys(pw);
        loginbtn.click();
        return new AddCustomerPage();
    }
}
