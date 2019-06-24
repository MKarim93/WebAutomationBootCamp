package facebookHomePageTest;

import base.CommonAPI;
import facebookHomePage.FacebookHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookHomePageTest extends CommonAPI {

    FacebookHomePage homePage;

    String url = "https://www.facebook.com/";

    @BeforeClass
    public void intil() {
        homePage = PageFactory.initElements(driver, FacebookHomePage.class);
        driver.get(url);
    }

    @Test
    public void negativeSignIn(){
        homePage.setUserNameField("wrongUserName");
        homePage.setPassWordField("wrongPassWord");
        homePage.setLogInButton();

        String acutualTitle = driver.getTitle();
        String expectedTitle = "Log into Facebook | Facebook";

        Assert.assertEquals(acutualTitle, expectedTitle);
    }

    @Test
    public void forgotAccountTest(){
        homePage.setForgotAccount();

        driver.findElement(By.xpath("//h2[@class='uiHeaderTitle']")).isDisplayed();
    }

    @Test
    public void blankInputFieldsTest(){
        homePage.setLogInButton();

        String acutualTitle = driver.getTitle();
        String expectedTitle = "Log into Facebook | Facebook";

        Assert.assertEquals(acutualTitle, expectedTitle);
    }
}
