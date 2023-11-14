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
