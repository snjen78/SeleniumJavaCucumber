Feature: Shopping Cart

  # Background: User Navigates to the Login Page (open browser & navigate to login page)

#  Scenario: Shopping Cart Logo Verification
#    Given the user logs in as a Customer
#    Then the user navigates to the UIPage

@run
  Scenario: Shhoping Cart 2
    Given the user opens URL
    And the user enters username as standard_user and password as secret_sauce
    Then the user clicks login button
    And the user clicks item

