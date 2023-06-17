package com.virgingames.pages;


import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    public String getTheCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='option']/label[@for='privacy_pref_optin']")
    WebElement acceptCookiesButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Online Bingo')]")
    WebElement onlineBingoLink;


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Join Now')]")
    WebElement joinNow;

    public void clickOnAcceptCookiesButton() {
        clickOnElement(acceptCookiesButton);
        log.info("Clicking on accept cookies button : " + acceptCookiesButton.toString());
    }

    public void clickOnOnlineBingo() {
        clickOnElement(onlineBingoLink);
        log.info("Clicking on  online Bingo Link : " + onlineBingoLink.toString());
    }

    public void clickOnJoinNowLink() {
        clickOnElement(joinNow);
        log.info("Clicking on join Now link : " + joinNow.toString());
    }


}
