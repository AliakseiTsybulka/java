#Author: aciba    //alex.tsybulka@gmail.com
Feature: Add employee

  Background: 
    Given I logged into OrangeHrm
    And I click on PIM link
    And I click on Add Employee link

  @smoke @addEmployee
  Scenario Outline: Add employee
    When I provide Employee details "<name>" and "<middleName>" and "<lastName>" and "<location>"
    And I click on save button
    Then I see employee is added successfully "<name>" and "<lastName>"

    Examples: 
      | name      | middleName | lastName   | location     |
      | Vladimir  | H          | Putin      | West Office  |
      | Muammar   | G          | Quaddafi   | HQ           |
      | Fidel     | M          | Castro     | North Office |
      | Kim       | Cen        | In         | Smart Office |
      | Alexander | G          | Lukashenko | North Office |

  @addEmpWithDetails
  Scenario: Add Employee and Create Login Details
    When I provide firstname, midlename, lastname and location
    And I click on create login details
    And I provide all mandatory fields
    And I click on save button
    Then I see employee is added successfully

  @temp
  Scenario: Add Employee Labels Verification
    Then I see following labels
      | First Name  |
      | Middle Name |
      | Last Name   |
      | Employee Id |
      | Location    |
