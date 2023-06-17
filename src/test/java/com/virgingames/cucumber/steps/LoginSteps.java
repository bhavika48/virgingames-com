package com.virgingames.cucumber.steps;

import com.virgingames.browserfactory.ManageBrowser;
import com.virgingames.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps {

    @Given("^I am on login page$")
    public void iAmOnRegisterPage() {
        ManageBrowser.driver.get("https://www.virgingames.com/onboarding/register");
    }

    @Given("^I am on Login page$")
    public void iAmOnLoginPage() {
    }

    @And("^I enter email \"([^\"]*)\" in email field$")
    public void iEnterEmailInEmailField(String email)  {
   new LoginPage().enterEmail(email);
    }

    @And("^I enter password \"([^\"]*)\" in password field$")
    public void iEnterPasswordInPasswordField(String  password)  {
   new LoginPage().enterPassword(password);
    }

    @And("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successful$")
    public void iShouldLoginSuccessful() {
    }


}

