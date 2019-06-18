package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static jdk.nashorn.internal.objects.NativeDate.getTime;

public class CommonAPI {

    public static final String BROWSERSTACK_USERNAME = "mohammadkarim1";
    public static final String BROWSERSTACK_AUTOMATE_KEY = "6AfReSjXekGBzR9ZRknw";
    public static final String SAUCE_USERNAME = "";
    public static final String SAUCE_AUTOMATE_KEY = "";
    public static final String BROWSERSTACK_URL = "https://mohammadkarim1:6AfReSjXekGBzR9ZRknw@hub-cloud.browserstack.com/wd/hub";
    public static final String SAUCE_URL = "https://" + SAUCE_USERNAME + ":" + SAUCE_AUTOMATE_KEY + "@ondemand.saucelabs.com:80/wd/hub";

    public static WebDriver driver = null;
    public static ExtentReports extent;

    @Parameters({"platform", "url", "browser", "cloud", "browserVersion", "envName"})
    @BeforeClass
    public static WebDriver setUpDriver(String platform, String url, @Optional("chrome") String browser, @Optional("false") boolean cloud, String browserVersion, String envName) throws MalformedURLException {
        if (cloud == true) {
            driver = getCloudDriver(browser, browserVersion, platform, envName);
        } else {
            driver = getLocalDriver(browser, platform);
        }
        driver.get(url);
        return driver;
    }

    public static WebDriver getCloudDriver(String browser, String browserVersion, String platform, String envName) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("name", "Cloud Execution");
        capabilities.setCapability("browser", browser);

        capabilities.setCapability("browser_version", browserVersion);
        capabilities.setCapability("os", platform);
        capabilities.setCapability("os_version", "Mojave");

        if (envName.equalsIgnoreCase("Saucelabs")) {
            driver = new RemoteWebDriver(new URL(SAUCE_URL), capabilities);
        } else if (envName.equalsIgnoreCase("Browserstack")) {
            capabilities.setCapability("resolution", "1024x768");
            driver = new RemoteWebDriver(new URL(BROWSERSTACK_URL), capabilities);
        }
        return driver;
    }

    public static WebDriver getLocalDriver(String browser, String platform) {
        if (platform.equalsIgnoreCase("mac") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver,", "../Generic/src/main/resources/drivers/chromedriver");
        } else if (platform.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "../Generic/src/main/resources/drivers/chromedriver.exe");
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    @AfterMethod
    public void quitDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
