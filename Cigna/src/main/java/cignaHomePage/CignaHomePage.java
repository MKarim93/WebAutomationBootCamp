package cignaHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CignaHomePage extends CommonAPI {

    @FindBy(linkText = "Individuals and Families")
    WebElement IndividualsFamiles;

    public void setIndividualsFamiles(){
        IndividualsFamiles.click();
    }

    @FindBy(linkText = "Employers and Brokers")
    WebElement EmployersBrokers;

    public void setEmployersBrokers(){
        EmployersBrokers.click();
    }

    @FindBy(linkText = "Health Care Providers")
    WebElement HealthCareProviders;

    public void setHealthCareProviders(){
        HealthCareProviders.click();
    }

    @FindBy(linkText = "About Us")
    WebElement AboutUs;

    public void setAboutUs(){
        AboutUs.click();
    }

    @FindBy(xpath = "//input[@type='search']")
    WebElement searchBar;

    public void setSearchBar(String inputText){
        searchBar.click();
        searchBar.sendKeys(inputText);
    }

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitButton;

    public void setSubmitButton(){
        submitButton.click();
    }

}
