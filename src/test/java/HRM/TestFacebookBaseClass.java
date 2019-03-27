package HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestFacebookBaseClass {
    WebDriver driver;

       @BeforeTest
       public void setup()
       {
           System.setProperty("webdriver.chrome.driver","C:\\Users\\Reshma\\Chromedriver.exe");
           driver=new ChromeDriver();
           driver.get("https://www.facebook.com");
           driver.manage().window().maximize();

       }
    @AfterTest
    public void Exit()
    {
        driver.quit();
    }

}
