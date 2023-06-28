import Base.TestBase;
import Pages.AddCustomerPage;
import Pages.DeleteCustomerPage;
import Pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utils.TestUtil.SS;
import static Utils.TestUtil.getTitle;

public class DeleteCustomerPageTest extends TestBase {

    AddCustomerPage ac;
    LoginPage lp;
    DeleteCustomerPage dp;
    public DeleteCustomerPageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        initialization();
        lp = new LoginPage();
        ac = new AddCustomerPage();
        dp = new DeleteCustomerPage();
        SS("LoginPage");
        ac =  lp.ValidloginData(prop.getProperty("username"),prop.getProperty("password") );
        getTitle();
        SS("HomePage");
    }
    @Test
    public void deleteCustomer(){
        dp.DeleteCustomerID();
    }
    @AfterMethod
    public void tearDown(){
        guru_driver.quit();
    }

}
