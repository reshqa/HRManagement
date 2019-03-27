package HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class BaseClass {
     public static WebDriver driver;

//public BaseClass(WebDriver driver){
    //this.driver=driver;
    public BaseClass(){

}

public void initialization(String browser){
    if (browser.equalsIgnoreCase("FF")) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Reshma\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    } else if (browser.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Reshma\\Chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
        driver.get("http://www.facebook.com");
    }
    public void NewBase()
    {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Reshma\\Chromedriver.exe");
    driver=new ChromeDriver();
        driver.get(" http://www.facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        }

}
