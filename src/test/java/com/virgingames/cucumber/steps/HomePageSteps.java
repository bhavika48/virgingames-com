package com.virgingames.cucumber.steps;
import com.virgingames.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }
    @And("^I click on accept cookies button$")
    public void i_click_on_accept_cookies_button()  {
        new HomePage().clickOnAcceptCookiesButton();
    }
    @And("^I click on Online Bingo link$")
    public void iClickOnOnlineBingoLink() {
        new HomePage().clickOnOnlineBingo();
    }

    @When("^I click on join Now link$")
    public void i_click_on_join_Now_link() {
        new HomePage().clickOnJoinNowLink();
    }


    @Then("^I should navigate to login  page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
    }
    @Then("^I should be on login-page \"([^\"]*)\"$")
    public void iShouldBeOnLoginPage(String expectedUrl )  {
        Assert.assertEquals("User is not on login page", expectedUrl, new HomePage().getTheCurrentUrl());

    }
}