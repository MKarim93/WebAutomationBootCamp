package cnnHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CNNHomePage extends CommonAPI {

    @FindBy(linkText = "US")
    WebElement US;

    public void setUS(){
        US.click();
    }

    @FindBy(linkText = "World")
    WebElement World;

    public void setWorld(){
        World.click();
    }

    @FindBy(linkText = "Politics")
    WebElement Politics;

    public void setPolitics(){
        Politics.click();
    }

    @FindBy(linkText = "Business")
    WebElement Business;

    public void setBusiness(){
        Business.click();
    }

    @FindBy(linkText = "Opinion")
    WebElement Opinion;

    public void setOpinion(){
        Opinion.click();
    }

    @FindBy(linkText = "Health")
    WebElement Health;

    public void setHealth(){
        Health.click();
    }

    @FindBy(linkText = "Entertainment")
    WebElement Entertainment;

    public void setEntertainment(){
        Entertainment.click();
    }

    @FindBy(linkText = "Style")
    WebElement Style;

    public void setStyle(){
        Style.click();
    }

    @FindBy(linkText = "Travel")
    WebElement Travel;

    public void setTravel(){
        Travel.click();
    }

    @FindBy(linkText = "Sports")
    WebElement Sports;

    public void setSports(){
        Sports.click();
    }

    @FindBy(linkText = "Video")
    WebElement Video;

    public void setVideo(){
        Video.click();
    }

}
