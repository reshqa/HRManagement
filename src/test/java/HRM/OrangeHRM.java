package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class OrangeHRM {
WebDriver driver;
@BeforeTest
public void beforetest()
{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Reshma\\Chromedriver.exe");
    System.setProperty("webdriver.ie.driver","C:\\Users\\Reshma\\IEDriverServer.exe");
    System.setProperty("webdriver.gecko.driver","C:\\Users\\Reshma\\geckodriver.exe");

}
@Parameters({"browser"})
@BeforeMethod
    public  void beforemethod(String brw){
    if(brw.equalsIgnoreCase("firefox")){

        driver=new FirefoxDriver();
    }

    else if (brw.equalsIgnoreCase("ie")){
        DesiredCapabilities dc;
        dc=DesiredCapabilities.internetExplorer();
        dc.setCapability("nativeEvents", false);
        dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        driver = new InternetExplorerDriver(dc);
    }
   else if(brw.equalsIgnoreCase("chrome")) {
        driver = new ChromeDriver();
    }

   else
    {
        System.out.println("Invalid Browser");
    }
    driver.get("https://opensource-demo.orangehrmlive.com/");

}
@Test
    //Checking with correct username and password
public void login(){
    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
    driver.findElement(By.name("Submit")).click();
   // driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
   // driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
    //Select drpuserrole=new Select(driver.findElement(By.name("systemUser[userType]")));
   // drpuserrole.selectByVisibleText("Admin");
   // driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Reshma");

}
@Test
public void addemp(){
    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
    driver.findElement(By.name("Submit")).click();
        driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
        driver.findElement(By.partialLinkText("Add")).click();
        driver.findElement(By.id("firstName")).sendKeys("Reshma1");
        driver.findElement(By.id("lastName")).sendKeys("Chandran");
       // driver.findElement(By.id("photofile")).getLocation("")

}
   // @AfterMethod
   // public void aftermethod(){
      //  driver.quit();}
@Test
    public void wrongpwd(){
    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
    driver.findElement(By.name("txtPassword")).sendKeys("adman12");
    driver.findElement(By.name("Submit")).click();
}
@Test
    public void wronguname(){
    driver.findElement(By.name("txtUsername")).sendKeys("Adman");
    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
    driver.findElement(By.name("Submit")).click();
}
@Test
    public void errormsg(){
    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
    driver.findElement(By.name("txtPassword")).sendKeys("adman123");
    driver.findElement(By.name("Submit")).click();
    String exptext="Invalid credentials";
    String acttext=driver.findElement(By.id("spanMessage")).getText();
    Assert.assertEquals(acttext,exptext,"Invalid credentials");
}
@Test
    public void adduser(){
    driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
}






}
