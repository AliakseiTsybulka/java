#Author: alex ciba    //alex.tsybulka@gmail.com

Feature: Login
@login
  Scenario: Valid login
    Given I navigated to OrangeHrm
    And I see OrangeHrm logo
    When I enter valid username and password
    And I click login button
    Then I successfully logged in
    And I close browser

  Scenario: Inalid login
    Given I navigated to OrangeHrm
    And I see OrangeHrm logo
    When I enter invalid username and password
    And I click login button
    Then I see error message is displayed
    And I close the browser