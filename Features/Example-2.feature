Feature: Shopping Cart-duplicate

@run
  Scenario: Shhoping Cart 2-Duplicate
    Given the user opens URL
    And the user enters username as standard_user and password as secret_sauce
    Then the user clicks login button
    And the user clicks item

