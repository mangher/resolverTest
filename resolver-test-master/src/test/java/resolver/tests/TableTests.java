package resolver.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resolver.webdriverinit.WebDriverInit;
import resolver.pages.HomePage;

public class TableTests extends WebDriverInit {
    
    HomePage homePage;

    @BeforeMethod
    public void initialization(){
        setUp();
        homePage = new HomePage(driver);
    }

    @Test
    public void checkTableData(){
        Assert.assertEquals(homePage.getTestFromTable(2,2),"Ventosanzap");
    }

    @AfterMethod
    public void tearDown(){
        close();
    }

}
