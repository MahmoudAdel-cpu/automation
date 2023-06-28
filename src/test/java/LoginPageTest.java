import Base.TestBase;
import Pages.AddCustomerPage;
import Pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static Utils.TestUtil.SS;
import static Utils.TestUtil.getTitle;

public class LoginPageTest extends TestBase {
    LoginPage lp;
    AddCustomerPage ac;
    public LoginPageTest (){
        super();
    }
    @BeforeMethod
    public void setup(){
        initialization();
        lp = new LoginPage();
    }
    @Test
    public void validLogin(){
        SS("LoginPage");
        ac =  lp.ValidloginData(prop.getProperty("username"),prop.getProperty("password") );
        getTitle();
        SS("HomePage");
    }
    @AfterMethod
    public void tearDown(){
        guru_driver.quit();
    }
}
