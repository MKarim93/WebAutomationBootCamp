package homePageTest;

import base.CommonAPI;
import homePage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePageTest extends CommonAPI {

    HomePage homePage;
    String url = "https://www.amazon.com/";

    @BeforeClass
    public void intil(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);
    }

    @Test
    public void searchBar(){
        homePage.setSearchBar("laptop");
        homePage.setSearchButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.getTitle();
        Assert.assertEquals(driver.getTitle(), "Amazon.com: laptop");
    }

    @Test
    public void todaysDeals(){
        homePage.setTodaysDeals();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String title = driver.getTitle();
        if(title.contains("Today's Deals"))
        {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
    }
}
