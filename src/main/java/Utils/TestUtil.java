package Utils;

import Base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class TestUtil extends TestBase {
    public   static long PAGE_LOAD_TIMEOUT = 20;
    public static long IMPLICIT_WAIT = 15;
    public static String SSpath = "E:\\Java\\projects\\guru99\\";
    public static String Extension = ".png";
    public static String CUSTOMERID;

    public static void SS(String path){
        File screenshotFile = ((TakesScreenshot) guru_driver).getScreenshotAs(OutputType.FILE);
        String screenshotPath =SSpath + path + TestUtil.Extension;
        try {
            // Save the screenshot to the specified path
            FileUtils.copyFile(screenshotFile, new File(screenshotPath));
            System.out.println("Screenshot saved successfully at " + screenshotPath);
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
    }
    public static void getTitle(){
        guru_driver.getTitle();
        System.out.println("Page title is: "+ guru_driver.getTitle());
    }
    public static void getID(){

    }


}
