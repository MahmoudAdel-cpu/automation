import Base.TestBase;
import Pages.AddCustomerPage;
import Pages.LoginPage;
import Pages.NewAccountPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utils.TestUtil.SS;
import static Utils.TestUtil.getTitle;

public class AddNewAccountPageTest extends TestBase {

    AddCustomerPage ac;
    LoginPage lp;
    NewAccountPage na;
    public AddNewAccountPageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        initialization();
        lp = new LoginPage();
        ac = new AddCustomerPage();
        na = new NewAccountPage();
        SS("LoginPage");
        ac =  lp.ValidloginData(prop.getProperty("username"),prop.getProperty("password") );
        getTitle();
        SS("HomePage");
    }
    @Test
    public void newAccount(){
        na.addingNewAccount();
    }

}
