package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    @FindBy(xpath = "//input[@id='field-username']")
    WebElement _userNameField;
    @FindBy(xpath = "//input[@id='field-password']")
    WebElement _passwordField;
    @FindBy(xpath = "//li[@class='field-item field-item-button']//button")
    WebElement _loginButton;
    @FindBy(xpath = "//div[contains(text(),'Please try again, your username/email or password ')]")
    WebElement _invalidLoginMessage;


    //This method clicks on the UserName and enter email
    public void sendEmailId(String email) {
        log.info("Send a valid emailId" + _userNameField.toString());
        clickOnElement(_userNameField);
        sendTextToElement(_userNameField, email);
    }
    //This method click on passwordField and enter password to Password Field
    public void sendPassword(String pwd) {
        log.info("Send password " + _passwordField.toString());
        clickOnElement(_passwordField);
        sendTextToElement(_passwordField, pwd);
    }
    //This method click on Login Button
    public void clickOnLoginBtn() {
        log.info("Click on Login Button " + _loginButton.toString());
        clickOnElement(_loginButton);
    }
    // User Cannot Login Using invalid credentials
    public String invalidLogin() {
        log.info("Verify invalid Login Message " + _invalidLoginMessage.toString());
        return getTextFromElement(_invalidLoginMessage);

    }



}
