package amazonHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends CommonAPI {

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement searchBar;

    public void setSearchBar(String searchText) {
        searchBar.click();
        searchBar.sendKeys(searchText);
    }

    @FindBy(xpath = "//input[@type='submit']")
    WebElement searchButton;

    public void setSearchButton() {
        searchButton.click();
    }

    @FindBy(linkText = "Today's Deals")
    WebElement TodaysDeals;

    public void setTodaysDeals() {
        TodaysDeals.click();
    }

    @FindBy(linkText = "AmazonBasics")
    WebElement AmazonBasics;

    public void setAmazonBasics() {
        AmazonBasics.click();
    }

    @FindBy(linkText = "Coupons")
    WebElement Coupons;

    public void setCoupons() {
        Coupons.click();
    }

    @FindBy(linkText = "Whole Foods")
    WebElement WholeFoods;

    public void setWholeFoods() {
        WholeFoods.click();
    }

    @FindBy(linkText = "Best Sellers")
    WebElement BestSellers;

    public void setBestSellers() {
        BestSellers.click();
    }

    @FindBy(linkText = "Gift Ideas")
    WebElement GiftIdeas;

    public void setGiftIdeas() {
        GiftIdeas.click();
    }

    @FindBy(linkText = "New Releases")
    WebElement NewReleases;

    public void setNewReleases() {
        NewReleases.click();
    }

    @FindBy(linkText = "Hello, Sign in")
    WebElement SignIn;

    public void setSignIn() {
        SignIn.click();
    }
}
