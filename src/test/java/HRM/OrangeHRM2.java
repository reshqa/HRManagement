package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.xml.bind.Element;

public class OrangeHRM2 {
WebDriver driver;
@BeforeTest
public void beforetest()
{
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Reshma\\Chromedriver.exe");

}
@BeforeMethod
    public  void beforemethod(){
    driver=new ChromeDriver();
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

    //file upload
  /*  String filepath="C:\\Users\\user\\Desktop\\Canada\\IMG_20170319_122017.jpg";
    WebElement choosefile= driver.findElement(By.xpath("//*[@id=\"photofile\"]"));
    choosefile.sendKeys(filepath);
    driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();*/

    driver.findElement(By.xpath("//*[@id=\"photofile\"]")).sendKeys("C:\\Users\\user\\Desktop\\Canada\\IMG_20170319_122017.jpg");
    driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();




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
