@smoke
Feature: HomePage Test
  As user I should able to see virgin Games homePage

  Background: I am on Home Page

  Scenario: User should navigate to login page successfully
    When I click on accept cookies button
    And I click on Online Bingo link
    And I click on join Now link
    Then I should be able to see "https://www.virgingames.com/onboarding/register" url





