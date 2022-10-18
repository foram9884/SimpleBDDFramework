
Feature: Nopcommerce Registration

  Background:
    Given User able to open browser
    And Enter Url

  Scenario: Nopcommerce Valid Register Test
    Then User click on Register Link
    Then user click on gender button
    Then user enter first name and last name
    Then user enter date of birth
    Then user enter email
    Then user company name
    Then user enter password and confirm password
    Then user click on register button