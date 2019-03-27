package testdata;
import base.BaseclassPOM;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TestFacebookPage;

import java.util.concurrent.TimeUnit;


public class TestFacebook extends BaseclassPOM {
    TestFacebookPage tp;
    public TestFacebook()
    {
        super();
    }

    @BeforeMethod
    public void initialization()
    {
        BaseclassPOM();
    tp=new TestFacebookPage();

    }

    @Test
    public void login()
    {
     tp=new TestFacebookPage();
     tp.loginPage("test","testpwd");
    }
    @Test
    public void titleverification()
    {
        tp=new TestFacebookPage();
        String titleverify=tp.title();
        Assert.assertEquals(titleverify,"Facebook - Log In or Sign Up");

    }
    @AfterMethod
    public void closebrowser()
    {
        driver.quit();
    }


}
