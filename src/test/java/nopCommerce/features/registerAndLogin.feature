@registerAndLogin
Feature:  Register and Login


  @register_login
  Scenario: Register to system and login

    When Input to First name
    And Input to Last name
    And Input to Email
    And Input to Password
    And Input to Confirm password
    And  Click to Register button
    Then Registration completed message displayed
    When Click to Login link
    And Submit valid infor to login form
    Then Home page displayed

  @register_login_with_commonPage
  Scenario Outline: Register to system and login

    When Input to "FirstName" textbox with value "<FirstName>"
    And Input to "LastName" textbox with value "<LastName>"
    And Input to "Email" textbox with value "<LastName>"
    And Input to "Password" textbox with value "<Password>"
    And Input to "ConfirmPassword" textbox with value "<Password>"
    And  Click to "Register" button
    Then Registration completed message displayed
    When Click to Login link
    And Submit valid infor to login form
    Then Home page displayed
    Examples:
      | FirstName | LastName | Password |
      | Annie     | Swif     | 123456   |