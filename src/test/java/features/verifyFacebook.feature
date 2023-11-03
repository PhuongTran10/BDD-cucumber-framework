@login
Feature:  Facebook login page

  @displayed
  @no_param
  Scenario: Scenario have no parameter
    Given Open facebook application
    Then Verify email textbox is displayed
    Then Input to Username textbox
    And Verify password textbox is displayed
    And Close application

  @param_mark
  Scenario: Scenario have parameter
    Given Open facebook application
    Then Input to Username textbox with "automationtest@gmail.com"
    And Input password textbox with "123456"
    And Click to Submit button
    And Close application

  @param_no_mark
  Scenario: Scenario have parameter
    Given Open facebook application
    Then Input to Username textbox with automationtest@gmail.com
    And Input password textbox with 123456
    And Click to Submit button
    And Close application

  @multiple_param
  Scenario: Scenario have parameter
    Given Open facebook application
    Then Input to Username textbox with "automationtest@gmail.com" and password textbox with "123456"
    And Click to Submit button
    And Close application

  @datatable_step
  Scenario Outline: Create new Customer with email "<Username>" and city "<City>"
    Given Open facebook application
    Then Input to password textbox
      | Username     | Password     |
      | "<Username>" | "<Password>" |
    And Click to Submit button
    And Close application

    Examples:
      | Username                 | Password | City   | Phone  |
      | automationtest@gmail.com | 123456   | Ha Noi | Le Loi |

  @datatable_scenario @data_driven_testing
  Scenario Outline: Data driven, Phone "<Phone>"
    Given Open facebook application
    Then Input to Username textbox with "<Username>"
    And Input password textbox with "<Password>"
    And Click to Submit button
    And Close application

    Examples:
      | Username                 | Password | City   | Phone    |
      | 1automationtest@gmail.com | 123456   | Ha Noi | 12345678 |
      | 2utomationtest@gmail.com | 123456   | Ha Noi | 12345678 |
      | 3automationtest@gmail.com | 123456   | Ha Noi | 12345678 |
      | 4utomationtest@gmail.com | 123456   | Ha Noi | 12345678 |
