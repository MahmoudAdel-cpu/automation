package Base;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import Utils.TestUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

    public   static WebDriver guru_driver;
    public   static Properties prop;


    public TestBase(){
        try{
            prop = new Properties();
            FileInputStream ip = new FileInputStream("E:\\Java\\projects\\guru99\\src\\main\\java\\config.properties");
            prop.load(ip);
        }
        catch (FileNotFoundException e ){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void initialization(){
        String browserName =  prop.getProperty("browser");
        if(browserName.equals("chrome")){
            guru_driver = new EdgeDriver();
        }
        guru_driver.manage().window().maximize();
        guru_driver.manage().deleteAllCookies();
        guru_driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        guru_driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        guru_driver.get(prop.getProperty("url"));
    }

}
