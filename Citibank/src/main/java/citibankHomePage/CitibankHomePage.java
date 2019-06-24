package citibankHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CitibankHomePage extends CommonAPI {

    @FindBy(linkText = "Credit Cards")
    WebElement CreditCards;

    public void setCreditCards(){
        CreditCards.click();
    }
    @FindBy(linkText = "Banking")
    WebElement Banking;

    public void setBanking(){
        Banking.click();
    }

    @FindBy(linkText = "Lending")
    WebElement Lending;

    public void setLending(){
        Lending.click();
    }

    @FindBy(linkText = "Investing")
    WebElement Investing;

    public void setInvesting(){
        Investing.click();
    }

    @FindBy(id = "citiGold_Link")
    WebElement citiGold_Link;

    public void setcitiGold_Link(){
        citiGold_Link.click();
    }

    @FindBy(id = "personetics-citi-menu")
    WebElement searchButton;

    public void setSearchButton(){
        searchButton.click();
    }

}
