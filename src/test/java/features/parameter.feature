@parameter
Feature:  Parameter feature

  @displayed
  @no_param
  Scenario: Scenario have no parameter
#    Given Open facebook application
    Then Verify email textbox is displayed
    Then Input to Username textbox
    And Verify password textbox is displayed
#    And Close application

  @param_mark
  Scenario: Scenario have parameter
#    Given Open facebook application
    Then Input to Username textbox with "automationtest@gmail.com"
    And Input password textbox with "123456"
    And Click to Submit button
#    And Close application

  @param_no_mark
  Scenario: Scenario have parameter
#    Given Open facebook application
    Then Input to Username textbox with automationtest@gmail.com
    And Input password textbox with 123456
    And Click to Submit button
#    And Close application

  @multiple_param
  Scenario: Scenario have parameter
#    Given Open facebook application
    Then Input to Username textbox with "automationtest@gmail.com" and password textbox with "123456"
    And Click to Submit button
#    And Close application

