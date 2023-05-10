@comp
Feature: Librarian can add book


  Scenario: Librarian will add book using the add book button and will fill out the information required.
    Given the user is on the login page
    When the librarian enters valid credentials
    And the librarian clicks sign in
    And the librarian lands on home page
    And librarian clicks books tab
    And librarian clicks add book button
    And librarian fills out book information
    And librarian presses save changes button
    Then the librarian will see the confirmation message