package resolver.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resolver.webdriverinit.WebDriverInit;
import resolver.pages.HomePage;

public class ButtonTests extends WebDriverInit {

    HomePage homePage;

    @BeforeMethod
    public void initialization(){
        setUp();
        homePage = new HomePage(driver);
    }

    @Test(description = "Check if Button is Enabled")
    public void checkButtonIsEnabled(){
        Assert.assertTrue(homePage.getButton1Status());
    }

    @Test(description = "Check if Button is disabled")
    public void checkButtonIsDisabled(){
        Assert.assertFalse(homePage.getButton2Status());
    }

    @Test(description = "Check Button click alert message")
    public void checkAlertTest(){
        Assert.assertEquals(homePage.getAlertMessage(),"You clicked a button!");
    }

    @AfterMethod
    public void tearDown(){
        close();
    }
}
