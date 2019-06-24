package cnnHomePageTest;

import base.CommonAPI;
import cnnHomePage.CNNHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CNNHomePageTest extends CommonAPI {

    CNNHomePage homePage;

    String url = "https://www.cnn.com/";

    @BeforeClass
    public void intil() {
        homePage = PageFactory.initElements(driver, CNNHomePage.class);
        driver.get(url);
    }

    @Test
    public void us(){
        homePage.setUS();

       String actualURL = driver.getCurrentUrl();
       String expectedURL = "https://www.cnn.com/us";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void world(){
        homePage.setWorld();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/world";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void politics(){
        homePage.setPolitics();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/politics";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void business(){
        homePage.setBusiness();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/business";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void opinions(){
        homePage.setOpinion();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/opinion";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void health(){
        homePage.setHealth();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/health";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void entertainment(){
        homePage.setEntertainment();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/entertainment";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void style(){
        homePage.setStyle();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/style";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void travel(){
        homePage.setTravel();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/travel";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void videos(){
        homePage.setVideo();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/videos";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualURL, expectedURL);
    }
}
