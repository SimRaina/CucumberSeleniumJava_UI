Feature: OrangeHRM Login

  Background: Below are the backround steps
    Given I launch chrome browser
    When I open OrangeHRM home page


   #Test#1
  Scenario: Logo presence on OrangeHRM home Page
    Then I verify that the logo present on page
    And Close browser

 #Test#2
  #Simple Login Test
  Scenario: Login to OrangeHRM with valid credentials
    And Enter username and password
    And Click on login button
    Then User must successfully login to the Dashboard page
    And Close browser

 #Test#3 : Passing parameters to steps
  Scenario: Login to OrangeHRM with valid credentials
    And Enter username "Admin" and password "admin123"
    And Click on login button
    Then User must successfully login to the Dashboard page
    And Close browser


  #Test#4 :
  #Login DDT-Passing Multiple Parameters using scenario Outline & Examples Keyword
  Scenario Outline: Login to OrangeHRM with Multiple parameters
    And Enter username "<username>" and password "<password>"
    And Click on login button
    Then User must successfully login to the Dashboard page
    And Close browser

    Examples:
      | username | password |
      | admin    | admin123 |



 #Test#5 :
 # Login DDT-Passing Parameters using Data Table
  Scenario: Login to OrangeHRM with DataTable parameters
    And Enter username and password from Data Table
    | admin | admin123  |
    And Click on login button
    Then User must successfully login to the Dashboard page
    And Close browser