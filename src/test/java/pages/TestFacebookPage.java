package pages;

import base.BaseclassPOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestFacebookPage extends BaseclassPOM {

    @FindBy(name = "email")
    WebElement userid;

    @FindBy(name = "pass")
    WebElement password;

    @FindBy(xpath ="//input[@type='submit']")
    WebElement lbutton;


    public  TestFacebookPage()
    {

        PageFactory.initElements(driver,this);
    }

    public void loginPage(String uid,String pwd)
    {
        userid.sendKeys(uid);
        password.sendKeys(pwd);
        lbutton.click();
    }
    public String title()
    {
        String x=driver.getTitle();
        return x;

    }
}
