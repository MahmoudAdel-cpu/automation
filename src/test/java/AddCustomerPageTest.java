import Base.TestBase;
import Pages.AddCustomerPage;
import Pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static Utils.TestUtil.SS;
import static Utils.TestUtil.getTitle;


public class AddCustomerPageTest extends TestBase {
    LoginPage lp;
    AddCustomerPage ac;
    public AddCustomerPageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        initialization();
        lp = new LoginPage();
        ac = new AddCustomerPage();
        SS("LoginPage");
        ac =  lp.ValidloginData(prop.getProperty("username"),prop.getProperty("password") );
        getTitle();
        SS("HomePage");
    }
    @Test
    public void addCustomerTest(){
        ac.addCustomer();
    }
    @AfterMethod
    public void tearDown(){
        guru_driver.quit();
    }
}
