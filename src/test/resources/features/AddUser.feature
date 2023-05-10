@comp
Feature: Librarian can add users


  Scenario: Librarian can navigate to users tab and add users
    Given the user is on the login page
    When the librarian enters valid credentials
    And the librarian clicks sign in
    And the librarian lands on home page
    And the librarian clicks users tab
    And the librarian clicks add user button
    And the librarian fills in user info
    And librarian presses save changes button
    Then the librarian will see the confirmation message