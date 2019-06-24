package citibankHomePageTest;

import base.CommonAPI;
import citibankHomePage.CitibankHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CitibankHomePageTest extends CommonAPI {

    CitibankHomePage homePage;

    String url = "https://online.citi.com/US/login.do";

    @BeforeClass
    public void intil() {
        homePage = PageFactory.initElements(driver, CitibankHomePage.class);
        driver.get(url);
    }

    @Test
    public void creditCards(){
        homePage.setCreditCards();
    }

    @Test
    public void banking(){
        homePage.setBanking();
    }

    @Test
    public void lending(){
        homePage.setLending();
    }

    @Test
    public void investing(){
        homePage.setInvesting();
    }

    @Test
    public void citigold(){
        homePage.setcitiGold_Link();
    }

}
