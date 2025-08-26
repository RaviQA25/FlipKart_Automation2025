Feature:Booking A Samsung Mobile
@SamsungMobile
  Scenario Outline:Booking A Samsung Mobile Phone With 128GB In Flipkart
    # Home Page
    Given User navigates to Flipkart homepage
#  When User clicks on the sign-in button
#  Then User enters "9666837134"
#  And User clicks on requestOTP button
    When  User searches for product "<ProductName>"
    And   User selects the particular product


    # Search Result Page
    And   User selects the customer rating "4★ & above"
    And   User selects the particular product

    # Product Details Page
  And   User gets the product price
  And   User verifies the product specifications
  Then  User checks the SimType as "Dual Sim" from specifications section
#  Then  User checks the SimType as Dual Sim from specifications section
#  Then  User checks the SimType as single Sim from specifications section

  When   User clicks on mobile "4 GB" in specifications Section and verify ram size in title of the product

#  Using switch method

 And    User clicks on required ram"4 GB"in specifications section and verifies the ram size using Switch
#  And  User adds the product to the cart
#  And   User enters deliverypincode in specifications section
#  And    user clicks on backcover radio button
  Examples:
    |  ProductName|
    |Samsung Galaxy F14 5G (Green, 128 GB)|
    | Samsung Galaxy F14 5G (GOAT Green, 128 GB)|

#  And    user clicks on additems to cart button

#  add to cart details page

#  When   User clicks on enter pincode button

#
#
#  Task: write generic method to click 4,6,8GB and write single method to verify the same based on given RAM
#
#
#  click on 4 and verify 4
#  click on 6 and verify 6
#  click on 8 and verify 8

#    When  User selects that particular product with name "Samsung Galaxy F15 5G (Groovy Violet, 128 GB)"
#
#    And  User adds the product to the cart
#    When   User clicks on placeOrder button

