Feature:LoginFeature
  This feature checks the login functionality of the app

  Scenario: Login with valid credentials
    Given User navigate to Home page
    And User navigate to Login page using My Account Dropdown
    And User enter valid username as "victor@gmail.com" and password as "Password123"
    And User clicks on Login button
    Then User is logged into account


  Scenario: Login with valid credentials2
    Given User navigate to Home page
    And User navigate to Login page using My Account Dropdown
    And User enter valid credentials
      | username         | password    |
      | victor@gmail.com | Password123 |
      | csdcdc           | dcsdc       |
    And User clicks on Login button
    Then User is logged into account
    And User click on Edit your account information from left list
    Then User is on My Account information page
    And User clears phone number in Telephone field and set random 9 digits
    And Continue button is clicked
    Then "Success: Your account has been successfully updated." message is displayed


  Scenario Outline: Login with valid credentials using Scenario Outline
    Given User navigate to Home page
    And User navigate to Login page using My Account Dropdown
    And User enter valid <username> and <password>
    And User clicks on Login button
    Then User is logged into account
    And Click on Desktop category from linebar
    And Select Mac subcategory from category dropdown
    Then User is on selected subcategory page
    Examples:
      | username         | password    |
      | victor@gmail.com | Password123 |
