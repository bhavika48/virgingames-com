Feature: Login
  As a user I want to login successfully in application

  Background: I am on Login Page

  @sanity
  Scenario: User should Login successfully
    Given I am on Login page
    And I enter email "admin1234@gmail.com" in email field
    And I enter password "admin@09" in password field
    And I click on Login Button
    Then  I should be on login-page "https://www.virgingames.com/quick-login"

