package amazonHomePageTest;

import base.CommonAPI;
import amazonHomePage.AmazonHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class AmazonHomePageTest extends CommonAPI {

    AmazonHomePage homePage;
    String url = "https://www.amazon.com/";

    @BeforeClass
    public void intil() {
        homePage = PageFactory.initElements(driver, AmazonHomePage.class);
        driver.get(url);
    }

    @Test
    public void searchBar() {
        homePage.setSearchBar("laptop");
        homePage.setSearchButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.getTitle();
        Assert.assertEquals(driver.getTitle(), "Amazon.com: laptop");
    }

    @Test
    public void todaysDeals() {
        homePage.setTodaysDeals();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String title = driver.getTitle();
        if (title.contains("Today's Deals")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }

    @Test
    public void amazonBasics() {
        homePage.setAmazonBasics();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.getTitle().contains("AmazonBasics");
        if (driver.getTitle().contains("AmazonBasics")) {
            System.out.println("Test did not fail! Whoo Hoo");
        } else {
            System.out.println("Test did not pass! Boo");
        }
    }

    @Test
    public void coupons() {
        homePage.setCoupons();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        if (driver.getTitle().contains("Coupons")) {
            System.out.println("Correct Webpage");
        } else {
            System.out.println("Incorrect Webpage");
        }
    }

    @Test
    public void wholeFoods() {
        homePage.setWholeFoods();
        if (driver.getTitle().equalsIgnoreCase("whole foods")) {
            System.out.println("Right Webpage");
        }
    }

    @Test
    public void bestSellers() {
        homePage.setBestSellers();
        if (driver.getTitle().contains("Best Sellers")) {
            System.out.println("Test Passed");
        }
    }

    @Test
    public void giftIdeas() {
        homePage.setGiftIdeas();
        driver.getTitle().contains("Gift Ideas");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(driver.getTitle().contains("Gift Ideas"), "Gift Ideas");
    }

    @Test
    public void newReleases() {
        homePage.setNewReleases();
        if (driver.getTitle().contains("New Releases")) {
            System.out.println("Passed");
        }
    }
}
