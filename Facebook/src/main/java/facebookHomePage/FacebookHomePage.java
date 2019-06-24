package facebookHomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookHomePage extends CommonAPI {

    @FindBy(id = "email")
    WebElement userNameField;

    public void setUserNameField(String userNameText){
        userNameField.click();
        userNameField.sendKeys(userNameText);
    }

    @FindBy(id = "pass")
    WebElement passWordField;

    public void setPassWordField(String passWordText){
        passWordField.click();
        passWordField.sendKeys(passWordText);
    }

    @FindBy(xpath = "//input[@type='submit']")
    WebElement logInButton;

    public void setLogInButton(){
        logInButton.click();
    }

    @FindBy(linkText = "Forgot account?")
    WebElement forgotAccount;

    public void setForgotAccount(){
        forgotAccount.click();
    }
}
