Feature: Flipkart Login Functionality
@Test
  Scenario Outline: Successful login with valid credentials
    Given User navigates to Flipkart homepage
    When User clicks on the sign-in button
    Then User enters "<mobileNumber>"
    And User clicks on requestOTP button
    Then User clicks on verify button


    Examples:
      | mobileNumber       |
      | 9113672922         |