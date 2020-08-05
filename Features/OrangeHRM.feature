Feature: OrangeHRM Login
    
     Scenario: Logo presence on OrangeHRM home page
    Given I launch chrome browser
    When I open OrangeHRM home page
    Then I verify that the logo present on page
    And Close browser
    
    
  Scenario: Login to OrangeHRM with valid credentials
    Given I launch chrome browser
    When I open OrangeHRM home page
    And Enter username and password
    And Click on login button
    Then User must successfully login to the Dashboard page
    And Close browser
    
    Scenario: Login to OrangeHRM with valid credentials
    Given I launch chrome browser
    When I open OrangeHRM home page
    And Enter username "Admin" and password "admin123"
    And Click on login button
    Then User must successfully login to the Dashboard page
    And Close browser
	
	 Scenario Outline: Login to OrangeHRM with Multiple parameters
    Given I launch chrome browser
    When I open OrangeHRM home page
    And Enter username "<username>" and password "<password>"
    And Click on login button
    Then User must successfully login to the Dashboard page
    And Close browser

    Examples:
      | username | password |
      | Aaadmin    | admin123 |
      | admin123 | admin    |
    
    Scenario: Login to OrangeHRM with DataTable parameters
    Given I launch chrome browser
    When I open OrangeHRM home page
    And Enter username and password from Data Table
    | Admin | admin123  |
    And Click on login button
    Then User must successfully login to the Dashboard page
    And Close browser
    