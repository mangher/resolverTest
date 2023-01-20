package resolver.tests;

import resolver.webdriverinit.WebDriverInit;
import resolver.pages.HomePage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTests extends WebDriverInit{

    HomePage homePage;

    @BeforeMethod
    public void initialization(){
        setUp();
        homePage = new HomePage(driver);
    }

    @Test(description = "Check default selected value")
    public void checkMenuDefaultValue(){
        Assert.assertEquals(homePage.getDefaultButtonValue(),"Option 1");
    }

    @Test(description = "Check if Option 3 is Selected")
    public void checkMenuSpecificValue(){
        Assert.assertEquals(homePage.getSpecificButtonValue(),"Option 3");
    }

    @AfterMethod
    public void tearDown(){
        close();
    }
}
