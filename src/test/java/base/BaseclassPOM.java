package base;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

        import java.util.concurrent.TimeUnit;

public class BaseclassPOM{

    public static WebDriver driver;


    public void BaseclassPOM()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Reshma\\Chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(" http://www.facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();


    }


}
