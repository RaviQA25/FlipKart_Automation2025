Feature: Book a product in Flipkart
@Product
  Scenario: Book a product in Flipkart Adrenex R201 Combo
    Given User navigates to Flipkart homepage
    When User clicks on the sign-in button
    Then User enters "9666837134"
    And User clicks on requestOTP button
    And User searches for product "Adrenex R201"
    And User selects the customer rating "4 Stars & Up"
  And User selects the product with name "Adrenex by Flipkart R201 Combo"
    And User adds the product to the cart
  And User clicks on placeOrder button
  Then User selects delivery address
  Then User clicks on delivery here button
  Then User verifies the product list
  And User clicks on continue button
  And User selects the mode off payment
  And User Clicks On confirm Order Button
#    Then User proceeds to checkout

#    And User selects delivery address and payment method
#    When User confirms the order
#    Then Order should be successfully placed