package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Login']")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='field-username']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='field-password']")
    WebElement passwordField;


    @CacheLookup
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement loginButton;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }


}
