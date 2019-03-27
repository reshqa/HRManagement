package HRM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest extends BaseClass  {
WebDriver driver;
    @BeforeMethod
    @Parameters({"Browser"})
    public void setup(String browser){
    //  BaseClass cbp=new BaseClass();
     // cbp.initialization(browser);
        initialization(browser);
    }
    @Test
    public void test1Page() {
            driver.get("http://www.facebook.com");
           // System.out.println("testing");
        }
    }
