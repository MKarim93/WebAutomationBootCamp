package cignaHomePageTest;

import base.CommonAPI;
import cignaHomePage.CignaHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class CignaHomePageTest extends CommonAPI {

    CignaHomePage homePage;

    String url = "https://www.cigna.com/";

    @BeforeClass
    public void intil() {
        homePage = PageFactory.initElements(driver, CignaHomePage.class);
        driver.get(url);
    }

    @Test
    public void individualsFamilies() {
        homePage.setIndividualsFamiles();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String acutalURL = driver.getCurrentUrl();
        String expectedURL = "https://www.cigna.com/individuals-families/";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(acutalURL, expectedURL);
    }

    @Test
    public void employersBrokers() {
        homePage.setEmployersBrokers();
        String acutalURL = getCurrentPageUrl();
        String expectedURL = "https://www.cigna.com/employers-brokers/";

        Assert.assertEquals(acutalURL, expectedURL);
    }

    @Test
    public void healthCareProviders() {
        homePage.setHealthCareProviders();
        String acutalURL = getCurrentPageUrl();
        String expectedURL = "https://www.cigna.com/health-care-providers/";

        Assert.assertEquals(acutalURL, expectedURL);
    }

    @Test
    public void aboutUs() {
        homePage.setAboutUs();
        String acutalURL = getCurrentPageUrl();
        String expectedURL = "https://www.cigna.com/about-us/";

        Assert.assertEquals(acutalURL, expectedURL);
    }

    @Test
    public void searchBar() {
        homePage.setSearchBar("Doctors");
        homePage.setSubmitButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String acutalURL = getCurrentPageUrl();
        String expectedURL = "https://www.cigna.com/search?query=Doctors";

        Assert.assertEquals(acutalURL, expectedURL);
    }

}
