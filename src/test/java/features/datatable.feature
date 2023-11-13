@datatable
Feature:  DataTable feature

#Background:
#  Given Open facebook application

  @datatable_step
  Scenario Outline: Create new Customer with email <Username> and city <City>
#    Given Open facebook application
    Then Input to password textbox
      | Username     | Password     |
      | "<Username>" | "<Password>" |
    And Click to Submit button
#    And Close application

    Examples:
      | Username                  | Password | City   | Phone    |
      | automationtest@gmail.com  | 923456   | Ha Noi | Le Loi   |
      | 2utomationtest@gmail.com  | 1023456  | Ha Noi | 12345678 |
      | 3automationtest@gmail.com | 1123456  | Ha Noi | 12345678 |

  @datatable_scenario @data_driven_testing
  Scenario Outline: Data driven, Phone "<Phone>"
#    Given Open facebook application
    Then Input to Username textbox with "<Username>"
    And Input password textbox with "<Password>"
    And Click to Submit button
#    And Close application

    Examples:
      | Username                  | Password | City   | Phone    |
      | 1automationtest@gmail.com | 123456   | Ha Noi | 12345678 |
      | 2utomationtest@gmail.com  | 123456   | Ha Noi | 12345678 |
      | 3automationtest@gmail.com | 123456   | Ha Noi | 12345678 |
      | 4utomationtest@gmail.com  | 123456   | Ha Noi | 12345678 |
